
package eu.datex2.schema._3.locationreferencing;

import java.math.BigInteger;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Properties of the path from the associated location reference point to the next location
 *         reference point, which are specified to assist correct identification of the point in an external map
 *         data source.
 *       
 * 
 * <p>Java class for OpenlrPathAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrPathAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrLowestFrcToNextLRPoint" type="{http://datex2.eu/schema/3/locationReferencing}_OpenlrFunctionalRoadClassEnum"/&gt;
 *         &lt;element name="openlrDistanceToNextLRPoint" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&gt;
 *         &lt;element name="_openlrPathAttributesExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPathAttributes", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "openlrLowestFrcToNextLRPoint",
    "openlrDistanceToNextLRPoint",
    "openlrPathAttributesExtension"
})
public class OpenlrPathAttributes {

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing", required = true)
    protected OpenlrFunctionalRoadClassEnum openlrLowestFrcToNextLRPoint;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger openlrDistanceToNextLRPoint;
    @XmlElement(name = "_openlrPathAttributesExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType openlrPathAttributesExtension;

    /**
     * Gets the value of the openlrLowestFrcToNextLRPoint property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrFunctionalRoadClassEnum }
     *     
     */
    public OpenlrFunctionalRoadClassEnum getOpenlrLowestFrcToNextLRPoint() {
        return openlrLowestFrcToNextLRPoint;
    }

    /**
     * Sets the value of the openlrLowestFrcToNextLRPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrFunctionalRoadClassEnum }
     *     
     */
    public void setOpenlrLowestFrcToNextLRPoint(OpenlrFunctionalRoadClassEnum value) {
        this.openlrLowestFrcToNextLRPoint = value;
    }

    /**
     * Gets the value of the openlrDistanceToNextLRPoint property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenlrDistanceToNextLRPoint() {
        return openlrDistanceToNextLRPoint;
    }

    /**
     * Sets the value of the openlrDistanceToNextLRPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenlrDistanceToNextLRPoint(BigInteger value) {
        this.openlrDistanceToNextLRPoint = value;
    }

    /**
     * Gets the value of the openlrPathAttributesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrPathAttributesExtension() {
        return openlrPathAttributesExtension;
    }

    /**
     * Sets the value of the openlrPathAttributesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrPathAttributesExtension(ExtensionType value) {
        this.openlrPathAttributesExtension = value;
    }

}
