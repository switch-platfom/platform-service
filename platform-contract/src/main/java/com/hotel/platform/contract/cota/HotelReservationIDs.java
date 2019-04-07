
package com.hotel.platform.contract.cota;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}HotelReservationID" maxOccurs="2" minOccurs="2"/&gt;
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
    "hotelReservationID"
})
@XmlRootElement(name = "HotelReservationIDs")
public class HotelReservationIDs {

    @XmlElement(name = "HotelReservationID", required = true)
    protected List<HotelReservationID> hotelReservationID;

    /**
     * Gets the value of the hotelReservationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelReservationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelReservationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelReservationID }
     * 
     * 
     */
    public List<HotelReservationID> getHotelReservationID() {
        if (hotelReservationID == null) {
            hotelReservationID = new ArrayList<HotelReservationID>();
        }
        return this.hotelReservationID;
    }

}
