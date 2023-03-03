
package webService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLogParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLogParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LogParameter" type="{http://schemas.datacontract.org/2004/07/INSA.Web.Security}LogParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLogParameter", namespace = "http://schemas.datacontract.org/2004/07/INSA.Web.Security", propOrder = {
    "logParameter"
})
public class ArrayOfLogParameter {

    @XmlElement(name = "LogParameter", nillable = true)
    protected List<LogParameter> logParameter;

    /**
     * Gets the value of the logParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogParameter }
     * 
     * 
     */
    public List<LogParameter> getLogParameter() {
        if (logParameter == null) {
            logParameter = new ArrayList<LogParameter>();
        }
        return this.logParameter;
    }

}
