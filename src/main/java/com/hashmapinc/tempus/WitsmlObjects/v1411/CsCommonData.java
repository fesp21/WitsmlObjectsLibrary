//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  WITSML - Common Data Component Schema 
 * 
 * <p>Java class for cs_commonData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_commonData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sourceName" type="{http://www.witsml.org/schemas/1series}nameString" minOccurs="0"/>
 *         <element name="dTimCreation" type="{http://www.witsml.org/schemas/1series}timestamp" minOccurs="0"/>
 *         <element name="dTimLastChange" type="{http://www.witsml.org/schemas/1series}timestamp" minOccurs="0"/>
 *         <element name="itemState" type="{http://www.witsml.org/schemas/1series}ItemState" minOccurs="0"/>
 *         <element name="serviceCategory" type="{http://www.witsml.org/schemas/1series}kindString" minOccurs="0"/>
 *         <element name="comments" type="{http://www.witsml.org/schemas/1series}commentString" minOccurs="0"/>
 *         <element name="acquisitionTimeZone" type="{http://www.witsml.org/schemas/1series}timestampedTimeZone" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="defaultDatum" type="{http://www.witsml.org/schemas/1series}refNameString" minOccurs="0"/>
 *         <element name="privateGroupOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="extensionAny" type="{http://www.witsml.org/schemas/1series}cs_extensionAny" minOccurs="0"/>
 *         <element name="extensionNameValue" type="{http://www.witsml.org/schemas/1series}cs_extensionNameValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_commonData", propOrder = {
    "sourceName",
    "dTimCreation",
    "dTimLastChange",
    "itemState",
    "serviceCategory",
    "comments",
    "acquisitionTimeZone",
    "defaultDatum",
    "privateGroupOnly",
    "extensionAny",
    "extensionNameValue"
})
public class CsCommonData {

    protected String sourceName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimCreation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimLastChange;
    @XmlSchemaType(name = "string")
    protected ItemState itemState;
    protected String serviceCategory;
    protected String comments;
    protected List<TimestampedTimeZone> acquisitionTimeZone;
    protected RefNameString defaultDatum;
    protected Boolean privateGroupOnly;
    protected CsExtensionAny extensionAny;
    protected List<CsExtensionNameValue> extensionNameValue;

    /**
     * Gets the value of the sourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceName(String value) {
        this.sourceName = value;
    }

    /**
     * Gets the value of the dTimCreation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimCreation() {
        return dTimCreation;
    }

    /**
     * Sets the value of the dTimCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimCreation(XMLGregorianCalendar value) {
        this.dTimCreation = value;
    }

    /**
     * Gets the value of the dTimLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimLastChange() {
        return dTimLastChange;
    }

    /**
     * Sets the value of the dTimLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimLastChange(XMLGregorianCalendar value) {
        this.dTimLastChange = value;
    }

    /**
     * Gets the value of the itemState property.
     * 
     * @return
     *     possible object is
     *     {@link ItemState }
     *     
     */
    public ItemState getItemState() {
        return itemState;
    }

    /**
     * Sets the value of the itemState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemState }
     *     
     */
    public void setItemState(ItemState value) {
        this.itemState = value;
    }

    /**
     * Gets the value of the serviceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCategory() {
        return serviceCategory;
    }

    /**
     * Sets the value of the serviceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCategory(String value) {
        this.serviceCategory = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the acquisitionTimeZone property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acquisitionTimeZone property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getAcquisitionTimeZone().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link TimestampedTimeZone }
     * 
     * 
     */
    public List<TimestampedTimeZone> getAcquisitionTimeZone() {
        if (acquisitionTimeZone == null) {
            acquisitionTimeZone = new ArrayList<TimestampedTimeZone>();
        }
        return this.acquisitionTimeZone;
    }

    /**
     * Gets the value of the defaultDatum property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getDefaultDatum() {
        return defaultDatum;
    }

    /**
     * Sets the value of the defaultDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setDefaultDatum(RefNameString value) {
        this.defaultDatum = value;
    }

    /**
     * Gets the value of the privateGroupOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivateGroupOnly() {
        return privateGroupOnly;
    }

    /**
     * Sets the value of the privateGroupOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivateGroupOnly(Boolean value) {
        this.privateGroupOnly = value;
    }

    /**
     * Gets the value of the extensionAny property.
     * 
     * @return
     *     possible object is
     *     {@link CsExtensionAny }
     *     
     */
    public CsExtensionAny getExtensionAny() {
        return extensionAny;
    }

    /**
     * Sets the value of the extensionAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsExtensionAny }
     *     
     */
    public void setExtensionAny(CsExtensionAny value) {
        this.extensionAny = value;
    }

    /**
     * Gets the value of the extensionNameValue property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionNameValue property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getExtensionNameValue().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsExtensionNameValue }
     * 
     * 
     */
    public List<CsExtensionNameValue> getExtensionNameValue() {
        if (extensionNameValue == null) {
            extensionNameValue = new ArrayList<CsExtensionNameValue>();
        }
        return this.extensionNameValue;
    }

}