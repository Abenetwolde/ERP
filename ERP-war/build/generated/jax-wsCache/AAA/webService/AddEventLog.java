
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
 *         &lt;element name="ev" type="{http://schemas.datacontract.org/2004/07/INSA.Web.Security}EventEntry" minOccurs="0"/&gt;
 *         &lt;element name="dataset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "ev",
    "dataset"
})
@XmlRootElement(name = "AddEventLog")
public class AddEventLog {

    @XmlElementRef(name = "ev", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<EventEntry> ev;
    @XmlElementRef(name = "dataset", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataset;

    /**
     * Gets the value of the ev property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventEntry }{@code >}
     *     
     */
    public JAXBElement<EventEntry> getEv() {
        return ev;
    }

    /**
     * Sets the value of the ev property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventEntry }{@code >}
     *     
     */
    public void setEv(JAXBElement<EventEntry> value) {
        this.ev = value;
    }

    /**
     * Gets the value of the dataset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataset() {
        return dataset;
    }

    /**
     * Sets the value of the dataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataset(JAXBElement<String> value) {
        this.dataset = value;
    }

}
