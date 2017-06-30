//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WellVerticalCoordinateUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="WellVerticalCoordinateUom">
 *   <restriction base="{http://www.witsml.org/schemas/1series}abstractUomEnum">
 *     <enumeration value="m"/>
 *     <enumeration value="ft"/>
 *     <enumeration value="ftUS"/>
 *     <enumeration value="ftBr(65)"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "WellVerticalCoordinateUom")
@XmlEnum
public enum WellVerticalCoordinateUom {


    /**
     * meter
     * 
     */
    @XmlEnumValue("m")
    M("m"),

    /**
     * International Foot
     * 
     */
    @XmlEnumValue("ft")
    FT("ft"),

    /**
     * US Survey Foot
     * 
     */
    @XmlEnumValue("ftUS")
    FT_US("ftUS"),

    /**
     * British Foot 1865
     * 
     */
    @XmlEnumValue("ftBr(65)")
    FT_BR_65("ftBr(65)");
    private final String value;

    WellVerticalCoordinateUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WellVerticalCoordinateUom fromValue(String v) {
        for (WellVerticalCoordinateUom c: WellVerticalCoordinateUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}