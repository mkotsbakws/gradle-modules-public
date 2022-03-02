
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for _RoadworksScaleEnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_RoadworksScaleEnum"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://datex2.eu/schema/3/situation&gt;RoadworksScaleEnum"&gt;
 *       &lt;attribute name="_extendedValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_RoadworksScaleEnum", propOrder = {
    "value"
})
public class RoadworksScaleEnum {

    @XmlValue
    protected RoadworksScaleEnum2 value;
    @XmlAttribute(name = "_extendedValue")
    protected String extendedValue;

    /**
     * Grade of complexity of the roadworks according to the responsible road operator. For
     *         example determined by size, duration and/or traffic disruption.
     *       
     * 
     * @return
     *     possible object is
     *     {@link RoadworksScaleEnum2 }
     *     
     */
    public RoadworksScaleEnum2 getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadworksScaleEnum2 }
     *     
     */
    public void setValue(RoadworksScaleEnum2 value) {
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
