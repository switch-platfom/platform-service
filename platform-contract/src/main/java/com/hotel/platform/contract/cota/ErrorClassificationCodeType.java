
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ErrorClassificationCodeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorClassificationCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ServiceError"/&gt;
 *     &lt;enumeration value="ValidationError"/&gt;
 *     &lt;enumeration value="FrameworkError"/&gt;
 *     &lt;enumeration value="SLAError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErrorClassificationCodeType")
@XmlEnum
public enum ErrorClassificationCodeType {


    /**
     * 
     *             Indicates that an error has occurred in the service implementation, such as business logic error or other backend error.
     *           
     * 
     */
    @XmlEnumValue("ServiceError")
    SERVICE_ERROR("ServiceError"),

    /**
     * 
     *             Indicates that an error has occurred because of framework-level request validation failure.
     *             This is usually because client consumer has attempted to submit invalid data (or missing data)
     *             in the request when making API call.
     *           
     * 
     */
    @XmlEnumValue("ValidationError")
    VALIDATION_ERROR("ValidationError"),

    /**
     * 
     *             Indicates that an error has occurred in the ctrip soa framework(CServiceStack), such as a serialization/descrialization failure.
     *           
     * 
     */
    @XmlEnumValue("FrameworkError")
    FRAMEWORK_ERROR("FrameworkError"),

    /**
     * 
     *             Indicates that a ctrip service is unable to meet a specified service level agreement.
     *             typical cases that will cause this error including: 1) continues high service call latency;
     *             2) continues high service call error rate, in these cases, to avoid further service deterioration,
     *             the service framework will enter into a self-protecting mode, by tripping the service call circuit
     *             and return SLAError to clients. Later, when the situation improves, the service framework will
     *             close the service call circuit again and continue to serve the clients.
     *           
     * 
     */
    @XmlEnumValue("SLAError")
    SLA_ERROR("SLAError");
    private final String value;

    ErrorClassificationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorClassificationCodeType fromValue(String v) {
        for (ErrorClassificationCodeType c: ErrorClassificationCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
