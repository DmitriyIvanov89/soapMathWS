package ru.divanov.soapMathWS.service;

import javax.jws.WebService;

@WebService(
        serviceName = "MathService",
        portName = "MathServiceEndpoint",
        targetNamespace = "http://service.ws.sample",
        endpointInterface = "ru.divanov.soapMathWS.service.SoapMathService")

public class SoapMathServiceImpl implements SoapMathService {

    @Override
    public double getSolution(double a, double b, double c) {
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        String education = String.format("%fx^2 + %fx + %f = 0", a, b, c);

        if (discriminant > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        } else if (discriminant == 0) {
            double x;
            x = -b / (2 * a);
        } else {
            throw new ArithmeticException("Discriminant < 0");
        }

        return 0;
    }
}
