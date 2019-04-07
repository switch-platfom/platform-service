
package com.hotel.platform.contract.cota;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A Collection of HotelReservationID objects for a given reservation. The collection of all ReservationIDs can include Passenger Name Record (PNR), Guest Name Record (GNR) and Guest Folio numbers. Associated with each can be a Confirmation number which is usually given to the guest.
 * 
 * <p>HotelReservationIDsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelReservationIDsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelReservationID" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ResID_Type" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *                 &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelReservationIDsType", propOrder = {
    "hotelReservationID"
})
public class HotelReservationIDsType {

    @XmlElement(name = "HotelReservationID", required = true)
    protected List<HotelReservationID> hotelReservationID;

    /**
     * Gets the value of the hotelReservationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelReservationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelReservationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelReservationID }
     * 
     * 
     */
    public List<HotelReservationID> getHotelReservationID() {
        if (hotelReservationID == null) {
            hotelReservationID = new ArrayList<HotelReservationID>();
        }
        return this.hotelReservationID;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="ResID_Type" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
     *       &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelReservationID {

        @XmlAttribute(name = "ResID_Type")
        protected String resIDType;
        @XmlAttribute(name = "ResID_Value")
        protected String resIDValue;

        /**
         * 获取resIDType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResIDType() {
            return resIDType;
        }

        /**
         * 设置resIDType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResIDType(String value) {
            this.resIDType = value;
        }

        /**
         * 获取resIDValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResIDValue() {
            return resIDValue;
        }

        /**
         * 设置resIDValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResIDValue(String value) {
            this.resIDValue = value;
        }

    }

}
