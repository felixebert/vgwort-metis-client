
package de.schreibfabrik.vgwort.soap.message;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "checkAuthorFault", targetNamespace = "http://vgwort.de/1.2/MessageService/xsd")
public class CheckAuthorFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CheckAuthorFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public CheckAuthorFault_Exception(String message, CheckAuthorFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public CheckAuthorFault_Exception(String message, CheckAuthorFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: de.schreibfabrik.vgwort.soap.message.CheckAuthorFault
     */
    public CheckAuthorFault getFaultInfo() {
        return faultInfo;
    }

}
