package ru.divanov.service;

import ru.divanov.dto.GetQuadraticEducationSolution;
import ru.divanov.dto.GetSolutionQuadraticEquationResponse;
import ru.divanov.dto.exceptions.MathException;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(
        name = "MathWebService",
        targetNamespace = "http://ru.divanov/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MathWebService {

    @WebMethod(action = "http://ru.divanov/", operationName = "getSolutionQuadraticEducation")
    @WebResult(name = "return", targetNamespace = "http://ru.divanov")
    @RequestWrapper(
            localName = "getSolutionQuadraticEquation",
            targetNamespace = "http://ru.divanov",
            className = "ru.divanov.model.GetQuadraticEducationSolution")
    @ResponseWrapper(
            localName = "getSolutionQuadraticEquationResponse",
            targetNamespace = "http://ru.divanov",
            className = "ru.divanov.model.GetSolutionQuadraticEquationResponse")
    GetSolutionQuadraticEquationResponse getSolutionQuadraticEducation(GetQuadraticEducationSolution request) throws MathException;
}
