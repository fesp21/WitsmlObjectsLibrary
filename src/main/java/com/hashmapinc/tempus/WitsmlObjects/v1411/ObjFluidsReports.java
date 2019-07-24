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
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for obj_fluidsReports complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_fluidsReports">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/schemas/abstract}abstractObject">
 *       <sequence>
 *         <element name="documentInfo" type="{http://www.witsml.org/schemas/1series}cs_documentInfo" minOccurs="0"/>
 *         <element name="fluidsReport" type="{http://www.witsml.org/schemas/1series}obj_fluidsReport" maxOccurs="unbounded"/>
 *       </sequence>
 *       <attribute name="version" use="required" type="{http://www.witsml.org/schemas/1series}schemaVersionString" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlRootElement(name="fluidsReports")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obj_fluidsReports", propOrder = {
    "documentInfo",
    "fluidsReport"
})
public class ObjFluidsReports
    extends AbstractObject
{
    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected CsDocumentInfo documentInfo;
    @XmlElement(required = true)
    protected List<ObjFluidsReport> fluidsReport;
    @XmlAttribute(name = "version", required = true)
    protected String version = "1.4.1.1";

    /**
     * adds a fluidsReport to the fluidsReport list.
     *
     * @param fluidsReportObj to add
     */
    public void addFluidReport(ObjFluidsReport fluidsReportObj) {
        if (fluidsReport == null) {
            fluidsReport = new ArrayList<>();
        }
        this.fluidsReport.add(fluidsReportObj);
    }

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
     * Gets the value of the fluidsReport property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fluidsReport property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getFluidsReport().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link ObjFluidsReport }
     * 
     * 
     */
    public List<ObjFluidsReport> getFluidsReport() {
        if (fluidsReport == null) {
            fluidsReport = new ArrayList<ObjFluidsReport>();
        }
        return this.fluidsReport;
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
