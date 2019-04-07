
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SeverityCodeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SeverityCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SeverityCodeType")
@XmlEnum
public enum SeverityCodeType {


    /**
     * 
     *             (out) The request that triggered the error was not processed
     *             successfully. When a serious framework, validation or service-level error occurs, the error
     *             is returned instead of the business data.
     *           
     * 
     */
    @XmlEnumValue("Error")
    ERROR("Error"),

    /**
     * 
     *             (out) The request was processed successfully, but something occurred
     *             that may affect your application or the user. For example, ctrip service may have
     *             changed a value the user sent in. In this case, ctrip service returns a normal,
     *             successful response and also returns the warning.
     *           
     * 
     */
    @XmlEnumValue("Warning")
    WARNING("Warning");
    private final String value;

    SeverityCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeverityCodeType fromValue(String v) {
        for (SeverityCodeType c: SeverityCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
