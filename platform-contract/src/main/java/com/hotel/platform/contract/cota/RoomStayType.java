
package com.hotel.platform.contract.cota;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Details on the Room Stay including Guest Counts, Time Span of this Room Stay, pointers to Res Guests, guest Memberships, Comments and Special Requests pertaining to this particular Room Stay and finally finacial information related to the Room Stay, including Guarantee, Deposit and Payment and Cancellation Penalties.
 * 
 * <p>RoomStayType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomStayType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomTypes"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RoomType" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomTypeType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="RoomDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RatePlans"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RatePlan" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RatePlanType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RoomRates"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RoomRate" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomRateType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType"/&gt;
 *         &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/&gt;
 *         &lt;element name="DepositPayments" type="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomStayType", propOrder = {
    "roomTypes",
    "ratePlans",
    "roomRates",
    "guestCounts",
    "total",
    "depositPayments",
    "availabilityStatus",
    "basicPropertyInfo"
})
@XmlSeeAlso({
    RoomStaysType.RoomStay.class
})
public class RoomStayType {

    @XmlElement(name = "RoomTypes", required = true)
    protected RoomStayType.RoomTypes roomTypes;
    @XmlElement(name = "RatePlans", required = true)
    protected RoomStayType.RatePlans ratePlans;
    @XmlElement(name = "RoomRates", required = true)
    protected RoomStayType.RoomRates roomRates;
    @XmlElement(name = "GuestCounts", required = true)
    protected GuestCountType guestCounts;
    @XmlElement(name = "Total")
    protected TotalType total;
    @XmlElement(name = "DepositPayments")
    protected RequiredPaymentsType depositPayments;
    @XmlElement(name = "AvailabilityStatus")
    protected String availabilityStatus;
    @XmlElement(name = "BasicPropertyInfo")
    protected BasicPropertyInfoType basicPropertyInfo;

    /**
     * 获取roomTypes属性的值。
     *
     * @return
     *     possible object is
     *     {@link RoomStayType.RoomTypes }
     *
     */
    public RoomStayType.RoomTypes getRoomTypes() {
        return roomTypes;
    }

    /**
     * 设置roomTypes属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link RoomStayType.RoomTypes }
     *
     */
    public void setRoomTypes(RoomStayType.RoomTypes value) {
        this.roomTypes = value;
    }

    /**
     * 获取ratePlans属性的值。
     *
     * @return
     *     possible object is
     *     {@link RoomStayType.RatePlans }
     *
     */
    public RoomStayType.RatePlans getRatePlans() {
        return ratePlans;
    }

    /**
     * 设置ratePlans属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link RoomStayType.RatePlans }
     *
     */
    public void setRatePlans(RoomStayType.RatePlans value) {
        this.ratePlans = value;
    }

    /**
     * 获取roomRates属性的值。
     *
     * @return
     *     possible object is
     *     {@link RoomStayType.RoomRates }
     *
     */
    public RoomStayType.RoomRates getRoomRates() {
        return roomRates;
    }

    /**
     * 设置roomRates属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link RoomStayType.RoomRates }
     *
     */
    public void setRoomRates(RoomStayType.RoomRates value) {
        this.roomRates = value;
    }

    /**
     * 获取guestCounts属性的值。
     *
     * @return
     *     possible object is
     *     {@link GuestCountType }
     *
     */
    public GuestCountType getGuestCounts() {
        return guestCounts;
    }

    /**
     * 设置guestCounts属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link GuestCountType }
     *
     */
    public void setGuestCounts(GuestCountType value) {
        this.guestCounts = value;
    }

    /**
     * 获取total属性的值。
     *
     * @return
     *     possible object is
     *     {@link TotalType }
     *
     */
    public TotalType getTotal() {
        return total;
    }

    /**
     * 设置total属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link TotalType }
     *
     */
    public void setTotal(TotalType value) {
        this.total = value;
    }

    /**
     * 获取depositPayments属性的值。
     *
     * @return
     *     possible object is
     *     {@link RequiredPaymentsType }
     *
     */
    public RequiredPaymentsType getDepositPayments() {
        return depositPayments;
    }

    /**
     * 设置depositPayments属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link RequiredPaymentsType }
     *
     */
    public void setDepositPayments(RequiredPaymentsType value) {
        this.depositPayments = value;
    }

    /**
     * 获取availabilityStatus属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * 设置availabilityStatus属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAvailabilityStatus(String value) {
        this.availabilityStatus = value;
    }

    public BasicPropertyInfoType getBasicPropertyInfo() {
        return basicPropertyInfo;
    }

    public void setBasicPropertyInfo(BasicPropertyInfoType value) {
        this.basicPropertyInfo = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="RatePlan" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RatePlanType"&gt;
     *               &lt;/extension&gt;
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
    @XmlType(name = "", propOrder = {
        "ratePlan"
    })
    public static class RatePlans {

        @XmlElement(name = "RatePlan", required = true)
        protected List<RatePlan> ratePlan;

        /**
         * Gets the value of the ratePlan property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ratePlan property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRatePlan().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoomStayType.RatePlans.RatePlan }
         *
         *
         */
        public List<RatePlan> getRatePlan() {
            if (ratePlan == null) {
                ratePlan = new ArrayList<RatePlan>();
            }
            return this.ratePlan;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RatePlanType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RatePlan
            extends RatePlanType
        {


        }

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
     *       &lt;sequence&gt;
     *         &lt;element name="RoomRate" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomRateType"&gt;
     *               &lt;/extension&gt;
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
    @XmlType(name = "", propOrder = {
        "roomRate"
    })
    public static class RoomRates {

        @XmlElement(name = "RoomRate", required = true)
        protected List<RoomRate> roomRate;

        /**
         * Gets the value of the roomRate property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomRate property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomRate().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoomStayType.RoomRates.RoomRate }
         *
         *
         */
        public List<RoomRate> getRoomRate() {
            if (roomRate == null) {
                roomRate = new ArrayList<RoomRate>();
            }
            return this.roomRate;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomRateType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RoomRate
            extends RoomRateType
        {


        }

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
     *       &lt;sequence&gt;
     *         &lt;element name="RoomType" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomTypeType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="RoomDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
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
    @XmlType(name = "", propOrder = {
        "roomType"
    })
    public static class RoomTypes {

        @XmlElement(name = "RoomType", required = true)
        protected List<RoomType> roomType;

        /**
         * Gets the value of the roomType property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomType property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomType().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoomStayType.RoomTypes.RoomType }
         *
         *
         */
        public List<RoomType> getRoomType() {
            if (roomType == null) {
                roomType = new ArrayList<RoomType>();
            }
            return this.roomType;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomTypeType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="RoomDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "roomDescription"
        })
        public static class RoomType
            extends RoomTypeType
        {

            @XmlElement(name = "RoomDescription")
            protected ParagraphType roomDescription;

            /**
             * 获取roomDescription属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ParagraphType }
             *     
             */
            public ParagraphType getRoomDescription() {
                return roomDescription;
            }

            /**
             * 设置roomDescription属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ParagraphType }
             *     
             */
            public void setRoomDescription(ParagraphType value) {
                this.roomDescription = value;
            }

        }

    }

}
