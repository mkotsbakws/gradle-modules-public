
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for _DisplayedNumericalInformationTypeEnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_DisplayedNumericalInformationTypeEnum"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://datex2.eu/schema/3/vms&gt;DisplayedNumericalInformationTypeEnum"&gt;
 *       &lt;attribute name="_extendedValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_DisplayedNumericalInformationTypeEnum", namespace = "http://datex2.eu/schema/3/vms", propOrder = {
    "value"
})
public class DisplayedNumericalInformationTypeEnum {

    @XmlValue
    protected DisplayedNumericalInformationTypeEnum2 value;
    @XmlAttribute(name = "_extendedValue")
    protected String extendedValue;

    /**
     * Type of numerical information displayed
     * 
     * @return
     *     possible object is
     *     {@link DisplayedNumericalInformationTypeEnum2 }
     *     
     */
    public DisplayedNumericalInformationTypeEnum2 getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayedNumericalInformationTypeEnum2 }
     *     
     */
    public void setValue(DisplayedNumericalInformationTypeEnum2 value) {
        this.value = value;
    }

    /**
     * Gets the value of the extendedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedValue() {
        return extendedValue;
    }

    /**
     * Sets the value of the extendedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedValue(String value) {
        this.extendedValue = value;
    }

}
