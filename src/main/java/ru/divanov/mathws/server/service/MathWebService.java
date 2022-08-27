package ru.divanov.mathws.server.service;

import ru.divanov.mathws.server.model.GetQuadraticEducationSolution;
import ru.divanov.mathws.server.model.GetSolutionQuadraticEquationResponse;
import ru.divanov.mathws.server.model.exceptions.MathException;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(
        name = "MathWebService",
        targetNamespace = "http://ru.divanov.mathws.server.service/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MathWebService {

    @WebMethod(action = "http://ru.divanov.mathws.server.service/", operationName = "getSolutionQuadraticEducation")
    @WebResult(name = "return", targetNamespace = "http://ru.divanov.mathws.server.service/")
    @RequestWrapper(
            localName = "getSolutionQuadraticEquation",
            targetNamespace = "http://ru.divanov.mathws.service/",
            className = "ru.divanov.mathws.server.model.GetQuadraticEducationSolution.java")
    @ResponseWrapper(
            localName = "getSolutionQuadraticEquationResponse",
            targetNamespace = "http://ru.divanov.mathws.service/",
            className = "ru.divanov.mathws.server.model.GetSolutionQuadraticEquationResponse")
    GetSolutionQuadraticEquationResponse getSolutionQuadraticEducation(GetQuadraticEducationSolution request) throws MathException;
}
