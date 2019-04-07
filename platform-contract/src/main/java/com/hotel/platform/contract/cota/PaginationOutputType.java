
package com.hotel.platform.contract.cota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Shows the pagination data for the item search. Child elements include the
 *         page number returned, the maximum entries returned per page, the total number
 *         of pages that can be returned, and the total number of items that match the
 *         search criteria.
 *       
 * 
 * <p>PaginationOutputType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PaginationOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EntriesPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalEntries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaginationOutputType", propOrder = {
    "pageNumber",
    "entriesPerPage",
    "totalPages",
    "totalEntries"
})
public class PaginationOutputType {

    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "EntriesPerPage")
    protected Integer entriesPerPage;
    @XmlElement(name = "TotalPages")
    protected Integer totalPages;
    @XmlElement(name = "TotalEntries")
    protected Integer totalEntries;

    /**
     * 获取pageNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * 设置pageNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * 获取entriesPerPage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntriesPerPage() {
        return entriesPerPage;
    }

    /**
     * 设置entriesPerPage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntriesPerPage(Integer value) {
        this.entriesPerPage = value;
    }

    /**
     * 获取totalPages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * 设置totalPages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPages(Integer value) {
        this.totalPages = value;
    }

    /**
     * 获取totalEntries属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalEntries() {
        return totalEntries;
    }

    /**
     * 设置totalEntries属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalEntries(Integer value) {
        this.totalEntries = value;
    }

}
