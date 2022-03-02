
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A measured or calculated value of the application rate of a substance.
 * 
 * <p>Java class for ApplicationRateValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationRateValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicationRate" type="{http://datex2.eu/schema/3/common}IntensityKilogramsPerSquareMetre"/&gt;
 *         &lt;element name="_applicationRateValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationRateValue", namespace = "http://datex2.eu/schema/3/common", propOrder = {
    "applicationRate",
    "applicationRateValueExtension"
})
public class ApplicationRateValue
    extends DataValue
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/common")
    protected float applicationRate;
    @XmlElement(name = "_applicationRateValueExtension", namespace = "http://datex2.eu/schema/3/common")
    protected ExtensionType applicationRateValueExtension;

    /**
     * Gets the value of the applicationRate property.
     * 
     */
    public float getApplicationRate() {
        return applicationRate;
    }

    /**
     * Sets the value of the applicationRate property.
     * 
     */
    public void setApplicationRate(float value) {
        this.applicationRate = value;
    }

    /**
     * Gets the value of the applicationRateValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getApplicationRateValueExtension() {
        return applicationRateValueExtension;
    }

    /**
     * Sets the value of the applicationRateValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setApplicationRateValueExtension(ExtensionType value) {
        this.applicationRateValueExtension = value;
    }

}
