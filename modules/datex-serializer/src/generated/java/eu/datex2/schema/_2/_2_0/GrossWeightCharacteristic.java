
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrossWeightCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrossWeightCharacteristic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/2/2_0}ComparisonOperatorEnum"/&gt;
 *         &lt;element name="grossVehicleWeight" type="{http://datex2.eu/schema/2/2_0}Tonnes"/&gt;
 *         &lt;element name="grossWeightCharacteristicExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrossWeightCharacteristic", propOrder = {
    "comparisonOperator",
    "grossVehicleWeight",
    "grossWeightCharacteristicExtension"
})
public class GrossWeightCharacteristic {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ComparisonOperatorEnum comparisonOperator;
    protected float grossVehicleWeight;
    protected ExtensionType grossWeightCharacteristicExtension;

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
     * Gets the value of the grossVehicleWeight property.
     * 
     */
    public float getGrossVehicleWeight() {
        return grossVehicleWeight;
    }

    /**
     * Sets the value of the grossVehicleWeight property.
     * 
     */
    public void setGrossVehicleWeight(float value) {
        this.grossVehicleWeight = value;
    }

    /**
     * Gets the value of the grossWeightCharacteristicExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGrossWeightCharacteristicExtension() {
        return grossWeightCharacteristicExtension;
    }

    /**
     * Sets the value of the grossWeightCharacteristicExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGrossWeightCharacteristicExtension(ExtensionType value) {
        this.grossWeightCharacteristicExtension = value;
    }

}
