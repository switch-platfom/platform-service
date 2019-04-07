
package com.hotel.platform.contract.cota;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The guarantee information to hold a reservation
 * 
 * <p>GuaranteeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GuaranteeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuaranteesAccepted" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="GuaranteeAccepted" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType"&gt;
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
 *       &lt;attribute name="GuaranteeCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
 *       &lt;attribute name="GuaranteeType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to32"&gt;
 *             &lt;enumeration value="GuaranteeRequired"/&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="CC/DC/Voucher"/&gt;
 *             &lt;enumeration value="Profile"/&gt;
 *             &lt;enumeration value="Deposit"/&gt;
 *             &lt;enumeration value="PrePay"/&gt;
 *             &lt;enumeration value="DepositRequired"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="HoldTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteeType", propOrder = {
    "guaranteesAccepted"
})
public class GuaranteeType {

    @XmlElement(name = "GuaranteesAccepted")
    protected GuaranteesAccepted guaranteesAccepted;
    @XmlAttribute(name = "GuaranteeCode")
    protected String guaranteeCode;
    @XmlAttribute(name = "GuaranteeType")
    protected String guaranteeType;
    @XmlAttribute(name = "HoldTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar holdTime;

    /**
     * 获取guaranteesAccepted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuaranteesAccepted }
     *     
     */
    public GuaranteesAccepted getGuaranteesAccepted() {
        return guaranteesAccepted;
    }

    /**
     * 设置guaranteesAccepted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteesAccepted }
     *     
     */
    public void setGuaranteesAccepted(GuaranteesAccepted value) {
        this.guaranteesAccepted = value;
    }

    /**
     * 获取guaranteeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeCode() {
        return guaranteeCode;
    }

    /**
     * 设置guaranteeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeCode(String value) {
        this.guaranteeCode = value;
    }

    /**
     * 获取guaranteeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeType() {
        return guaranteeType;
    }

    /**
     * 设置guaranteeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeType(String value) {
        this.guaranteeType = value;
    }

    /**
     * 获取holdTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoldTime() {
        return holdTime;
    }

    /**
     * 设置holdTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoldTime(XMLGregorianCalendar value) {
        this.holdTime = value;
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
     *         &lt;element name="GuaranteeAccepted" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType"&gt;
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
        "guaranteeAccepted"
    })
    public static class GuaranteesAccepted {

        @XmlElement(name = "GuaranteeAccepted", required = true)
        protected List<GuaranteeAccepted> guaranteeAccepted;

        /**
         * Gets the value of the guaranteeAccepted property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guaranteeAccepted property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuaranteeAccepted().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GuaranteeAccepted }
         * 
         * 
         */
        public List<GuaranteeAccepted> getGuaranteeAccepted() {
            if (guaranteeAccepted == null) {
                guaranteeAccepted = new ArrayList<GuaranteeAccepted>();
            }
            return this.guaranteeAccepted;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class GuaranteeAccepted
            extends PaymentFormType
        {


        }

    }

}
