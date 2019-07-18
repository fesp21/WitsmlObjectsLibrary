//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.06.26 at 03:00:38 PM CDT
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * WITSML Log - Curve Information
 *
 * <p>Java class for cs_logCurveInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <complexType name="cs_logCurveInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mnemonic" type="{http://www.witsml.org/schemas/1series}shortNameStruct"/>
 *         <element name="classWitsml" type="{http://www.witsml.org/schemas/1series}descriptionString" minOccurs="0"/>
 *         <element name="classIndex" type="{http://www.witsml.org/schemas/1series}positiveCount" minOccurs="0"/>
 *         <element name="unit" type="{http://www.witsml.org/schemas/1series}uomString" minOccurs="0"/>
 *         <element name="mnemAlias" type="{http://www.witsml.org/schemas/1series}shortNameStruct" minOccurs="0"/>
 *         <element name="nullValue" type="{http://www.witsml.org/schemas/1series}encodedValueString" minOccurs="0"/>
 *         <element name="alternateIndex" type="{http://www.witsml.org/schemas/1series}logicalBoolean" minOccurs="0"/>
 *         <element name="wellDatum" type="{http://www.witsml.org/schemas/1series}refNameString" minOccurs="0"/>
 *         <element name="minIndex" type="{http://www.witsml.org/schemas/1series}genericMeasure" minOccurs="0"/>
 *         <element name="maxIndex" type="{http://www.witsml.org/schemas/1series}genericMeasure" minOccurs="0"/>
 *         <element name="minDateTimeIndex" type="{http://www.witsml.org/schemas/1series}timestamp" minOccurs="0"/>
 *         <element name="maxDateTimeIndex" type="{http://www.witsml.org/schemas/1series}timestamp" minOccurs="0"/>
 *         <element name="curveDescription" type="{http://www.witsml.org/schemas/1series}descriptionString" minOccurs="0"/>
 *         <element name="sensorOffset" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="dataSource" type="{http://www.witsml.org/schemas/1series}str32" minOccurs="0"/>
 *         <element name="densData" type="{http://www.witsml.org/schemas/1series}perLengthMeasure" minOccurs="0"/>
 *         <element name="traceState" type="{http://www.witsml.org/schemas/1series}LogTraceState" minOccurs="0"/>
 *         <element name="traceOrigin" type="{http://www.witsml.org/schemas/1series}LogTraceOrigin" minOccurs="0"/>
 *         <element name="typeLogData" type="{http://www.witsml.org/schemas/1series}LogDataType"/>
 *         <element name="axisDefinition" type="{http://www.witsml.org/schemas/1series}cs_axisDefinition" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "cs_logCurveInfo", propOrder = {
        "mnemonic",
        "classWitsml",
        "classIndex",
        "unit",
        "mnemAlias",
        "nullValue",
        "alternateIndex",
        "wellDatum",
        "minIndex",
        "maxIndex",
        "minDateTimeIndex",
        "maxDateTimeIndex",
        "curveDescription",
        "sensorOffset",
        "dataSource",
        "densData",
        "traceState",
        "traceOrigin",
        "typeLogData",
        "axisDefinition",
        "extensionNameValue"
})
public class CsLogCurveInfo {

    @XmlElement(required = true)
    protected ShortNameStruct mnemonic;
    protected String classWitsml;
    protected String classIndex;
    protected String unit;
    protected ShortNameStruct mnemAlias;
    protected String nullValue;
    protected String alternateIndex;
    protected RefNameString wellDatum;
    protected GenericMeasure minIndex;
    protected GenericMeasure maxIndex;
    @XmlSchemaType(name = "dateTime")
    protected String minDateTimeIndex;
    @XmlSchemaType(name = "dateTime")
    protected String maxDateTimeIndex;
    protected String curveDescription;
    protected LengthMeasure sensorOffset;
    protected String dataSource;
    protected PerLengthMeasure densData;
    @XmlSchemaType(name = "string")
    protected String traceState;
    @XmlSchemaType(name = "string")
    protected String traceOrigin;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected String typeLogData;
    protected List<CsAxisDefinition> axisDefinition;
    protected List<CsExtensionNameValue> extensionNameValue;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the mnemonic property.
     *
     * @return
     *     possible object is
     *     {@link ShortNameStruct }
     *
     */
    public ShortNameStruct getMnemonic() {
        return mnemonic;
    }

    /**
     * Sets the value of the mnemonic property.
     *
     * @param value
     *     allowed object is
     *     {@link ShortNameStruct }
     *
     */
    public void setMnemonic(ShortNameStruct value) {
        this.mnemonic = value;
    }

    /**
     * Gets the value of the classWitsml property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClassWitsml() {
        return classWitsml;
    }

    /**
     * Sets the value of the classWitsml property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClassWitsml(String value) {
        this.classWitsml = value;
    }

    /**
     * Gets the value of the classIndex property.
     *
     * @return
     *     possible object is
     *     {@link Short }
     *
     */
    public String getClassIndex() {
        return classIndex;
    }

    /**
     * Sets the value of the classIndex property.
     *
     * @param value
     *     allowed object is
     *     {@link Short }
     *
     */
    public void setClassIndex(String value) {
        this.classIndex = value;
    }

    /**
     * Gets the value of the unit property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the mnemAlias property.
     *
     * @return
     *     possible object is
     *     {@link ShortNameStruct }
     *
     */
    public ShortNameStruct getMnemAlias() {
        return mnemAlias;
    }

    /**
     * Sets the value of the mnemAlias property.
     *
     * @param value
     *     allowed object is
     *     {@link ShortNameStruct }
     *
     */
    public void setMnemAlias(ShortNameStruct value) {
        this.mnemAlias = value;
    }

    /**
     * Gets the value of the nullValue property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNullValue() {
        return nullValue;
    }

    /**
     * Sets the value of the nullValue property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNullValue(String value) {
        this.nullValue = value;
    }

    /**
     * Gets the value of the alternateIndex property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public String isAlternateIndex() {
        return alternateIndex;
    }

    /**
     * Sets the value of the alternateIndex property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setAlternateIndex(String value) {
        this.alternateIndex = value;
    }

    /**
     * Gets the value of the wellDatum property.
     *
     * @return
     *     possible object is
     *     {@link RefNameString }
     *
     */
    public RefNameString getWellDatum() {
        return wellDatum;
    }

    /**
     * Sets the value of the wellDatum property.
     *
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *
     */
    public void setWellDatum(RefNameString value) {
        this.wellDatum = value;
    }

    /**
     * Gets the value of the minIndex property.
     *
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *
     */
    public GenericMeasure getMinIndex() {
        return minIndex;
    }

    /**
     * Sets the value of the minIndex property.
     *
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *
     */
    public void setMinIndex(GenericMeasure value) {
        this.minIndex = value;
    }

    /**
     * Gets the value of the maxIndex property.
     *
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *
     */
    public GenericMeasure getMaxIndex() {
        return maxIndex;
    }

    /**
     * Sets the value of the maxIndex property.
     *
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *
     */
    public void setMaxIndex(GenericMeasure value) {
        this.maxIndex = value;
    }

    /**
     * Gets the value of the minDateTimeIndex property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public String getMinDateTimeIndex() {
        return minDateTimeIndex;
    }

    /**
     * Sets the value of the minDateTimeIndex property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setMinDateTimeIndex(String value) {
        this.minDateTimeIndex = value;
    }

    /**
     * Gets the value of the maxDateTimeIndex property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public String getMaxDateTimeIndex() {
        return maxDateTimeIndex;
    }

    /**
     * Sets the value of the maxDateTimeIndex property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setMaxDateTimeIndex(String value) {
        this.maxDateTimeIndex = value;
    }

    /**
     * Gets the value of the curveDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurveDescription() {
        return curveDescription;
    }

    /**
     * Sets the value of the curveDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurveDescription(String value) {
        this.curveDescription = value;
    }

    /**
     * Gets the value of the sensorOffset property.
     *
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *
     */
    public LengthMeasure getSensorOffset() {
        return sensorOffset;
    }

    /**
     * Sets the value of the sensorOffset property.
     *
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *
     */
    public void setSensorOffset(LengthMeasure value) {
        this.sensorOffset = value;
    }

    /**
     * Gets the value of the dataSource property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the densData property.
     *
     * @return
     *     possible object is
     *     {@link PerLengthMeasure }
     *
     */
    public PerLengthMeasure getDensData() {
        return densData;
    }

    /**
     * Sets the value of the densData property.
     *
     * @param value
     *     allowed object is
     *     {@link PerLengthMeasure }
     *
     */
    public void setDensData(PerLengthMeasure value) {
        this.densData = value;
    }

    /**
     * Gets the value of the traceState property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTraceState() {
        return traceState;
    }

    /**
     * Sets the value of the traceState property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTraceState(String value) {
        this.traceState = value;
    }

    /**
     * Gets the value of the traceOrigin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTraceOrigin() {
        return traceOrigin;
    }

    /**
     * Sets the value of the traceOrigin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTraceOrigin(String value) {
        this.traceOrigin = value;
    }

    /**
     * Gets the value of the typeLogData property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTypeLogData() {
        return typeLogData;
    }

    /**
     * Sets the value of the typeLogData property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTypeLogData(String value) {
        this.typeLogData = value;
    }

    /**
     * Gets the value of the axisDefinition property.
     *
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisDefinition property.
     *
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getAxisDefinition().add(newItem);
     * } </pre>
     *
     *
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsAxisDefinition }
     *
     *
     */
    public List<CsAxisDefinition> getAxisDefinition() {
        if (axisDefinition == null) {
            axisDefinition = new ArrayList<CsAxisDefinition>();
        }
        return this.axisDefinition;
    }

    public void setAxisDefinition(List<CsAxisDefinition> values) {
        this.axisDefinition = values;
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




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1311.CsLogCurveInfo to1311CsLogCurveInfo(String mnemList) {
        com.hashmapinc.tempus.WitsmlObjects.v1311.CsLogCurveInfo info =
                new com.hashmapinc.tempus.WitsmlObjects.v1311.CsLogCurveInfo();

        List<String> chanIndexSrc = null;
        if (mnemList!= null && mnemList.length() > 0) {
            String[] mnemAliasArr = mnemList.split(",");
            chanIndexSrc = Arrays.asList(mnemAliasArr);
        }

        // simple fields
        info.setClassWitsml(this.getClassWitsml());
        info.setUnit(this.getUnit());
        info.setNullValue(this.getNullValue());
        info.setAlternateIndex(this.isAlternateIndex());
        info.setMinDateTimeIndex(this.getMinDateTimeIndex());
        info.setMaxDateTimeIndex(this.getMaxDateTimeIndex());
        info.setCurveDescription(this.getCurveDescription());
        info.setDataSource(this.getDataSource());
        info.setUid(this.getUid());
        info.setTraceState(this.getTraceState());
        info.setTraceOrigin(this.getTraceOrigin());
        info.setTypeLogData(this.getTypeLogData());
        if (chanIndexSrc != null)
            info.setColumnIndex(String.valueOf(chanIndexSrc.indexOf(this.getMnemonic().value.toLowerCase()) + 1));

        // complex fields
        // mnemonic
        if (null != this.getMnemonic())
            info.setMnemonic(this.getMnemonic().getValue());

        // mnemAlias
        if (null != this.getMnemAlias())
            info.setMnemAlias(this.getMnemAlias().getValue());

        // wellDatum
        if (null != this.getWellDatum())
            info.setWellDatum(this.getWellDatum().to1311RefNameString());

        // minIndex
        if (null != this.getMinIndex())
            info.setMinIndex(this.getMinIndex().to1311GenericMeasure());

        // maxIndex
        if (null != this.getMaxIndex())
            info.setMaxIndex(this.getMaxIndex().to1311GenericMeasure());

        // sensorOffset
        if (null != this.getSensorOffset())
            info.setSensorOffset(this.getSensorOffset().to1311LengthMeasure());

        // densData
        if (null != this.getDensData())
            info.setDensData(this.getDensData().to1311PerLengthMeasure());

        // repeating fields
        if (null != this.getAxisDefinition()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsAxisDefinition> destDefs = new ArrayList<>();
            for (com.hashmapinc.tempus.WitsmlObjects.v1411.CsAxisDefinition srcDef : this.getAxisDefinition())
                destDefs.add(srcDef.to1311CsAxisDefinition());

            info.setAxisDefinition(destDefs);
        }

        return info;
    }
    //=========================================================================

}