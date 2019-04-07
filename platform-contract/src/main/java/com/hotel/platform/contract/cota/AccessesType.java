
package com.hotel.platform.contract.cota;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Element to capture creation and last update data.
 * 
 * <p>AccessesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AccessesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Access" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AccessPerson" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
 *                   &lt;element name="AccessComment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_Group"/&gt;
 *                 &lt;attribute name="ActionType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                       &lt;enumeration value="Create"/&gt;
 *                       &lt;enumeration value="Read"/&gt;
 *                       &lt;enumeration value="Update"/&gt;
 *                       &lt;enumeration value="Delete"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ActionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/&gt;
 *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessesType", propOrder = {
    "access"
})
public class AccessesType {

    @XmlElement(name = "Access", required = true)
    protected List<Access> access;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;

    /**
     * Gets the value of the access property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the access property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Access }
     * 
     * 
     */
    public List<Access> getAccess() {
        if (access == null) {
            access = new ArrayList<Access>();
        }
        return this.access;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AccessPerson" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
     *         &lt;element name="AccessComment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_Group"/&gt;
     *       &lt;attribute name="ActionType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *             &lt;enumeration value="Create"/&gt;
     *             &lt;enumeration value="Read"/&gt;
     *             &lt;enumeration value="Update"/&gt;
     *             &lt;enumeration value="Delete"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ActionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accessPerson",
        "accessComment"
    })
    public static class Access {

        @XmlElement(name = "AccessPerson")
        protected PersonNameType accessPerson;
        @XmlElement(name = "AccessComment")
        protected FreeTextType accessComment;
        @XmlAttribute(name = "ActionType")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String actionType;
        @XmlAttribute(name = "ActionDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar actionDateTime;
        @XmlAttribute(name = "ID", required = true)
        protected String id;

        /**
         * 获取accessPerson属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PersonNameType }
         *     
         */
        public PersonNameType getAccessPerson() {
            return accessPerson;
        }

        /**
         * 设置accessPerson属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PersonNameType }
         *     
         */
        public void setAccessPerson(PersonNameType value) {
            this.accessPerson = value;
        }

        /**
         * 获取accessComment属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FreeTextType }
         *     
         */
        public FreeTextType getAccessComment() {
            return accessComment;
        }

        /**
         * 设置accessComment属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FreeTextType }
         *     
         */
        public void setAccessComment(FreeTextType value) {
            this.accessComment = value;
        }

        /**
         * 获取actionType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionType() {
            return actionType;
        }

        /**
         * 设置actionType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionType(String value) {
            this.actionType = value;
        }

        /**
         * 获取actionDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getActionDateTime() {
            return actionDateTime;
        }

        /**
         * 设置actionDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setActionDateTime(XMLGregorianCalendar value) {
            this.actionDateTime = value;
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

    }

}
