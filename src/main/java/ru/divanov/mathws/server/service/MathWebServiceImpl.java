package ru.divanov.mathws.server.service;


import ru.divanov.mathws.server.model.GetQuadraticEducationSolution;
import ru.divanov.mathws.server.model.GetSolutionQuadraticEquationResponse;
import ru.divanov.mathws.server.model.exceptions.MathException;
import ru.divanov.mathws.server.model.exceptions.QuadraticEducationFault;

import javax.jws.WebService;

@WebService(
        serviceName = "MathWebService",
        portName = "MathWebServicePort",
        targetNamespace = "http://ru.divanov.mathws.server.service/",
        endpointInterface = "ru.divanov.mathws.server.service.MathWebService")
public class MathWebServiceImpl implements MathWebService {

    @Override
    public GetSolutionQuadraticEquationResponse getSolutionQuadraticEducation(GetQuadraticEducationSolution request) throws MathException {
        GetSolutionQuadraticEquationResponse response = new GetSolutionQuadraticEquationResponse();

        if (request.getA() != 0) {
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
            throw new MathException("Discriminant is less than 0",
                    new QuadraticEducationFault(String.format("%.1fx^2+%.1fX+%.1f=0", request.getA(), request.getB(), request.getC()),
                            response.getDiscriminant()));
        } else {
            throw new MathException("Coefficient 'A' mustn't be equal 0");
        }
    }
}
