
package operators;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operatorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fightOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightOperatorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operatorType", propOrder = {
    "fightOperator",
    "flightOperatorType",
    "updateDate"
})
public class OperatorType {

    protected String fightOperator;
    protected String flightOperatorType;
    protected String updateDate;

    /**
     * Gets the value of the fightOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFightOperator() {
        return fightOperator;
    }

    /**
     * Sets the value of the fightOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFightOperator(String value) {
        this.fightOperator = value;
    }

    /**
     * Gets the value of the flightOperatorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightOperatorType() {
        return flightOperatorType;
    }

    /**
     * Sets the value of the flightOperatorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightOperatorType(String value) {
        this.flightOperatorType = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDate(String value) {
        this.updateDate = value;
    }

}
