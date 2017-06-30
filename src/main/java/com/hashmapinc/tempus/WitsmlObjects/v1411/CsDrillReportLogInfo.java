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
 * <p>Java class for cs_drillReportLogInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_drillReportLogInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dTim" type="{http://www.witsml.org/schemas/1series}timestamp" minOccurs="0"/>
 *         <element name="runNumber" type="{http://www.witsml.org/schemas/1series}str16" minOccurs="0"/>
 *         <element name="serviceCompany" type="{http://www.witsml.org/schemas/1series}nameString" minOccurs="0"/>
 *         <element name="mdTop" type="{http://www.witsml.org/schemas/1series}measuredDepthCoord" minOccurs="0"/>
 *         <element name="mdBottom" type="{http://www.witsml.org/schemas/1series}measuredDepthCoord" minOccurs="0"/>
 *         <element name="tvdTop" type="{http://www.witsml.org/schemas/1series}wellVerticalDepthCoord" minOccurs="0"/>
 *         <element name="tvdBottom" type="{http://www.witsml.org/schemas/1series}wellVerticalDepthCoord" minOccurs="0"/>
 *         <element name="tool" type="{http://www.witsml.org/schemas/1series}kindString" minOccurs="0"/>
 *         <choice>
 *           <element name="tempBHCT" type="{http://www.witsml.org/schemas/1series}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *           <sequence>
 *             <element name="tempBHST" type="{http://www.witsml.org/schemas/1series}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *             <element name="eTimStatic" type="{http://www.witsml.org/schemas/1series}timeMeasure" minOccurs="0"/>
 *           </sequence>
 *         </choice>
 *         <element name="mdTempTool" type="{http://www.witsml.org/schemas/1series}measuredDepthCoord" minOccurs="0"/>
 *         <element name="tvdTempTool" type="{http://www.witsml.org/schemas/1series}wellVerticalDepthCoord" minOccurs="0"/>
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
@XmlType(name = "cs_drillReportLogInfo", propOrder = {
    "dTim",
    "runNumber",
    "serviceCompany",
    "mdTop",
    "mdBottom",
    "tvdTop",
    "tvdBottom",
    "tool",
    "tempBHCT",
    "tempBHST",
    "eTimStatic",
    "mdTempTool",
    "tvdTempTool",
    "extensionNameValue"
})
public class CsDrillReportLogInfo {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTim;
    protected String runNumber;
    protected String serviceCompany;
    protected MeasuredDepthCoord mdTop;
    protected MeasuredDepthCoord mdBottom;
    protected WellVerticalDepthCoord tvdTop;
    protected WellVerticalDepthCoord tvdBottom;
    protected String tool;
    protected ThermodynamicTemperatureMeasure tempBHCT;
    protected ThermodynamicTemperatureMeasure tempBHST;
    protected TimeMeasure eTimStatic;
    protected MeasuredDepthCoord mdTempTool;
    protected WellVerticalDepthCoord tvdTempTool;
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
     * Gets the value of the runNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunNumber() {
        return runNumber;
    }

    /**
     * Sets the value of the runNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunNumber(String value) {
        this.runNumber = value;
    }

    /**
     * Gets the value of the serviceCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCompany() {
        return serviceCompany;
    }

    /**
     * Sets the value of the serviceCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCompany(String value) {
        this.serviceCompany = value;
    }

    /**
     * Gets the value of the mdTop property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdTop() {
        return mdTop;
    }

    /**
     * Sets the value of the mdTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdTop(MeasuredDepthCoord value) {
        this.mdTop = value;
    }

    /**
     * Gets the value of the mdBottom property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdBottom() {
        return mdBottom;
    }

    /**
     * Sets the value of the mdBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdBottom(MeasuredDepthCoord value) {
        this.mdBottom = value;
    }

    /**
     * Gets the value of the tvdTop property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdTop() {
        return tvdTop;
    }

    /**
     * Sets the value of the tvdTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdTop(WellVerticalDepthCoord value) {
        this.tvdTop = value;
    }

    /**
     * Gets the value of the tvdBottom property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdBottom() {
        return tvdBottom;
    }

    /**
     * Sets the value of the tvdBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdBottom(WellVerticalDepthCoord value) {
        this.tvdBottom = value;
    }

    /**
     * Gets the value of the tool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTool() {
        return tool;
    }

    /**
     * Sets the value of the tool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTool(String value) {
        this.tool = value;
    }

    /**
     * Gets the value of the tempBHCT property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempBHCT() {
        return tempBHCT;
    }

    /**
     * Sets the value of the tempBHCT property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempBHCT(ThermodynamicTemperatureMeasure value) {
        this.tempBHCT = value;
    }

    /**
     * Gets the value of the tempBHST property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempBHST() {
        return tempBHST;
    }

    /**
     * Sets the value of the tempBHST property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempBHST(ThermodynamicTemperatureMeasure value) {
        this.tempBHST = value;
    }

    /**
     * Gets the value of the eTimStatic property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimStatic() {
        return eTimStatic;
    }

    /**
     * Sets the value of the eTimStatic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimStatic(TimeMeasure value) {
        this.eTimStatic = value;
    }

    /**
     * Gets the value of the mdTempTool property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdTempTool() {
        return mdTempTool;
    }

    /**
     * Sets the value of the mdTempTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdTempTool(MeasuredDepthCoord value) {
        this.mdTempTool = value;
    }

    /**
     * Gets the value of the tvdTempTool property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdTempTool() {
        return tvdTempTool;
    }

    /**
     * Sets the value of the tvdTempTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdTempTool(WellVerticalDepthCoord value) {
        this.tvdTempTool = value;
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