package ru.divanov.mathws.server.service;


import ru.divanov.mathws.server.model.GetQuadraticEducationSolution;
import ru.divanov.mathws.server.model.GetSolutionQuadraticEquationResponse;

import javax.jws.WebService;

@WebService(
        serviceName = "MathWebService",
        portName = "MathWebServicePort",
        targetNamespace = "http://ru.divanov.mathws.server.service/",
        endpointInterface = "ru.divanov.mathws.server.service.MathWebService")
public class MathWebServiceImpl implements MathWebService {

    @Override
    public GetSolutionQuadraticEquationResponse getSolutionQuadraticEducation(GetQuadraticEducationSolution request) {
        GetSolutionQuadraticEquationResponse response = new GetSolutionQuadraticEquationResponse();

        if (request.getA() > 0) {
            response.setDiscriminant(Math.pow(request.getB(), 2) - 4 * request.getA() * request.getC());
            if (response.getDiscriminant() > 0) {
                response.setFormula(String.format("%.1fX^2+%.1fX+%.1f=0", request.getA(), request.getB(), request.getC()));
                response.setX1((-request.getB() + Math.sqrt(response.getDiscriminant())) / (2 * request.getA()));
                response.setX2((-request.getB() - Math.sqrt(response.getDiscriminant())) / (2 * request.getA()));
                return response;
            } else if (response.getDiscriminant() == 0) {
                response.setFormula(String.format("%.1fX^2+%.1fX+%.1f=0", request.getA(), request.getB(), request.getC()));
                response.setX1(-request.getB() / (2 * request.getA()));
                return response;
            }
            throw new ArithmeticException("D < 0");

        } else {
            throw new ArithmeticException("'A' must be > 0");
        }
    }
}
