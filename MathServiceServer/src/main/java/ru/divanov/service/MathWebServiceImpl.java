package ru.divanov.service;

import ru.divanov.dto.ErrorResponseMessage;
import ru.divanov.dto.GetQuadraticEducationSolution;
import ru.divanov.dto.GetSolutionQuadraticEquationResponse;
import ru.divanov.exceptions.QuadraticEducationException;

import javax.jws.WebService;

@WebService(
        serviceName = "MathWebService",
        portName = "MathWebServicePort",
        targetNamespace = "http://ru.divanov",
        endpointInterface = "ru.divanov.service.MathWebService")
public class MathWebServiceImpl implements MathWebService {

    private static final String ERROR_PARAM_A_MESSAGE = "Coefficient A can't be equal 0";
    private static final String ERROR_DISCRIMINANT_VALUE = "Discriminant can't be less than 0";
    private static final String NO_REAL_ROOTS = "The equation has no real roots";

    // TODO refactor this method!!! It's ugly!!!
    /**
     * In case where b = 0 & c = 0 response x1 = -0.0
     */

    @Override
    public GetSolutionQuadraticEquationResponse getSolutionQuadraticEducation(GetQuadraticEducationSolution request) throws QuadraticEducationException {
        GetSolutionQuadraticEquationResponse response = new GetSolutionQuadraticEquationResponse();

        if (request.getA() != 0) {
            if (request.getB() == 0 && request.getC() == 0) {
                response.setFormula(generateEducationFormula(request.getA(), request.getB(), request.getC()));
                response.setX1(0.0);
                return response;
            } else if (request.getB() == 0 && request.getC() != 0) {
                response.setFormula(generateEducationFormula(request.getA(), request.getB(), request.getC()));
                if (-(request.getC() / request.getA()) > 0) {
                    response.setX1(Math.sqrt(-(request.getC() / request.getA())));
                    response.setX2(-(Math.sqrt(-(request.getC() / request.getA()))));
                    return response;
                } else {
                    throw new QuadraticEducationException(
                            NO_REAL_ROOTS,
                            new ErrorResponseMessage(response.getFormula(generateEducationFormula(request.getA(), request.getB(), request.getC()))));
                }
            } else if (request.getB() != 0 && request.getC() == 0) {
                response.setFormula(generateEducationFormula(request.getA(), request.getB(), request.getC()));
                response.setX1(0.0);
                response.setX2(-(request.getB() / request.getA()));
                return response;
            }
            response.setDiscriminant(Math.pow(request.getB(), 2) - 4 * request.getA() * request.getC());
            if (response.getDiscriminant() > 0) {
                response.setFormula(generateEducationFormula(request.getA(), request.getB(), request.getC()));
                response.setX1((-request.getB() + Math.sqrt(response.getDiscriminant())) / (2 * request.getA()));
                response.setX2((-request.getB() - Math.sqrt(response.getDiscriminant())) / (2 * request.getA()));
                return response;
            } else if (response.getDiscriminant() == 0) {
                response.setFormula(generateEducationFormula(request.getA(), request.getB(), request.getC()));
                response.setX1(-request.getB() / (2 * request.getA()));
                return response;
            }
            throw new QuadraticEducationException(
                    ERROR_DISCRIMINANT_VALUE,
                    new ErrorResponseMessage(
                            generateEducationFormula(request.getA(), request.getB(), request.getC()),
                            response.getDiscriminant()));
        } else {
            throw new QuadraticEducationException(ERROR_PARAM_A_MESSAGE);
        }
    }

    private static String generateEducationFormula(double a, double b, double c) {
        if (b == 0 && c == 0) {
            return String.format("%.1fx^2 = 0", a);
        } else if (b == 0 && c != 0) {
            return String.format("%.1fx^2 + %.1f = 0", a, c);
        } else if (b != 0 && c == 0) {
            return String.format("%.1fx^2 + %.1fx = 0", a, b);
        }

        return String.format("%.1fx^2 + %.1fx + %.1f = 0", a, b, c);
    }
}

