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
        targetNamespace = "http://ru.divanov.soapMathWS.service/",
        name = "SoapMathService")
public interface SoapMathService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(
            localName = "getSolution",
            targetNamespace = "http://ru.divanov.soapMathWS.service/",
            className = "ru.divanov.soapMathWS.service.GetSolution")
    @WebMethod(action = "urn:GetSolution")
    @ResponseWrapper(
            localName = "getSolutionResponse",
            targetNamespace = "http://ru.divanov.soapMathWS.service/",
            className = "sample.ws.service.GetSolutionResponse")
    String getSolution(@WebParam(name = "a", targetNamespace = "") double a,
                       @WebParam(name = "b", targetNamespace = "") double b,
                       @WebParam(name = "c", targetNamespace = "") double c);
}
