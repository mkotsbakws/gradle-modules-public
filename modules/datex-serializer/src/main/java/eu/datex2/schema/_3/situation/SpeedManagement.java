
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Speed management action that is instigated by the network/road operator.
 *       
 * 
 * <p>Java class for SpeedManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeedManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="speedManagementType" type="{http://datex2.eu/schema/3/situation}_SpeedManagementTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="temporarySpeedLimit" type="{http://datex2.eu/schema/3/common}KilometresPerHour" minOccurs="0"/&gt;
 *         &lt;element name="_speedManagementExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedManagement", propOrder = {
    "speedManagementType",
    "temporarySpeedLimit",
    "speedManagementExtension"
})
public class SpeedManagement
    extends NetworkManagement
{

    protected SpeedManagementTypeEnum speedManagementType;
    protected Float temporarySpeedLimit;
    @XmlElement(name = "_speedManagementExtension")
    protected ExtensionType speedManagementExtension;

    /**
     * Gets the value of the speedManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedManagementTypeEnum }
     *     
     */
    public SpeedManagementTypeEnum getSpeedManagementType() {
        return speedManagementType;
    }

    /**
     * Sets the value of the speedManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedManagementTypeEnum }
     *     
     */
    public void setSpeedManagementType(SpeedManagementTypeEnum value) {
        this.speedManagementType = value;
    }

    /**
     * Gets the value of the temporarySpeedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTemporarySpeedLimit() {
        return temporarySpeedLimit;
    }

    /**
     * Sets the value of the temporarySpeedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTemporarySpeedLimit(Float value) {
        this.temporarySpeedLimit = value;
    }

    /**
     * Gets the value of the speedManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSpeedManagementExtension() {
        return speedManagementExtension;
    }

    /**
     * Sets the value of the speedManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSpeedManagementExtension(ExtensionType value) {
        this.speedManagementExtension = value;
    }

}
