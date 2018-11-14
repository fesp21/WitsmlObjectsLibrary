


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Captures validation information for a survey.
 * 
 * <p>Java class for StnTrajValid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="StnTrajValid">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MagTotalFieldCalc" type="{http://www.energistics.org/energyml/data/commonv2}MagneticFluxDensityMeasure" minOccurs="0"/>
 *         <element name="MagDipAngleCalc" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure" minOccurs="0"/>
 *         <element name="GravTotalFieldCalc" type="{http://www.energistics.org/energyml/data/commonv2}LinearAccelerationMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StnTrajValid", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "magTotalFieldCalc",
    "magDipAngleCalc",
    "gravTotalFieldCalc"
})
public class StnTrajValid {

    @XmlElement(name = "MagTotalFieldCalc")
    protected MagneticFluxDensityMeasure magTotalFieldCalc;
    @XmlElement(name = "MagDipAngleCalc")
    protected PlaneAngleMeasure magDipAngleCalc;
    @XmlElement(name = "GravTotalFieldCalc")
    protected LinearAccelerationMeasure gravTotalFieldCalc;

    /**
     * Gets the value of the magTotalFieldCalc property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public MagneticFluxDensityMeasure getMagTotalFieldCalc() {
        return magTotalFieldCalc;
    }

    /**
     * Sets the value of the magTotalFieldCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public void setMagTotalFieldCalc(MagneticFluxDensityMeasure value) {
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
     *     {@link LinearAccelerationMeasure }
     *     
     */
    public LinearAccelerationMeasure getGravTotalFieldCalc() {
        return gravTotalFieldCalc;
    }

    /**
     * Sets the value of the gravTotalFieldCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearAccelerationMeasure }
     *     
     */
    public void setGravTotalFieldCalc(LinearAccelerationMeasure value) {
        this.gravTotalFieldCalc = value;
    }

}
