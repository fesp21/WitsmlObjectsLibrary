package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A measured depth coordinate in a wellbore. 
 * 			Positive moving from the reference datum toward the bottomhole.
 * 			All coordinates with the same datum (and same uom) can be considered to be in the same 
 * 			Coordinate Reference System and are thus directly comparable.
 * 
 * <p>Java class for measuredDepthCoord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="measuredDepthCoord">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/131>abstractMeasure">
 *       <attribute name="uom" use="required" type="{http://www.witsml.org/schemas/131}MeasuredDepthUom" />
 *       <attribute name="datum" type="{http://www.witsml.org/schemas/131}refWellDatum" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "measuredDepthCoord")
public class MeasuredDepthCoord
    extends AbstractMeasure
{

    @XmlAttribute(name = "uom", required = true)
    protected String uom;
    @XmlAttribute(name = "datum")
    protected String datum;

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
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatum(String value) {
        this.datum = value;
    }




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord to20DepthCoord() {
        com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord mdCoord = new com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord();

        mdCoord.setDatum(this.getDatum());
        mdCoord.setUom(this.getUom());
        mdCoord.setValue(this.getValue());

        return mdCoord;
    }

    public com.hashmapinc.tempus.WitsmlObjects.v1411.MeasuredDepthCoord to1411MeasuredDepthCoord() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.MeasuredDepthCoord mdCoord = new com.hashmapinc.tempus.WitsmlObjects.v1411.MeasuredDepthCoord();

        mdCoord.setUom(this.getUom());
        mdCoord.setDatum(this.getDatum());
        mdCoord.setValue(this.getValue());

        return mdCoord;
    }

    public com.hashmapinc.tempus.WitsmlObjects.v1411.LengthMeasure to1411LengthMeasure() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.LengthMeasure measure = new com.hashmapinc.tempus.WitsmlObjects.v1411.LengthMeasure();

        measure.setUom(this.getUom());
        measure.setValue(this.getValue());

        return measure;
    }
    //=========================================================================

}
