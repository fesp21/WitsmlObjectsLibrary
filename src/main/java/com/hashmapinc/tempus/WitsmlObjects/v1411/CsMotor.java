//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Tubular Motor Component Schema
 * 
 * <p>Java class for cs_motor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_motor">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="offsetTool" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="presLossFact" type="{http://www.witsml.org/schemas/1series}unitlessQuantity" minOccurs="0"/>
 *         <element name="flowrateMn" type="{http://www.witsml.org/schemas/1series}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="flowrateMx" type="{http://www.witsml.org/schemas/1series}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="diaRotorNozzle" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="clearanceBearBox" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="lobesRotor" type="{http://www.witsml.org/schemas/1series}nonNegativeCount" minOccurs="0"/>
 *         <element name="lobesStator" type="{http://www.witsml.org/schemas/1series}nonNegativeCount" minOccurs="0"/>
 *         <element name="typeBearing" type="{http://www.witsml.org/schemas/1series}BearingType" minOccurs="0"/>
 *         <element name="tempOpMx" type="{http://www.witsml.org/schemas/1series}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="rotorCatcher" type="{http://www.witsml.org/schemas/1series}logicalBoolean" minOccurs="0"/>
 *         <element name="dumpValve" type="{http://www.witsml.org/schemas/1series}logicalBoolean" minOccurs="0"/>
 *         <element name="diaNozzle" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="rotatable" type="{http://www.witsml.org/schemas/1series}logicalBoolean" minOccurs="0"/>
 *         <element name="bendSettingsMn" type="{http://www.witsml.org/schemas/1series}planeAngleMeasure" minOccurs="0"/>
 *         <element name="bendSettingsMx" type="{http://www.witsml.org/schemas/1series}planeAngleMeasure" minOccurs="0"/>
 *         <element name="customData" type="{http://www.witsml.org/schemas/1series}cs_customData" minOccurs="0"/>
 *         <element name="extensionAny" type="{http://www.witsml.org/schemas/1series}cs_extensionAny" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_motor", propOrder = {
    "offsetTool",
    "presLossFact",
    "flowrateMn",
    "flowrateMx",
    "diaRotorNozzle",
    "clearanceBearBox",
    "lobesRotor",
    "lobesStator",
    "typeBearing",
    "tempOpMx",
    "rotorCatcher",
    "dumpValve",
    "diaNozzle",
    "rotatable",
    "bendSettingsMn",
    "bendSettingsMx",
    "customData",
    "extensionAny"
})
public class CsMotor {

    protected LengthMeasure offsetTool;
    protected Double presLossFact;
    protected VolumeFlowRateMeasure flowrateMn;
    protected VolumeFlowRateMeasure flowrateMx;
    protected LengthMeasure diaRotorNozzle;
    protected LengthMeasure clearanceBearBox;
    protected Short lobesRotor;
    protected Short lobesStator;
    @XmlSchemaType(name = "string")
    protected String typeBearing;
    protected ThermodynamicTemperatureMeasure tempOpMx;
    protected Boolean rotorCatcher;
    protected Boolean dumpValve;
    protected LengthMeasure diaNozzle;
    protected Boolean rotatable;
    protected PlaneAngleMeasure bendSettingsMn;
    protected PlaneAngleMeasure bendSettingsMx;
    protected CsCustomData customData;
    protected CsExtensionAny extensionAny;

    /**
     * Gets the value of the offsetTool property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOffsetTool() {
        return offsetTool;
    }

    /**
     * Sets the value of the offsetTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOffsetTool(LengthMeasure value) {
        this.offsetTool = value;
    }

    /**
     * Gets the value of the presLossFact property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPresLossFact() {
        return presLossFact;
    }

    /**
     * Sets the value of the presLossFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPresLossFact(Double value) {
        this.presLossFact = value;
    }

    /**
     * Gets the value of the flowrateMn property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getFlowrateMn() {
        return flowrateMn;
    }

    /**
     * Sets the value of the flowrateMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setFlowrateMn(VolumeFlowRateMeasure value) {
        this.flowrateMn = value;
    }

    /**
     * Gets the value of the flowrateMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getFlowrateMx() {
        return flowrateMx;
    }

    /**
     * Sets the value of the flowrateMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setFlowrateMx(VolumeFlowRateMeasure value) {
        this.flowrateMx = value;
    }

    /**
     * Gets the value of the diaRotorNozzle property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiaRotorNozzle() {
        return diaRotorNozzle;
    }

    /**
     * Sets the value of the diaRotorNozzle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiaRotorNozzle(LengthMeasure value) {
        this.diaRotorNozzle = value;
    }

    /**
     * Gets the value of the clearanceBearBox property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getClearanceBearBox() {
        return clearanceBearBox;
    }

    /**
     * Sets the value of the clearanceBearBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setClearanceBearBox(LengthMeasure value) {
        this.clearanceBearBox = value;
    }

    /**
     * Gets the value of the lobesRotor property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLobesRotor() {
        return lobesRotor;
    }

    /**
     * Sets the value of the lobesRotor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLobesRotor(Short value) {
        this.lobesRotor = value;
    }

    /**
     * Gets the value of the lobesStator property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLobesStator() {
        return lobesStator;
    }

    /**
     * Sets the value of the lobesStator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLobesStator(Short value) {
        this.lobesStator = value;
    }

    /**
     * Gets the value of the typeBearing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeBearing() {
        return typeBearing;
    }

    /**
     * Sets the value of the typeBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeBearing(String value) {
        this.typeBearing = value;
    }

    /**
     * Gets the value of the tempOpMx property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempOpMx() {
        return tempOpMx;
    }

    /**
     * Sets the value of the tempOpMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempOpMx(ThermodynamicTemperatureMeasure value) {
        this.tempOpMx = value;
    }

    /**
     * Gets the value of the rotorCatcher property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRotorCatcher() {
        return rotorCatcher;
    }

    /**
     * Sets the value of the rotorCatcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRotorCatcher(Boolean value) {
        this.rotorCatcher = value;
    }

    /**
     * Gets the value of the dumpValve property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDumpValve() {
        return dumpValve;
    }

    /**
     * Sets the value of the dumpValve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDumpValve(Boolean value) {
        this.dumpValve = value;
    }

    /**
     * Gets the value of the diaNozzle property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiaNozzle() {
        return diaNozzle;
    }

    /**
     * Sets the value of the diaNozzle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiaNozzle(LengthMeasure value) {
        this.diaNozzle = value;
    }

    /**
     * Gets the value of the rotatable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRotatable() {
        return rotatable;
    }

    /**
     * Sets the value of the rotatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRotatable(Boolean value) {
        this.rotatable = value;
    }

    /**
     * Gets the value of the bendSettingsMn property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getBendSettingsMn() {
        return bendSettingsMn;
    }

    /**
     * Sets the value of the bendSettingsMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setBendSettingsMn(PlaneAngleMeasure value) {
        this.bendSettingsMn = value;
    }

    /**
     * Gets the value of the bendSettingsMx property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getBendSettingsMx() {
        return bendSettingsMx;
    }

    /**
     * Sets the value of the bendSettingsMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setBendSettingsMx(PlaneAngleMeasure value) {
        this.bendSettingsMx = value;
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

}
