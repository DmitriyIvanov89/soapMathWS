package ru.divanov.soapMathWS.server.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import ru.divanov.soapMathWS.server.model.*;

@XmlRegistry
public class ObjectFactory {

    private interface QNames {
        QName getRequest = new QName(MathWS.NAMESPACE_URI, "getRequest");
        QName getResponse = new QName(MathWS.NAMESPACE_URI, "getResponse");
    }

    @XmlElementDecl(namespace = MathWS.NAMESPACE_URI, name = "getRequest")
    public JAXBElement<GetSolutionQuadraticEquation> createRequest(GetSolutionQuadraticEquation request) {
        return new JAXBElement<>(QNames.getRequest, GetSolutionQuadraticEquation.class, null, request);
    }

    @XmlElementDecl(namespace = MathWS.NAMESPACE_URI, name = "getResponse")
    public JAXBElement<GetSolutionQuadraticEquationResponse> createResponse(GetSolutionQuadraticEquationResponse response) {
        return new JAXBElement<>(QNames.getResponse, GetSolutionQuadraticEquationResponse.class, null, response);
    }


}
