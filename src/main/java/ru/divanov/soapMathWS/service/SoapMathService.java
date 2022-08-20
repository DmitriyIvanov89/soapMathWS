package ru.divanov.soapMathWS.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(
        serviceName = "MathService",
        name = "MathPortType",
        targetNamespace = "http://divanov.org")
public interface SoapMathService {

    @WebResult(name = "parameters", targetNamespace = "http://divanov.org/complex")
    @RequestWrapper(
            localName = "getSolution",
            targetNamespace = "http://service.ws.sample",
            className = "ru.divanov.soapMathWS.service.SoapMathService")
    @WebMethod(operationName = "create", action = "urn:GetSolution")
    @ResponseWrapper(
            localName = "getSolutionResponse",
            targetNamespace = "http://service.ws.sample",
            className = "ru.divanov.soapMathWS.service.GetSolutionResponse")
    double getSolution(@WebParam(name = "a", targetNamespace = "") double a,
                       @WebParam(name = "b", targetNamespace = "") double b,
                       @WebParam(name = "c", targetNamespace = "") double c);
}
