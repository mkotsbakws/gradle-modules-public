
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.Humidity;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Measurements of atmospheric humidity.
 * 
 * <p>Java class for HumidityInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HumidityInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}WeatherData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="humidity" type="{http://datex2.eu/schema/3/common}Humidity"/&gt;
 *         &lt;element name="_humidityInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HumidityInformation", propOrder = {
    "humidity",
    "humidityInformationExtension"
})
public class HumidityInformation
    extends WeatherData
{

    @XmlElement(required = true)
    protected Humidity humidity;
    @XmlElement(name = "_humidityInformationExtension")
    protected ExtensionType humidityInformationExtension;

    /**
     * Gets the value of the humidity property.
     * 
     * @return
     *     possible object is
     *     {@link Humidity }
     *     
     */
    public Humidity getHumidity() {
        return humidity;
    }

    /**
     * Sets the value of the humidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Humidity }
     *     
     */
    public void setHumidity(Humidity value) {
        this.humidity = value;
    }

    /**
     * Gets the value of the humidityInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHumidityInformationExtension() {
        return humidityInformationExtension;
    }

    /**
     * Sets the value of the humidityInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHumidityInformationExtension(ExtensionType value) {
        this.humidityInformationExtension = value;
    }

}
