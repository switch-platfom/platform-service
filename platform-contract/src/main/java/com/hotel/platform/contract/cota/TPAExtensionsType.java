
package com.hotel.platform.contract.cota;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Allows extensions to be added to the OpenTravel specification per trading partner agreement.
 * 
 * <p>TPA_ExtensionsType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="TPA_ExtensionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LateArrivalTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrTimeOrDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="IsReserved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPA_ExtensionsType", propOrder = {
    "extraPersonCharge",
    "lateArrivalTime",
    "isReserved",
    "quickCheckIn",
    "depositAmount"
})
public class TPAExtensionsType {
    @XmlElement(name = "ExtraPersonCharge")
    protected TPAExtensionsType.ExtraPersonChargeType extraPersonCharge;
    @XmlElement(name = "LateArrivalTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String lateArrivalTime;
    @XmlElement(name = "IsReserved")
    protected Boolean isReserved;
    @XmlElement(name = "QuickCheckIn")
    protected Boolean quickCheckIn;
    @XmlElement(name = "DepositAmount")
    protected BigDecimal depositAmount;

    /**
     * 获取lateArrivalTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLateArrivalTime() {
        return lateArrivalTime;
    }

    /**
     * 设置lateArrivalTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLateArrivalTime(String value) {
        this.lateArrivalTime = value;
    }

    /**
     * 获取isReserved属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsReserved() {
        return isReserved;
    }

    /**
     * 设置isReserved属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsReserved(Boolean value) {
        this.isReserved = value;
    }

    public ExtraPersonChargeType getExtraPersonCharge() {
        return extraPersonCharge;
    }

    public void setExtraPersonCharge(ExtraPersonChargeType extraPersonCharge) {
        this.extraPersonCharge = extraPersonCharge;
    }

    public Boolean getReserved() {
        return isReserved;
    }

    public void setReserved(Boolean value) {
        isReserved = value;
    }

    public Boolean getQuickCheckIn() {
        return quickCheckIn;
    }

    public void setQuickCheckIn(Boolean value) {
        this.quickCheckIn = value;
    }

    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(BigDecimal value) {
        this.depositAmount = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "ExtraPersonChargeType", propOrder = {
    })
    public static class ExtraPersonChargeType{
        @XmlAttribute(name = "EffectiveOcc")
        private int effectiveOcc;
        @XmlAttribute(name = "AmountBeforeTax")
        private double amountBeforeTax;
        @XmlAttribute(name = "AmountBeforeTaxSpecified")
        private boolean amountBeforeTaxSpecified;
        @XmlAttribute(name = "AmountAfterTax")
        private double amountAfterTax;
        @XmlAttribute(name = "AmountAfterTaxSpecified")
        private boolean amountAfterTaxSpecified;

        public int getEffectiveOcc() {
            return effectiveOcc;
        }

        public void setEffectiveOcc(int effectiveOcc) {
            this.effectiveOcc = effectiveOcc;
        }

        public double getAmountBeforeTax() {
            return amountBeforeTax;
        }

        public void setAmountBeforeTax(double amountBeforeTax) {
            this.amountBeforeTax = amountBeforeTax;
        }

        public boolean isAmountBeforeTaxSpecified() {
            return amountBeforeTaxSpecified;
        }

        public void setAmountBeforeTaxSpecified(boolean amountBeforeTaxSpecified) {
            this.amountBeforeTaxSpecified = amountBeforeTaxSpecified;
        }

        public double getAmountAfterTax() {
            return amountAfterTax;
        }

        public void setAmountAfterTax(double amountAfterTax) {
            this.amountAfterTax = amountAfterTax;
        }

        public boolean isAmountAfterTaxSpecified() {
            return amountAfterTaxSpecified;
        }

        public void setAmountAfterTaxSpecified(boolean amountAfterTaxSpecified) {
            this.amountAfterTaxSpecified = amountAfterTaxSpecified;
        }
    }
}
