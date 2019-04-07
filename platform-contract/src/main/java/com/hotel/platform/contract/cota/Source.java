
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}RequestorID"/&gt;
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
    "requestorID"
})
@XmlRootElement(name = "Source")
public class Source {

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

}
