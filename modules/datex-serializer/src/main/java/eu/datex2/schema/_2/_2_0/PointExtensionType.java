
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for _PointExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_PointExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pointExtended" type="{http://datex2.eu/schema/2/2_0}PointExtended" minOccurs="0"/&gt;
 *         &lt;element name="openlrExtendedPoint" type="{http://datex2.eu/schema/2/2_0}OpenlrExtendedPoint" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_PointExtensionType", propOrder = {
    "pointExtended",
    "openlrExtendedPoint",
    "any"
})
public class PointExtensionType {

    protected PointExtended pointExtended;
    protected OpenlrExtendedPoint openlrExtendedPoint;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pointExtended property.
     * 
     * @return
     *     possible object is
     *     {@link PointExtended }
     *     
     */
    public PointExtended getPointExtended() {
        return pointExtended;
    }

    /**
     * Sets the value of the pointExtended property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointExtended }
     *     
     */
    public void setPointExtended(PointExtended value) {
        this.pointExtended = value;
    }

    /**
     * Gets the value of the openlrExtendedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrExtendedPoint }
     *     
     */
    public OpenlrExtendedPoint getOpenlrExtendedPoint() {
        return openlrExtendedPoint;
    }

    /**
     * Sets the value of the openlrExtendedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrExtendedPoint }
     *     
     */
    public void setOpenlrExtendedPoint(OpenlrExtendedPoint value) {
        this.openlrExtendedPoint = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
