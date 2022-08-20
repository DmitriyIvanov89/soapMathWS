package ru.divanov.soapMathWS.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * Service Endpoint Interface
 */

@WebService(
        targetNamespace = "http://service.ws.sample/",
        name = "SoapMathService")
public interface SoapMathService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(
            localName = "getSolution",
            targetNamespace = "http://service.ws.sample/",
            className = "sample.ws.service.SoapMathService")
    @WebMethod(action = "urn:GetSolution")
    @ResponseWrapper(
            localName = "getSolutionResponse",
            targetNamespace = "http://service.ws.sample/",
            className = "sample.ws.service.GetSolutionResponse")
    String getSolution(@WebParam(name = "a", targetNamespace = "") double a,
                       @WebParam(name = "b", targetNamespace = "") double b,
                       @WebParam(name = "c", targetNamespace = "") double c);
}
