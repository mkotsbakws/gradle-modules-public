
package eu.datex2.schema._3.roadtrafficdata;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ComputationMethodEnum;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.VehicleCharacteristics;
import eu.datex2.schema._3.locationreferencing.DirectionEnum;
import eu.datex2.schema._3.locationreferencing.Lane;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Characteristics which are specific to an individual measurement type (specified in a known
 *         order) at the given measurement site.
 *       
 * 
 * <p>Java class for MeasurementSpecificCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSpecificCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accuracy" type="{http://datex2.eu/schema/3/common}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="computationMethod" type="{http://datex2.eu/schema/3/common}_ComputationMethodEnum" minOccurs="0"/&gt;
 *         &lt;element name="defaultMeasurementHeight" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="measurementSide" type="{http://datex2.eu/schema/3/locationReferencing}_DirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://datex2.eu/schema/3/common}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="smoothingFactor" type="{http://datex2.eu/schema/3/common}Float" minOccurs="0"/&gt;
 *         &lt;element name="specificMeasurementValueType" type="{http://datex2.eu/schema/3/roadTrafficData}_MeasuredOrDerivedDataTypeEnum"/&gt;
 *         &lt;element name="specificVehicleCharacteristics" type="{http://datex2.eu/schema/3/common}VehicleCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="specificLane" type="{http://datex2.eu/schema/3/locationReferencing}Lane" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="axleCharacteristics" type="{http://datex2.eu/schema/3/roadTrafficData}AxleCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="_measurementSpecificCharacteristicsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementSpecificCharacteristics", namespace = "http://datex2.eu/schema/3/roadTrafficData", propOrder = {
    "accuracy",
    "computationMethod",
    "defaultMeasurementHeight",
    "measurementSide",
    "period",
    "smoothingFactor",
    "specificMeasurementValueType",
    "specificVehicleCharacteristics",
    "specificLane",
    "axleCharacteristics",
    "measurementSpecificCharacteristicsExtension"
})
public class MeasurementSpecificCharacteristics {

    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected Float accuracy;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected ComputationMethodEnum computationMethod;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected Float defaultMeasurementHeight;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected DirectionEnum measurementSide;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected Float period;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected Float smoothingFactor;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData", required = true)
    protected MeasuredOrDerivedDataTypeEnum specificMeasurementValueType;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected VehicleCharacteristics specificVehicleCharacteristics;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected List<Lane> specificLane;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected AxleCharacteristics axleCharacteristics;
    @XmlElement(name = "_measurementSpecificCharacteristicsExtension", namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected ExtensionType measurementSpecificCharacteristicsExtension;

    /**
     * Gets the value of the accuracy property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAccuracy() {
        return accuracy;
    }

    /**
     * Sets the value of the accuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAccuracy(Float value) {
        this.accuracy = value;
    }

    /**
     * Gets the value of the computationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public ComputationMethodEnum getComputationMethod() {
        return computationMethod;
    }

    /**
     * Sets the value of the computationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public void setComputationMethod(ComputationMethodEnum value) {
        this.computationMethod = value;
    }

    /**
     * Gets the value of the defaultMeasurementHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDefaultMeasurementHeight() {
        return defaultMeasurementHeight;
    }

    /**
     * Sets the value of the defaultMeasurementHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDefaultMeasurementHeight(Float value) {
        this.defaultMeasurementHeight = value;
    }

    /**
     * Gets the value of the measurementSide property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getMeasurementSide() {
        return measurementSide;
    }

    /**
     * Sets the value of the measurementSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setMeasurementSide(DirectionEnum value) {
        this.measurementSide = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPeriod(Float value) {
        this.period = value;
    }

    /**
     * Gets the value of the smoothingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSmoothingFactor() {
        return smoothingFactor;
    }

    /**
     * Sets the value of the smoothingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSmoothingFactor(Float value) {
        this.smoothingFactor = value;
    }

    /**
     * Gets the value of the specificMeasurementValueType property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredOrDerivedDataTypeEnum }
     *     
     */
    public MeasuredOrDerivedDataTypeEnum getSpecificMeasurementValueType() {
        return specificMeasurementValueType;
    }

    /**
     * Sets the value of the specificMeasurementValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredOrDerivedDataTypeEnum }
     *     
     */
    public void setSpecificMeasurementValueType(MeasuredOrDerivedDataTypeEnum value) {
        this.specificMeasurementValueType = value;
    }

    /**
     * Gets the value of the specificVehicleCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public VehicleCharacteristics getSpecificVehicleCharacteristics() {
        return specificVehicleCharacteristics;
    }

    /**
     * Sets the value of the specificVehicleCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public void setSpecificVehicleCharacteristics(VehicleCharacteristics value) {
        this.specificVehicleCharacteristics = value;
    }

    /**
     * Gets the value of the specificLane property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the specificLane property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificLane().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lane }
     * 
     * 
     */
    public List<Lane> getSpecificLane() {
        if (specificLane == null) {
            specificLane = new ArrayList<Lane>();
        }
        return this.specificLane;
    }

    /**
     * Gets the value of the axleCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link AxleCharacteristics }
     *     
     */
    public AxleCharacteristics getAxleCharacteristics() {
        return axleCharacteristics;
    }

    /**
     * Sets the value of the axleCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link AxleCharacteristics }
     *     
     */
    public void setAxleCharacteristics(AxleCharacteristics value) {
        this.axleCharacteristics = value;
    }

    /**
     * Gets the value of the measurementSpecificCharacteristicsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasurementSpecificCharacteristicsExtension() {
        return measurementSpecificCharacteristicsExtension;
    }

    /**
     * Sets the value of the measurementSpecificCharacteristicsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasurementSpecificCharacteristicsExtension(ExtensionType value) {
        this.measurementSpecificCharacteristicsExtension = value;
    }

}
