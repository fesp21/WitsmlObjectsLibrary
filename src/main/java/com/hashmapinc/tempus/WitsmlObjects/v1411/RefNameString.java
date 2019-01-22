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
import javax.xml.bind.annotation.XmlValue;


/**
 * A reference to a name in another node of the xml hierachy.
 * 			This value represents a foreign key from one element to another.
 * 
 * <p>Java class for refNameString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="refNameString">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/1series>abstractNameString">
 *       <attribute name="uidRef" type="{http://www.witsml.org/schemas/1series}refString" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refNameString", propOrder = {
    "value"
})
public class RefNameString {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "uidRef")
    protected String uidRef;

    /**
     * The intended abstract supertype of all user assigned human 
     * 			recognizable contextual name types. 
     * 			There should be no assumption that (interoperable) semantic information will be extracted from the name by a third party.
     * 			This type of value is generally not guaranteed to be unique and is not a candidate to be replaced by an enumeration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the uidRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidRef() {
        return uidRef;
    }

    /**
     * Sets the value of the uidRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidRef(String value) {
        this.uidRef = value;
    }




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1311.RefNameString to1311RefNameString() {
        com.hashmapinc.tempus.WitsmlObjects.v1311.RefNameString rnString = new com.hashmapinc.tempus.WitsmlObjects.v1311.RefNameString();

        // assign fields
        rnString.setUidRef(this.uidRef);
        rnString.setValue(this.value);

        return rnString;
    }
    //=========================================================================

}
