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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cs_drillReportFormTestInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_drillReportFormTestInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dTim" type="{http://www.witsml.org/schemas/1series}timestamp" minOccurs="0"/>
 *         <element name="md" type="{http://www.witsml.org/schemas/1series}measuredDepthCoord" minOccurs="0"/>
 *         <element name="tvd" type="{http://www.witsml.org/schemas/1series}wellVerticalDepthCoord" minOccurs="0"/>
 *         <element name="presPore" type="{http://www.witsml.org/schemas/1series}pressureMeasure" minOccurs="0"/>
 *         <element name="goodSeal" type="{http://www.witsml.org/schemas/1series}logicalBoolean" minOccurs="0"/>
 *         <element name="mdSample" type="{http://www.witsml.org/schemas/1series}measuredDepthCoord" minOccurs="0"/>
 *         <element name="dominateComponent" type="{http://www.witsml.org/schemas/1series}kindString" minOccurs="0"/>
 *         <element name="densityHC" type="{http://www.witsml.org/schemas/1series}densityMeasure" minOccurs="0"/>
 *         <element name="volumeSample" type="{http://www.witsml.org/schemas/1series}volumeMeasure" minOccurs="0"/>
 *         <element name="description" type="{http://www.witsml.org/schemas/1series}descriptionString" minOccurs="0"/>
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
@XmlType(name = "cs_drillReportFormTestInfo", propOrder = {
    "dTim",
    "md",
    "tvd",
    "presPore",
    "goodSeal",
    "mdSample",
    "dominateComponent",
    "densityHC",
    "volumeSample",
    "description",
    "extensionNameValue"
})
public class CsDrillReportFormTestInfo {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTim;
    protected MeasuredDepthCoord md;
    protected WellVerticalDepthCoord tvd;
    protected PressureMeasure presPore;
    protected Boolean goodSeal;
    protected MeasuredDepthCoord mdSample;
    protected String dominateComponent;
    protected DensityMeasure densityHC;
    protected VolumeMeasure volumeSample;
    protected String description;
    protected List<CsExtensionNameValue> extensionNameValue;
    @XmlAttribute(name = "uid")
    protected String uid;

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
     * Gets the value of the presPore property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresPore() {
        return presPore;
    }

    /**
     * Sets the value of the presPore property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresPore(PressureMeasure value) {
        this.presPore = value;
    }

    /**
     * Gets the value of the goodSeal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoodSeal() {
        return goodSeal;
    }

    /**
     * Sets the value of the goodSeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoodSeal(Boolean value) {
        this.goodSeal = value;
    }

    /**
     * Gets the value of the mdSample property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdSample() {
        return mdSample;
    }

    /**
     * Sets the value of the mdSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdSample(MeasuredDepthCoord value) {
        this.mdSample = value;
    }

    /**
     * Gets the value of the dominateComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDominateComponent() {
        return dominateComponent;
    }

    /**
     * Sets the value of the dominateComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDominateComponent(String value) {
        this.dominateComponent = value;
    }

    /**
     * Gets the value of the densityHC property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getDensityHC() {
        return densityHC;
    }

    /**
     * Sets the value of the densityHC property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setDensityHC(DensityMeasure value) {
        this.densityHC = value;
    }

    /**
     * Gets the value of the volumeSample property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolumeSample() {
        return volumeSample;
    }

    /**
     * Sets the value of the volumeSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolumeSample(VolumeMeasure value) {
        this.volumeSample = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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