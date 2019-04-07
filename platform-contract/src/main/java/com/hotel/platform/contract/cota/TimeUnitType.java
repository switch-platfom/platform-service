
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TimeUnitType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TimeUnitType"&gt;
 *   &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to16"&gt;
 *     &lt;enumeration value="Year"/&gt;
 *     &lt;enumeration value="Month"/&gt;
 *     &lt;enumeration value="Week"/&gt;
 *     &lt;enumeration value="Day"/&gt;
 *     &lt;enumeration value="Hour"/&gt;
 *     &lt;enumeration value="Second"/&gt;
 *     &lt;enumeration value="FullDuration"/&gt;
 *     &lt;enumeration value="Minute"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeUnitType")
@XmlEnum
public enum TimeUnitType {

    @XmlEnumValue("Year")
    YEAR("Year"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("Hour")
    HOUR("Hour"),
    @XmlEnumValue("Second")
    SECOND("Second"),
    @XmlEnumValue("FullDuration")
    FULL_DURATION("FullDuration"),
    @XmlEnumValue("Minute")
    MINUTE("Minute");
    private final String value;

    TimeUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeUnitType fromValue(String v) {
        for (TimeUnitType c: TimeUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
