
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionYAbsoluteEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PositionYAbsoluteEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="atTop"/&gt;
 *     &lt;enumeration value="inTheMiddle"/&gt;
 *     &lt;enumeration value="atBottom"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PositionYAbsoluteEnum", namespace = "http://datex2.eu/schema/3/vms")
@XmlEnum
public enum PositionYAbsoluteEnum2 {


    /**
     * At the top of the assigned space.
     * 
     */
    @XmlEnumValue("atTop")
    AT_TOP("atTop"),

    /**
     * In the middle of the assigned space.
     * 
     */
    @XmlEnumValue("inTheMiddle")
    IN_THE_MIDDLE("inTheMiddle"),

    /**
     * At the bottom of the assigned space.
     * 
     */
    @XmlEnumValue("atBottom")
    AT_BOTTOM("atBottom"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    PositionYAbsoluteEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionYAbsoluteEnum2 fromValue(String v) {
        for (PositionYAbsoluteEnum2 c: PositionYAbsoluteEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
