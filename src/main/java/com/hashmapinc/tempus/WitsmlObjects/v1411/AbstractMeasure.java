//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The intended abstract supertype of all quantities that have a value 
 * 			with a unit of measure. The unit of measure is in the uom attribute of the subtypes. 
 * 			This type allows all quantities to be profiled to be a 'float' instead of a 'Double'.
 * 
 * <p>Java class for abstractMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="abstractMeasure">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/1series>abstractDouble">
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractMeasure", propOrder = {
    "value"
})
@XmlSeeAlso({
    MomentOfForceMeasure.class,
    AccelerationLinearMeasure.class,
    TimeMeasure.class,
    DimensionlessMeasure.class,
    DensityMeasure.class,
    ForcePerVolumeMeasure.class,
    VolumePerVolumeMeasure.class,
    PermeabilityRockMeasure.class,
    VolumeMeasure.class,
    ThermalVolumetricExpansionMeasure.class,
    AnglePerLengthMeasure.class,
    VolumePerVolumeMeasurePercent.class,
    MeasureOrQuantity.class,
    ThermalConductivityMeasure.class,
    ElectricPotentialMeasure.class,
    PerLengthMeasure.class,
    FootageEastWest.class,
    ThermodynamicTemperatureMeasure.class,
    CompressibilityMeasure.class,
    SpecificVolumeMeasure.class,
    MeasuredDepthCoord.class,
    AreaMeasure.class,
    ForceMeasure.class,
    RelativePowerMeasure.class,
    GenericMeasure.class,
    WellElevationCoord.class,
    YAxisAzimuth.class,
    MassPerLengthMeasure.class,
    ForcePerLengthMeasure.class,
    WellVerticalDepthCoord.class,
    LengthMeasure.class,
    AreaPerAreaMeasure.class,
    PressureMeasure.class,
    StandardVolumeMeasure.class,
    EquivalentPerMassMeasure.class,
    DynamicViscosityMeasure.class,
    ElectricCurrentMeasure.class,
    LengthPerLengthMeasure.class,
    VelocityMeasure.class,
    MassMeasure.class,
    IlluminanceMeasure.class,
    VolumePerLengthMeasure.class,
    AnglePerTimeMeasure.class,
    PlaneAngleMeasure.class,
    StandardVolumePerTimeMeasure.class,
    MassConcentrationMeasure.class,
    RatioGenericMeasure.class,
    FootageNorthSouth.class,
    PowerMeasure.class,
    SpecificHeatCapacityMeasure.class,
    VolumeFlowRateMeasure.class,
    MagneticInductionMeasure.class
})
public abstract class AbstractMeasure {

    @XmlValue
    protected Double value;

    /**
     * This type disallows an "empty" Double value.
     * 			This type should not be used directly except to derive another type.
     * 
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(Double value) {
        this.value = value;
    }

}
