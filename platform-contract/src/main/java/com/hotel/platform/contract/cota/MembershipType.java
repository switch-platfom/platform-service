
package com.hotel.platform.contract.cota;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of Membership objects. Memberships provides a list of reward programs which may be credited with points accrued from the guest's activity. Which memberships are to be applied to which part is determined by each object's SelectedMembershipRPHs collection.
 * 
 * <p>MembershipType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MembershipType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Membership" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ProgramCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
 *                 &lt;attribute name="BonusCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
 *                 &lt;attribute name="AccountID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
 *                 &lt;attribute name="PointsEarned" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="TravelSector" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MembershipType", propOrder = {
    "membership"
})
public class MembershipType {

    @XmlElement(name = "Membership", required = true)
    protected List<Membership> membership;

    /**
     * Gets the value of the membership property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the membership property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembership().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Membership }
     * 
     * 
     */
    public List<Membership> getMembership() {
        if (membership == null) {
            membership = new ArrayList<Membership>();
        }
        return this.membership;
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
     *       &lt;attribute name="ProgramCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
     *       &lt;attribute name="BonusCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
     *       &lt;attribute name="AccountID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
     *       &lt;attribute name="PointsEarned" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="TravelSector" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Membership {

        @XmlAttribute(name = "ProgramCode")
        protected String programCode;
        @XmlAttribute(name = "BonusCode")
        protected String bonusCode;
        @XmlAttribute(name = "AccountID")
        protected String accountID;
        @XmlAttribute(name = "PointsEarned")
        protected BigInteger pointsEarned;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;

        /**
         * 获取programCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramCode() {
            return programCode;
        }

        /**
         * 设置programCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramCode(String value) {
            this.programCode = value;
        }

        /**
         * 获取bonusCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBonusCode() {
            return bonusCode;
        }

        /**
         * 设置bonusCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBonusCode(String value) {
            this.bonusCode = value;
        }

        /**
         * 获取accountID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountID() {
            return accountID;
        }

        /**
         * 设置accountID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountID(String value) {
            this.accountID = value;
        }

        /**
         * 获取pointsEarned属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPointsEarned() {
            return pointsEarned;
        }

        /**
         * 设置pointsEarned属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPointsEarned(BigInteger value) {
            this.pointsEarned = value;
        }

        /**
         * 获取travelSector属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * 设置travelSector属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
        }

    }

}
