
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.VersionedReference;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _MeasurementSiteTableVersionedReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_MeasurementSiteTableVersionedReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}VersionedReference"&gt;
 *       &lt;attribute name="targetClass" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="roa:MeasurementSiteTable" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_MeasurementSiteTableVersionedReference")
public class MeasurementSiteTableVersionedReference
    extends VersionedReference
{

    @XmlAttribute(name = "targetClass", required = true)
    protected String targetClass;

    /**
     * Gets the value of the targetClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetClass() {
        if (targetClass == null) {
            return "roa:MeasurementSiteTable";
        } else {
            return targetClass;
        }
    }

    /**
     * Sets the value of the targetClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetClass(String value) {
        this.targetClass = value;
    }

}
