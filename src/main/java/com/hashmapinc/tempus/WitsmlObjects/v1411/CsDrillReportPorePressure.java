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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cs_drillReportPorePressure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_drillReportPorePressure">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="readingKind" type="{http://www.witsml.org/schemas/1series}ReadingKind"/>
 *         <element name="equivalentMudWeight" type="{http://www.witsml.org/schemas/1series}densityMeasure"/>
 *         <element name="dTim" type="{http://www.witsml.org/schemas/1series}timestamp" minOccurs="0"/>
 *         <element name="md" type="{http://www.witsml.org/schemas/1series}measuredDepthCoord" minOccurs="0"/>
 *         <element name="tvd" type="{http://www.witsml.org/schemas/1series}wellVerticalDepthCoord" minOccurs="0"/>
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
@XmlType(name = "cs_drillReportPorePressure", propOrder = {
    "readingKind",
    "equivalentMudWeight",
    "dTim",
    "md",
    "tvd",
    "extensionNameValue"
})
public class CsDrillReportPorePressure {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected String readingKind;
    @XmlElement(required = true)
    protected DensityMeasure equivalentMudWeight;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTim;
    protected MeasuredDepthCoord md;
    protected WellVerticalDepthCoord tvd;
    protected List<CsExtensionNameValue> extensionNameValue;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the readingKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadingKind() {
        return readingKind;
    }

    /**
     * Sets the value of the readingKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadingKind(String value) {
        this.readingKind = value;
    }

    /**
     * Gets the value of the equivalentMudWeight property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getEquivalentMudWeight() {
        return equivalentMudWeight;
    }

    /**
     * Sets the value of the equivalentMudWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setEquivalentMudWeight(DensityMeasure value) {
        this.equivalentMudWeight = value;
    }

    /**
     * Gets the value of the dTim property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTim() {
        return dTim;
    }

    /**
     * Sets the value of the dTim property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTim(XMLGregorianCalendar value) {
        this.dTim = value;
    }

    /**
     * Gets the value of the md property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMd() {
        return md;
    }

    /**
     * Sets the value of the md property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMd(MeasuredDepthCoord value) {
        this.md = value;
    }

    /**
     * Gets the value of the tvd property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvd() {
        return tvd;
    }

    /**
     * Sets the value of the tvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvd(WellVerticalDepthCoord value) {
        this.tvd = value;
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
