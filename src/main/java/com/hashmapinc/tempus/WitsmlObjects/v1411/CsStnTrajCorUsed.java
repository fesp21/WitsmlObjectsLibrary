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
 * WITSML Trajectory Station Corrections Applied
 * 
 * <p>Java class for cs_stnTrajCorUsed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_stnTrajCorUsed">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="gravAxialAccelCor" type="{http://www.witsml.org/schemas/1series}accelerationLinearMeasure" minOccurs="0"/>
 *         <element name="gravTran1AccelCor" type="{http://www.witsml.org/schemas/1series}accelerationLinearMeasure" minOccurs="0"/>
 *         <element name="gravTran2AccelCor" type="{http://www.witsml.org/schemas/1series}accelerationLinearMeasure" minOccurs="0"/>
 *         <element name="magAxialDrlstrCor" type="{http://www.witsml.org/schemas/1series}magneticInductionMeasure" minOccurs="0"/>
 *         <element name="magTran1DrlstrCor" type="{http://www.witsml.org/schemas/1series}magneticInductionMeasure" minOccurs="0"/>
 *         <element name="magTran2DrlstrCor" type="{http://www.witsml.org/schemas/1series}magneticInductionMeasure" minOccurs="0"/>
 *         <element name="magTran1MSACor" type="{http://www.witsml.org/schemas/1series}magneticInductionMeasure" minOccurs="0"/>
 *         <element name="magTran2MSACor" type="{http://www.witsml.org/schemas/1series}magneticInductionMeasure" minOccurs="0"/>
 *         <element name="magAxialMSACor" type="{http://www.witsml.org/schemas/1series}magneticInductionMeasure" minOccurs="0"/>
 *         <element name="sagIncCor" type="{http://www.witsml.org/schemas/1series}planeAngleMeasure" minOccurs="0"/>
 *         <element name="sagAziCor" type="{http://www.witsml.org/schemas/1series}planeAngleMeasure" minOccurs="0"/>
 *         <element name="stnMagDeclUsed" type="{http://www.witsml.org/schemas/1series}planeAngleMeasure" minOccurs="0"/>
 *         <element name="stnGridCorUsed" type="{http://www.witsml.org/schemas/1series}planeAngleMeasure" minOccurs="0"/>
 *         <element name="stnGridConUsed" type="{http://www.witsml.org/schemas/1series}planeAngleMeasure" minOccurs="0"/>
 *         <element name="dirSensorOffset" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_stnTrajCorUsed", propOrder = {
    "gravAxialAccelCor",
    "gravTran1AccelCor",
    "gravTran2AccelCor",
    "magAxialDrlstrCor",
    "magTran1DrlstrCor",
    "magTran2DrlstrCor",
    "magTran1MSACor",
    "magTran2MSACor",
    "magAxialMSACor",
    "sagIncCor",
    "sagAziCor",
    "stnMagDeclUsed",
    "stnGridCorUsed",
    "stnGridConUsed",
    "dirSensorOffset"
})
public class CsStnTrajCorUsed {

    protected AccelerationLinearMeasure gravAxialAccelCor;
    protected AccelerationLinearMeasure gravTran1AccelCor;
    protected AccelerationLinearMeasure gravTran2AccelCor;
    protected MagneticInductionMeasure magAxialDrlstrCor;
    protected MagneticInductionMeasure magTran1DrlstrCor;
    protected MagneticInductionMeasure magTran2DrlstrCor;
    protected MagneticInductionMeasure magTran1MSACor;
    protected MagneticInductionMeasure magTran2MSACor;
    protected MagneticInductionMeasure magAxialMSACor;
    protected PlaneAngleMeasure sagIncCor;
    protected PlaneAngleMeasure sagAziCor;
    protected PlaneAngleMeasure stnMagDeclUsed;
    protected PlaneAngleMeasure stnGridCorUsed;
    protected PlaneAngleMeasure stnGridConUsed;
    protected LengthMeasure dirSensorOffset;

    /**
     * Gets the value of the gravAxialAccelCor property.
     * 
     * @return
     *     possible object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public AccelerationLinearMeasure getGravAxialAccelCor() {
        return gravAxialAccelCor;
    }

    /**
     * Sets the value of the gravAxialAccelCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public void setGravAxialAccelCor(AccelerationLinearMeasure value) {
        this.gravAxialAccelCor = value;
    }

    /**
     * Gets the value of the gravTran1AccelCor property.
     * 
     * @return
     *     possible object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public AccelerationLinearMeasure getGravTran1AccelCor() {
        return gravTran1AccelCor;
    }

    /**
     * Sets the value of the gravTran1AccelCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public void setGravTran1AccelCor(AccelerationLinearMeasure value) {
        this.gravTran1AccelCor = value;
    }

    /**
     * Gets the value of the gravTran2AccelCor property.
     * 
     * @return
     *     possible object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public AccelerationLinearMeasure getGravTran2AccelCor() {
        return gravTran2AccelCor;
    }

    /**
     * Sets the value of the gravTran2AccelCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public void setGravTran2AccelCor(AccelerationLinearMeasure value) {
        this.gravTran2AccelCor = value;
    }

    /**
     * Gets the value of the magAxialDrlstrCor property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public MagneticInductionMeasure getMagAxialDrlstrCor() {
        return magAxialDrlstrCor;
    }

    /**
     * Sets the value of the magAxialDrlstrCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public void setMagAxialDrlstrCor(MagneticInductionMeasure value) {
        this.magAxialDrlstrCor = value;
    }

    /**
     * Gets the value of the magTran1DrlstrCor property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public MagneticInductionMeasure getMagTran1DrlstrCor() {
        return magTran1DrlstrCor;
    }

    /**
     * Sets the value of the magTran1DrlstrCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public void setMagTran1DrlstrCor(MagneticInductionMeasure value) {
        this.magTran1DrlstrCor = value;
    }

    /**
     * Gets the value of the magTran2DrlstrCor property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public MagneticInductionMeasure getMagTran2DrlstrCor() {
        return magTran2DrlstrCor;
    }

    /**
     * Sets the value of the magTran2DrlstrCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public void setMagTran2DrlstrCor(MagneticInductionMeasure value) {
        this.magTran2DrlstrCor = value;
    }

    /**
     * Gets the value of the magTran1MSACor property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public MagneticInductionMeasure getMagTran1MSACor() {
        return magTran1MSACor;
    }

    /**
     * Sets the value of the magTran1MSACor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public void setMagTran1MSACor(MagneticInductionMeasure value) {
        this.magTran1MSACor = value;
    }

    /**
     * Gets the value of the magTran2MSACor property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public MagneticInductionMeasure getMagTran2MSACor() {
        return magTran2MSACor;
    }

    /**
     * Sets the value of the magTran2MSACor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public void setMagTran2MSACor(MagneticInductionMeasure value) {
        this.magTran2MSACor = value;
    }

    /**
     * Gets the value of the magAxialMSACor property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public MagneticInductionMeasure getMagAxialMSACor() {
        return magAxialMSACor;
    }

    /**
     * Sets the value of the magAxialMSACor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public void setMagAxialMSACor(MagneticInductionMeasure value) {
        this.magAxialMSACor = value;
    }

    /**
     * Gets the value of the sagIncCor property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getSagIncCor() {
        return sagIncCor;
    }

    /**
     * Sets the value of the sagIncCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setSagIncCor(PlaneAngleMeasure value) {
        this.sagIncCor = value;
    }

    /**
     * Gets the value of the sagAziCor property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getSagAziCor() {
        return sagAziCor;
    }

    /**
     * Sets the value of the sagAziCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setSagAziCor(PlaneAngleMeasure value) {
        this.sagAziCor = value;
    }

    /**
     * Gets the value of the stnMagDeclUsed property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getStnMagDeclUsed() {
        return stnMagDeclUsed;
    }

    /**
     * Sets the value of the stnMagDeclUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setStnMagDeclUsed(PlaneAngleMeasure value) {
        this.stnMagDeclUsed = value;
    }

    /**
     * Gets the value of the stnGridCorUsed property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getStnGridCorUsed() {
        return stnGridCorUsed;
    }

    /**
     * Sets the value of the stnGridCorUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setStnGridCorUsed(PlaneAngleMeasure value) {
        this.stnGridCorUsed = value;
    }

    /**
     * Gets the value of the stnGridConUsed property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getStnGridConUsed() {
        return stnGridConUsed;
    }

    /**
     * Sets the value of the stnGridConUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setStnGridConUsed(PlaneAngleMeasure value) {
        this.stnGridConUsed = value;
    }

    /**
     * Gets the value of the dirSensorOffset property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDirSensorOffset() {
        return dirSensorOffset;
    }

    /**
     * Sets the value of the dirSensorOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDirSensorOffset(LengthMeasure value) {
        this.dirSensorOffset = value;
    }




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1311.CsStnTrajCorUsed to1311CsStnTrajCorUsed() {
        com.hashmapinc.tempus.WitsmlObjects.v1311.CsStnTrajCorUsed cor = new com.hashmapinc.tempus.WitsmlObjects.v1311.CsStnTrajCorUsed();

        // assign fields
        if (null != this.getGravAxialAccelCor())
            cor.setGravAxialAccelCor(this.getGravAxialAccelCor().to1311AnglePerLengthMeasure());

        if (null != this.getGravTran1AccelCor())
            cor.setGravTran1AccelCor(this.getGravTran1AccelCor().to1311AnglePerLengthMeasure());

        if (null != this.getGravTran2AccelCor())
            cor.setGravTran2AccelCor(this.getGravTran2AccelCor().to1311AnglePerLengthMeasure());

        if (null != this.getMagAxialDrlstrCor())
            cor.setMagAxialDrlstrCor(this.getMagAxialDrlstrCor().to1311MagneticInductionMeasure());

        if (null != this.getMagTran1DrlstrCor())
            cor.setMagTran1DrlstrCor(this.getMagTran1DrlstrCor().to1311MagneticInductionMeasure());

        if (null != this.getMagTran2DrlstrCor())
            cor.setMagTran2DrlstrCor(this.getMagTran2DrlstrCor().to1311MagneticInductionMeasure());

        if (null != this.getSagIncCor())
            cor.setSagIncCor(this.getSagIncCor().to1311PlaneAngleMeasure());

        if (null != this.getSagAziCor())
            cor.setSagAziCor(this.getSagAziCor().to1311PlaneAngleMeasure());

        if (null != this.getStnMagDeclUsed())
            cor.setStnMagDeclUsed(this.getStnMagDeclUsed().to1311PlaneAngleMeasure());

        if (null != this.getStnGridCorUsed())
            cor.setStnGridCorUsed(this.getStnGridCorUsed().to1311PlaneAngleMeasure());

        if (null != this.getDirSensorOffset())
            cor.setDirSensorOffset(this.getDirSensorOffset().to1311LengthMeasure());

        return cor;
    }


    public com.hashmapinc.tempus.WitsmlObjects.v20.StnTrajCorUsed to20StnTrajCorUsed() {
        com.hashmapinc.tempus.WitsmlObjects.v20.StnTrajCorUsed cor = new com.hashmapinc.tempus.WitsmlObjects.v20.StnTrajCorUsed();

        // assign fields
        if (null != this.getGravAxialAccelCor())
            cor.setGravAxialAccelCor(this.getGravAxialAccelCor().to20LinearAccelerationMeasure());

        if (null != this.getGravTran1AccelCor())
            cor.setGravTran1AccelCor(this.getGravTran1AccelCor().to20LinearAccelerationMeasure());

        if (null != this.getGravTran2AccelCor())
            cor.setGravTran2AccelCor(this.getGravTran2AccelCor().to20LinearAccelerationMeasure());

        if (null != this.getMagAxialDrlstrCor())
            cor.setMagAxialDrlstrCor(this.getMagAxialDrlstrCor().to20MagneticFluxDensityMeasure());

        if (null != this.getMagTran1DrlstrCor())
            cor.setMagTran1DrlstrCor(this.getMagTran1DrlstrCor().to20MagneticFluxDensityMeasure());

        if (null != this.getMagTran2DrlstrCor())
            cor.setMagTran2DrlstrCor(this.getMagTran2DrlstrCor().to20MagneticFluxDensityMeasure());

        if (null != this.getSagIncCor())
            cor.setSagIncCor(this.getSagIncCor().to20PlaneAngleMeasure());

        if (null != this.getSagAziCor())
            cor.setSagAziCor(this.getSagAziCor().to20PlaneAngleMeasure());

        if (null != this.getStnMagDeclUsed())
            cor.setStnMagDeclUsed(this.getStnMagDeclUsed().to20PlaneAngleMeasure());

        if (null != this.getDirSensorOffset())
            cor.setDirSensorOffset(this.getDirSensorOffset().to20LengthMeasure());

        return cor;
    }
    //=========================================================================

}
