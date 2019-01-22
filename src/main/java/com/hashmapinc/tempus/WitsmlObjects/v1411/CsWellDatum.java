//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the vertical datums associated with elevation, vertical depth 
 * 			and measured depth coordinates within the context of a well. 
 * 
 * <p>Java class for cs_wellDatum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_wellDatum">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.witsml.org/schemas/1series}nameString"/>
 *         <element name="code" type="{http://www.witsml.org/schemas/1series}ElevCodeEnum" minOccurs="0"/>
 *         <choice>
 *           <element name="datumName" type="{http://www.witsml.org/schemas/1series}wellKnownNameStruct" minOccurs="0"/>
 *           <element name="datumCRS" type="{http://www.witsml.org/schemas/1series}refNameString" minOccurs="0"/>
 *         </choice>
 *         <element name="kind" type="{http://www.witsml.org/schemas/1series}kindString" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="wellbore" type="{http://www.witsml.org/schemas/1series}cs_refWellWellbore" minOccurs="0"/>
 *         <element name="rig" type="{http://www.witsml.org/schemas/1series}cs_refWellWellboreRig" minOccurs="0"/>
 *         <element name="elevation" type="{http://www.witsml.org/schemas/1series}wellElevationCoord" minOccurs="0"/>
 *         <element name="measuredDepth" type="{http://www.witsml.org/schemas/1series}measuredDepthCoord" minOccurs="0"/>
 *         <element name="horizontalLocation" type="{http://www.witsml.org/schemas/1series}cs_location" minOccurs="0"/>
 *         <element name="comment" type="{http://www.witsml.org/schemas/1series}commentString" minOccurs="0"/>
 *         <element name="extensionNameValue" type="{http://www.witsml.org/schemas/1series}cs_extensionNameValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="uid" use="required" type="{http://www.witsml.org/schemas/1series}uidString" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_wellDatum", propOrder = {
    "name",
    "code",
    "datumName",
    "datumCRS",
    "kind",
    "wellbore",
    "rig",
    "elevation",
    "measuredDepth",
    "horizontalLocation",
    "comment",
    "extensionNameValue"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CsWellDatum {

    @XmlElement(required = true)
    protected String name;
    @XmlSchemaType(name = "string")
    protected ElevCodeEnum code;
    protected WellKnownNameStruct datumName;
    protected RefNameString datumCRS;
    protected List<String> kind;
    protected CsRefWellWellbore wellbore;
    protected CsRefWellWellboreRig rig;
    protected WellElevationCoord elevation;
    protected MeasuredDepthCoord measuredDepth;
    protected CsLocation horizontalLocation;
    protected String comment;
    protected List<CsExtensionNameValue> extensionNameValue;
    @XmlAttribute(name = "uid", required = true)
    @JsonInclude(JsonInclude.Include.ALWAYS)
    protected String uid;

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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link ElevCodeEnum }
     *     
     */
    public ElevCodeEnum getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevCodeEnum }
     *     
     */
    public void setCode(ElevCodeEnum value) {
        this.code = value;
    }

    /**
     * Gets the value of the datumName property.
     * 
     * @return
     *     possible object is
     *     {@link WellKnownNameStruct }
     *     
     */
    public WellKnownNameStruct getDatumName() {
        return datumName;
    }

    /**
     * Sets the value of the datumName property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellKnownNameStruct }
     *     
     */
    public void setDatumName(WellKnownNameStruct value) {
        this.datumName = value;
    }

    /**
     * Gets the value of the datumCRS property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getDatumCRS() {
        return datumCRS;
    }

    /**
     * Sets the value of the datumCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setDatumCRS(RefNameString value) {
        this.datumCRS = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kind property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getKind().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKind() {
        if (kind == null) {
            kind = new ArrayList<String>();
        }
        return this.kind;
    }

    public void setKind(List<String> kindList) {
        this.kind = kindList;
    }


    /**
     * Gets the value of the wellbore property.
     * 
     * @return
     *     possible object is
     *     {@link CsRefWellWellbore }
     *     
     */
    public CsRefWellWellbore getWellbore() {
        return wellbore;
    }

    /**
     * Sets the value of the wellbore property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsRefWellWellbore }
     *     
     */
    public void setWellbore(CsRefWellWellbore value) {
        this.wellbore = value;
    }

    /**
     * Gets the value of the rig property.
     * 
     * @return
     *     possible object is
     *     {@link CsRefWellWellboreRig }
     *     
     */
    public CsRefWellWellboreRig getRig() {
        return rig;
    }

    /**
     * Sets the value of the rig property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsRefWellWellboreRig }
     *     
     */
    public void setRig(CsRefWellWellboreRig value) {
        this.rig = value;
    }

    /**
     * Gets the value of the elevation property.
     * 
     * @return
     *     possible object is
     *     {@link WellElevationCoord }
     *     
     */
    public WellElevationCoord getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellElevationCoord }
     *     
     */
    public void setElevation(WellElevationCoord value) {
        this.elevation = value;
    }

    /**
     * Gets the value of the measuredDepth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMeasuredDepth() {
        return measuredDepth;
    }

    /**
     * Sets the value of the measuredDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMeasuredDepth(MeasuredDepthCoord value) {
        this.measuredDepth = value;
    }

    /**
     * Gets the value of the horizontalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CsLocation }
     *     
     */
    public CsLocation getHorizontalLocation() {
        return horizontalLocation;
    }

    /**
     * Sets the value of the horizontalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsLocation }
     *     
     */
    public void setHorizontalLocation(CsLocation value) {
        this.horizontalLocation = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
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
