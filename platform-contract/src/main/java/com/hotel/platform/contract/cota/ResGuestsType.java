
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of ResGuest objects, identifying the guests associated with this reservation. Which guests are in which room is determined by each RoomStays ResGuestRPHs collection.
 * 
 * <p>ResGuestsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResGuestsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResGuest" type="{http://www.opentravel.org/OTA/2003/05}ResGuestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResGuestsType", propOrder = {
    "resGuest"
})
public class ResGuestsType {

    @XmlElement(name = "ResGuest", required = true)
    protected ResGuestType resGuest;

    /**
     * 获取resGuest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResGuestType }
     *     
     */
    public ResGuestType getResGuest() {
        return resGuest;
    }

    /**
     * 设置resGuest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResGuestType }
     *     
     */
    public void setResGuest(ResGuestType value) {
        this.resGuest = value;
    }

}
