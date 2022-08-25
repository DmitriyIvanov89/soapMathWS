package ru.divanov.soapMathWS.server.service;

import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ru.divanov.soapMathWS.server.model.GetSolutionQuadraticEquation;
import ru.divanov.soapMathWS.server.model.GetSolutionQuadraticEquationResponse;

import javax.jws.WebService;

@WebService(
        serviceName = "SoapMathService",
        portName = "SoapMathServicePort",
        targetNamespace = "http://ru.divanov.soapMathWS.server.service/",
        endpointInterface = "ru.divanov.soapMathWS.server.service.SoapMathService")
public class SoapMathServiceImpl implements SoapMathService {

    @Override
    @PayloadRoot(namespace = "http://ru.divanov.soapMathWS.service/", localPart = "getSolutionQuadraticEquationRequest")
    @ResponsePayload
    public GetSolutionQuadraticEquationResponse getSolutionQuadraticEducation(double a, double b, double c) {
        GetSolutionQuadraticEquationResponse response = new GetSolutionQuadraticEquationResponse();
        response.setFormula("Formula");
        response.setX1(a);
        response.setX2(b + c);
        return response;
    }
}
