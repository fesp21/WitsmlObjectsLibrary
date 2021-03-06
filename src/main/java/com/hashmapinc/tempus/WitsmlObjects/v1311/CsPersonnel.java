package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Operations Personnel Component Schema
 * 
 * <p>Java class for cs_personnel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_personnel">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="company" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="typeService" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="numPeople" type="{http://www.witsml.org/schemas/131}nonNegativeCount" minOccurs="0"/>
 *         <element name="totalTime" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
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
@XmlType(name = "cs_personnel", propOrder = {
    "company",
    "typeService",
    "numPeople",
    "totalTime"
})
public class CsPersonnel {

    protected String company;
    protected String typeService;
    protected Short numPeople;
    protected TimeMeasure totalTime;
    @XmlAttribute(name = "uid")
    protected String uid;

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
     * Gets the value of the typeService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeService() {
        return typeService;
    }

    /**
     * Sets the value of the typeService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeService(String value) {
        this.typeService = value;
    }

    /**
     * Gets the value of the numPeople property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumPeople() {
        return numPeople;
    }

    /**
     * Sets the value of the numPeople property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumPeople(Short value) {
        this.numPeople = value;
    }

    /**
     * Gets the value of the totalTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getTotalTime() {
        return totalTime;
    }

    /**
     * Sets the value of the totalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setTotalTime(TimeMeasure value) {
        this.totalTime = value;
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
