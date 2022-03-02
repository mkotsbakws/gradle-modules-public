
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Evaluation of the altitude confidence assessed according to ETSI ISO 102894-2
 *       
 * 
 * <p>Java class for AltitudeConfidence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AltitudeConfidence"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="altitudeAccuracyCodedValue" type="{http://datex2.eu/schema/3/locationReferencing}_AltitudeAccuracyEnum" minOccurs="0"/&gt;
 *         &lt;element name="altitudeAccuracyCodedError" type="{http://datex2.eu/schema/3/locationReferencing}_PositionConfidenceCodedErrorEnum" minOccurs="0"/&gt;
 *         &lt;element name="_altitudeConfidenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltitudeConfidence", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "altitudeAccuracyCodedValue",
    "altitudeAccuracyCodedError",
    "altitudeConfidenceExtension"
})
public class AltitudeConfidence {

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected AltitudeAccuracyEnum altitudeAccuracyCodedValue;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected PositionConfidenceCodedErrorEnum altitudeAccuracyCodedError;
    @XmlElement(name = "_altitudeConfidenceExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType altitudeConfidenceExtension;

    /**
     * Gets the value of the altitudeAccuracyCodedValue property.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeAccuracyEnum }
     *     
     */
    public AltitudeAccuracyEnum getAltitudeAccuracyCodedValue() {
        return altitudeAccuracyCodedValue;
    }

    /**
     * Sets the value of the altitudeAccuracyCodedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeAccuracyEnum }
     *     
     */
    public void setAltitudeAccuracyCodedValue(AltitudeAccuracyEnum value) {
        this.altitudeAccuracyCodedValue = value;
    }

    /**
     * Gets the value of the altitudeAccuracyCodedError property.
     * 
     * @return
     *     possible object is
     *     {@link PositionConfidenceCodedErrorEnum }
     *     
     */
    public PositionConfidenceCodedErrorEnum getAltitudeAccuracyCodedError() {
        return altitudeAccuracyCodedError;
    }

    /**
     * Sets the value of the altitudeAccuracyCodedError property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionConfidenceCodedErrorEnum }
     *     
     */
    public void setAltitudeAccuracyCodedError(PositionConfidenceCodedErrorEnum value) {
        this.altitudeAccuracyCodedError = value;
    }

    /**
     * Gets the value of the altitudeConfidenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAltitudeConfidenceExtension() {
        return altitudeConfidenceExtension;
    }

    /**
     * Sets the value of the altitudeConfidenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAltitudeConfidenceExtension(ExtensionType value) {
        this.altitudeConfidenceExtension = value;
    }

}
