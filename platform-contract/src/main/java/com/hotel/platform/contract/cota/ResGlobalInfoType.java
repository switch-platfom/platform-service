
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * ResGlobalInfo is a container for various information that affects the Reservation as a whole. These include global comments, counts, reservation IDs, loyalty programs, and payment methods.
 * 
 * <p>ResGlobalInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResGlobalInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ResCommonDetailType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelReservationIDs" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationIDsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResGlobalInfoType", propOrder = {
    "hotelReservationIDs"
})
@XmlSeeAlso({
    HotelReservationType.ResGlobalInfo.class,
    HotelResModifyType.ResGlobalInfo.class
})
public class ResGlobalInfoType
    extends ResCommonDetailType
{

    @XmlElement(name = "HotelReservationIDs")
    protected HotelReservationIDsType hotelReservationIDs;

    /**
     * 获取hotelReservationIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelReservationIDsType }
     *     
     */
    public HotelReservationIDsType getHotelReservationIDs() {
        return hotelReservationIDs;
    }

    /**
     * 设置hotelReservationIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservationIDsType }
     *     
     */
    public void setHotelReservationIDs(HotelReservationIDsType value) {
        this.hotelReservationIDs = value;
    }

}
