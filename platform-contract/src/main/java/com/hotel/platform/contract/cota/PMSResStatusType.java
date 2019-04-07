
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PMS_ResStatusType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PMS_ResStatusType"&gt;
 *   &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to16"&gt;
 *     &lt;enumeration value="Reserved"/&gt;
 *     &lt;enumeration value="Requested"/&gt;
 *     &lt;enumeration value="Request denied"/&gt;
 *     &lt;enumeration value="No-show"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="In-house"/&gt;
 *     &lt;enumeration value="Checked out"/&gt;
 *     &lt;enumeration value="Waitlisted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PMS_ResStatusType")
@XmlEnum
public enum PMSResStatusType {


    /**
     * The reservation has been reserved.
     * 
     */
    @XmlEnumValue("Reserved")
    RESERVED("Reserved"),

    /**
     * The reservation has been requested but has not yet been reserved.
     * 
     */
    @XmlEnumValue("Requested")
    REQUESTED("Requested"),

    /**
     * The request for the reservation has been denied.
     * 
     */
    @XmlEnumValue("Request denied")
    REQUEST_DENIED("Request denied"),

    /**
     * This reservation is in "no show" status. Typically this means the person for whom this reservation belonged did not check in and the reservation was moved to "no show" status.
     * 
     */
    @XmlEnumValue("No-show")
    NO_SHOW("No-show"),

    /**
     * This reservation has been cancelled.
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * This reservation has been check in, and is in "in-house" status.
     * 
     */
    @XmlEnumValue("In-house")
    IN_HOUSE("In-house"),

    /**
     * The guest has checked out and the reservation has been changed to "Checked out" status
     * 
     */
    @XmlEnumValue("Checked out")
    CHECKED_OUT("Checked out"),

    /**
     * This reservation is in waitlist status and the reservation has not been confirmed.
     * 
     */
    @XmlEnumValue("Waitlisted")
    WAITLISTED("Waitlisted");
    private final String value;

    PMSResStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PMSResStatusType fromValue(String v) {
        for (PMSResStatusType c: PMSResStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
