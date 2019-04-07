
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AckCodeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AckCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="Failure"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="PartialFailure"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AckCodeType")
@XmlEnum
public enum AckCodeType {


    /**
     * 
     *             (out) Request processing succeeded
     *           
     * 
     */
    @XmlEnumValue("Success")
    SUCCESS("Success"),

    /**
     * 
     *             (out) Request processing failed
     *           
     * 
     */
    @XmlEnumValue("Failure")
    FAILURE("Failure"),

    /**
     * 
     *             (out) Request processing completed with warning information
     *             being included in the response message
     *           
     * 
     */
    @XmlEnumValue("Warning")
    WARNING("Warning"),

    /**
     * 
     *             (out) Request processing completed with some failures.
     *             See the Errors data to determine which portions of the request failed.
     *           
     * 
     */
    @XmlEnumValue("PartialFailure")
    PARTIAL_FAILURE("PartialFailure");
    private final String value;

    AckCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AckCodeType fromValue(String v) {
        for (AckCodeType c: AckCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
