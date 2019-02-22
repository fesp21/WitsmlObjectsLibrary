package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - tubular component - component schema.
 * 			The order of the components in the XML instance is significant.
 * 			The components are list in the order that they enter the hole.
 * 			That is, the first component is closest to the bit.
 * 
 * <p>Java class for cs_tubularComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_tubularComponent">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="typeTubularComp" type="{http://www.witsml.org/schemas/131}TubularComponent"/>
 *         <element name="sequence" type="{http://www.witsml.org/schemas/131}positiveCount"/>
 *         <element name="description" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *         <element name="id" type="{http://www.witsml.org/schemas/131}lengthMeasure"/>
 *         <element name="od" type="{http://www.witsml.org/schemas/131}lengthMeasure"/>
 *         <element name="odMx" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="len" type="{http://www.witsml.org/schemas/131}lengthMeasure"/>
 *         <element name="lenJointAv" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="numJointStand" type="{http://www.witsml.org/schemas/131}nonNegativeCount" minOccurs="0"/>
 *         <element name="wtPerLen" type="{http://www.witsml.org/schemas/131}massPerLengthMeasure" minOccurs="0"/>
 *         <element name="grade" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="odDrift" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="tensYield" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="tqYield" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="stressFatig" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="lenFishneck" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="idFishneck" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="odFishneck" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="disp" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="presBurst" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presCollapse" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="classService" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="wearWall" type="{http://www.witsml.org/schemas/131}lengthPerLengthMeasure" minOccurs="0"/>
 *         <element name="thickWall" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="configCon" type="{http://www.witsml.org/schemas/131}BoxPinConfig" minOccurs="0"/>
 *         <element name="bendStiffness" type="{http://www.witsml.org/schemas/131}forcePerLengthMeasure" minOccurs="0"/>
 *         <element name="axialStiffness" type="{http://www.witsml.org/schemas/131}forcePerLengthMeasure" minOccurs="0"/>
 *         <element name="torsionalStiffness" type="{http://www.witsml.org/schemas/131}forcePerLengthMeasure" minOccurs="0"/>
 *         <element name="typeMaterial" type="{http://www.witsml.org/schemas/131}MaterialType" minOccurs="0"/>
 *         <element name="doglegMx" type="{http://www.witsml.org/schemas/131}anglePerLengthMeasure" minOccurs="0"/>
 *         <element name="vendor" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="model" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="nameTag" type="{http://www.witsml.org/schemas/131}cs_nameTag" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="bitRecord" type="{http://www.witsml.org/schemas/131}cs_bitRecord" minOccurs="0"/>
 *         <element name="areaNozzleFlow" type="{http://www.witsml.org/schemas/131}areaMeasure" minOccurs="0"/>
 *         <element name="nozzle" type="{http://www.witsml.org/schemas/131}cs_nozzle" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="connection" type="{http://www.witsml.org/schemas/131}cs_connection" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="jar" type="{http://www.witsml.org/schemas/131}cs_jar" minOccurs="0"/>
 *         <element name="mwdTool" type="{http://www.witsml.org/schemas/131}cs_mwdTool" minOccurs="0"/>
 *         <element name="motor" type="{http://www.witsml.org/schemas/131}cs_motor" minOccurs="0"/>
 *         <element name="stabilizer" type="{http://www.witsml.org/schemas/131}cs_stabilizer" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="bend" type="{http://www.witsml.org/schemas/131}cs_bend" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="holeOpener" type="{http://www.witsml.org/schemas/131}cs_holeOpener" minOccurs="0"/>
 *         <element name="rotarySteerableTool" type="{http://www.witsml.org/schemas/131}cs_rotarySteerableTool" minOccurs="0"/>
 *         <element name="customData" type="{http://www.witsml.org/schemas/131}cs_customData" minOccurs="0"/>
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
@XmlType(name = "cs_tubularComponent", propOrder = {
    "typeTubularComp",
    "sequence",
    "description",
    "id",
    "od",
    "odMx",
    "len",
    "lenJointAv",
    "numJointStand",
    "wtPerLen",
    "grade",
    "odDrift",
    "tensYield",
    "tqYield",
    "stressFatig",
    "lenFishneck",
    "idFishneck",
    "odFishneck",
    "disp",
    "presBurst",
    "presCollapse",
    "classService",
    "wearWall",
    "thickWall",
    "configCon",
    "bendStiffness",
    "axialStiffness",
    "torsionalStiffness",
    "typeMaterial",
    "doglegMx",
    "vendor",
    "model",
    "nameTag",
    "bitRecord",
    "areaNozzleFlow",
    "nozzle",
    "connection",
    "jar",
    "mwdTool",
    "motor",
    "stabilizer",
    "bend",
    "holeOpener",
    "rotarySteerableTool",
    "customData"
})
public class CsTubularComponent {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected String typeTubularComp;
    protected short sequence;
    protected String description;
    @XmlElement(required = true)
    protected LengthMeasure id;
    @XmlElement(required = true)
    protected LengthMeasure od;
    protected LengthMeasure odMx;
    @XmlElement(required = true)
    protected LengthMeasure len;
    protected LengthMeasure lenJointAv;
    protected Short numJointStand;
    protected MassPerLengthMeasure wtPerLen;
    protected String grade;
    protected LengthMeasure odDrift;
    protected PressureMeasure tensYield;
    protected PressureMeasure tqYield;
    protected PressureMeasure stressFatig;
    protected LengthMeasure lenFishneck;
    protected LengthMeasure idFishneck;
    protected LengthMeasure odFishneck;
    protected VolumeMeasure disp;
    protected PressureMeasure presBurst;
    protected PressureMeasure presCollapse;
    protected String classService;
    protected LengthPerLengthMeasure wearWall;
    protected LengthMeasure thickWall;
    @XmlSchemaType(name = "string")
    protected String configCon;
    protected ForcePerLengthMeasure bendStiffness;
    protected ForcePerLengthMeasure axialStiffness;
    protected ForcePerLengthMeasure torsionalStiffness;
    @XmlSchemaType(name = "string")
    protected String typeMaterial;
    protected AnglePerLengthMeasure doglegMx;
    protected String vendor;
    protected String model;
    protected List<CsNameTag> nameTag;
    protected CsBitRecord bitRecord;
    protected AreaMeasure areaNozzleFlow;
    protected List<CsNozzle> nozzle;
    protected List<CsConnection> connection;
    protected CsJar jar;
    protected CsMwdTool mwdTool;
    protected CsMotor motor;
    protected List<CsStabilizer> stabilizer;
    protected List<CsBend> bend;
    protected CsHoleOpener holeOpener;
    protected CsRotarySteerableTool rotarySteerableTool;
    protected CsCustomData customData;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the typeTubularComp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeTubularComp() {
        return typeTubularComp;
    }

    /**
     * Sets the value of the typeTubularComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeTubularComp(String value) {
        this.typeTubularComp = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     */
    public short getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(short value) {
        this.sequence = value;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setId(LengthMeasure value) {
        this.id = value;
    }

    /**
     * Gets the value of the od property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOd() {
        return od;
    }

    /**
     * Sets the value of the od property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOd(LengthMeasure value) {
        this.od = value;
    }

    /**
     * Gets the value of the odMx property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOdMx() {
        return odMx;
    }

    /**
     * Sets the value of the odMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOdMx(LengthMeasure value) {
        this.odMx = value;
    }

    /**
     * Gets the value of the len property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLen() {
        return len;
    }

    /**
     * Sets the value of the len property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLen(LengthMeasure value) {
        this.len = value;
    }

    /**
     * Gets the value of the lenJointAv property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenJointAv() {
        return lenJointAv;
    }

    /**
     * Sets the value of the lenJointAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenJointAv(LengthMeasure value) {
        this.lenJointAv = value;
    }

    /**
     * Gets the value of the numJointStand property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumJointStand() {
        return numJointStand;
    }

    /**
     * Sets the value of the numJointStand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumJointStand(Short value) {
        this.numJointStand = value;
    }

    /**
     * Gets the value of the wtPerLen property.
     * 
     * @return
     *     possible object is
     *     {@link MassPerLengthMeasure }
     *     
     */
    public MassPerLengthMeasure getWtPerLen() {
        return wtPerLen;
    }

    /**
     * Sets the value of the wtPerLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassPerLengthMeasure }
     *     
     */
    public void setWtPerLen(MassPerLengthMeasure value) {
        this.wtPerLen = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade(String value) {
        this.grade = value;
    }

    /**
     * Gets the value of the odDrift property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOdDrift() {
        return odDrift;
    }

    /**
     * Sets the value of the odDrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOdDrift(LengthMeasure value) {
        this.odDrift = value;
    }

    /**
     * Gets the value of the tensYield property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getTensYield() {
        return tensYield;
    }

    /**
     * Sets the value of the tensYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setTensYield(PressureMeasure value) {
        this.tensYield = value;
    }

    /**
     * Gets the value of the tqYield property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getTqYield() {
        return tqYield;
    }

    /**
     * Sets the value of the tqYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setTqYield(PressureMeasure value) {
        this.tqYield = value;
    }

    /**
     * Gets the value of the stressFatig property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getStressFatig() {
        return stressFatig;
    }

    /**
     * Sets the value of the stressFatig property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setStressFatig(PressureMeasure value) {
        this.stressFatig = value;
    }

    /**
     * Gets the value of the lenFishneck property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenFishneck() {
        return lenFishneck;
    }

    /**
     * Sets the value of the lenFishneck property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenFishneck(LengthMeasure value) {
        this.lenFishneck = value;
    }

    /**
     * Gets the value of the idFishneck property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdFishneck() {
        return idFishneck;
    }

    /**
     * Sets the value of the idFishneck property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdFishneck(LengthMeasure value) {
        this.idFishneck = value;
    }

    /**
     * Gets the value of the odFishneck property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOdFishneck() {
        return odFishneck;
    }

    /**
     * Sets the value of the odFishneck property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOdFishneck(LengthMeasure value) {
        this.odFishneck = value;
    }

    /**
     * Gets the value of the disp property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getDisp() {
        return disp;
    }

    /**
     * Sets the value of the disp property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setDisp(VolumeMeasure value) {
        this.disp = value;
    }

    /**
     * Gets the value of the presBurst property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresBurst() {
        return presBurst;
    }

    /**
     * Sets the value of the presBurst property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresBurst(PressureMeasure value) {
        this.presBurst = value;
    }

    /**
     * Gets the value of the presCollapse property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresCollapse() {
        return presCollapse;
    }

    /**
     * Sets the value of the presCollapse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresCollapse(PressureMeasure value) {
        this.presCollapse = value;
    }

    /**
     * Gets the value of the classService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassService() {
        return classService;
    }

    /**
     * Sets the value of the classService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassService(String value) {
        this.classService = value;
    }

    /**
     * Gets the value of the wearWall property.
     * 
     * @return
     *     possible object is
     *     {@link LengthPerLengthMeasure }
     *     
     */
    public LengthPerLengthMeasure getWearWall() {
        return wearWall;
    }

    /**
     * Sets the value of the wearWall property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthPerLengthMeasure }
     *     
     */
    public void setWearWall(LengthPerLengthMeasure value) {
        this.wearWall = value;
    }

    /**
     * Gets the value of the thickWall property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getThickWall() {
        return thickWall;
    }

    /**
     * Sets the value of the thickWall property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setThickWall(LengthMeasure value) {
        this.thickWall = value;
    }

    /**
     * Gets the value of the configCon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigCon() {
        return configCon;
    }

    /**
     * Sets the value of the configCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigCon(String value) {
        this.configCon = value;
    }

    /**
     * Gets the value of the bendStiffness property.
     * 
     * @return
     *     possible object is
     *     {@link ForcePerLengthMeasure }
     *     
     */
    public ForcePerLengthMeasure getBendStiffness() {
        return bendStiffness;
    }

    /**
     * Sets the value of the bendStiffness property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForcePerLengthMeasure }
     *     
     */
    public void setBendStiffness(ForcePerLengthMeasure value) {
        this.bendStiffness = value;
    }

    /**
     * Gets the value of the axialStiffness property.
     * 
     * @return
     *     possible object is
     *     {@link ForcePerLengthMeasure }
     *     
     */
    public ForcePerLengthMeasure getAxialStiffness() {
        return axialStiffness;
    }

    /**
     * Sets the value of the axialStiffness property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForcePerLengthMeasure }
     *     
     */
    public void setAxialStiffness(ForcePerLengthMeasure value) {
        this.axialStiffness = value;
    }

    /**
     * Gets the value of the torsionalStiffness property.
     * 
     * @return
     *     possible object is
     *     {@link ForcePerLengthMeasure }
     *     
     */
    public ForcePerLengthMeasure getTorsionalStiffness() {
        return torsionalStiffness;
    }

    /**
     * Sets the value of the torsionalStiffness property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForcePerLengthMeasure }
     *     
     */
    public void setTorsionalStiffness(ForcePerLengthMeasure value) {
        this.torsionalStiffness = value;
    }

    /**
     * Gets the value of the typeMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeMaterial() {
        return typeMaterial;
    }

    /**
     * Sets the value of the typeMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeMaterial(String value) {
        this.typeMaterial = value;
    }

    /**
     * Gets the value of the doglegMx property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerLengthMeasure }
     *     
     */
    public AnglePerLengthMeasure getDoglegMx() {
        return doglegMx;
    }

    /**
     * Sets the value of the doglegMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerLengthMeasure }
     *     
     */
    public void setDoglegMx(AnglePerLengthMeasure value) {
        this.doglegMx = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the nameTag property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameTag property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getNameTag().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsNameTag }
     * 
     * 
     */
    public List<CsNameTag> getNameTag() {
        if (nameTag == null) {
            nameTag = new ArrayList<CsNameTag>();
        }
        return this.nameTag;
    }

    /**
     * Gets the value of the bitRecord property.
     * 
     * @return
     *     possible object is
     *     {@link CsBitRecord }
     *     
     */
    public CsBitRecord getBitRecord() {
        return bitRecord;
    }

    /**
     * Sets the value of the bitRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsBitRecord }
     *     
     */
    public void setBitRecord(CsBitRecord value) {
        this.bitRecord = value;
    }

    /**
     * Gets the value of the areaNozzleFlow property.
     * 
     * @return
     *     possible object is
     *     {@link AreaMeasure }
     *     
     */
    public AreaMeasure getAreaNozzleFlow() {
        return areaNozzleFlow;
    }

    /**
     * Sets the value of the areaNozzleFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaMeasure }
     *     
     */
    public void setAreaNozzleFlow(AreaMeasure value) {
        this.areaNozzleFlow = value;
    }

    /**
     * Gets the value of the nozzle property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nozzle property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getNozzle().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsNozzle }
     * 
     * 
     */
    public List<CsNozzle> getNozzle() {
        if (nozzle == null) {
            nozzle = new ArrayList<CsNozzle>();
        }
        return this.nozzle;
    }

    /**
     * Gets the value of the connection property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connection property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getConnection().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsConnection }
     * 
     * 
     */
    public List<CsConnection> getConnection() {
        if (connection == null) {
            connection = new ArrayList<CsConnection>();
        }
        return this.connection;
    }

    /**
     * Gets the value of the jar property.
     * 
     * @return
     *     possible object is
     *     {@link CsJar }
     *     
     */
    public CsJar getJar() {
        return jar;
    }

    /**
     * Sets the value of the jar property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsJar }
     *     
     */
    public void setJar(CsJar value) {
        this.jar = value;
    }

    /**
     * Gets the value of the mwdTool property.
     * 
     * @return
     *     possible object is
     *     {@link CsMwdTool }
     *     
     */
    public CsMwdTool getMwdTool() {
        return mwdTool;
    }

    /**
     * Sets the value of the mwdTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsMwdTool }
     *     
     */
    public void setMwdTool(CsMwdTool value) {
        this.mwdTool = value;
    }

    /**
     * Gets the value of the motor property.
     * 
     * @return
     *     possible object is
     *     {@link CsMotor }
     *     
     */
    public CsMotor getMotor() {
        return motor;
    }

    /**
     * Sets the value of the motor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsMotor }
     *     
     */
    public void setMotor(CsMotor value) {
        this.motor = value;
    }

    /**
     * Gets the value of the stabilizer property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stabilizer property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getStabilizer().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsStabilizer }
     * 
     * 
     */
    public List<CsStabilizer> getStabilizer() {
        if (stabilizer == null) {
            stabilizer = new ArrayList<CsStabilizer>();
        }
        return this.stabilizer;
    }

    /**
     * Gets the value of the bend property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bend property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getBend().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsBend }
     * 
     * 
     */
    public List<CsBend> getBend() {
        if (bend == null) {
            bend = new ArrayList<CsBend>();
        }
        return this.bend;
    }

    /**
     * Gets the value of the holeOpener property.
     * 
     * @return
     *     possible object is
     *     {@link CsHoleOpener }
     *     
     */
    public CsHoleOpener getHoleOpener() {
        return holeOpener;
    }

    /**
     * Sets the value of the holeOpener property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsHoleOpener }
     *     
     */
    public void setHoleOpener(CsHoleOpener value) {
        this.holeOpener = value;
    }

    /**
     * Gets the value of the rotarySteerableTool property.
     * 
     * @return
     *     possible object is
     *     {@link CsRotarySteerableTool }
     *     
     */
    public CsRotarySteerableTool getRotarySteerableTool() {
        return rotarySteerableTool;
    }

    /**
     * Sets the value of the rotarySteerableTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsRotarySteerableTool }
     *     
     */
    public void setRotarySteerableTool(CsRotarySteerableTool value) {
        this.rotarySteerableTool = value;
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
