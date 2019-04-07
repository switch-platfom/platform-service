
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The Reservation class contains the current reservation being created or altered.
 * 
 * <p>HotelResModifyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelResModifyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomStays" type="{http://www.opentravel.org/OTA/2003/05}RoomStaysType" minOccurs="0"/&gt;
 *         &lt;element name="ResGuests" type="{http://www.opentravel.org/OTA/2003/05}ResGuestsType" minOccurs="0"/&gt;
 *         &lt;element name="ResGlobalInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ResGlobalInfoType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeStampGroup"/&gt;
 *       &lt;attribute name="ResStatus" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelResModifyType", propOrder = {
    "roomStays",
    "resGuests",
    "resGlobalInfo"
})
@XmlSeeAlso({
    HotelResModifiesType.HotelResModify.class
})
public class HotelResModifyType {

    @XmlElement(name = "RoomStays")
    protected RoomStaysType roomStays;
    @XmlElement(name = "ResGuests")
    protected ResGuestsType resGuests;
    @XmlElement(name = "ResGlobalInfo")
    protected ResGlobalInfo resGlobalInfo;
    @XmlAttribute(name = "ResStatus")
    protected String resStatus;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlAttribute(name = "CreatorID")
    protected String creatorID;

    /**
     * 获取roomStays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomStaysType }
     *     
     */
    public RoomStaysType getRoomStays() {
        return roomStays;
    }

    /**
     * 设置roomStays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomStaysType }
     *     
     */
    public void setRoomStays(RoomStaysType value) {
        this.roomStays = value;
    }

    /**
     * 获取resGuests属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResGuestsType }
     *     
     */
    public ResGuestsType getResGuests() {
        return resGuests;
    }

    /**
     * 设置resGuests属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResGuestsType }
     *     
     */
    public void setResGuests(ResGuestsType value) {
        this.resGuests = value;
    }

    /**
     * 获取resGlobalInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResGlobalInfo }
     *     
     */
    public ResGlobalInfo getResGlobalInfo() {
        return resGlobalInfo;
    }

    /**
     * 设置resGlobalInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResGlobalInfo }
     *     
     */
    public void setResGlobalInfo(ResGlobalInfo value) {
        this.resGlobalInfo = value;
    }

    /**
     * 获取resStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResStatus() {
        return resStatus;
    }

    /**
     * 设置resStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResStatus(String value) {
        this.resStatus = value;
    }

    /**
     * 获取createDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * 设置createDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * 获取creatorID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * 设置creatorID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ResGlobalInfoType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ResGlobalInfo
        extends ResGlobalInfoType
    {


    }

}
