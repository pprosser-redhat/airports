
package operators;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the operators package. 
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

    private final static QName _OperatorQuery_QNAME = new QName("http://operators/", "operatorQuery");
    private final static QName _OperatorQueryResponse_QNAME = new QName("http://operators/", "operatorQueryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: operators
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OperatorQuery }
     * 
     */
    public OperatorQuery createOperatorQuery() {
        return new OperatorQuery();
    }

    /**
     * Create an instance of {@link OperatorQueryResponse }
     * 
     */
    public OperatorQueryResponse createOperatorQueryResponse() {
        return new OperatorQueryResponse();
    }

    /**
     * Create an instance of {@link OperatorType }
     * 
     */
    public OperatorType createOperatorType() {
        return new OperatorType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatorQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://operators/", name = "operatorQuery")
    public JAXBElement<OperatorQuery> createOperatorQuery(OperatorQuery value) {
        return new JAXBElement<OperatorQuery>(_OperatorQuery_QNAME, OperatorQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatorQueryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://operators/", name = "operatorQueryResponse")
    public JAXBElement<OperatorQueryResponse> createOperatorQueryResponse(OperatorQueryResponse value) {
        return new JAXBElement<OperatorQueryResponse>(_OperatorQueryResponse_QNAME, OperatorQueryResponse.class, null, value);
    }

}
