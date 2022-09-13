
package ru.divanov.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.divanov.ws.client package. 
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

    private final static QName _QuadraticEducationException_QNAME = new QName("http://ru.divanov/", "QuadraticEducationException");
    private final static QName _GetSolutionQuadraticEducation_QNAME = new QName("http://ru.divanov", "getSolutionQuadraticEducation");
    private final static QName _GetSolutionQuadraticEducationResponse_QNAME = new QName("http://ru.divanov", "getSolutionQuadraticEducationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.divanov.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QuadraticEducationException }
     * 
     */
    public QuadraticEducationException createQuadraticEducationException() {
        return new QuadraticEducationException();
    }

    /**
     * Create an instance of {@link GetSolutionQuadraticEducation }
     * 
     */
    public GetSolutionQuadraticEducation createGetSolutionQuadraticEducation() {
        return new GetSolutionQuadraticEducation();
    }

    /**
     * Create an instance of {@link GetSolutionQuadraticEquationResponse }
     * 
     */
    public GetSolutionQuadraticEquationResponse createGetSolutionQuadraticEquationResponse() {
        return new GetSolutionQuadraticEquationResponse();
    }

    /**
     * Create an instance of {@link ErrorResponseMessage }
     * 
     */
    public ErrorResponseMessage createErrorResponseMessage() {
        return new ErrorResponseMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuadraticEducationException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QuadraticEducationException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ru.divanov/", name = "QuadraticEducationException")
    public JAXBElement<QuadraticEducationException> createQuadraticEducationException(QuadraticEducationException value) {
        return new JAXBElement<QuadraticEducationException>(_QuadraticEducationException_QNAME, QuadraticEducationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSolutionQuadraticEducation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSolutionQuadraticEducation }{@code >}
     */
    @XmlElementDecl(namespace = "http://ru.divanov", name = "getSolutionQuadraticEducation")
    public JAXBElement<GetSolutionQuadraticEducation> createGetSolutionQuadraticEducation(GetSolutionQuadraticEducation value) {
        return new JAXBElement<GetSolutionQuadraticEducation>(_GetSolutionQuadraticEducation_QNAME, GetSolutionQuadraticEducation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSolutionQuadraticEquationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSolutionQuadraticEquationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ru.divanov", name = "getSolutionQuadraticEducationResponse")
    public JAXBElement<GetSolutionQuadraticEquationResponse> createGetSolutionQuadraticEducationResponse(GetSolutionQuadraticEquationResponse value) {
        return new JAXBElement<GetSolutionQuadraticEquationResponse>(_GetSolutionQuadraticEducationResponse_QNAME, GetSolutionQuadraticEquationResponse.class, null, value);
    }

}
