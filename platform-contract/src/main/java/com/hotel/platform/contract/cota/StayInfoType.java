
package com.hotel.platform.contract.cota;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The StayInfo class contains the guest revenue and stay data to be sent to the central server.
 * 
 * <p>StayInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StayInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RevenueCategories" type="{http://www.opentravel.org/OTA/2003/05}RevenueCategoriesType" minOccurs="0"/&gt;
 *         &lt;element name="ReservationID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *         &lt;element name="HotelReservation" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="RoomStayRPH" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StayInfoType", propOrder = {
    "revenueCategories",
    "reservationID",
    "hotelReservation"
})
public class StayInfoType {

    @XmlElement(name = "RevenueCategories")
    protected RevenueCategoriesType revenueCategories;
    @XmlElement(name = "ReservationID")
    protected UniqueIDType reservationID;
    @XmlElement(name = "HotelReservation")
    protected HotelReservationType hotelReservation;
    @XmlAttribute(name = "SequenceNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    @XmlAttribute(name = "RoomStayRPH")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger roomStayRPH;

    /**
     * 获取revenueCategories属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RevenueCategoriesType }
     *     
     */
    public RevenueCategoriesType getRevenueCategories() {
        return revenueCategories;
    }

    /**
     * 设置revenueCategories属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RevenueCategoriesType }
     *     
     */
    public void setRevenueCategories(RevenueCategoriesType value) {
        this.revenueCategories = value;
    }

    /**
     * 获取reservationID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getReservationID() {
        return reservationID;
    }

    /**
     * 设置reservationID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setReservationID(UniqueIDType value) {
        this.reservationID = value;
    }

    /**
     * 获取hotelReservation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelReservationType }
     *     
     */
    public HotelReservationType getHotelReservation() {
        return hotelReservation;
    }

    /**
     * 设置hotelReservation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservationType }
     *     
     */
    public void setHotelReservation(HotelReservationType value) {
        this.hotelReservation = value;
    }

    /**
     * 获取sequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * 设置sequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * 获取roomStayRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRoomStayRPH() {
        return roomStayRPH;
    }

    /**
     * 设置roomStayRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoomStayRPH(BigInteger value) {
        this.roomStayRPH = value;
    }

}
