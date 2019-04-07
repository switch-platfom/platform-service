
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to define the types of payments accepted.
 * 
 * <p>AcceptedPaymentsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AcceptedPaymentsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptedPayment" type="{http://www.opentravel.org/OTA/2003/05}PaymentFormType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptedPaymentsType", propOrder = {
    "acceptedPayment"
})
public class AcceptedPaymentsType {

    @XmlElement(name = "AcceptedPayment", required = true)
    protected PaymentFormType acceptedPayment;

    /**
     * 获取acceptedPayment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType }
     *     
     */
    public PaymentFormType getAcceptedPayment() {
        return acceptedPayment;
    }

    /**
     * 设置acceptedPayment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType }
     *     
     */
    public void setAcceptedPayment(PaymentFormType value) {
        this.acceptedPayment = value;
    }

}
