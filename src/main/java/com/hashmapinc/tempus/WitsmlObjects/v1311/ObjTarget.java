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
 * <p>Java class for obj_target complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_target">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameWell" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="nameWellbore" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_target" minOccurs="0"/>
 *         <element name="commonData" type="{http://www.witsml.org/schemas/131}cs_commonData" minOccurs="0"/>
 *         <element name="customData" type="{http://www.witsml.org/schemas/131}cs_customData" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/131}attgrp_uid"/>
 *       <attribute name="uidWell" type="{http://www.witsml.org/schemas/131}uidString" />
 *       <attribute name="uidWellbore" type="{http://www.witsml.org/schemas/131}uidString" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obj_target", propOrder = {
    "nameWell",
    "nameWellbore",
    "name",
    "parentTarget",
    "dispNsCenter",
    "dispEwCenter",
    "tvd",
    "dispNsOffset",
    "dispEwOffset",
    "thickAbove",
    "thickBelow",
    "dip",
    "strike",
    "rotation",
    "lenMajorAxis",
    "widMinorAxis",
    "typeTargetScope",
    "dispNsSectOrig",
    "dispEwSectOrig",
    "aziRef",
    "catTarg",
    "location",
    "targetSection",
    "commonData",
    "customData"
})
public class ObjTarget {

    @XmlElement(required = true)
    protected String nameWell;
    @XmlElement(required = true)
    protected String nameWellbore;
    @XmlElement(required = true)
    protected String name;
    protected RefNameString parentTarget;
    protected LengthMeasure dispNsCenter;
    protected LengthMeasure dispEwCenter;
    protected WellVerticalDepthCoord tvd;
    protected LengthMeasure dispNsOffset;
    protected LengthMeasure dispEwOffset;
    protected LengthMeasure thickAbove;
    protected LengthMeasure thickBelow;
    protected PlaneAngleMeasure dip;
    protected PlaneAngleMeasure strike;
    protected PlaneAngleMeasure rotation;
    protected LengthMeasure lenMajorAxis;
    protected LengthMeasure widMinorAxis;
    protected String typeTargetScope;
    protected LengthMeasure dispNsSectOrig;
    protected LengthMeasure dispEwSectOrig;
    @XmlSchemaType(name = "string")
    protected String aziRef;
    @XmlSchemaType(name = "string")
    protected String catTarg;
    protected List<CsLocation> location;
    protected List<CsTargetSection> targetSection;
    protected CsCommonData commonData;
    protected CsCustomData customData;
    @XmlAttribute(name = "uidWell")
    protected String uidWell;
    @XmlAttribute(name = "uidWellbore")
    protected String uidWellbore;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the nameWell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameWell() {
        return nameWell;
    }

    /**
     * Sets the value of the nameWell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameWell(String value) {
        this.nameWell = value;
    }

    /**
     * Gets the value of the nameWellbore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameWellbore() {
        return nameWellbore;
    }

    /**
     * Sets the value of the nameWellbore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameWellbore(String value) {
        this.nameWellbore = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the parentTarget property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getParentTarget() {
        return parentTarget;
    }

    /**
     * Sets the value of the parentTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setParentTarget(RefNameString value) {
        this.parentTarget = value;
    }

    /**
     * Gets the value of the dispNsCenter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDispNsCenter() {
        return dispNsCenter;
    }

    /**
     * Sets the value of the dispNsCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDispNsCenter(LengthMeasure value) {
        this.dispNsCenter = value;
    }

    /**
     * Gets the value of the dispEwCenter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDispEwCenter() {
        return dispEwCenter;
    }

    /**
     * Sets the value of the dispEwCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDispEwCenter(LengthMeasure value) {
        this.dispEwCenter = value;
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
     * Gets the value of the dispNsOffset property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDispNsOffset() {
        return dispNsOffset;
    }

    /**
     * Sets the value of the dispNsOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDispNsOffset(LengthMeasure value) {
        this.dispNsOffset = value;
    }

    /**
     * Gets the value of the dispEwOffset property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDispEwOffset() {
        return dispEwOffset;
    }

    /**
     * Sets the value of the dispEwOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDispEwOffset(LengthMeasure value) {
        this.dispEwOffset = value;
    }

    /**
     * Gets the value of the thickAbove property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getThickAbove() {
        return thickAbove;
    }

    /**
     * Sets the value of the thickAbove property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setThickAbove(LengthMeasure value) {
        this.thickAbove = value;
    }

    /**
     * Gets the value of the thickBelow property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getThickBelow() {
        return thickBelow;
    }

    /**
     * Sets the value of the thickBelow property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setThickBelow(LengthMeasure value) {
        this.thickBelow = value;
    }

    /**
     * Gets the value of the dip property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getDip() {
        return dip;
    }

    /**
     * Sets the value of the dip property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setDip(PlaneAngleMeasure value) {
        this.dip = value;
    }

    /**
     * Gets the value of the strike property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getStrike() {
        return strike;
    }

    /**
     * Sets the value of the strike property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setStrike(PlaneAngleMeasure value) {
        this.strike = value;
    }

    /**
     * Gets the value of the rotation property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getRotation() {
        return rotation;
    }

    /**
     * Sets the value of the rotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setRotation(PlaneAngleMeasure value) {
        this.rotation = value;
    }

    /**
     * Gets the value of the lenMajorAxis property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenMajorAxis() {
        return lenMajorAxis;
    }

    /**
     * Sets the value of the lenMajorAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenMajorAxis(LengthMeasure value) {
        this.lenMajorAxis = value;
    }

    /**
     * Gets the value of the widMinorAxis property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getWidMinorAxis() {
        return widMinorAxis;
    }

    /**
     * Sets the value of the widMinorAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setWidMinorAxis(LengthMeasure value) {
        this.widMinorAxis = value;
    }

    /**
     * Gets the value of the typeTargetScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeTargetScope() {
        return typeTargetScope;
    }

    /**
     * Sets the value of the typeTargetScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeTargetScope(String value) {
        this.typeTargetScope = value;
    }

    /**
     * Gets the value of the dispNsSectOrig property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDispNsSectOrig() {
        return dispNsSectOrig;
    }

    /**
     * Sets the value of the dispNsSectOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDispNsSectOrig(LengthMeasure value) {
        this.dispNsSectOrig = value;
    }

    /**
     * Gets the value of the dispEwSectOrig property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDispEwSectOrig() {
        return dispEwSectOrig;
    }

    /**
     * Sets the value of the dispEwSectOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDispEwSectOrig(LengthMeasure value) {
        this.dispEwSectOrig = value;
    }

    /**
     * Gets the value of the aziRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAziRef() {
        return aziRef;
    }

    /**
     * Sets the value of the aziRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAziRef(String value) {
        this.aziRef = value;
    }

    /**
     * Gets the value of the catTarg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatTarg() {
        return catTarg;
    }

    /**
     * Sets the value of the catTarg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatTarg(String value) {
        this.catTarg = value;
    }

    /**
     * Gets the value of the location property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getLocation().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsLocation }
     * 
     * 
     */
    public List<CsLocation> getLocation() {
        if (location == null) {
            location = new ArrayList<CsLocation>();
        }
        return this.location;
    }

    /**
     * Gets the value of the targetSection property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetSection property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getTargetSection().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsTargetSection }
     * 
     * 
     */
    public List<CsTargetSection> getTargetSection() {
        if (targetSection == null) {
            targetSection = new ArrayList<CsTargetSection>();
        }
        return this.targetSection;
    }

    /**
     * Gets the value of the commonData property.
     * 
     * @return
     *     possible object is
     *     {@link CsCommonData }
     *     
     */
    public CsCommonData getCommonData() {
        return commonData;
    }

    /**
     * Sets the value of the commonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsCommonData }
     *     
     */
    public void setCommonData(CsCommonData value) {
        this.commonData = value;
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
     * Gets the value of the uidWell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidWell() {
        return uidWell;
    }

    /**
     * Sets the value of the uidWell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidWell(String value) {
        this.uidWell = value;
    }

    /**
     * Gets the value of the uidWellbore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidWellbore() {
        return uidWellbore;
    }

    /**
     * Sets the value of the uidWellbore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidWellbore(String value) {
        this.uidWellbore = value;
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
