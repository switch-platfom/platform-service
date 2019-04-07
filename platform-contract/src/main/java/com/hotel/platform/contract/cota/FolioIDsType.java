
package com.hotel.platform.contract.cota;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Collection of strings (recommended length - 20 characters) indicating the PMS folio identifiers associated with this revenue detail item.
 * 
 * <p>FolioIDsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FolioIDsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FolioID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" maxOccurs="99"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolioIDsType", propOrder = {
    "folioID"
})
public class FolioIDsType {

    @XmlElement(name = "FolioID", required = true)
    protected List<String> folioID;

    /**
     * Gets the value of the folioID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folioID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolioID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFolioID() {
        if (folioID == null) {
            folioID = new ArrayList<String>();
        }
        return this.folioID;
    }

}
