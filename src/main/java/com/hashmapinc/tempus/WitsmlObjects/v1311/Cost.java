package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for cost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cost">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/131>abstractDouble">
 *       <attribute name="currency" type="{http://www.witsml.org/schemas/131}kindString" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cost", propOrder = {
    "value"
})
public class Cost {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "currency")
    protected String currency;

    /**
     * This type disallows an "empty" double value.
     * 			This type should not be used directly except to derive another type.
     *
     * @return The value of the value property as double
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value The value to set the value property to
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
