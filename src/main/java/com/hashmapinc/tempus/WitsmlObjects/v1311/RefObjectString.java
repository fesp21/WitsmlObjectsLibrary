package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A reference to a name in another object.
 * 			This value represents a foreign key from one object to another.
 * 			Knowledge of the object being referenced is defined by an attribute.
 * 
 * <p>Java class for refObjectString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="refObjectString">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/131>abstractNameString">
 *       <attribute name="object" use="required" type="{http://www.witsml.org/schemas/131}nameString" />
 *       <attribute name="uidRef" type="{http://www.witsml.org/schemas/131}refString" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refObjectString", propOrder = {
    "value"
})
public class RefObjectString {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "object", required = true)
    protected String object;
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
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObject(String value) {
        this.object = value;
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

}
