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
import javax.xml.bind.annotation.XmlType;


/**
 * A nomenclature for the description of errror terms.
 * 
 * <p>Java class for cs_iscwsaNomenclature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_iscwsaNomenclature">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="parameter" type="{http://www.witsml.org/schemas/1series}cs_iscwsaNameAndDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="function" type="{http://www.witsml.org/schemas/1series}cs_iscwsaNameAndDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="constant" type="{http://www.witsml.org/schemas/1series}cs_iscwsaNomenclatureConstant" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_iscwsaNomenclature", propOrder = {
    "parameter",
    "function",
    "constant"
})
public class CsIscwsaNomenclature {

    protected List<CsIscwsaNameAndDescription> parameter;
    protected List<CsIscwsaNameAndDescription> function;
    protected List<CsIscwsaNomenclatureConstant> constant;

    /**
     * Gets the value of the parameter property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getParameter().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsIscwsaNameAndDescription }
     * 
     * 
     */
    public List<CsIscwsaNameAndDescription> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<CsIscwsaNameAndDescription>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the function property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the function property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getFunction().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsIscwsaNameAndDescription }
     * 
     * 
     */
    public List<CsIscwsaNameAndDescription> getFunction() {
        if (function == null) {
            function = new ArrayList<CsIscwsaNameAndDescription>();
        }
        return this.function;
    }

    /**
     * Gets the value of the constant property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constant property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getConstant().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsIscwsaNomenclatureConstant }
     * 
     * 
     */
    public List<CsIscwsaNomenclatureConstant> getConstant() {
        if (constant == null) {
            constant = new ArrayList<CsIscwsaNomenclatureConstant>();
        }
        return this.constant;
    }

}
