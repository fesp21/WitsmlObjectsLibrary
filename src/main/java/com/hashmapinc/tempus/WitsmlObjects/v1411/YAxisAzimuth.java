//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The angle of a Y axis from North.
 * 			This is a variation of planeAngleMeasure with an 
 * 			attribute defining the direction of north.
 * 
 * <p>Java class for yAxisAzimuth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="yAxisAzimuth">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/1series>abstractMeasure">
 *       <attribute name="uom" use="required" type="{http://www.witsml.org/schemas/1series}PlaneAngleUom" />
 *       <attribute name="northDirection" type="{http://www.witsml.org/schemas/1series}AziRef" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "yAxisAzimuth")
public class YAxisAzimuth
    extends AbstractMeasure
{

    @XmlAttribute(name = "uom", required = true)
    protected String uom;
    @XmlAttribute(name = "northDirection")
    protected String northDirection;

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

    /**
     * Gets the value of the northDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNorthDirection() {
        return northDirection;
    }

    /**
     * Sets the value of the northDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNorthDirection(String value) {
        this.northDirection = value;
    }




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1311.YAxisAzimuth to1311YAxisAzimuth() {
        com.hashmapinc.tempus.WitsmlObjects.v1311.YAxisAzimuth azi = new com.hashmapinc.tempus.WitsmlObjects.v1311.YAxisAzimuth();

        // assign fields
        azi.setUom(this.getUom());
        azi.setValue(this.getValue());
        azi.setNorthDirection(this.getNorthDirection());

        return azi;
    }
    //=========================================================================

}
