package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Bit Record Component Schema.
 * 
 * <p>Java class for cs_bitRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_bitRecord">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="numBit" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="diaBit" type="{http://www.witsml.org/schemas/131}lengthMeasure"/>
 *         <element name="diaPassThru" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="diaPilot" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="manufacturer" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="typeBit" type="{http://www.witsml.org/schemas/131}BitType" minOccurs="0"/>
 *         <element name="cost" type="{http://www.witsml.org/schemas/131}cost" minOccurs="0"/>
 *         <element name="codeIADC" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="condInitInner" type="{http://www.witsml.org/schemas/131}iadcIntegerCode" minOccurs="0"/>
 *         <element name="condInitOuter" type="{http://www.witsml.org/schemas/131}iadcIntegerCode" minOccurs="0"/>
 *         <element name="condInitDull" type="{http://www.witsml.org/schemas/131}BitDullCode" minOccurs="0"/>
 *         <element name="condInitLocation" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="condInitBearing" type="{http://www.witsml.org/schemas/131}iadcBearingWearCode" minOccurs="0"/>
 *         <element name="condInitGauge" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="condInitOther" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="condInitReason" type="{http://www.witsml.org/schemas/131}BitReasonPulled" minOccurs="0"/>
 *         <element name="condFinalInner" type="{http://www.witsml.org/schemas/131}iadcIntegerCode" minOccurs="0"/>
 *         <element name="condFinalOuter" type="{http://www.witsml.org/schemas/131}iadcIntegerCode" minOccurs="0"/>
 *         <element name="condFinalDull" type="{http://www.witsml.org/schemas/131}BitDullCode" minOccurs="0"/>
 *         <element name="condFinalLocation" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="condFinalBearing" type="{http://www.witsml.org/schemas/131}iadcBearingWearCode" minOccurs="0"/>
 *         <element name="condFinalGauge" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="condFinalOther" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="condFinalReason" type="{http://www.witsml.org/schemas/131}BitReasonPulled" minOccurs="0"/>
 *         <element name="drive" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="bitClass" type="{http://www.witsml.org/schemas/131}str2" minOccurs="0"/>
 *         <element name="customData" type="{http://www.witsml.org/schemas/131}cs_customData" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_bitRecord", propOrder = {
    "numBit",
    "diaBit",
    "diaPassThru",
    "diaPilot",
    "manufacturer",
    "typeBit",
    "cost",
    "codeIADC",
    "condInitInner",
    "condInitOuter",
    "condInitDull",
    "condInitLocation",
    "condInitBearing",
    "condInitGauge",
    "condInitOther",
    "condInitReason",
    "condFinalInner",
    "condFinalOuter",
    "condFinalDull",
    "condFinalLocation",
    "condFinalBearing",
    "condFinalGauge",
    "condFinalOther",
    "condFinalReason",
    "drive",
    "bitClass",
    "customData"
})
public class CsBitRecord {

    protected String numBit;
    @XmlElement(required = true)
    protected LengthMeasure diaBit;
    protected LengthMeasure diaPassThru;
    protected LengthMeasure diaPilot;
    protected String manufacturer;
    @XmlSchemaType(name = "string")
    protected String typeBit;
    protected Cost cost;
    protected String codeIADC;
    protected Short condInitInner;
    protected Short condInitOuter;
    @XmlSchemaType(name = "string")
    protected String condInitDull;
    protected String condInitLocation;
    protected String condInitBearing;
    protected String condInitGauge;
    protected String condInitOther;
    @XmlSchemaType(name = "string")
    protected String condInitReason;
    protected Short condFinalInner;
    protected Short condFinalOuter;
    @XmlSchemaType(name = "string")
    protected String condFinalDull;
    protected String condFinalLocation;
    protected String condFinalBearing;
    protected String condFinalGauge;
    protected String condFinalOther;
    @XmlSchemaType(name = "string")
    protected String condFinalReason;
    protected String drive;
    protected String bitClass;
    protected CsCustomData customData;

    /**
     * Gets the value of the numBit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumBit() {
        return numBit;
    }

    /**
     * Sets the value of the numBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumBit(String value) {
        this.numBit = value;
    }

    /**
     * Gets the value of the diaBit property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiaBit() {
        return diaBit;
    }

    /**
     * Sets the value of the diaBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiaBit(LengthMeasure value) {
        this.diaBit = value;
    }

    /**
     * Gets the value of the diaPassThru property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiaPassThru() {
        return diaPassThru;
    }

    /**
     * Sets the value of the diaPassThru property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiaPassThru(LengthMeasure value) {
        this.diaPassThru = value;
    }

    /**
     * Gets the value of the diaPilot property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiaPilot() {
        return diaPilot;
    }

    /**
     * Sets the value of the diaPilot property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiaPilot(LengthMeasure value) {
        this.diaPilot = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the typeBit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeBit() {
        return typeBit;
    }

    /**
     * Sets the value of the typeBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeBit(String value) {
        this.typeBit = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setCost(Cost value) {
        this.cost = value;
    }

    /**
     * Gets the value of the codeIADC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeIADC() {
        return codeIADC;
    }

    /**
     * Sets the value of the codeIADC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeIADC(String value) {
        this.codeIADC = value;
    }

    /**
     * Gets the value of the condInitInner property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCondInitInner() {
        return condInitInner;
    }

    /**
     * Sets the value of the condInitInner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCondInitInner(Short value) {
        this.condInitInner = value;
    }

    /**
     * Gets the value of the condInitOuter property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCondInitOuter() {
        return condInitOuter;
    }

    /**
     * Sets the value of the condInitOuter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCondInitOuter(Short value) {
        this.condInitOuter = value;
    }

    /**
     * Gets the value of the condInitDull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondInitDull() {
        return condInitDull;
    }

    /**
     * Sets the value of the condInitDull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondInitDull(String value) {
        this.condInitDull = value;
    }

    /**
     * Gets the value of the condInitLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondInitLocation() {
        return condInitLocation;
    }

    /**
     * Sets the value of the condInitLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondInitLocation(String value) {
        this.condInitLocation = value;
    }

    /**
     * Gets the value of the condInitBearing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondInitBearing() {
        return condInitBearing;
    }

    /**
     * Sets the value of the condInitBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondInitBearing(String value) {
        this.condInitBearing = value;
    }

    /**
     * Gets the value of the condInitGauge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondInitGauge() {
        return condInitGauge;
    }

    /**
     * Sets the value of the condInitGauge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondInitGauge(String value) {
        this.condInitGauge = value;
    }

    /**
     * Gets the value of the condInitOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondInitOther() {
        return condInitOther;
    }

    /**
     * Sets the value of the condInitOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondInitOther(String value) {
        this.condInitOther = value;
    }

    /**
     * Gets the value of the condInitReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondInitReason() {
        return condInitReason;
    }

    /**
     * Sets the value of the condInitReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondInitReason(String value) {
        this.condInitReason = value;
    }

    /**
     * Gets the value of the condFinalInner property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCondFinalInner() {
        return condFinalInner;
    }

    /**
     * Sets the value of the condFinalInner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCondFinalInner(Short value) {
        this.condFinalInner = value;
    }

    /**
     * Gets the value of the condFinalOuter property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCondFinalOuter() {
        return condFinalOuter;
    }

    /**
     * Sets the value of the condFinalOuter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCondFinalOuter(Short value) {
        this.condFinalOuter = value;
    }

    /**
     * Gets the value of the condFinalDull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondFinalDull() {
        return condFinalDull;
    }

    /**
     * Sets the value of the condFinalDull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondFinalDull(String value) {
        this.condFinalDull = value;
    }

    /**
     * Gets the value of the condFinalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondFinalLocation() {
        return condFinalLocation;
    }

    /**
     * Sets the value of the condFinalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondFinalLocation(String value) {
        this.condFinalLocation = value;
    }

    /**
     * Gets the value of the condFinalBearing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondFinalBearing() {
        return condFinalBearing;
    }

    /**
     * Sets the value of the condFinalBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondFinalBearing(String value) {
        this.condFinalBearing = value;
    }

    /**
     * Gets the value of the condFinalGauge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondFinalGauge() {
        return condFinalGauge;
    }

    /**
     * Sets the value of the condFinalGauge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondFinalGauge(String value) {
        this.condFinalGauge = value;
    }

    /**
     * Gets the value of the condFinalOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondFinalOther() {
        return condFinalOther;
    }

    /**
     * Sets the value of the condFinalOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondFinalOther(String value) {
        this.condFinalOther = value;
    }

    /**
     * Gets the value of the condFinalReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondFinalReason() {
        return condFinalReason;
    }

    /**
     * Sets the value of the condFinalReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondFinalReason(String value) {
        this.condFinalReason = value;
    }

    /**
     * Gets the value of the drive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrive() {
        return drive;
    }

    /**
     * Sets the value of the drive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrive(String value) {
        this.drive = value;
    }

    /**
     * Gets the value of the bitClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitClass() {
        return bitClass;
    }

    /**
     * Sets the value of the bitClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitClass(String value) {
        this.bitClass = value;
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

}
