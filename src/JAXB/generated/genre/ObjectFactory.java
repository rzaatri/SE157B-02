//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.20 at 08:48:09 PM PST 
//


package jaxb.generated.genre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxb.generated.genre package. 
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

    private final static QName _Genre_QNAME = new QName("", "genre");
    private final static QName _GenreInfo_QNAME = new QName("", "genre_info");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxb.generated.genre
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenreRoot }
     * 
     */
    public GenreRoot createGenreRoot() {
        return new GenreRoot();
    }

    /**
     * Create an instance of {@link GenreType }
     * 
     */
    public GenreType createGenreType() {
        return new GenreType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenreRoot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "genre")
    public JAXBElement<GenreRoot> createGenre(GenreRoot value) {
        return new JAXBElement<GenreRoot>(_Genre_QNAME, GenreRoot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "genre_info")
    public JAXBElement<GenreType> createGenreInfo(GenreType value) {
        return new JAXBElement<GenreType>(_GenreInfo_QNAME, GenreType.class, null, value);
    }

}
