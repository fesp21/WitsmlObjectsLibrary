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
import javax.xml.bind.annotation.XmlType;


/**
 *  WITSML - Well Coordinate Reference System Component Schema.
 * 			Note that this is intended for use with two dimensional coordinates. 
 * 			That does not prevent the use of a three dimensional CRS. It just means that
 * 			only two coordinates will be specified in that 3D system. The veritcal coordinates are
 * 			specified separately and, for 3D systems, one of the linked wellDatums should represent
 * 			the vertical datum of that 3D system so that the height in the 3d system can be determined. 
 * 
 * <p>Java class for cs_wellCRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_wellCRS">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.witsml.org/schemas/1series}nameString"/>
 *         <choice>
 *           <element name="mapProjection" type="{http://www.witsml.org/schemas/1series}cs_projectionx"/>
 *           <element name="geographic" type="{http://www.witsml.org/schemas/1series}cs_geodeticModel"/>
 *           <element name="mapProjectionCRS" type="{http://www.witsml.org/schemas/1series}refNameString"/>
 *           <element name="geodeticCRS" type="{http://www.witsml.org/schemas/1series}refNameString"/>
 *           <element name="localCRS" type="{http://www.witsml.org/schemas/1series}cs_localCRS"/>
 *         </choice>
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
@XmlType(name = "cs_wellCRS", propOrder = {
    "name",
    "mapProjection",
    "geographic",
    "mapProjectionCRS",
    "geodeticCRS",
    "localCRS",
    "description",
    "extensionNameValue"
})
public class CsWellCRS {

    @XmlElement(required = true)
    protected String name;
    protected CsProjectionx mapProjection;
    protected CsGeodeticModel geographic;
    protected RefNameString mapProjectionCRS;
    protected RefNameString geodeticCRS;
    protected CsLocalCRS localCRS;
    protected String description;
    protected List<CsExtensionNameValue> extensionNameValue;
    @XmlAttribute(name = "uid")
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
     * Gets the value of the mapProjection property.
     * 
     * @return
     *     possible object is
     *     {@link CsProjectionx }
     *     
     */
    public CsProjectionx getMapProjection() {
        return mapProjection;
    }

    /**
     * Sets the value of the mapProjection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsProjectionx }
     *     
     */
    public void setMapProjection(CsProjectionx value) {
        this.mapProjection = value;
    }

    /**
     * Gets the value of the geographic property.
     * 
     * @return
     *     possible object is
     *     {@link CsGeodeticModel }
     *     
     */
    public CsGeodeticModel getGeographic() {
        return geographic;
    }

    /**
     * Sets the value of the geographic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsGeodeticModel }
     *     
     */
    public void setGeographic(CsGeodeticModel value) {
        this.geographic = value;
    }

    /**
     * Gets the value of the mapProjectionCRS property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getMapProjectionCRS() {
        return mapProjectionCRS;
    }

    /**
     * Sets the value of the mapProjectionCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setMapProjectionCRS(RefNameString value) {
        this.mapProjectionCRS = value;
    }

    /**
     * Gets the value of the geodeticCRS property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getGeodeticCRS() {
        return geodeticCRS;
    }

    /**
     * Sets the value of the geodeticCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setGeodeticCRS(RefNameString value) {
        this.geodeticCRS = value;
    }

    /**
     * Gets the value of the localCRS property.
     * 
     * @return
     *     possible object is
     *     {@link CsLocalCRS }
     *     
     */
    public CsLocalCRS getLocalCRS() {
        return localCRS;
    }

    /**
     * Sets the value of the localCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsLocalCRS }
     *     
     */
    public void setLocalCRS(CsLocalCRS value) {
        this.localCRS = value;
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