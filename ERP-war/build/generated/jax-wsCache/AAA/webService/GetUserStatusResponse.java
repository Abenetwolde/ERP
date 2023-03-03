
package webService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetUserStatusResult" type="{http://schemas.datacontract.org/2004/07/INSA.Web.Security}UserStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getUserStatusResult"
})
@XmlRootElement(name = "GetUserStatusResponse")
public class GetUserStatusResponse {

    @XmlElementRef(name = "GetUserStatusResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<UserStatus> getUserStatusResult;

    /**
     * Gets the value of the getUserStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserStatus }{@code >}
     *     
     */
    public JAXBElement<UserStatus> getGetUserStatusResult() {
        return getUserStatusResult;
    }

    /**
     * Sets the value of the getUserStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserStatus }{@code >}
     *     
     */
    public void setGetUserStatusResult(JAXBElement<UserStatus> value) {
        this.getUserStatusResult = value;
    }

}
