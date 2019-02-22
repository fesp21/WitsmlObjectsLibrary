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
 * WITSML - Tubular Jar Component Schema
 * 
 * <p>Java class for cs_jar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_jar">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="forUpSet" type="{http://www.witsml.org/schemas/1series}forceMeasure" minOccurs="0"/>
 *         <element name="forDownSet" type="{http://www.witsml.org/schemas/1series}forceMeasure" minOccurs="0"/>
 *         <element name="forUpTrip" type="{http://www.witsml.org/schemas/1series}forceMeasure" minOccurs="0"/>
 *         <element name="forDownTrip" type="{http://www.witsml.org/schemas/1series}forceMeasure" minOccurs="0"/>
 *         <element name="forPmpOpen" type="{http://www.witsml.org/schemas/1series}forceMeasure" minOccurs="0"/>
 *         <element name="forSealFric" type="{http://www.witsml.org/schemas/1series}forceMeasure" minOccurs="0"/>
 *         <element name="typeJar" type="{http://www.witsml.org/schemas/1series}JarType" minOccurs="0"/>
 *         <element name="jarAction" type="{http://www.witsml.org/schemas/1series}JarAction" minOccurs="0"/>
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
@XmlType(name = "cs_jar", propOrder = {
    "forUpSet",
    "forDownSet",
    "forUpTrip",
    "forDownTrip",
    "forPmpOpen",
    "forSealFric",
    "typeJar",
    "jarAction",
    "customData",
    "extensionAny"
})
public class CsJar {

    protected ForceMeasure forUpSet;
    protected ForceMeasure forDownSet;
    protected ForceMeasure forUpTrip;
    protected ForceMeasure forDownTrip;
    protected ForceMeasure forPmpOpen;
    protected ForceMeasure forSealFric;
    @XmlSchemaType(name = "string")
    protected String typeJar;
    @XmlSchemaType(name = "string")
    protected String jarAction;
    protected CsCustomData customData;
    protected CsExtensionAny extensionAny;

    /**
     * Gets the value of the forUpSet property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getForUpSet() {
        return forUpSet;
    }

    /**
     * Sets the value of the forUpSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setForUpSet(ForceMeasure value) {
        this.forUpSet = value;
    }

    /**
     * Gets the value of the forDownSet property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getForDownSet() {
        return forDownSet;
    }

    /**
     * Sets the value of the forDownSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setForDownSet(ForceMeasure value) {
        this.forDownSet = value;
    }

    /**
     * Gets the value of the forUpTrip property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getForUpTrip() {
        return forUpTrip;
    }

    /**
     * Sets the value of the forUpTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setForUpTrip(ForceMeasure value) {
        this.forUpTrip = value;
    }

    /**
     * Gets the value of the forDownTrip property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getForDownTrip() {
        return forDownTrip;
    }

    /**
     * Sets the value of the forDownTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setForDownTrip(ForceMeasure value) {
        this.forDownTrip = value;
    }

    /**
     * Gets the value of the forPmpOpen property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getForPmpOpen() {
        return forPmpOpen;
    }

    /**
     * Sets the value of the forPmpOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setForPmpOpen(ForceMeasure value) {
        this.forPmpOpen = value;
    }

    /**
     * Gets the value of the forSealFric property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getForSealFric() {
        return forSealFric;
    }

    /**
     * Sets the value of the forSealFric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setForSealFric(ForceMeasure value) {
        this.forSealFric = value;
    }

    /**
     * Gets the value of the typeJar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeJar() {
        return typeJar;
    }

    /**
     * Sets the value of the typeJar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeJar(String value) {
        this.typeJar = value;
    }

    /**
     * Gets the value of the jarAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJarAction() {
        return jarAction;
    }

    /**
     * Sets the value of the jarAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJarAction(String value) {
        this.jarAction = value;
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
