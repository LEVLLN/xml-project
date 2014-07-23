
package entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the entity package. 
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

    private final static QName _Authors_QNAME = new QName("", "authors");
    private final static QName _Publications_QNAME = new QName("", "publications");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthorsListType }
     * 
     */
    public AuthorsListType createAuthorsListType() {
        return new AuthorsListType();
    }

    /**
     * Create an instance of {@link PublicationsListType }
     * 
     */
    public PublicationsListType createPublicationsListType() {
        return new PublicationsListType();
    }

    /**
     * Create an instance of {@link PublicationType }
     * 
     */
    public PublicationType createPublicationType() {
        return new PublicationType();
    }

    /**
     * Create an instance of {@link AuthorsType }
     * 
     */
    public AuthorsType createAuthorsType() {
        return new AuthorsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorsListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "authors")
    public JAXBElement<AuthorsListType> createAuthors(AuthorsListType value) {
        return new JAXBElement<AuthorsListType>(_Authors_QNAME, AuthorsListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicationsListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "publications")
    public JAXBElement<PublicationsListType> createPublications(PublicationsListType value) {
        return new JAXBElement<PublicationsListType>(_Publications_QNAME, PublicationsListType.class, null, value);
    }

}
