
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A main pictogram displayable on the VMS panel. Note a main pictogram may have an
 *         associated supplementary panel which may itself contain a further pictogram and line of text.
 *       
 * 
 * <p>Java class for Pictogram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pictogram"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customPictogramCode" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="additionalDescription" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="pictogramFlashing" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="pictogramInInverseColour" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="viennaConventionCompliant" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="pictogramInformationType" type="{http://datex2.eu/schema/3/vms}_InformationTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="gddStructure" type="{http://datex2.eu/schema/3/vms}GddStructure" minOccurs="0"/&gt;
 *         &lt;element name="_pictogramExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pictogram", namespace = "http://datex2.eu/schema/3/vms", propOrder = {
    "customPictogramCode",
    "additionalDescription",
    "pictogramFlashing",
    "pictogramInInverseColour",
    "viennaConventionCompliant",
    "pictogramInformationType",
    "gddStructure",
    "pictogramExtension"
})
@XmlSeeAlso({
    CompositePictogram.class,
    RegularPictogram.class
})
public abstract class Pictogram {

    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected String customPictogramCode;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected MultilingualString additionalDescription;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected Boolean pictogramFlashing;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected Boolean pictogramInInverseColour;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected Boolean viennaConventionCompliant;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected InformationTypeEnum pictogramInformationType;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected GddStructure gddStructure;
    @XmlElement(name = "_pictogramExtension", namespace = "http://datex2.eu/schema/3/vms")
    protected ExtensionType pictogramExtension;

    /**
     * Gets the value of the customPictogramCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomPictogramCode() {
        return customPictogramCode;
    }

    /**
     * Sets the value of the customPictogramCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomPictogramCode(String value) {
        this.customPictogramCode = value;
    }

    /**
     * Gets the value of the additionalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAdditionalDescription() {
        return additionalDescription;
    }

    /**
     * Sets the value of the additionalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAdditionalDescription(MultilingualString value) {
        this.additionalDescription = value;
    }

    /**
     * Gets the value of the pictogramFlashing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPictogramFlashing() {
        return pictogramFlashing;
    }

    /**
     * Sets the value of the pictogramFlashing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPictogramFlashing(Boolean value) {
        this.pictogramFlashing = value;
    }

    /**
     * Gets the value of the pictogramInInverseColour property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPictogramInInverseColour() {
        return pictogramInInverseColour;
    }

    /**
     * Sets the value of the pictogramInInverseColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPictogramInInverseColour(Boolean value) {
        this.pictogramInInverseColour = value;
    }

    /**
     * Gets the value of the viennaConventionCompliant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViennaConventionCompliant() {
        return viennaConventionCompliant;
    }

    /**
     * Sets the value of the viennaConventionCompliant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViennaConventionCompliant(Boolean value) {
        this.viennaConventionCompliant = value;
    }

    /**
     * Gets the value of the pictogramInformationType property.
     * 
     * @return
     *     possible object is
     *     {@link InformationTypeEnum }
     *     
     */
    public InformationTypeEnum getPictogramInformationType() {
        return pictogramInformationType;
    }

    /**
     * Sets the value of the pictogramInformationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationTypeEnum }
     *     
     */
    public void setPictogramInformationType(InformationTypeEnum value) {
        this.pictogramInformationType = value;
    }

    /**
     * Gets the value of the gddStructure property.
     * 
     * @return
     *     possible object is
     *     {@link GddStructure }
     *     
     */
    public GddStructure getGddStructure() {
        return gddStructure;
    }

    /**
     * Sets the value of the gddStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link GddStructure }
     *     
     */
    public void setGddStructure(GddStructure value) {
        this.gddStructure = value;
    }

    /**
     * Gets the value of the pictogramExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPictogramExtension() {
        return pictogramExtension;
    }

    /**
     * Sets the value of the pictogramExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPictogramExtension(ExtensionType value) {
        this.pictogramExtension = value;
    }

}
