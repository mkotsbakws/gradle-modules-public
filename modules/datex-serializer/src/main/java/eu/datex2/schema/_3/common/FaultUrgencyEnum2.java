
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultUrgencyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FaultUrgencyEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="normal"/&gt;
 *     &lt;enumeration value="urgent"/&gt;
 *     &lt;enumeration value="extremelyUrgent"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FaultUrgencyEnum", namespace = "http://datex2.eu/schema/3/common")
@XmlEnum
public enum FaultUrgencyEnum2 {


    /**
     * The fault is of normal urgency.
     * 
     */
    @XmlEnumValue("normal")
    NORMAL("normal"),

    /**
     * The fault is to be rectified urgent.
     * 
     */
    @XmlEnumValue("urgent")
    URGENT("urgent"),

    /**
     * The fault is to be rectified extremely urgency.
     * 
     */
    @XmlEnumValue("extremelyUrgent")
    EXTREMELY_URGENT("extremelyUrgent"),

    /**
     * The fault is of unknown urgency.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    FaultUrgencyEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FaultUrgencyEnum2 fromValue(String v) {
        for (FaultUrgencyEnum2 c: FaultUrgencyEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
