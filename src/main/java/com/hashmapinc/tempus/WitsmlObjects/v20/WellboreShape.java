


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WellboreShape.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="WellboreShape">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="build and hold"/>
 *     <enumeration value="deviated"/>
 *     <enumeration value="double kickoff"/>
 *     <enumeration value="horizontal"/>
 *     <enumeration value="S-shaped"/>
 *     <enumeration value="vertical"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WellboreShape", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum WellboreShape {


    /**
     * A wellbore configuration where the inclination 
     * is increased to some terminal angle of inclination and maintained 
     * at that angle to the specified target.
     * 
     */
    @XmlEnumValue("build and hold")
    BUILD_AND_HOLD("build and hold"),

    /**
     * A wellbore that significantly departs from vertical 
     * with respect to the surface location.
     * 
     */
    @XmlEnumValue("deviated")
    DEVIATED("deviated"),

    /**
     * Incorporates two tangential (constant, non-zero inclination) sections, the second of which must be at a higher inclination than the first.
     * 
     */
    @XmlEnumValue("double kickoff")
    DOUBLE_KICKOFF("double kickoff"),

    /**
     * A wellbore whose path deviates from the 
     * vertical by at least 75 degrees.
     * 
     */
    @XmlEnumValue("horizontal")
    HORIZONTAL("horizontal"),

    /**
     * A wellbore drilled with a vertical segment, a 
     * deviated segment, and a return toward a vertical segment.
     * 
     */
    @XmlEnumValue("S-shaped")
    S_SHAPED("S-shaped"),

    /**
     * A wellbore that is nearly vertical with 
     * respect to the surface location.
     * 
     */
    @XmlEnumValue("vertical")
    VERTICAL("vertical");
    private final String value;

    WellboreShape(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WellboreShape fromValue(String v) {
        for (WellboreShape c: WellboreShape.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
