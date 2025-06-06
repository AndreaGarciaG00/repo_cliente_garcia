
package garcia_recu;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the garcia_recu package. 
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

    private static final QName _CalcularMasa_QNAME = new QName("http://garcia_recu/", "calcularMasa");
    private static final QName _CalcularMasaResponse_QNAME = new QName("http://garcia_recu/", "calcularMasaResponse");
    private static final QName _Hello_QNAME = new QName("http://garcia_recu/", "hello");
    private static final QName _HelloResponse_QNAME = new QName("http://garcia_recu/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: garcia_recu
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularMasa }
     * 
     * @return
     *     the new instance of {@link CalcularMasa }
     */
    public CalcularMasa createCalcularMasa() {
        return new CalcularMasa();
    }

    /**
     * Create an instance of {@link CalcularMasaResponse }
     * 
     * @return
     *     the new instance of {@link CalcularMasaResponse }
     */
    public CalcularMasaResponse createCalcularMasaResponse() {
        return new CalcularMasaResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     * @return
     *     the new instance of {@link Hello }
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     * @return
     *     the new instance of {@link HelloResponse }
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularMasa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularMasa }{@code >}
     */
    @XmlElementDecl(namespace = "http://garcia_recu/", name = "calcularMasa")
    public JAXBElement<CalcularMasa> createCalcularMasa(CalcularMasa value) {
        return new JAXBElement<>(_CalcularMasa_QNAME, CalcularMasa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularMasaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularMasaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://garcia_recu/", name = "calcularMasaResponse")
    public JAXBElement<CalcularMasaResponse> createCalcularMasaResponse(CalcularMasaResponse value) {
        return new JAXBElement<>(_CalcularMasaResponse_QNAME, CalcularMasaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://garcia_recu/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://garcia_recu/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
