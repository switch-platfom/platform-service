
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides information on the source of a request.
 * 
 * <p>SourceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SourceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestorID"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="MessagePassword" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
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
@XmlType(name = "SourceType", propOrder = {
    "requestorID"
})
public class SourceType {

    @XmlElement(name = "RequestorID", required = true)
    protected RequestorID requestorID;

    /**
     * 获取requestorID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RequestorID }
     *     
     */
    public RequestorID getRequestorID() {
        return requestorID;
    }

    /**
     * 设置requestorID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RequestorID }
     *     
     */
    public void setRequestorID(RequestorID value) {
        this.requestorID = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="MessagePassword" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "companyName"
    })
    public static class RequestorID
        extends UniqueIDType
    {

        @XmlElement(name = "CompanyName")
        protected CompanyNameType companyName;
        @XmlAttribute(name = "MessagePassword")
        protected String messagePassword;

        /**
         * 获取companyName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CompanyNameType }
         *     
         */
        public CompanyNameType getCompanyName() {
            return companyName;
        }

        /**
         * 设置companyName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyNameType }
         *     
         */
        public void setCompanyName(CompanyNameType value) {
            this.companyName = value;
        }

        /**
         * 获取messagePassword属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessagePassword() {
            return messagePassword;
        }

        /**
         * 设置messagePassword属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessagePassword(String value) {
            this.messagePassword = value;
        }

    }

}
