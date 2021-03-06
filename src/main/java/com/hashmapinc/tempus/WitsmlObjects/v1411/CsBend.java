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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Tubular Bend Component Schema.
 * 
 * <p>Java class for cs_bend complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_bend">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="angle" type="{http://www.witsml.org/schemas/1series}planeAngleMeasure" minOccurs="0"/>
 *         <element name="distBendBot" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="customData" type="{http://www.witsml.org/schemas/1series}cs_customData" minOccurs="0"/>
 *         <element name="extensionAny" type="{http://www.witsml.org/schemas/1series}cs_extensionAny" minOccurs="0"/>
 *         <element name="extensionNameValue" type="{http://www.witsml.org/schemas/1series}cs_extensionNameValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/1series}attgrp_uid"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_bend", propOrder = {
    "angle",
    "distBendBot",
    "customData",
    "extensionAny",
    "extensionNameValue"
})
public class CsBend {

    protected PlaneAngleMeasure angle;
    protected LengthMeasure distBendBot;
    protected CsCustomData customData;
    protected CsExtensionAny extensionAny;
    protected List<CsExtensionNameValue> extensionNameValue;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the angle property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getAngle() {
        return angle;
    }

    /**
     * Sets the value of the angle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setAngle(PlaneAngleMeasure value) {
        this.angle = value;
    }

    /**
     * Gets the value of the distBendBot property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDistBendBot() {
        return distBendBot;
    }

    /**
     * Sets the value of the distBendBot property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDistBendBot(LengthMeasure value) {
        this.distBendBot = value;
    }

    /**
     * Gets the value of the customData property.
     * 
     * @return
     *     possible object is
     *     {@link CsCustomData }
     *     
     */
    public CsCustomData getCustomData() {
        return customData;
    }

    /**
     * Sets the value of the customData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsCustomData }
     *     
     */
    public void setCustomData(CsCustomData value) {
        this.customData = value;
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

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

}
