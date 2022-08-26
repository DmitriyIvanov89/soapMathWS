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

        if (a > 0) {
            response.setDiscriminant(Math.pow(b, 2) - 4 * a * c);
            if (response.getDiscriminant() > 0) {
                response.setFormula(String.format("%.1fX^2+%.1fX+%.1f=0", a, b, c));
                response.setX1((-b + Math.sqrt(response.getDiscriminant())) / (2 * a));
                response.setX2((-b - Math.sqrt(response.getDiscriminant())) / (2 * a));
                return response;
            } else if (response.getDiscriminant() == 0) {
                response.setFormula(String.format("%.1fX^2+%.1fX+%.1f=0", a, b, c));
                response.setX1(-b / (2 * a));
                return response;
            }
            throw new ArithmeticException("Discriminant < 0"); // my exception

        } else {
            throw new ArithmeticException("'A' must be > 0");
        }
    }
}
