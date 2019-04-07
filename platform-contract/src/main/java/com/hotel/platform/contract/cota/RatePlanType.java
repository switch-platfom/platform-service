
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Information significant to defining a rate plan.
 *
 * <p>RatePlanType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="RatePlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancelPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType"/&gt;
 *         &lt;element name="MealsIncluded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MealsIncludedGroup"/&gt;
 *                 &lt;attribute name="NumberOfMeal" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="NumberOfBreakfast" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RatePlanDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RatePlanCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
 *       &lt;attribute name="RatePlanCategory" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
 *       &lt;attribute name="PrepaidIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RatePlanID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlanType", propOrder = {
        "cancelPenalties",
        "mealsIncluded",
        "ratePlanDescription"
})
@XmlSeeAlso({
        RoomStayType.RatePlans.RatePlan.class
})
public class RatePlanType {

    @XmlElement(name = "CancelPenalties", required = true)
    protected CancelPenaltiesType cancelPenalties;
    @XmlElement(name = "MealsIncluded")
    protected RatePlanType.MealsIncluded mealsIncluded;
    @XmlElement(name = "RatePlanDescription")
    protected ParagraphType ratePlanDescription;
    @XmlAttribute(name = "RatePlanCode", required = true)
    protected String ratePlanCode;
    @XmlAttribute(name = "RatePlanCategory")
    protected String ratePlanCategory;
    @XmlAttribute(name = "PrepaidIndicator")
    protected Boolean prepaidIndicator;
    @XmlAttribute(name = "RatePlanID")
    protected String ratePlanID;

    /**
     * 获取cancelPenalties属性的值。
     *
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *
     */
    public CancelPenaltiesType getCancelPenalties() {
        return cancelPenalties;
    }

    /**
     * 设置cancelPenalties属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *
     */
    public void setCancelPenalties(CancelPenaltiesType value) {
        this.cancelPenalties = value;
    }

    /**
     * 获取mealsIncluded属性的值。
     *
     * @return
     *     possible object is
     *     {@link RatePlanType.MealsIncluded }
     *
     */
    public RatePlanType.MealsIncluded getMealsIncluded() {
        return mealsIncluded;
    }

    /**
     * 设置mealsIncluded属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link RatePlanType.MealsIncluded }
     *
     */
    public void setMealsIncluded(RatePlanType.MealsIncluded value) {
        this.mealsIncluded = value;
    }

    /**
     * 获取ratePlanDescription属性的值。
     *
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *
     */
    public ParagraphType getRatePlanDescription() {
        return ratePlanDescription;
    }

    /**
     * 设置ratePlanDescription属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *
     */
    public void setRatePlanDescription(ParagraphType value) {
        this.ratePlanDescription = value;
    }

    /**
     * 获取ratePlanCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * 设置ratePlanCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * 获取ratePlanCategory属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRatePlanCategory() {
        return ratePlanCategory;
    }

    /**
     * 设置ratePlanCategory属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRatePlanCategory(String value) {
        this.ratePlanCategory = value;
    }

    /**
     * 获取prepaidIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isPrepaidIndicator() {
        return prepaidIndicator;
    }

    /**
     * 设置prepaidIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setPrepaidIndicator(Boolean value) {
        this.prepaidIndicator = value;
    }

    /**
     * 获取ratePlanID属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRatePlanID() {
        return ratePlanID;
    }

    /**
     * 设置ratePlanID属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRatePlanID(String value) {
        this.ratePlanID = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MealsIncludedGroup"/&gt;
     *       &lt;attribute name="NumberOfMeal" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="NumberOfBreakfast" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MealsIncluded {

        @XmlAttribute(name = "NumberOfMeal")
        protected Integer numberOfMeal;
        @XmlAttribute(name = "NumberOfBreakfast")
        protected Integer numberOfBreakfast;
        @XmlAttribute(name = "Breakfast")
        protected Boolean breakfast;
        @XmlAttribute(name = "Lunch")
        protected Boolean lunch;
        @XmlAttribute(name = "Dinner")
        protected Boolean dinner;

        /**
         * 获取numberOfMeal属性的值。
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        public Integer getNumberOfMeal() {
            return numberOfMeal;
        }

        /**
         * 设置numberOfMeal属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setNumberOfMeal(Integer value) {
            this.numberOfMeal = value;
        }

        /**
         * 获取numberOfBreakfast属性的值。
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        public Integer getNumberOfBreakfast() {
            return numberOfBreakfast;
        }

        /**
         * 设置numberOfBreakfast属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setNumberOfBreakfast(Integer value) {
            this.numberOfBreakfast = value;
        }

        /**
         * 获取breakfast属性的值。
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isBreakfast() {
            return breakfast;
        }

        /**
         * 设置breakfast属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setBreakfast(Boolean value) {
            this.breakfast = value;
        }

        /**
         * 获取lunch属性的值。
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isLunch() {
            return lunch;
        }

        /**
         * 设置lunch属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setLunch(Boolean value) {
            this.lunch = value;
        }

        /**
         * 获取dinner属性的值。
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isDinner() {
            return dinner;
        }

        /**
         * 设置dinner属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setDinner(Boolean value) {
            this.dinner = value;
        }

    }

}
