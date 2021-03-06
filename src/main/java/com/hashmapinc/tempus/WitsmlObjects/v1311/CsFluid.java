package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  WITSML - fluids component schema 
 * 
 * <p>Java class for cs_fluid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_fluid">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="type" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="locationSample" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="dTim" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="md" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="density" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="visFunnel" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="tempVis" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="pv" type="{http://www.witsml.org/schemas/131}dynamicViscosityMeasure" minOccurs="0"/>
 *         <element name="yp" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="gel10Sec" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="gel10Min" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="gel30Min" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="filterCakeLtlp" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="filtrateLtlp" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="tempHthp" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="presHthp" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="filtrateHthp" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="filterCakeHthp" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="solidsPc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="waterPc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="oilPc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="sandPc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="solidsLowGravPc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="solidsCalcPc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="baritePc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="lcm" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="mbt" type="{http://www.witsml.org/schemas/131}equivalentPerMassMeasure" minOccurs="0"/>
 *         <element name="ph" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="tempPh" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="pm" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="pmFiltrate" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="mf" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="alkalinityP1" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="alkalinityP2" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="chloride" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="calcium" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="magnesium" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="potassium" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="rheometer" type="{http://www.witsml.org/schemas/131}cs_rheometer" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="brinePc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="lime" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="electStab" type="{http://www.witsml.org/schemas/131}electricPotentialMeasure" minOccurs="0"/>
 *         <element name="calciumChloride" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="company" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="engineer" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="asg" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="solidsHiGravPc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="polymer" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="polyType" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="solCorPc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="oilCtg" type="{http://www.witsml.org/schemas/131}massConcentrationMeasure" minOccurs="0"/>
 *         <element name="hardnessCa" type="{http://www.witsml.org/schemas/131}massConcentrationMeasure" minOccurs="0"/>
 *         <element name="sulfide" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="comments" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/131}attgrp_uid"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_fluid", propOrder = {
    "type",
    "locationSample",
    "dTim",
    "md",
    "density",
    "visFunnel",
    "tempVis",
    "pv",
    "yp",
    "gel10Sec",
    "gel10Min",
    "gel30Min",
    "filterCakeLtlp",
    "filtrateLtlp",
    "tempHthp",
    "presHthp",
    "filtrateHthp",
    "filterCakeHthp",
    "solidsPc",
    "waterPc",
    "oilPc",
    "sandPc",
    "solidsLowGravPc",
    "solidsCalcPc",
    "baritePc",
    "lcm",
    "mbt",
    "ph",
    "tempPh",
    "pm",
    "pmFiltrate",
    "mf",
    "alkalinityP1",
    "alkalinityP2",
    "chloride",
    "calcium",
    "magnesium",
    "potassium",
    "rheometer",
    "brinePc",
    "lime",
    "electStab",
    "calciumChloride",
    "company",
    "engineer",
    "asg",
    "solidsHiGravPc",
    "polymer",
    "polyType",
    "solCorPc",
    "oilCtg",
    "hardnessCa",
    "sulfide",
    "comments"
})
public class CsFluid {

    protected String type;
    protected String locationSample;
    @XmlSchemaType(name = "dateTime")
    // protected XMLGregorianCalendar dTim;
    protected String dTim;
    protected MeasuredDepthCoord md;
    protected GenericMeasure density;
    protected GenericMeasure visFunnel;
    protected GenericMeasure tempVis;
    protected GenericMeasure pv;
    protected GenericMeasure yp;
    protected GenericMeasure gel10Sec;
    protected GenericMeasure gel10Min;
    protected GenericMeasure gel30Min;
    protected GenericMeasure filterCakeLtlp;
    protected GenericMeasure filtrateLtlp;
    protected GenericMeasure tempHthp;
    protected GenericMeasure presHthp;
    protected GenericMeasure filtrateHthp;
    protected GenericMeasure filterCakeHthp;
    protected GenericMeasure solidsPc;
    protected GenericMeasure waterPc;
    protected GenericMeasure oilPc;
    protected GenericMeasure sandPc;
    protected GenericMeasure solidsLowGravPc;
    protected GenericMeasure solidsCalcPc;
    protected GenericMeasure baritePc;
    protected GenericMeasure lcm;
    protected GenericMeasure mbt;
    protected Double ph;
    protected GenericMeasure tempPh;
    protected GenericMeasure pm;
    protected GenericMeasure pmFiltrate;
    protected GenericMeasure mf;
    protected GenericMeasure alkalinityP1;
    protected GenericMeasure alkalinityP2;
    protected GenericMeasure chloride;
    protected GenericMeasure calcium;
    protected GenericMeasure magnesium;
    protected GenericMeasure potassium;
    protected List<CsRheometer> rheometer;
    protected GenericMeasure brinePc;
    protected GenericMeasure lime;
    protected GenericMeasure electStab;
    protected GenericMeasure calciumChloride;
    protected String company;
    protected String engineer;
    protected Double asg;
    protected GenericMeasure solidsHiGravPc;
    protected GenericMeasure polymer;
    protected String polyType;
    protected GenericMeasure solCorPc;
    protected GenericMeasure oilCtg;
    protected GenericMeasure hardnessCa;
    protected GenericMeasure sulfide;
    protected String comments;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the locationSample property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationSample() {
        return locationSample;
    }

    /**
     * Sets the value of the locationSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationSample(String value) {
        this.locationSample = value;
    }

    /**
     * Gets the value of the dTim property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getDTim() {
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
    public void setDTim(String value) {
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
     * Gets the value of the density property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setDensity(GenericMeasure value) {
        this.density = value;
    }

    /**
     * Gets the value of the visFunnel property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getVisFunnel() {
        return visFunnel;
    }

    /**
     * Sets the value of the visFunnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setVisFunnel(GenericMeasure value) {
        this.visFunnel = value;
    }

    /**
     * Gets the value of the tempVis property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getTempVis() {
        return tempVis;
    }

    /**
     * Sets the value of the tempVis property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setTempVis(GenericMeasure value) {
        this.tempVis = value;
    }

    /**
     * Gets the value of the pv property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getPv() {
        return pv;
    }

    /**
     * Sets the value of the pv property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setPv(GenericMeasure value) {
        this.pv = value;
    }

    /**
     * Gets the value of the yp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getYp() {
        return yp;
    }

    /**
     * Sets the value of the yp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setYp(GenericMeasure value) {
        this.yp = value;
    }

    /**
     * Gets the value of the gel10Sec property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getGel10Sec() {
        return gel10Sec;
    }

    /**
     * Sets the value of the gel10Sec property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setGel10Sec(GenericMeasure value) {
        this.gel10Sec = value;
    }

    /**
     * Gets the value of the gel10Min property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getGel10Min() {
        return gel10Min;
    }

    /**
     * Sets the value of the gel10Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setGel10Min(GenericMeasure value) {
        this.gel10Min = value;
    }

    /**
     * Gets the value of the gel30Min property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getGel30Min() {
        return gel30Min;
    }

    /**
     * Sets the value of the gel30Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setGel30Min(GenericMeasure value) {
        this.gel30Min = value;
    }

    /**
     * Gets the value of the filterCakeLtlp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getFilterCakeLtlp() {
        return filterCakeLtlp;
    }

    /**
     * Sets the value of the filterCakeLtlp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setFilterCakeLtlp(GenericMeasure value) {
        this.filterCakeLtlp = value;
    }

    /**
     * Gets the value of the filtrateLtlp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getFiltrateLtlp() {
        return filtrateLtlp;
    }

    /**
     * Sets the value of the filtrateLtlp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setFiltrateLtlp(GenericMeasure value) {
        this.filtrateLtlp = value;
    }

    /**
     * Gets the value of the tempHthp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getTempHthp() {
        return tempHthp;
    }

    /**
     * Sets the value of the tempHthp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setTempHthp(GenericMeasure value) {
        this.tempHthp = value;
    }

    /**
     * Gets the value of the presHthp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getPresHthp() {
        return presHthp;
    }

    /**
     * Sets the value of the presHthp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setPresHthp(GenericMeasure value) {
        this.presHthp = value;
    }

    /**
     * Gets the value of the filtrateHthp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getFiltrateHthp() {
        return filtrateHthp;
    }

    /**
     * Sets the value of the filtrateHthp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setFiltrateHthp(GenericMeasure value) {
        this.filtrateHthp = value;
    }

    /**
     * Gets the value of the filterCakeHthp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getFilterCakeHthp() {
        return filterCakeHthp;
    }

    /**
     * Sets the value of the filterCakeHthp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setFilterCakeHthp(GenericMeasure value) {
        this.filterCakeHthp = value;
    }

    /**
     * Gets the value of the solidsPc property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getSolidsPc() {
        return solidsPc;
    }

    /**
     * Sets the value of the solidsPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setSolidsPc(GenericMeasure value) {
        this.solidsPc = value;
    }

    /**
     * Gets the value of the waterPc property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getWaterPc() {
        return waterPc;
    }

    /**
     * Sets the value of the waterPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setWaterPc(GenericMeasure value) {
        this.waterPc = value;
    }

    /**
     * Gets the value of the oilPc property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getOilPc() {
        return oilPc;
    }

    /**
     * Sets the value of the oilPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setOilPc(GenericMeasure value) {
        this.oilPc = value;
    }

    /**
     * Gets the value of the sandPc property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getSandPc() {
        return sandPc;
    }

    /**
     * Sets the value of the sandPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setSandPc(GenericMeasure value) {
        this.sandPc = value;
    }

    /**
     * Gets the value of the solidsLowGravPc property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getSolidsLowGravPc() {
        return solidsLowGravPc;
    }

    /**
     * Sets the value of the solidsLowGravPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setSolidsLowGravPc(GenericMeasure value) {
        this.solidsLowGravPc = value;
    }

    /**
     * Gets the value of the solidsCalcPc property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getSolidsCalcPc() {
        return solidsCalcPc;
    }

    /**
     * Sets the value of the solidsCalcPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setSolidsCalcPc(GenericMeasure value) {
        this.solidsCalcPc = value;
    }

    /**
     * Gets the value of the baritePc property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getBaritePc() {
        return baritePc;
    }

    /**
     * Sets the value of the baritePc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setBaritePc(GenericMeasure value) {
        this.baritePc = value;
    }

    /**
     * Gets the value of the lcm property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getLcm() {
        return lcm;
    }

    /**
     * Sets the value of the lcm property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setLcm(GenericMeasure value) {
        this.lcm = value;
    }

    /**
     * Gets the value of the mbt property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getMbt() {
        return mbt;
    }

    /**
     * Sets the value of the mbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setMbt(GenericMeasure value) {
        this.mbt = value;
    }

    /**
     * Gets the value of the ph property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPh() {
        return ph;
    }

    /**
     * Sets the value of the ph property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPh(Double value) {
        this.ph = value;
    }

    /**
     * Gets the value of the tempPh property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getTempPh() {
        return tempPh;
    }

    /**
     * Sets the value of the tempPh property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setTempPh(GenericMeasure value) {
        this.tempPh = value;
    }

    /**
     * Gets the value of the pm property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getPm() {
        return pm;
    }

    /**
     * Sets the value of the pm property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setPm(GenericMeasure value) {
        this.pm = value;
    }

    /**
     * Gets the value of the pmFiltrate property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getPmFiltrate() {
        return pmFiltrate;
    }

    /**
     * Sets the value of the pmFiltrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setPmFiltrate(GenericMeasure value) {
        this.pmFiltrate = value;
    }

    /**
     * Gets the value of the mf property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getMf() {
        return mf;
    }

    /**
     * Sets the value of the mf property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setMf(GenericMeasure value) {
        this.mf = value;
    }

    /**
     * Gets the value of the alkalinityP1 property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getAlkalinityP1() {
        return alkalinityP1;
    }

    /**
     * Sets the value of the alkalinityP1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setAlkalinityP1(GenericMeasure value) {
        this.alkalinityP1 = value;
    }

    /**
     * Gets the value of the alkalinityP2 property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getAlkalinityP2() {
        return alkalinityP2;
    }

    /**
     * Sets the value of the alkalinityP2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setAlkalinityP2(GenericMeasure value) {
        this.alkalinityP2 = value;
    }

    /**
     * Gets the value of the chloride property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getChloride() {
        return chloride;
    }

    /**
     * Sets the value of the chloride property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setChloride(GenericMeasure value) {
        this.chloride = value;
    }

    /**
     * Gets the value of the calcium property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getCalcium() {
        return calcium;
    }

    /**
     * Sets the value of the calcium property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setCalcium(GenericMeasure value) {
        this.calcium = value;
    }

    /**
     * Gets the value of the magnesium property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getMagnesium() {
        return magnesium;
    }

    /**
     * Sets the value of the magnesium property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setMagnesium(GenericMeasure value) {
        this.magnesium = value;
    }

    /**
     * Gets the value of the potassium property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getPotassium() {
        return potassium;
    }

    /**
     * Sets the value of the potassium property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setPotassium(GenericMeasure value) {
        this.potassium = value;
    }

    /**
     * Gets the value of the rheometer property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rheometer property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getRheometer().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsRheometer }
     * 
     * 
     */
    public List<CsRheometer> getRheometer() {
        if (rheometer == null) {
            rheometer = new ArrayList<CsRheometer>();
        }
        return this.rheometer;
    }

    /**
     * Gets the value of the brinePc property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getBrinePc() {
        return brinePc;
    }

    /**
     * Sets the value of the brinePc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setBrinePc(GenericMeasure value) {
        this.brinePc = value;
    }

    /**
     * Gets the value of the lime property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getLime() {
        return lime;
    }

    /**
     * Sets the value of the lime property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setLime(GenericMeasure value) {
        this.lime = value;
    }

    /**
     * Gets the value of the electStab property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getElectStab() {
        return electStab;
    }

    /**
     * Sets the value of the electStab property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setElectStab(GenericMeasure value) {
        this.electStab = value;
    }

    /**
     * Gets the value of the calciumChloride property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getCalciumChloride() {
        return calciumChloride;
    }

    /**
     * Sets the value of the calciumChloride property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setCalciumChloride(GenericMeasure value) {
        this.calciumChloride = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the engineer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineer() {
        return engineer;
    }

    /**
     * Sets the value of the engineer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineer(String value) {
        this.engineer = value;
    }

    /**
     * Gets the value of the asg property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAsg() {
        return asg;
    }

    /**
     * Sets the value of the asg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAsg(Double value) {
        this.asg = value;
    }

    /**
     * Gets the value of the solidsHiGravPc property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getSolidsHiGravPc() {
        return solidsHiGravPc;
    }

    /**
     * Sets the value of the solidsHiGravPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setSolidsHiGravPc(GenericMeasure value) {
        this.solidsHiGravPc = value;
    }

    /**
     * Gets the value of the polymer property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getPolymer() {
        return polymer;
    }

    /**
     * Sets the value of the polymer property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setPolymer(GenericMeasure value) {
        this.polymer = value;
    }

    /**
     * Gets the value of the polyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolyType() {
        return polyType;
    }

    /**
     * Sets the value of the polyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolyType(String value) {
        this.polyType = value;
    }

    /**
     * Gets the value of the solCorPc property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getSolCorPc() {
        return solCorPc;
    }

    /**
     * Sets the value of the solCorPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setSolCorPc(GenericMeasure value) {
        this.solCorPc = value;
    }

    /**
     * Gets the value of the oilCtg property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getOilCtg() {
        return oilCtg;
    }

    /**
     * Sets the value of the oilCtg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setOilCtg(GenericMeasure value) {
        this.oilCtg = value;
    }

    /**
     * Gets the value of the hardnessCa property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getHardnessCa() {
        return hardnessCa;
    }

    /**
     * Sets the value of the hardnessCa property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setHardnessCa(GenericMeasure value) {
        this.hardnessCa = value;
    }

    /**
     * Gets the value of the sulfide property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getSulfide() {
        return sulfide;
    }

    /**
     * Sets the value of the sulfide property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setSulfide(GenericMeasure value) {
        this.sulfide = value;
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
    //=========================================================================
    // 1.3.1.1 to 2.0
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v20.Fluid to20Fluid(){
        com.hashmapinc.tempus.WitsmlObjects.v20.Fluid dest =
                new com.hashmapinc.tempus.WitsmlObjects.v20.Fluid();
        // check non-complex, non-repeating fields
        dest.setType(this.getType());
        dest.setLocationSample(this.getLocationSample());
        dest.setPh(this.getPh());
        dest.setCompany(this.getCompany());
        dest.setEngineer(this.getEngineer());
        dest.setPolyType(this.getPolyType());
        dest.setComments(this.getComments());
        dest.setUid(this.getUid());

        if (this.getAsg() != null){
            com.hashmapinc.tempus.WitsmlObjects.v20.GenericMeasure asgGM =
                    new com.hashmapinc.tempus.WitsmlObjects.v20.GenericMeasure();
            asgGM.setValue(this.getAsg().doubleValue());
            // TODO 2.0 requires ASG to be type GenericMeasure; however, v1.3.1.1
            //      doe NOT have a UOM for this value. Should there be a default?
            // asgGM.setUom();
            dest.setAsg(asgGM);
        }

        // check complex fields
        if (this.getDTim() != null)
            dest.setDTim(this.getDTim()); //.toXMLFormat());

        if (this.getMd() != null)
            dest.setMd(this.getMd().to20DepthCoord());

        if (this.getDensity() != null)
            dest.setDensity(this.getDensity().to20GenericMeasure());

        if (this.getVisFunnel() != null)
            dest.setVisFunnel(this.getVisFunnel().to20GenericMeasure());

        if (this.getTempVis() != null)
            dest.setTempVis(this.getTempVis().to20GenericMeasure());

        if (this.getPv() != null)
            dest.setPv(this.getPv().to20GenericMeasure());

        if (this.getYp() != null)
            dest.setYp(this.getYp().to20GenericMeasure());

        if (this.getGel10Sec() != null)
            dest.setGel10Sec(this.getGel10Sec().to20GenericMeasure());

        if (this.getGel10Min() != null)
            dest.setGel10Min(this.getGel10Min().to20GenericMeasure());

        if (this.getGel30Min() != null)
            dest.setGel30Min(this.getGel30Min().to20GenericMeasure());

        if (this.getFilterCakeLtlp() != null)
            dest.setFilterCakeLtlp(this.getFilterCakeLtlp().to20GenericMeasure());

        if (this.getFiltrateLtlp() != null)
            dest.setFiltrateLtlp(this.getFiltrateLtlp().to20GenericMeasure());

        if (this.getTempHthp() != null)
            dest.setTempHthp(this.getTempHthp().to20GenericMeasure());

        if (this.getPresHthp() != null)
            dest.setPresHthp(this.getPresHthp().to20GenericMeasure());

        if (this.getFiltrateHthp() != null)
            dest.setFiltrateHthp(this.getFiltrateHthp().to20GenericMeasure());

        if (this.getFilterCakeHthp() != null)
            dest.setFilterCakeHthp(this.getFilterCakeHthp().to20GenericMeasure());

        if (this.getSolidsPc() != null)
            dest.setSolidsPc(this.getSolidsPc().to20GenericMeasure());

        if (this.getWaterPc() != null)
            dest.setWaterPc(this.getWaterPc().to20GenericMeasure());

        if (this.getOilPc() != null)
            dest.setOilPc(this.getOilPc().to20GenericMeasure());

        if (this.getSandPc() != null)
            dest.setSandPc(this.getSandPc().to20GenericMeasure());

        if (this.getSolidsLowGravPc() != null)
            dest.setSolidsLowGravPc(this.getSolidsLowGravPc().to20GenericMeasure());

        if (this.getSolidsCalcPc() != null)
            dest.setSolidsCalcPc(this.getSolidsCalcPc().to20GenericMeasure());

        if (this.getBaritePc() != null)
            dest.setBaritePc(this.getBaritePc().to20GenericMeasure());

        if (this.getLcm() != null)
            dest.setLcm(this.getLcm().to20GenericMeasure());

        if (this.getMbt() != null)
            dest.setMbt(this.getMbt().to20GenericMeasure());

        if (this.getTempPh() != null)
            dest.setTempPh(this.getTempPh().to20GenericMeasure());

        if (this.getPm() != null)
            dest.setPm(this.getPm().to20GenericMeasure());

        if (this.getPmFiltrate() != null)
            dest.setPmFiltrate(this.getPmFiltrate().to20GenericMeasure());

        if (this.getMf() != null)
            dest.setMf(this.getMf().to20GenericMeasure());

        if (this.getAlkalinityP1() != null)
            dest.setAlkalinityP1(this.getAlkalinityP1().to20GenericMeasure());

        if (this.getAlkalinityP2() != null)
            this.getAlkalinityP2().to1411GenericMeasure();
        dest.setAlkalinityP2(this.getAlkalinityP2().to20GenericMeasure());

        if (this.getChloride() != null)
            dest.setChloride(this.getChloride().to20GenericMeasure());

        if (this.getCalcium() != null)
            dest.setCalcium(this.getCalcium().to20GenericMeasure());

        if (this.getMagnesium() != null)
            dest.setMagnesium(this.getMagnesium().to20GenericMeasure());

        if (this.getPotassium() != null)
            dest.setPotassium(this.getPotassium().to20GenericMeasure());

        if (this.getBrinePc() != null)
            dest.setBrinePc(this.getBrinePc().to20GenericMeasure());

        if (this.getLime() != null)
            dest.setLime(this.getLime().to20GenericMeasure());

        if (this.getElectStab() != null)
            dest.setElectStab(this.getElectStab().to20GenericMeasure());

        if (this.getCalciumChloride() != null)
            dest.setCalciumChloride(this.getCalciumChloride().to20GenericMeasure());

        if (this.getSolidsHiGravPc() != null)
            dest.setSolidsHiGravPc(this.getSolidsHiGravPc().to20GenericMeasure());

        if (this.getPolymer() != null)
            dest.setPolymer(this.getPolymer().to20GenericMeasure());

        if (this.getSolCorPc() != null)
            dest.setSolCorPc(this.getSolCorPc().to20GenericMeasure());

        if (this.getOilCtg() != null)
            dest.setOilCtg(this.getOilCtg().to20GenericMeasure());

        if (this.getHardnessCa() != null)
            dest.setHardnessCa(this.getHardnessCa().to20GenericMeasure());

        if (this.getSulfide() != null)
            dest.setSulfide(this.getSulfide().to20GenericMeasure());

        if (this.getRheometer() != null) {
            for (com.hashmapinc.tempus.WitsmlObjects.v1311.CsRheometer rheometer : this.getRheometer()) {
                dest.getRheometer().add(rheometer.to20Rheometer());
            }
        }

        return dest;
    }

    //=========================================================================
    // 1.3.1.1 to 1.4.1.1
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1411.CsFluid to1411CsFluid(){
        com.hashmapinc.tempus.WitsmlObjects.v1411.CsFluid dest =
                new com.hashmapinc.tempus.WitsmlObjects.v1411.CsFluid();

        // check non-complex, non-repeating fields
        dest.setType(this.getType());
        dest.setLocationSample(this.getLocationSample());
        dest.setPh(this.getPh());
        dest.setCompany(this.getCompany());
        dest.setEngineer(this.getEngineer());
        dest.setPolyType(this.getPolyType());
        dest.setComments(this.getComments());
        dest.setUid(this.getUid());

        if (this.getAsg() != null){
            dest.setAsg(this.asg);
        }

        // check complex fields
        if (this.getDTim() != null)
            dest.setDTim(this.getDTim());

        if (this.getMd() != null)
            dest.setMd(this.getMd().to1411MeasuredDepthCoord());

        if (this.getDensity() != null)
            dest.setDensity(this.getDensity().to1411GenericMeasure());

        if (this.getVisFunnel() != null)
            dest.setVisFunnel(this.getVisFunnel().to1411GenericMeasure());

        if (this.getTempVis() != null)
            dest.setTempVis(this.getTempVis().to1411GenericMeasure());

        if (this.getPv() != null)
            dest.setPv(this.getPv().to1411GenericMeasure());

        if (this.getYp() != null)
            dest.setYp(this.getYp().to1411GenericMeasure());

        if (this.getGel10Sec() != null)
            dest.setGel10Sec(this.getGel10Sec().to1411GenericMeasure());

        if (this.getGel10Min() != null)
            dest.setGel10Min(this.getGel10Min().to1411GenericMeasure());

        if (this.getGel30Min() != null)
            dest.setGel30Min(this.getGel30Min().to1411GenericMeasure());

        if (this.getFilterCakeLtlp() != null)
            dest.setFilterCakeLtlp(this.getFilterCakeLtlp().to1411GenericMeasure());

        if (this.getFiltrateLtlp() != null)
            dest.setFiltrateLtlp(this.getFiltrateLtlp().to1411GenericMeasure());

        if (this.getTempHthp() != null)
            dest.setTempHthp(this.getTempHthp().to1411GenericMeasure());

        if (this.getPresHthp() != null)
            dest.setPresHthp(this.getPresHthp().to1411GenericMeasure());

        if (this.getFiltrateHthp() != null)
            dest.setFiltrateHthp(this.getFiltrateHthp().to1411GenericMeasure());

        if (this.getFilterCakeHthp() != null)
            dest.setFilterCakeHthp(this.getFilterCakeHthp().to1411GenericMeasure());

        if (this.getSolidsPc() != null)
            dest.setSolidsPc(this.getSolidsPc().to1411GenericMeasure());

        if (this.getWaterPc() != null)
            dest.setWaterPc(this.getWaterPc().to1411GenericMeasure());

        if (this.getOilPc() != null)
            dest.setOilPc(this.getOilPc().to1411GenericMeasure());

        if (this.getSandPc() != null)
            dest.setSandPc(this.getSandPc().to1411GenericMeasure());

        if (this.getSolidsLowGravPc() != null)
            dest.setSolidsLowGravPc(this.getSolidsLowGravPc().to1411GenericMeasure());

        if (this.getSolidsCalcPc() != null)
            dest.setSolidsCalcPc(this.getSolidsCalcPc().to1411GenericMeasure());

        if (this.getBaritePc() != null)
            dest.setBaritePc(this.getBaritePc().to1411GenericMeasure());

        if (this.getLcm() != null)
            dest.setLcd(this.getLcm().to1411GenericMeasure());

        if (this.getMbt() != null)
            dest.setMbt(this.getMbt().to1411GenericMeasure());

        if (this.getTempPh() != null)
            dest.setTempPh(this.getTempPh().to1411GenericMeasure());

        if (this.getPm() != null)
            dest.setPm(this.getPm().to1411GenericMeasure());

        if (this.getPmFiltrate() != null)
            dest.setPmFiltrate(this.getPmFiltrate().to1411GenericMeasure());

        if (this.getMf() != null)
            dest.setMf(this.getMf().to1411GenericMeasure());

        if (this.getAlkalinityP1() != null)
            dest.setAlkalinityP1(this.getAlkalinityP1().to1411GenericMeasure());

        if (this.getAlkalinityP2() != null)
            this.getAlkalinityP2().to1411GenericMeasure();
        dest.setAlkalinityP2(this.getAlkalinityP2().to1411GenericMeasure());

        if (this.getChloride() != null)
            dest.setChloride(this.getChloride().to1411GenericMeasure());

        if (this.getCalcium() != null)
            dest.setCalcium(this.getCalcium().to1411GenericMeasure());

        if (this.getMagnesium() != null)
            dest.setMagnesium(this.getMagnesium().to1411GenericMeasure());

        if (this.getPotassium() != null)
            dest.setPotassium(this.getPotassium().to1411GenericMeasure());

        if (this.getBrinePc() != null)
            dest.setBrinePc(this.getBrinePc().to1411GenericMeasure());

        if (this.getLime() != null)
            dest.setLime(this.getLime().to1411GenericMeasure());

        if (this.getElectStab() != null)
            dest.setElectStab(this.getElectStab().to1411GenericMeasure());

        if (this.getCalciumChloride() != null)
            dest.setCalciumChloride(this.getCalciumChloride().to1411GenericMeasure());

        if (this.getSolidsHiGravPc() != null)
            dest.setSolidsHiGravPc(this.getSolidsHiGravPc().to1411GenericMeasure());

        if (this.getPolymer() != null)
            dest.setPolymer(this.getPolymer().to1411GenericMeasure());

        if (this.getSolCorPc() != null)
            dest.setSolCorPc(this.getSolCorPc().to1411GenericMeasure());

        if (this.getOilCtg() != null)
            dest.setOilCtg(this.getOilCtg().to1411GenericMeasure());

        if (this.getHardnessCa() != null)
            dest.setHardnessCa(this.getHardnessCa().to1411GenericMeasure());

        if (this.getSulfide() != null)
            dest.setSulfide(this.getSulfide().to1411GenericMeasure());

        if (this.getRheometer() != null) {
            for (com.hashmapinc.tempus.WitsmlObjects.v1311.CsRheometer rheometer : this.getRheometer()) {
                dest.getRheometer().add(rheometer.to1411CsRheometer());
            }
        }
        return dest;
    }

}
