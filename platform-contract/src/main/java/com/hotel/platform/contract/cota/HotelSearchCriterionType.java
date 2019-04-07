
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of Profile objects or Unique IDs of Profiles.
 * 
 * <p>HotelSearchCriterionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelSearchCriterionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ItemSearchCriterionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StayDateRange" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType"/&gt;
 *         &lt;element name="RatePlanCandidates" type="{http://www.opentravel.org/OTA/2003/05}RatePlanCandidatesType"/&gt;
 *         &lt;element name="RoomStayCandidates"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RoomStayCandidate"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType"/&gt;
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
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelSearchCriterionType", propOrder = {
    "stayDateRange",
    "ratePlanCandidates",
    "roomStayCandidates",
    "tpaExtensions"
})
@XmlSeeAlso({
    HotelSearchCriteriaType.Criterion.class
})
public class HotelSearchCriterionType
    extends ItemSearchCriterionType
{

    @XmlElement(name = "StayDateRange", required = true)
    protected DateTimeSpanType stayDateRange;
    @XmlElement(name = "RatePlanCandidates", required = true)
    protected RatePlanCandidatesType ratePlanCandidates;
    @XmlElement(name = "RoomStayCandidates", required = true)
    protected RoomStayCandidates roomStayCandidates;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * 获取stayDateRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType }
     *     
     */
    public DateTimeSpanType getStayDateRange() {
        return stayDateRange;
    }

    /**
     * 设置stayDateRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType }
     *     
     */
    public void setStayDateRange(DateTimeSpanType value) {
        this.stayDateRange = value;
    }

    /**
     * 获取ratePlanCandidates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanCandidatesType }
     *     
     */
    public RatePlanCandidatesType getRatePlanCandidates() {
        return ratePlanCandidates;
    }

    /**
     * 设置ratePlanCandidates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanCandidatesType }
     *     
     */
    public void setRatePlanCandidates(RatePlanCandidatesType value) {
        this.ratePlanCandidates = value;
    }

    /**
     * 获取roomStayCandidates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomStayCandidates }
     *     
     */
    public RoomStayCandidates getRoomStayCandidates() {
        return roomStayCandidates;
    }

    /**
     * 设置roomStayCandidates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomStayCandidates }
     *     
     */
    public void setRoomStayCandidates(RoomStayCandidates value) {
        this.roomStayCandidates = value;
    }

    /**
     * 获取tpaExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * 设置tpaExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
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
     *         &lt;element name="RoomStayCandidate"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType"/&gt;
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
        "roomStayCandidate"
    })
    public static class RoomStayCandidates {

        @XmlElement(name = "RoomStayCandidate", required = true)
        protected RoomStayCandidate roomStayCandidate;

        /**
         * 获取roomStayCandidate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RoomStayCandidate }
         *     
         */
        public RoomStayCandidate getRoomStayCandidate() {
            return roomStayCandidate;
        }

        /**
         * 设置roomStayCandidate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RoomStayCandidate }
         *     
         */
        public void setRoomStayCandidate(RoomStayCandidate value) {
            this.roomStayCandidate = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType"/&gt;
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
            "guestCounts"
        })
        public static class RoomStayCandidate
            extends RoomStayCandidateType
        {

            @XmlElement(name = "GuestCounts", required = true)
            protected GuestCountType guestCounts;

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

        }

    }

}
