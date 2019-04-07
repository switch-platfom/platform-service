
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ReservationID"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}GuestRooms"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reservationID",
    "guestRooms"
})
@XmlRootElement(name = "StayInfo")
public class StayInfo {

    @XmlElement(name = "ReservationID", required = true)
    protected ReservationID reservationID;
    @XmlElement(name = "GuestRooms", required = true)
    protected GuestRooms guestRooms;

    /**
     * 获取reservationID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReservationID }
     *     
     */
    public ReservationID getReservationID() {
        return reservationID;
    }

    /**
     * 设置reservationID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationID }
     *     
     */
    public void setReservationID(ReservationID value) {
        this.reservationID = value;
    }

    /**
     * 获取guestRooms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuestRooms }
     *     
     */
    public GuestRooms getGuestRooms() {
        return guestRooms;
    }

    /**
     * 设置guestRooms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuestRooms }
     *     
     */
    public void setGuestRooms(GuestRooms value) {
        this.guestRooms = value;
    }

}
