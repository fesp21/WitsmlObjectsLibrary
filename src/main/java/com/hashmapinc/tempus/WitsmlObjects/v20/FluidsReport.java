//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.14 at 09:24:00 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to capture an analysis of the drilling mud. 
 * 
 * <p>Java class for FluidsReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FluidsReport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractObject">
 *       &lt;sequence>
 *         &lt;element name="DTim" type="{http://www.energistics.org/energyml/data/commonv2}TimeStamp"/>
 *         &lt;element name="Md" type="{http://www.energistics.org/energyml/data/witsmlv2}MeasuredDepthCoord"/>
 *         &lt;element name="Tvd" type="{http://www.energistics.org/energyml/data/witsmlv2}WellVerticalDepthCoord" minOccurs="0"/>
 *         &lt;element name="NumReport" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Fluid" type="{http://www.energistics.org/energyml/data/witsmlv2}Fluid" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Wellbore" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FluidsReport", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "dTim",
    "md",
    "tvd",
    "numReport",
    "fluid",
    "wellbore"
})
public class FluidsReport
    extends AbstractObject
{

    protected String uid;
    @XmlElement(name = "DTim", required = true)
    protected String dTim;
    @XmlElement(name = "Md", required = true)
    protected DepthCoord md;
    @XmlElement(name = "Tvd")
    protected DepthCoord tvd;
    @XmlElement(name = "NumReport")
    protected Integer numReport;
    @XmlElement(name = "Fluid")
    protected List<Fluid> fluid;
    @XmlElement(name = "Wellbore", required = true)
    protected DataObjectReference wellbore;

    /**
     * Gets the value of the dTim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTim() {
        return dTim;
    }

    /**
     * Sets the value of the dTim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTim(String value) {
        this.dTim = value;
    }

    /**
     * Gets the value of the md property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public DepthCoord getMd() {
        return md;
    }

    /**
     * Sets the value of the md property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMd(DepthCoord value) {
        this.md = value;
    }

    /**
     * Gets the value of the tvd property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public DepthCoord getTvd() {
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
    public void setTvd(DepthCoord value) {
        this.tvd = value;
    }

    /**
     * Gets the value of the numReport property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumReport() {
        return numReport;
    }

    /**
     * Sets the value of the numReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumReport(Integer value) {
        this.numReport = value;
    }

    public void setUid(String uid){
        this.uid = uid;
    }

    public String getUid(){
        return this.uid;
    }

    /**
     * Gets the value of the fluid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fluid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFluid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fluid }
     * 
     * 
     */
    public List<Fluid> getFluid() {
        if (fluid == null) {
            fluid = new ArrayList<Fluid>();
        }
        return this.fluid;
    }

    /**
     * Gets the value of the wellbore property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *     
     */
    public DataObjectReference getWellbore() {
        return wellbore;
    }

    /**
     * Sets the value of the wellbore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *     
     */
    public void setWellbore(DataObjectReference value) {
        this.wellbore = value;
    }

}
