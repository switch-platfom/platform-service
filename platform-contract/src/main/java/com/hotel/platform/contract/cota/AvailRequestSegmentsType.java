
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of AvailRequestSegment. Each segment includes a collection of criteria that requests a bookable entity, which may include designated rate plans, room types, amenities or services, and the request can be used for guest rooms or other inventory items for which availability is sought. Each segment would be presumed to have a unique date range for each request.
 * 
 * <p>AvailRequestSegmentsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AvailRequestSegmentsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvailRequestSegment"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="HotelSearchCriteria"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriteriaType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "AvailRequestSegmentsType", propOrder = {
    "availRequestSegment"
})
@XmlSeeAlso({
    OTAHotelAvailRQ.AvailRequestSegments.class
})
public class AvailRequestSegmentsType {

    @XmlElement(name = "AvailRequestSegment", required = true)
    protected AvailRequestSegment availRequestSegment;

    /**
     * 获取availRequestSegment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AvailRequestSegment }
     *     
     */
    public AvailRequestSegment getAvailRequestSegment() {
        return availRequestSegment;
    }

    /**
     * 设置availRequestSegment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AvailRequestSegment }
     *     
     */
    public void setAvailRequestSegment(AvailRequestSegment value) {
        this.availRequestSegment = value;
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
     *         &lt;element name="HotelSearchCriteria"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriteriaType"&gt;
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
        "hotelSearchCriteria"
    })
    public static class AvailRequestSegment {

        @XmlElement(name = "HotelSearchCriteria", required = true)
        protected HotelSearchCriteria hotelSearchCriteria;

        /**
         * 获取hotelSearchCriteria属性的值。
         * 
         * @return
         *     possible object is
         *     {@link HotelSearchCriteria }
         *     
         */
        public HotelSearchCriteria getHotelSearchCriteria() {
            return hotelSearchCriteria;
        }

        /**
         * 设置hotelSearchCriteria属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link HotelSearchCriteria }
         *     
         */
        public void setHotelSearchCriteria(HotelSearchCriteria value) {
            this.hotelSearchCriteria = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriteriaType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class HotelSearchCriteria
            extends HotelSearchCriteriaType
        {


        }

    }

}
