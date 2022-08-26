package ru.divanov.soapMathWS.server.service;


import ru.divanov.soapMathWS.server.model.GetSolutionQuadraticEquationResponse;

import javax.jws.WebService;

@WebService(
        serviceName = "SoapMathService",
        portName = "SoapMathServicePort",
        targetNamespace = "http://ru.divanov.soapMathWS.server.service/",
        endpointInterface = "ru.divanov.soapMathWS.server.service.SoapMathService")
public class SoapMathServiceImpl implements SoapMathService {

    @Override
    public GetSolutionQuadraticEquationResponse getSolutionQuadraticEducation(double a, double b, double c) {
        GetSolutionQuadraticEquationResponse response = new GetSolutionQuadraticEquationResponse();
        response.setFormula("Formula");
        response.setDiscriminant(a * (b + c));
        response.setX1(a);
        response.setX2(b + c);
        return response;
    }
}
