
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for _DirectionCompassEnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_DirectionCompassEnum"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://datex2.eu/schema/3/common&gt;DirectionCompassEnum"&gt;
 *       &lt;attribute name="_extendedValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_DirectionCompassEnum", namespace = "http://datex2.eu/schema/3/common", propOrder = {
    "value"
})
public class DirectionCompassEnum {

    @XmlValue
    protected DirectionCompassEnum2 value;
    @XmlAttribute(name = "_extendedValue")
    protected String extendedValue;

    /**
     * Cardinal direction points of the compass.
     * 
     * @return
     *     possible object is
     *     {@link DirectionCompassEnum2 }
     *     
     */
    public DirectionCompassEnum2 getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionCompassEnum2 }
     *     
     */
    public void setValue(DirectionCompassEnum2 value) {
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
