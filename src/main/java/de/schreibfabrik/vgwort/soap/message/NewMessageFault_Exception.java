package de.schreibfabrik.vgwort.soap.message;

import javax.xml.ws.WebFault;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.4-b01 Generated source version: 2.2
 * 
 */
@WebFault(name = "newMessageFault", targetNamespace = "http://vgwort.de/1.2/MessageService/xsd")
public class NewMessageFault_Exception extends Exception
{
	private static final long serialVersionUID = -7580527291511605954L;

	/**
	 * Java type that goes as soapenv:Fault detail element.
	 * 
	 */
	private NewMessageFault faultInfo;

	/**
	 * 
	 * @param message
	 * @param faultInfo
	 */
	public NewMessageFault_Exception(String message, NewMessageFault faultInfo)
	{
		super(message);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @param message
	 * @param faultInfo
	 * @param cause
	 */
	public NewMessageFault_Exception(String message, NewMessageFault faultInfo, Throwable cause)
	{
		super(message, cause);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @return returns fault bean: de.schreibfabrik.vgwort.soap.message.NewMessageFault
	 */
	public NewMessageFault getFaultInfo()
	{
		return faultInfo;
	}

}
