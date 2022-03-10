
package eu.datex2.schema._3.cctvextension;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common.UrlLink;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvVideoService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvVideoService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cctvVideoServiceLevel" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&gt;
 *         &lt;element name="cctvVideoServiceLevelName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="cctvVideoEncodingStandard" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="cctvVideoResolution" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="cctvVideoFrameRate" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="cctvVideoBitRate" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="cctvVideoZoomBlankingLevel" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="videoUrl" type="{http://datex2.eu/schema/3/common}UrlLink"/&gt;
 *         &lt;element name="orientationImageUrl" type="{http://datex2.eu/schema/3/common}UrlLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="thumbnailImageUrl" type="{http://datex2.eu/schema/3/common}UrlLink" minOccurs="0"/&gt;
 *         &lt;element name="_cctvVideoServiceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvVideoService", propOrder = {
    "cctvVideoServiceLevel",
    "cctvVideoServiceLevelName",
    "cctvVideoEncodingStandard",
    "cctvVideoResolution",
    "cctvVideoFrameRate",
    "cctvVideoBitRate",
    "cctvVideoZoomBlankingLevel",
    "videoUrl",
    "orientationImageUrl",
    "thumbnailImageUrl",
    "_CctvVideoServiceExtension"
})
public class CctvVideoService {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvVideoServiceLevel;
    protected MultilingualString cctvVideoServiceLevelName;
    @XmlElement(required = true)
    protected String cctvVideoEncodingStandard;
    protected String cctvVideoResolution;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvVideoFrameRate;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvVideoBitRate;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvVideoZoomBlankingLevel;
    @XmlElement(required = true)
    protected UrlLink videoUrl;
    protected List<UrlLink> orientationImageUrl;
    protected UrlLink thumbnailImageUrl;
    @XmlElement(name = "_cctvVideoServiceExtension")
    protected _ExtensionType _CctvVideoServiceExtension;

    /**
     * Gets the value of the cctvVideoServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvVideoServiceLevel() {
        return cctvVideoServiceLevel;
    }

    /**
     * Sets the value of the cctvVideoServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvVideoServiceLevel(BigInteger value) {
        this.cctvVideoServiceLevel = value;
    }

    /**
     * Gets the value of the cctvVideoServiceLevelName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCctvVideoServiceLevelName() {
        return cctvVideoServiceLevelName;
    }

    /**
     * Sets the value of the cctvVideoServiceLevelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCctvVideoServiceLevelName(MultilingualString value) {
        this.cctvVideoServiceLevelName = value;
    }

    /**
     * Gets the value of the cctvVideoEncodingStandard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvVideoEncodingStandard() {
        return cctvVideoEncodingStandard;
    }

    /**
     * Sets the value of the cctvVideoEncodingStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvVideoEncodingStandard(String value) {
        this.cctvVideoEncodingStandard = value;
    }

    /**
     * Gets the value of the cctvVideoResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvVideoResolution() {
        return cctvVideoResolution;
    }

    /**
     * Sets the value of the cctvVideoResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvVideoResolution(String value) {
        this.cctvVideoResolution = value;
    }

    /**
     * Gets the value of the cctvVideoFrameRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvVideoFrameRate() {
        return cctvVideoFrameRate;
    }

    /**
     * Sets the value of the cctvVideoFrameRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvVideoFrameRate(BigInteger value) {
        this.cctvVideoFrameRate = value;
    }

    /**
     * Gets the value of the cctvVideoBitRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvVideoBitRate() {
        return cctvVideoBitRate;
    }

    /**
     * Sets the value of the cctvVideoBitRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvVideoBitRate(BigInteger value) {
        this.cctvVideoBitRate = value;
    }

    /**
     * Gets the value of the cctvVideoZoomBlankingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvVideoZoomBlankingLevel() {
        return cctvVideoZoomBlankingLevel;
    }

    /**
     * Sets the value of the cctvVideoZoomBlankingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvVideoZoomBlankingLevel(BigInteger value) {
        this.cctvVideoZoomBlankingLevel = value;
    }

    /**
     * Gets the value of the videoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link UrlLink }
     *     
     */
    public UrlLink getVideoUrl() {
        return videoUrl;
    }

    /**
     * Sets the value of the videoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlLink }
     *     
     */
    public void setVideoUrl(UrlLink value) {
        this.videoUrl = value;
    }

    /**
     * Gets the value of the orientationImageUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the orientationImageUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrientationImageUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlLink }
     * 
     * 
     */
    public List<UrlLink> getOrientationImageUrl() {
        if (orientationImageUrl == null) {
            orientationImageUrl = new ArrayList<UrlLink>();
        }
        return this.orientationImageUrl;
    }

    /**
     * Gets the value of the thumbnailImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link UrlLink }
     *     
     */
    public UrlLink getThumbnailImageUrl() {
        return thumbnailImageUrl;
    }

    /**
     * Sets the value of the thumbnailImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlLink }
     *     
     */
    public void setThumbnailImageUrl(UrlLink value) {
        this.thumbnailImageUrl = value;
    }

    /**
     * Gets the value of the _CctvVideoServiceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_CctvVideoServiceExtension() {
        return _CctvVideoServiceExtension;
    }

    /**
     * Sets the value of the _CctvVideoServiceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_CctvVideoServiceExtension(_ExtensionType value) {
        this._CctvVideoServiceExtension = value;
    }

}