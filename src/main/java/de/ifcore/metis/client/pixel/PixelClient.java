package de.ifcore.metis.client.pixel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.ws.BindingProvider;

import de.ifcore.metis.client.MetisEndpoint;
import de.ifcore.metis.client.exception.MetisClientException;
import de.ifcore.metis.client.pixel.jaxws.OrderPixelFault_Exception;
import de.ifcore.metis.client.pixel.jaxws.OrderPixelRequest;
import de.ifcore.metis.client.pixel.jaxws.OrderPixelResponse;
import de.ifcore.metis.client.pixel.jaxws.PixelService;
import de.ifcore.metis.client.pixel.jaxws.Pixel_Type;

public class PixelClient
{
	private final de.ifcore.metis.client.pixel.jaxws.Pixel port;

	public PixelClient(MetisEndpoint endpoint)
	{
		this.port = new PixelService().getPixelPort();

		String wsdlUrl = endpoint.buildUrl("/services/1.0/pixelService.wsdl");
		endpoint.configure((BindingProvider)port, wsdlUrl);
	}

	public List<Pixel> order(int count)
	{
		OrderPixelRequest request = new OrderPixelRequest();
		request.setCount(count);

		try
		{
			OrderPixelResponse response = port.orderPixel(request);

			List<Pixel> pixels = new ArrayList<>();
			for (Pixel_Type pixel : response.getPixels().getPixel())
			{
				pixels.add(new Pixel(pixel.getPublicIdentificationId(), pixel.getPrivateIdentificationId()));
			}
			return Collections.unmodifiableList(pixels);
		}
		catch (OrderPixelFault_Exception e)
		{
			throw new MetisClientException(e);
		}
	}
}
