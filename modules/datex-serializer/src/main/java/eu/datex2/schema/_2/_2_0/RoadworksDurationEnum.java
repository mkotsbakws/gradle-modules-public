
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadworksDurationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RoadworksDurationEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="longTerm"/&gt;
 *     &lt;enumeration value="mediumTerm"/&gt;
 *     &lt;enumeration value="shortTerm"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoadworksDurationEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum RoadworksDurationEnum {

    @XmlEnumValue("longTerm")
    LONG_TERM("longTerm"),
    @XmlEnumValue("mediumTerm")
    MEDIUM_TERM("mediumTerm"),
    @XmlEnumValue("shortTerm")
    SHORT_TERM("shortTerm");
    private final String value;

    RoadworksDurationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadworksDurationEnum fromValue(String v) {
        for (RoadworksDurationEnum c: RoadworksDurationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
