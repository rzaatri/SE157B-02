//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.20 at 08:20:44 PM PST 
//


package jaxb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for publisher_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="publisher_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pub_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pub_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publisher_type", propOrder = {
    "pubId",
    "pubName"
})
public class PublisherType {

    @XmlElement(name = "pub_id", required = true)
    protected String pubId;
    @XmlElement(name = "pub_name", required = true)
    protected String pubName;

    /**
     * Gets the value of the pubId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPubId() {
        return pubId;
    }

    /**
     * Sets the value of the pubId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPubId(String value) {
        this.pubId = value;
    }

    /**
     * Gets the value of the pubName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPubName() {
        return pubName;
    }

    /**
     * Sets the value of the pubName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPubName(String value) {
        this.pubName = value;
    }

}
