
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
 *         &lt;element name="getGroupRightsResult" type="{http://schemas.datacontract.org/2004/07/INSA.Web.Administration}ArrayOfINSAGetGroupRights" minOccurs="0"/&gt;
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
    "getGroupRightsResult"
})
@XmlRootElement(name = "getGroupRightsResponse")
public class GetGroupRightsResponse {

    @XmlElementRef(name = "getGroupRightsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfINSAGetGroupRights> getGroupRightsResult;

    /**
     * Gets the value of the getGroupRightsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfINSAGetGroupRights }{@code >}
     *     
     */
    public JAXBElement<ArrayOfINSAGetGroupRights> getGetGroupRightsResult() {
        return getGroupRightsResult;
    }

    /**
     * Sets the value of the getGroupRightsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfINSAGetGroupRights }{@code >}
     *     
     */
    public void setGetGroupRightsResult(JAXBElement<ArrayOfINSAGetGroupRights> value) {
        this.getGroupRightsResult = value;
    }

}
