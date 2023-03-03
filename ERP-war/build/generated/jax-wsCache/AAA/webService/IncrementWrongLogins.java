
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
 *         &lt;element name="user" type="{http://schemas.datacontract.org/2004/07/INSA.Web.GBK}AumsUser" minOccurs="0"/&gt;
 *         &lt;element name="maxLoginRetryCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="incorrectLoginsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DataSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "user",
    "maxLoginRetryCount",
    "incorrectLoginsCount",
    "dataSet"
})
@XmlRootElement(name = "IncrementWrongLogins")
public class IncrementWrongLogins {

    @XmlElementRef(name = "user", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AumsUser> user;
    protected Integer maxLoginRetryCount;
    protected Integer incorrectLoginsCount;
    @XmlElementRef(name = "DataSet", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataSet;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AumsUser }{@code >}
     *     
     */
    public JAXBElement<AumsUser> getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AumsUser }{@code >}
     *     
     */
    public void setUser(JAXBElement<AumsUser> value) {
        this.user = value;
    }

    /**
     * Gets the value of the maxLoginRetryCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLoginRetryCount() {
        return maxLoginRetryCount;
    }

    /**
     * Sets the value of the maxLoginRetryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLoginRetryCount(Integer value) {
        this.maxLoginRetryCount = value;
    }

    /**
     * Gets the value of the incorrectLoginsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIncorrectLoginsCount() {
        return incorrectLoginsCount;
    }

    /**
     * Sets the value of the incorrectLoginsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIncorrectLoginsCount(Integer value) {
        this.incorrectLoginsCount = value;
    }

    /**
     * Gets the value of the dataSet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataSet() {
        return dataSet;
    }

    /**
     * Sets the value of the dataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataSet(JAXBElement<String> value) {
        this.dataSet = value;
    }

}
