


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




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1311.CsStnTrajValid to1311CsStnTrajValid() {
        com.hashmapinc.tempus.WitsmlObjects.v1311.CsStnTrajValid valid = new com.hashmapinc.tempus.WitsmlObjects.v1311.CsStnTrajValid();

        // assign fields
        if (null != this.getMagTotalFieldCalc())
            valid.setMagTotalFieldCalc(this.getMagTotalFieldCalc().to1311MagneticInductionMeasure());

        if (null != this.getMagDipAngleCalc())
            valid.setMagDipAngleCalc(this.getMagDipAngleCalc().to1311PlaneAngleMeasure());

        if (null != this.getGravTotalFieldCalc())
            valid.setGravTotalFieldCalc(this.getGravTotalFieldCalc().to1311AnglePerLengthMeasure());

        return valid;
    }

    public com.hashmapinc.tempus.WitsmlObjects.v1411.CsStnTrajValid to1411CsStnTrajValid() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.CsStnTrajValid valid = new com.hashmapinc.tempus.WitsmlObjects.v1411.CsStnTrajValid();

        // assign fields
        if (null != this.getMagTotalFieldCalc())
            valid.setMagTotalFieldCalc(this.getMagTotalFieldCalc().to1411MagneticInductionMeasure());

        if (null != this.getMagDipAngleCalc())
            valid.setMagDipAngleCalc(this.getMagDipAngleCalc().to1411PlaneAngleMeasure());

        if (null != this.getGravTotalFieldCalc())
            valid.setGravTotalFieldCalc(this.getGravTotalFieldCalc().to1411AnglePerLengthMeasure());

        return valid;
    }
    //=========================================================================

}
