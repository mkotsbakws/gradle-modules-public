
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The specification of a location either on a network (as a point or a linear location) or
 *         as an area. This may be provided in one or more referencing systems.
 *       
 * 
 * <p>Java class for Location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}LocationReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalReferencing" type="{http://datex2.eu/schema/3/locationReferencing}ExternalReferencing" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="coordinatesForDisplay" type="{http://datex2.eu/schema/3/locationReferencing}PointCoordinates" minOccurs="0"/&gt;
 *         &lt;element name="_locationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "externalReferencing",
    "coordinatesForDisplay",
    "locationExtension"
})
@XmlSeeAlso({
    AreaLocation.class,
    LocationByReference.class,
    NetworkLocation.class
})
public abstract class Location
    extends LocationReference
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected List<ExternalReferencing> externalReferencing;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected PointCoordinates coordinatesForDisplay;
    @XmlElement(name = "_locationExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType locationExtension;

    /**
     * Gets the value of the externalReferencing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the externalReferencing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalReferencing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalReferencing }
     * 
     * 
     */
    public List<ExternalReferencing> getExternalReferencing() {
        if (externalReferencing == null) {
            externalReferencing = new ArrayList<ExternalReferencing>();
        }
        return this.externalReferencing;
    }

    /**
     * Gets the value of the coordinatesForDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getCoordinatesForDisplay() {
        return coordinatesForDisplay;
    }

    /**
     * Sets the value of the coordinatesForDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setCoordinatesForDisplay(PointCoordinates value) {
        this.coordinatesForDisplay = value;
    }

    /**
     * Gets the value of the locationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLocationExtension() {
        return locationExtension;
    }

    /**
     * Sets the value of the locationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLocationExtension(ExtensionType value) {
        this.locationExtension = value;
    }

}
