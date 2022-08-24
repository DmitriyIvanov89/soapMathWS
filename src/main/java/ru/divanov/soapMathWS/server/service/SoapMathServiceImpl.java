package ru.divanov.soapMathWS.server.service;

import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(
        serviceName = "SoapMathService",
        portName = "SoapMathServicePort",
        targetNamespace = "http://ru.divanov.soapMathWS.service/",
        endpointInterface = "ru.divanov.soapMathWS.server.service.SoapMathService")
public class SoapMathServiceImpl implements SoapMathService {

    @WebResult(name = "return", targetNamespace = "http://ru.divanov.soapMathWS.service/")
    @Override
    public String getSolutionQuadraticEquation(double a, double b, double c) {
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double x, x1, x2;

        if (discriminant > 0) {
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            return String.format("Solutions: x1 = %f, x2 = %f", x1, x2);
        } else if (discriminant == 0) {
            x = -b / (2 * a);
            return String.format("Solutions: x1,2 = %f", x);
        } else {
            throw new ArithmeticException("Discriminant < 0");
        }
    }
}
