//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML Validation Information for Survey
 * 
 * <p>Java class for cs_stnTrajValid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_stnTrajValid">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="magTotalFieldCalc" type="{http://www.witsml.org/schemas/1series}magneticInductionMeasure" minOccurs="0"/>
 *         <element name="magDipAngleCalc" type="{http://www.witsml.org/schemas/1series}planeAngleMeasure" minOccurs="0"/>
 *         <element name="gravTotalFieldCalc" type="{http://www.witsml.org/schemas/1series}accelerationLinearMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_stnTrajValid", propOrder = {
    "magTotalFieldCalc",
    "magDipAngleCalc",
    "gravTotalFieldCalc"
})
public class CsStnTrajValid {

    protected MagneticInductionMeasure magTotalFieldCalc;
    protected PlaneAngleMeasure magDipAngleCalc;
    protected AccelerationLinearMeasure gravTotalFieldCalc;

    /**
     * Gets the value of the magTotalFieldCalc property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public MagneticInductionMeasure getMagTotalFieldCalc() {
        return magTotalFieldCalc;
    }

    /**
     * Sets the value of the magTotalFieldCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public void setMagTotalFieldCalc(MagneticInductionMeasure value) {
        this.magTotalFieldCalc = value;
    }

    /**
     * Gets the value of the magDipAngleCalc property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getMagDipAngleCalc() {
        return magDipAngleCalc;
    }

    /**
     * Sets the value of the magDipAngleCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setMagDipAngleCalc(PlaneAngleMeasure value) {
        this.magDipAngleCalc = value;
    }

    /**
     * Gets the value of the gravTotalFieldCalc property.
     * 
     * @return
     *     possible object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public AccelerationLinearMeasure getGravTotalFieldCalc() {
        return gravTotalFieldCalc;
    }

    /**
     * Sets the value of the gravTotalFieldCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public void setGravTotalFieldCalc(AccelerationLinearMeasure value) {
        this.gravTotalFieldCalc = value;
    }

}