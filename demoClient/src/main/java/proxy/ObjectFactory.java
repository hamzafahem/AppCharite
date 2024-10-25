
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _Division_QNAME = new QName("http://webService.jeeg3webservice.example.com/", "division");
    private static final QName _DivisionResponse_QNAME = new QName("http://webService.jeeg3webservice.example.com/", "divisionResponse");
    private static final QName _Multiplication_QNAME = new QName("http://webService.jeeg3webservice.example.com/", "multiplication");
    private static final QName _MultiplicationResponse_QNAME = new QName("http://webService.jeeg3webservice.example.com/", "multiplicationResponse");
    private static final QName _Produit_QNAME = new QName("http://webService.jeeg3webservice.example.com/", "produit");
    private static final QName _ProduitResponse_QNAME = new QName("http://webService.jeeg3webservice.example.com/", "produitResponse");
    private static final QName _Somme_QNAME = new QName("http://webService.jeeg3webservice.example.com/", "somme");
    private static final QName _SommeResponse_QNAME = new QName("http://webService.jeeg3webservice.example.com/", "sommeResponse");
    private static final QName _Soustraction_QNAME = new QName("http://webService.jeeg3webservice.example.com/", "soustraction");
    private static final QName _SoustractionResponse_QNAME = new QName("http://webService.jeeg3webservice.example.com/", "soustractionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Division }
     * 
     * @return
     *     the new instance of {@link Division }
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     * @return
     *     the new instance of {@link DivisionResponse }
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link Multiplication }
     * 
     * @return
     *     the new instance of {@link Multiplication }
     */
    public Multiplication createMultiplication() {
        return new Multiplication();
    }

    /**
     * Create an instance of {@link MultiplicationResponse }
     * 
     * @return
     *     the new instance of {@link MultiplicationResponse }
     */
    public MultiplicationResponse createMultiplicationResponse() {
        return new MultiplicationResponse();
    }

    /**
     * Create an instance of {@link Produit }
     * 
     * @return
     *     the new instance of {@link Produit }
     */
    public Produit createProduit() {
        return new Produit();
    }

    /**
     * Create an instance of {@link ProduitResponse }
     * 
     * @return
     *     the new instance of {@link ProduitResponse }
     */
    public ProduitResponse createProduitResponse() {
        return new ProduitResponse();
    }

    /**
     * Create an instance of {@link Somme }
     * 
     * @return
     *     the new instance of {@link Somme }
     */
    public Somme createSomme() {
        return new Somme();
    }

    /**
     * Create an instance of {@link SommeResponse }
     * 
     * @return
     *     the new instance of {@link SommeResponse }
     */
    public SommeResponse createSommeResponse() {
        return new SommeResponse();
    }

    /**
     * Create an instance of {@link Soustraction }
     * 
     * @return
     *     the new instance of {@link Soustraction }
     */
    public Soustraction createSoustraction() {
        return new Soustraction();
    }

    /**
     * Create an instance of {@link SoustractionResponse }
     * 
     * @return
     *     the new instance of {@link SoustractionResponse }
     */
    public SoustractionResponse createSoustractionResponse() {
        return new SoustractionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.jeeg3webservice.example.com/", name = "division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.jeeg3webservice.example.com/", name = "divisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplication }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Multiplication }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.jeeg3webservice.example.com/", name = "multiplication")
    public JAXBElement<Multiplication> createMultiplication(Multiplication value) {
        return new JAXBElement<>(_Multiplication_QNAME, Multiplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplicationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.jeeg3webservice.example.com/", name = "multiplicationResponse")
    public JAXBElement<MultiplicationResponse> createMultiplicationResponse(MultiplicationResponse value) {
        return new JAXBElement<>(_MultiplicationResponse_QNAME, MultiplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Produit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Produit }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.jeeg3webservice.example.com/", name = "produit")
    public JAXBElement<Produit> createProduit(Produit value) {
        return new JAXBElement<>(_Produit_QNAME, Produit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProduitResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProduitResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.jeeg3webservice.example.com/", name = "produitResponse")
    public JAXBElement<ProduitResponse> createProduitResponse(ProduitResponse value) {
        return new JAXBElement<>(_ProduitResponse_QNAME, ProduitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Somme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Somme }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.jeeg3webservice.example.com/", name = "somme")
    public JAXBElement<Somme> createSomme(Somme value) {
        return new JAXBElement<>(_Somme_QNAME, Somme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SommeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SommeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.jeeg3webservice.example.com/", name = "sommeResponse")
    public JAXBElement<SommeResponse> createSommeResponse(SommeResponse value) {
        return new JAXBElement<>(_SommeResponse_QNAME, SommeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soustraction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Soustraction }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.jeeg3webservice.example.com/", name = "soustraction")
    public JAXBElement<Soustraction> createSoustraction(Soustraction value) {
        return new JAXBElement<>(_Soustraction_QNAME, Soustraction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoustractionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoustractionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.jeeg3webservice.example.com/", name = "soustractionResponse")
    public JAXBElement<SoustractionResponse> createSoustractionResponse(SoustractionResponse value) {
        return new JAXBElement<>(_SoustractionResponse_QNAME, SoustractionResponse.class, null, value);
    }

}
