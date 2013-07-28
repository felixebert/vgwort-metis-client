package de.ifcore.metis.client;

import javax.inject.Inject;
import javax.inject.Named;

import de.ifcore.metis.client.message.MessageClient;
import de.ifcore.metis.client.pixel.PixelClient;

@Named
public class MetisClient
{
	private final MetisEndpoint endpoint;

	@Inject
	public MetisClient(MetisEndpoint endpoint)
	{
		this.endpoint = endpoint;
	}

	public void orderPixels(int count)
	{
		PixelClient client = new PixelClient(endpoint);
		client.order(count);
	}

	public void submitText()
	{
		MessageClient client = new MessageClient(endpoint);
		client.submitText();
	}
}
