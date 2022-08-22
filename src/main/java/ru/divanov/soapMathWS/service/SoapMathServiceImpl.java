package ru.divanov.soapMathWS.service;


import javax.jws.WebService;

@WebService(
        serviceName = "SoapMathService",
        portName = "SoapMathServicePort",
        targetNamespace = "http://ru.divanov.soapMathWS.service/",
        endpointInterface = "ru.divanov.soapMathWS.service.SoapMathService")
public class SoapMathServiceImpl implements SoapMathService {

    @Override
    public String getSolutionQuadraticEquation(double a, double b, double c) {
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double x, x1, x2;

        String education = String.format("%fx^2 + %fx + %f = 0", a, b, c);

        if (discriminant > 0) {
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            return String.format("Education: x1 - %f, x2 - %f", x1, x2);
        } else if (discriminant == 0) {
            x = -b / (2 * a);
            return String.format("Education: x1,2 = %f", x);
        } else {
            throw new ArithmeticException("Discriminant < 0");
        }
    }
}
