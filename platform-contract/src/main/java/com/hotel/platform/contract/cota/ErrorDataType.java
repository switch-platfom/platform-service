
package com.hotel.platform.contract.cota;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         This is serivce, validation or framework-level error.
 *       
 * 
 * <p>ErrorDataType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ErrorDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Message"&gt;
 *         &lt;element name="ErrorCode"&gt;
 *         &lt;element name="StackTrace" minOccurs="0"/&gt;
 *         &lt;element name="SeverityCode" &gt;
 *         &lt;element name="ErrorFields"  maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ErrorClassification" &gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorDataType", propOrder = {
    "message",
    "errorCode",
    "stackTrace",
    "severityCode",
    "errorFields",
    "errorClassification"
})
public class ErrorDataType {

    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "ErrorCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String errorCode;
    @XmlElement(name = "StackTrace")
    protected String stackTrace;
    @XmlElement(name = "SeverityCode", required = true)
    @XmlSchemaType(name = "token")
    protected SeverityCodeType severityCode;
    @XmlElement(name = "ErrorFields")
    protected List<ErrorFieldType> errorFields;
    @XmlElement(name = "ErrorClassification", required = true)
    @XmlSchemaType(name = "token")
    protected ErrorClassificationCodeType errorClassification;

    /**
     * 获取message属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置message属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * 获取errorCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 设置errorCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * 获取stackTrace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackTrace() {
        return stackTrace;
    }

    /**
     * 设置stackTrace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackTrace(String value) {
        this.stackTrace = value;
    }

    /**
     * 获取severityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeverityCodeType }
     *     
     */
    public SeverityCodeType getSeverityCode() {
        return severityCode;
    }

    /**
     * 设置severityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityCodeType }
     *     
     */
    public void setSeverityCode(SeverityCodeType value) {
        this.severityCode = value;
    }

    /**
     * Gets the value of the errorFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorFieldType }
     * 
     * 
     */
    public List<ErrorFieldType> getErrorFields() {
        if (errorFields == null) {
            errorFields = new ArrayList<ErrorFieldType>();
        }
        return this.errorFields;
    }

    /**
     * 获取errorClassification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ErrorClassificationCodeType }
     *     
     */
    public ErrorClassificationCodeType getErrorClassification() {
        return errorClassification;
    }

    /**
     * 设置errorClassification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorClassificationCodeType }
     *     
     */
    public void setErrorClassification(ErrorClassificationCodeType value) {
        this.errorClassification = value;
    }

}
