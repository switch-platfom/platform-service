
package com.hotel.platform.contract.cota;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of RevenueCategory classes that detail the categories of revenue data associated with the StayInfo report.
 * 
 * <p>RevenueCategoriesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RevenueCategoriesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RevenueCategory" type="{http://www.opentravel.org/OTA/2003/05}RevenueCategoryType" maxOccurs="99"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevenueCategoriesType", propOrder = {
    "revenueCategory"
})
public class RevenueCategoriesType {

    @XmlElement(name = "RevenueCategory", required = true)
    protected List<RevenueCategoryType> revenueCategory;

    /**
     * Gets the value of the revenueCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revenueCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevenueCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevenueCategoryType }
     * 
     * 
     */
    public List<RevenueCategoryType> getRevenueCategory() {
        if (revenueCategory == null) {
            revenueCategory = new ArrayList<RevenueCategoryType>();
        }
        return this.revenueCategory;
    }

}
