
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
 *         &lt;element name="getEmpInfoResult" type="{http://schemas.datacontract.org/2004/07/INSA.Web.Security}EmployeeInfo" minOccurs="0"/&gt;
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
    "getEmpInfoResult"
})
@XmlRootElement(name = "getEmpInfoResponse")
public class GetEmpInfoResponse {

    @XmlElementRef(name = "getEmpInfoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<EmployeeInfo> getEmpInfoResult;

    /**
     * Gets the value of the getEmpInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmployeeInfo }{@code >}
     *     
     */
    public JAXBElement<EmployeeInfo> getGetEmpInfoResult() {
        return getEmpInfoResult;
    }

    /**
     * Sets the value of the getEmpInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmployeeInfo }{@code >}
     *     
     */
    public void setGetEmpInfoResult(JAXBElement<EmployeeInfo> value) {
        this.getEmpInfoResult = value;
    }

}
