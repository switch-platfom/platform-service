
package com.hotel.platform.contract.cota;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of required payments.
 * 
 * <p>
 * RequiredPaymentsType complex type的 Java 类。
 * 
 * <p>
 * 以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RequiredPaymentsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuaranteePayment" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AmountPercent"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountPercentType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="GuaranteeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
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
@XmlType(name = "RequiredPaymentsType", propOrder = {"guaranteePayment"})
public class RequiredPaymentsType {

    @XmlElement(name = "GuaranteePayment", required = true)
    protected List<GuaranteePayment> guaranteePayment;

    /**
     * Gets the value of the guaranteePayment property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the guaranteePayment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getGuaranteePayment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link RequiredPaymentsType.GuaranteePayment }
     *
     *
     */
    public List<GuaranteePayment> getGuaranteePayment() {
        if (guaranteePayment == null) {
            guaranteePayment = new ArrayList<GuaranteePayment>();
        }
        return this.guaranteePayment;
    }


    /**
     * <p>
     * anonymous complex type的 Java 类。
     *
     * <p>
     * 以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AmountPercent"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountPercentType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="GuaranteeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"amountPercent", "description","guaranteeCode","acceptedPayments"})
    public static class GuaranteePayment {

        @XmlElement(name = "AmountPercent", required = true)
        protected RequiredPaymentsType.GuaranteePayment.AmountPercent amountPercent;
        @XmlElement(name = "Description")
        protected ParagraphType description;
        @XmlAttribute(name = "GuaranteeCode", required = true)
        protected String guaranteeCode;
        @XmlElement(name = "AcceptedPayments")
        protected AcceptedPaymentsType acceptedPayments;

        public AcceptedPaymentsType getAcceptedPayments() {
            return acceptedPayments;
        }

        public void setAcceptedPayments(AcceptedPaymentsType value) {
            this.acceptedPayments = value;
        }

        /**
         * 获取amountPercent属性的值。
         *
         * @return possible object is {@link RequiredPaymentsType.GuaranteePayment.AmountPercent }
         *
         */
        public RequiredPaymentsType.GuaranteePayment.AmountPercent getAmountPercent() {
            return amountPercent;
        }

        /**
         * 设置amountPercent属性的值。
         *
         * @param value allowed object is {@link RequiredPaymentsType.GuaranteePayment.AmountPercent }
         *
         */
        public void setAmountPercent(RequiredPaymentsType.GuaranteePayment.AmountPercent value) {
            this.amountPercent = value;
        }

        /**
         * 获取description属性的值。
         * 
         * @return possible object is {@link ParagraphType }
         * 
         */
        public ParagraphType getDescription() {
            return description;
        }

        /**
         * 设置description属性的值。
         * 
         * @param value allowed object is {@link ParagraphType }
         * 
         */
        public void setDescription(ParagraphType value) {
            this.description = value;
        }

        /**
         * 获取guaranteeCode属性的值。
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getGuaranteeCode() {
            return guaranteeCode;
        }

        /**
         * 设置guaranteeCode属性的值。
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setGuaranteeCode(String value) {
            this.guaranteeCode = value;
        }


        /**
         * <p>
         * anonymous complex type的 Java 类。
         * 
         * <p>
         * 以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountPercentType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AmountPercent extends AmountPercentType {


        }

    }

}
