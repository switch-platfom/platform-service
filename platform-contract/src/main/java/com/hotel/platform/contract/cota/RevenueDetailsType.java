
package com.hotel.platform.contract.cota;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The line item detail of specific revenue transactions.
 * 
 * <p>RevenueDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RevenueDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RevenueDetail" type="{http://www.opentravel.org/OTA/2003/05}RevenueDetailType" maxOccurs="99"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevenueDetailsType", propOrder = {
    "revenueDetail"
})
public class RevenueDetailsType {

    @XmlElement(name = "RevenueDetail", required = true)
    protected List<RevenueDetailType> revenueDetail;

    /**
     * Gets the value of the revenueDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revenueDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevenueDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevenueDetailType }
     * 
     * 
     */
    public List<RevenueDetailType> getRevenueDetail() {
        if (revenueDetail == null) {
            revenueDetail = new ArrayList<RevenueDetailType>();
        }
        return this.revenueDetail;
    }

}
