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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML Log - Curve Information
 * 			The order of the data should correspond to the 'direction'.
 * 
 * <p>Java class for cs_logData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_logData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mnemonicList" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unitList" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="data" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_logData", propOrder = {
    "mnemonicList",
    "unitList",
    "data"
})
public class CsLogData {

    @XmlElement(required = true)
    protected String mnemonicList;
    @XmlElement(required = true)
    protected String unitList;
    protected List<String> data;

    /**
     * Gets the value of the mnemonicList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnemonicList() {
        return mnemonicList;
    }

    /**
     * Sets the value of the mnemonicList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnemonicList(String value) {
        this.mnemonicList = value;
    }

    /**
     * Gets the value of the unitList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitList() {
        return unitList;
    }

    /**
     * Sets the value of the unitList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitList(String value) {
        this.unitList = value;
    }

    /**
     * Gets the value of the data property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getData().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getData() {
        if (data == null) {
            data = new ArrayList<String>();
        }
        return this.data;
    }


    public void setData(List<String> value) {
        this.data = value;
    }
}
