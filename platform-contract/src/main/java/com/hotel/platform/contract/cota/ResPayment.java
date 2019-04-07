
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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}HotelReservationIDs"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}HotelIDs"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}PaymentType"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TotalAmount"/&gt;
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
    "hotelReservationIDs",
    "hotelIDs",
    "paymentType",
    "totalAmount"
})
@XmlRootElement(name = "ResPayment")
public class ResPayment {

    @XmlElement(name = "HotelReservationIDs", required = true)
    protected HotelReservationIDs hotelReservationIDs;
    @XmlElement(name = "HotelIDs", required = true)
    protected HotelIDs hotelIDs;
    @XmlElement(name = "PaymentType", required = true)
    protected PaymentType paymentType;
    @XmlElement(name = "TotalAmount", required = true)
    protected TotalAmount totalAmount;

    /**
     * 获取hotelReservationIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelReservationIDs }
     *     
     */
    public HotelReservationIDs getHotelReservationIDs() {
        return hotelReservationIDs;
    }

    /**
     * 设置hotelReservationIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservationIDs }
     *     
     */
    public void setHotelReservationIDs(HotelReservationIDs value) {
        this.hotelReservationIDs = value;
    }

    /**
     * 获取hotelIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelIDs }
     *     
     */
    public HotelIDs getHotelIDs() {
        return hotelIDs;
    }

    /**
     * 设置hotelIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelIDs }
     *     
     */
    public void setHotelIDs(HotelIDs value) {
        this.hotelIDs = value;
    }

    /**
     * 获取paymentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * 设置paymentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPaymentType(PaymentType value) {
        this.paymentType = value;
    }

    /**
     * 获取totalAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TotalAmount }
     *     
     */
    public TotalAmount getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置totalAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmount }
     *     
     */
    public void setTotalAmount(TotalAmount value) {
        this.totalAmount = value;
    }

}
