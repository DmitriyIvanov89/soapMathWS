package ru.divanov.soapMathWS.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


@WebService(
        name = "SoapMathService",
        targetNamespace = "http://ru.divanov.soapMathWS.service/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL) // Style.DOCUMENTATION - generate schema
public interface SoapMathService {

    @WebMethod(operationName = "getSolutionQuadraticEquation",action = "urn:GetSolutionQuadraticEquation")
    @WebResult(name = "return", targetNamespace = "http://ru.divanov.soapMathWS.service/")
    @RequestWrapper(
            localName = "getSolutionQuadraticEquation",
            targetNamespace = "http://ru.divanov.soapMathWS.service/",
            className = "ru.divanov.soapMathWS.service.GetSolutionQuadraticEquation")
    @ResponseWrapper(
            localName = "getSolutionQuadraticEquationResponse",
            targetNamespace = "http://ru.divanov.soapMathWS.service/",
            className = "sample.ws.service.GetSolutionQuadraticEquationResponse")
    String getSolutionQuadraticEquation(@WebParam(name = "a", targetNamespace = "") double a,
                                        @WebParam(name = "b", targetNamespace = "") double b,
                                        @WebParam(name = "c", targetNamespace = "") double c);
}
