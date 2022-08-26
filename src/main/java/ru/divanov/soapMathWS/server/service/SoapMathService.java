package ru.divanov.soapMathWS.server.service;

import ru.divanov.soapMathWS.server.model.GetSolutionQuadraticEquationResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


@WebService(
        name = "SoapMathService",
        targetNamespace = "http://ru.divanov.soapMathWS.server.service/")
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL,parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface SoapMathService {

    @WebMethod(operationName = "getSolutionQuadraticEquation", action = "urn:getSolutionQuadraticEquation")
    @RequestWrapper(
            localName = "getSolutionQuadraticEquationRequest",
            targetNamespace = "http://ru.divanov.soapMathWS.service/",
            className = "ru.divanov.soapMathWS.server.model.GetSolutionQuadraticEquation")
    @ResponseWrapper(
            localName = "getSolutionQuadraticEquationResponse",
            targetNamespace = "http://ru.divanov.soapMathWS.service/",
            className = "ru.divanov.soapMathWS.server.model.GetSolutionQuadraticEquationResponse")
    GetSolutionQuadraticEquationResponse getSolutionQuadraticEducation(@WebParam(name = "a") double a,
                                                                       @WebParam(name = "b") double b,
                                                                       @WebParam(name = "c") double c);
}
