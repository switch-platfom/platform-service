
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="GuestPayAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RoomAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DepositAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NoInvoiceAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Currency" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "TotalAmount")
public class TotalAmount {

    @XmlAttribute(name = "GuestPayAmount", required = true)
    protected String guestPayAmount;
    @XmlAttribute(name = "RoomAmount", required = true)
    protected String roomAmount;
    @XmlAttribute(name = "DepositAmount", required = true)
    protected String depositAmount;
    @XmlAttribute(name = "NoInvoiceAmount", required = true)
    protected String noInvoiceAmount;
    @XmlAttribute(name = "Currency", required = true)
    protected String currency;

    /**
     * 获取guestPayAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestPayAmount() {
        return guestPayAmount;
    }

    /**
     * 设置guestPayAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestPayAmount(String value) {
        this.guestPayAmount = value;
    }

    /**
     * 获取roomAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomAmount() {
        return roomAmount;
    }

    /**
     * 设置roomAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomAmount(String value) {
        this.roomAmount = value;
    }

    /**
     * 获取depositAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositAmount() {
        return depositAmount;
    }

    /**
     * 设置depositAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositAmount(String value) {
        this.depositAmount = value;
    }

    /**
     * 获取noInvoiceAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoInvoiceAmount() {
        return noInvoiceAmount;
    }

    /**
     * 设置noInvoiceAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoInvoiceAmount(String value) {
        this.noInvoiceAmount = value;
    }

    /**
     * 获取currency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置currency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
