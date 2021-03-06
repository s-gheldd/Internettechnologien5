
package gheldd;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import net.java.dev.jaxb.array.ObjectFactory;
import net.java.dev.jaxb.array.StringArray;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Party", targetNamespace = "http://gheldd/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Party {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://gheldd/Party/getDatumRequest", output = "http://gheldd/Party/getDatumResponse")
    public String getDatum();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://gheldd/Party/getDjRequest", output = "http://gheldd/Party/getDjResponse")
    public String getDj();

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://gheldd/Party/amountOfGuestsRequest", output = "http://gheldd/Party/amountOfGuestsResponse")
    public int amountOfGuests();

    /**
     * 
     * @return
     *     returns net.java.dev.jaxb.array.StringArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://gheldd/Party/getGuestListRequest", output = "http://gheldd/Party/getGuestListResponse")
    public StringArray getGuestList();

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://gheldd/Party/inviteRequest", output = "http://gheldd/Party/inviteResponse")
    public boolean invite(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}
