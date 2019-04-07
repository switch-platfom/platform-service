
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A TransportInfo object is used to indicate transportation information for a guest.
 * 
 * <p>TransportInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TransportInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransportInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
 *                 &lt;attribute name="ID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
 *                 &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
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
@XmlType(name = "TransportInfoType", propOrder = {
    "transportInfo"
})
public class TransportInfoType {

    @XmlElement(name = "TransportInfo", required = true)
    protected TransportInfo transportInfo;

    /**
     * 获取transportInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransportInfo }
     *     
     */
    public TransportInfo getTransportInfo() {
        return transportInfo;
    }

    /**
     * 设置transportInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransportInfo }
     *     
     */
    public void setTransportInfo(TransportInfo value) {
        this.transportInfo = value;
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
     *       &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
     *       &lt;attribute name="ID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
     *       &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TransportInfo {

        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "ID")
        protected String id;
        @XmlAttribute(name = "Time")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar time;

        /**
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * 获取id属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * 设置id属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * 获取time属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTime() {
            return time;
        }

        /**
         * 设置time属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTime(XMLGregorianCalendar value) {
            this.time = value;
        }

    }

}
