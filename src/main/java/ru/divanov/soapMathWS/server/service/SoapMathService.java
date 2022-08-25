package ru.divanov.soapMathWS.server.service;

import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import ru.divanov.soapMathWS.server.model.GetSolutionQuadraticEquation;
import ru.divanov.soapMathWS.server.model.GetSolutionQuadraticEquationResponse;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


@WebService(
        name = "SoapMathService",
        targetNamespace = "http://ru.divanov.soapMathWS.server.service/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public interface SoapMathService {

    @WebMethod(operationName = "getSolutionQuadraticEquation", action = "urn:GetSolutionQuadraticEquation")
    @RequestWrapper(
            localName = "getSolutionQuadraticEquationRequest",
            targetNamespace = "http://ru.divanov.soapMathWS.server.model/",
            className = "ru.divanov.soapMathWS.server.model.GetSolutionQuadraticEquation")
    @ResponseWrapper(
            localName = "getSolutionQuadraticEquationResponse",
            targetNamespace = "http://ru.divanov.soapMathWS.server.model/",
            className = "ru.divanov.soapMathWS.server.model.GetSolutionQuadraticEquationResponse")
    JAXBElement<GetSolutionQuadraticEquationResponse> getSolutionQuadraticEquation(@RequestPayload GetSolutionQuadraticEquation request);
}
