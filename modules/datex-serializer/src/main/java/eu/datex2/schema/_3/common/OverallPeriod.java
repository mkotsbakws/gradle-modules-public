
package eu.datex2.schema._3.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A continuous or discontinuous period of validity defined by overall bounding start and end
 *         times and the possible intersection of valid periods (potentially recurring) with the complement of
 *         exception periods (also potentially recurring).
 *       
 * 
 * <p>Java class for OverallPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverallPeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="overallStartTime" type="{http://datex2.eu/schema/3/common}DateTime"/&gt;
 *         &lt;element name="overallEndTime" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="validPeriod" type="{http://datex2.eu/schema/3/common}Period" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="exceptionPeriod" type="{http://datex2.eu/schema/3/common}Period" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_overallPeriodExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverallPeriod", namespace = "http://datex2.eu/schema/3/common", propOrder = {
    "overallStartTime",
    "overallEndTime",
    "validPeriod",
    "exceptionPeriod",
    "overallPeriodExtension"
})
public class OverallPeriod {

    @XmlElement(namespace = "http://datex2.eu/schema/3/common", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar overallStartTime;
    @XmlElement(namespace = "http://datex2.eu/schema/3/common")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar overallEndTime;
    @XmlElement(namespace = "http://datex2.eu/schema/3/common")
    protected List<Period> validPeriod;
    @XmlElement(namespace = "http://datex2.eu/schema/3/common")
    protected List<Period> exceptionPeriod;
    @XmlElement(name = "_overallPeriodExtension", namespace = "http://datex2.eu/schema/3/common")
    protected ExtensionType overallPeriodExtension;

    /**
     * Gets the value of the overallStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOverallStartTime() {
        return overallStartTime;
    }

    /**
     * Sets the value of the overallStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOverallStartTime(XMLGregorianCalendar value) {
        this.overallStartTime = value;
    }

    /**
     * Gets the value of the overallEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOverallEndTime() {
        return overallEndTime;
    }

    /**
     * Sets the value of the overallEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOverallEndTime(XMLGregorianCalendar value) {
        this.overallEndTime = value;
    }

    /**
     * Gets the value of the validPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the validPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Period }
     * 
     * 
     */
    public List<Period> getValidPeriod() {
        if (validPeriod == null) {
            validPeriod = new ArrayList<Period>();
        }
        return this.validPeriod;
    }

    /**
     * Gets the value of the exceptionPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the exceptionPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptionPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Period }
     * 
     * 
     */
    public List<Period> getExceptionPeriod() {
        if (exceptionPeriod == null) {
            exceptionPeriod = new ArrayList<Period>();
        }
        return this.exceptionPeriod;
    }

    /**
     * Gets the value of the overallPeriodExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOverallPeriodExtension() {
        return overallPeriodExtension;
    }

    /**
     * Sets the value of the overallPeriodExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOverallPeriodExtension(ExtensionType value) {
        this.overallPeriodExtension = value;
    }

}
