package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for obj_wells complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_wells">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="documentInfo" type="{http://www.witsml.org/schemas/131}cs_documentInfo" minOccurs="0"/>
 *         <element name="well" type="{http://www.witsml.org/schemas/131}obj_well" maxOccurs="unbounded"/>
 *       </sequence>
 *       <attribute name="version" use="required" type="{http://www.witsml.org/schemas/131}schemaVersionString" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlRootElement(name = "wells")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obj_wells", propOrder = {
    "documentInfo",
    "well"
})
public class ObjWells {

    protected CsDocumentInfo documentInfo;
    @XmlElement(required = true)
    protected List<ObjWell> well;
    @XmlAttribute(name = "version", required = true)
    protected String version = "1.3.1.1";

    /**
     * Gets the value of the documentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CsDocumentInfo }
     *     
     */
    public CsDocumentInfo getDocumentInfo() {
        return documentInfo;
    }

    /**
     * Sets the value of the documentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsDocumentInfo }
     *     
     */
    public void setDocumentInfo(CsDocumentInfo value) {
        this.documentInfo = value;
    }

    /**
     * Gets the value of the well property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the well property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getWell().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link ObjWell }
     * 
     * 
     */
    public List<ObjWell> getWell() {
        if (well == null) {
            well = new ArrayList<ObjWell>();
        }
        return this.well;
    }

    /**
     * adds a well object to the well list. If list is null, it is instantiated
     * @param wellObj - well to  add
     */
    public void addWell(ObjWell wellObj) {
        if (well == null) {
            well = new ArrayList<ObjWell>();
        }
        well.add(wellObj);
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
