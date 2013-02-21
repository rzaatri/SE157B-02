//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.20 at 08:47:46 PM PST 
//


package jaxb.generated.publisher;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxb.generated.publisher package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PubInfo_QNAME = new QName("", "pub_info");
    private final static QName _Publisher_QNAME = new QName("", "publisher");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxb.generated.publisher
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PublisherType }
     * 
     */
    public PublisherType createPublisherType() {
        return new PublisherType();
    }

    /**
     * Create an instance of {@link PublisherRoot }
     * 
     */
    public PublisherRoot createPublisherRoot() {
        return new PublisherRoot();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublisherType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pub_info")
    public JAXBElement<PublisherType> createPubInfo(PublisherType value) {
        return new JAXBElement<PublisherType>(_PubInfo_QNAME, PublisherType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublisherRoot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "publisher")
    public JAXBElement<PublisherRoot> createPublisher(PublisherRoot value) {
        return new JAXBElement<PublisherRoot>(_Publisher_QNAME, PublisherRoot.class, null, value);
    }

}