
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Ways of providing funds and guarantees for travel by the individual.
 * 
 * <p>PaymentFormType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PaymentFormType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="PaymentCard" type="{http://www.opentravel.org/OTA/2003/05}PaymentCardType" minOccurs="0"/&gt;
 *         &lt;element name="MiscChargeOrder" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="TicketNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Cash"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="CashIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentFormType", propOrder = {
    "paymentCard",
    "miscChargeOrder",
    "cash"
})
@XmlSeeAlso({
    GuaranteeType.GuaranteesAccepted.GuaranteeAccepted.class
})
public class PaymentFormType {

    @XmlElement(name = "PaymentCard")
    protected PaymentCardType paymentCard;
    @XmlElement(name = "MiscChargeOrder")
    protected MiscChargeOrder miscChargeOrder;
    @XmlElement(name = "Cash")
    protected Cash cash;

    /**
     * 获取paymentCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType }
     *     
     */
    public PaymentCardType getPaymentCard() {
        return paymentCard;
    }

    /**
     * 设置paymentCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType }
     *     
     */
    public void setPaymentCard(PaymentCardType value) {
        this.paymentCard = value;
    }

    /**
     * 获取miscChargeOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MiscChargeOrder }
     *     
     */
    public MiscChargeOrder getMiscChargeOrder() {
        return miscChargeOrder;
    }

    /**
     * 设置miscChargeOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MiscChargeOrder }
     *     
     */
    public void setMiscChargeOrder(MiscChargeOrder value) {
        this.miscChargeOrder = value;
    }

    /**
     * 获取cash属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Cash }
     *     
     */
    public Cash getCash() {
        return cash;
    }

    /**
     * 设置cash属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Cash }
     *     
     */
    public void setCash(Cash value) {
        this.cash = value;
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
     *       &lt;attribute name="CashIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Cash {

        @XmlAttribute(name = "CashIndicator", required = true)
        protected boolean cashIndicator;

        /**
         * 获取cashIndicator属性的值。
         * 
         */
        public boolean isCashIndicator() {
            return cashIndicator;
        }

        /**
         * 设置cashIndicator属性的值。
         * 
         */
        public void setCashIndicator(boolean value) {
            this.cashIndicator = value;
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
     *       &lt;attribute name="TicketNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MiscChargeOrder {

        @XmlAttribute(name = "TicketNumber")
        protected String ticketNumber;

        /**
         * 获取ticketNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketNumber() {
            return ticketNumber;
        }

        /**
         * 设置ticketNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketNumber(String value) {
            this.ticketNumber = value;
        }

    }

}
