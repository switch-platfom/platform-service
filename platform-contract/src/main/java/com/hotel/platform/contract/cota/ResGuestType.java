
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of ResGuest objects, identifying the guests associated with this reservation. Which guests are in which
 * room is determined by each RoomStays ResGuestRPHs collection.
 * 
 * <p>
 * ResGuestType complex type的 Java 类。
 * 
 * <p>
 * 以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResGuestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ProfilesType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ArrivalTime" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResGuestType", propOrder = {"profiles"})
public class ResGuestType {

    @XmlElement(name = "Profiles", required = true)
    protected ProfilesType profiles;
    @XmlAttribute(name = "ArrivalTime")
    protected String arrivalTime;
    @XmlAttribute(name = "EarlyArrivalTime")
    protected String earlyArrivalTime;
    @XmlAttribute(name = "LastArrivalTime")
    protected String lastArrivalTime;

    /**
     * 获取profiles属性的值。
     * 
     * @return possible object is {@link ProfilesType }
     * 
     */
    public ProfilesType getProfiles() {
        return profiles;
    }

    /**
     * 设置profiles属性的值。
     * 
     * @param value allowed object is {@link ProfilesType }
     * 
     */
    public void setProfiles(ProfilesType value) {
        this.profiles = value;
    }

    /**
     * 获取arrivalTime属性的值。
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * 设置arrivalTime属性的值。
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }


    public String getEarlyArrivalTime() {
        return earlyArrivalTime;
    }

    public void setEarlyArrivalTime(String value) {
        this.earlyArrivalTime = value;
    }

    public String getLastArrivalTime() {
        return lastArrivalTime;
    }

    public void setLastArrivalTime(String value) {
        this.lastArrivalTime = value;
    }
}
