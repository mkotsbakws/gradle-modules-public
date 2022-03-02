
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Width characteristic of a vehicle.
 * 
 * <p>Java class for WidthCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WidthCharacteristic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/3/common}_ComparisonOperatorEnum"/&gt;
 *         &lt;element name="vehicleWidth" type="{http://datex2.eu/schema/3/common}MetresAsFloat"/&gt;
 *         &lt;element name="_widthCharacteristicExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WidthCharacteristic", namespace = "http://datex2.eu/schema/3/common", propOrder = {
    "comparisonOperator",
    "vehicleWidth",
    "widthCharacteristicExtension"
})
public class WidthCharacteristic {

    @XmlElement(namespace = "http://datex2.eu/schema/3/common", required = true)
    protected ComparisonOperatorEnum comparisonOperator;
    @XmlElement(namespace = "http://datex2.eu/schema/3/common")
    protected float vehicleWidth;
    @XmlElement(name = "_widthCharacteristicExtension", namespace = "http://datex2.eu/schema/3/common")
    protected ExtensionType widthCharacteristicExtension;

    /**
     * Gets the value of the comparisonOperator property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public ComparisonOperatorEnum getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * Sets the value of the comparisonOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public void setComparisonOperator(ComparisonOperatorEnum value) {
        this.comparisonOperator = value;
    }

    /**
     * Gets the value of the vehicleWidth property.
     * 
     */
    public float getVehicleWidth() {
        return vehicleWidth;
    }

    /**
     * Sets the value of the vehicleWidth property.
     * 
     */
    public void setVehicleWidth(float value) {
        this.vehicleWidth = value;
    }

    /**
     * Gets the value of the widthCharacteristicExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWidthCharacteristicExtension() {
        return widthCharacteristicExtension;
    }

    /**
     * Sets the value of the widthCharacteristicExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWidthCharacteristicExtension(ExtensionType value) {
        this.widthCharacteristicExtension = value;
    }

}
