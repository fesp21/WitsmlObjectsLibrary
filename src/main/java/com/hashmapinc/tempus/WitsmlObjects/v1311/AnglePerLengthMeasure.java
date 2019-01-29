package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anglePerLengthMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="anglePerLengthMeasure">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/131>abstractMeasure">
 *       <attribute name="uom" use="required" type="{http://www.witsml.org/schemas/131}anglePerLengthUom" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "anglePerLengthMeasure")
public class AnglePerLengthMeasure
    extends AbstractMeasure
{

    @XmlAttribute(name = "uom", required = true)
    protected AnglePerLengthUom uom;

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerLengthUom }
     *     
     */
    public AnglePerLengthUom getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerLengthUom }
     *     
     */
    public void setUom(AnglePerLengthUom value) {
        this.uom = value;
    }




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1411.AnglePerLengthMeasure to1411AnglePerLengthMeasure() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.AnglePerLengthMeasure measure = new com.hashmapinc.tempus.WitsmlObjects.v1411.AnglePerLengthMeasure();

        // assign fields
        measure.setValue(this.value);
        if (null != this.getUom())
            measure.setUom(com.hashmapinc.tempus.WitsmlObjects.v1411.AnglePerLengthUom.fromValue(this.getUom().value()));

        return measure;
    }
    //=========================================================================

}
