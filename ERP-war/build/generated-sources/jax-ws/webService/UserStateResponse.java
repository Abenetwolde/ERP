
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
 *         &lt;element name="UserStateResult" type="{http://schemas.datacontract.org/2004/07/INSA.Web.GBK}AumsUser" minOccurs="0"/&gt;
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
    "userStateResult"
})
@XmlRootElement(name = "UserStateResponse")
public class UserStateResponse {

    @XmlElementRef(name = "UserStateResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AumsUser> userStateResult;

    /**
     * Gets the value of the userStateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AumsUser }{@code >}
     *     
     */
    public JAXBElement<AumsUser> getUserStateResult() {
        return userStateResult;
    }

    /**
     * Sets the value of the userStateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AumsUser }{@code >}
     *     
     */
    public void setUserStateResult(JAXBElement<AumsUser> value) {
        this.userStateResult = value;
    }

}
