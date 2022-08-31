package ru.divanov.service;


import ru.divanov.dto.GetQuadraticEducationSolution;
import ru.divanov.dto.GetSolutionQuadraticEquationResponse;
import ru.divanov.dto.exceptions.ErrorResponseMessage;

import javax.jws.WebService;
import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;

@WebService(
        serviceName = "MathWebService",
        portName = "MathWebServicePort",
        targetNamespace = "http://ru.divanov",
        endpointInterface = "ru.divanov.service.MathWebService")
public class MathWebServiceImpl implements MathWebService {

    @Override
    public GetSolutionQuadraticEquationResponse getSolutionQuadraticEducation(GetQuadraticEducationSolution request) throws JAXBException {
        GetSolutionQuadraticEquationResponse response = new GetSolutionQuadraticEquationResponse();

        if (request.getA() != 0) {
            response.setDiscriminant(Math.pow(request.getB(), 2) - 4 * request.getA() * request.getC());
            String formula = String.format("%.1fX^2+%.1fX+%.1f=0", request.getA(), request.getB(), request.getC());
            if (response.getDiscriminant() > 0) {
                response.setFormula(formula);
                response.setX1((-request.getB() + Math.sqrt(response.getDiscriminant())) / (2 * request.getA()));
                response.setX2((-request.getB() - Math.sqrt(response.getDiscriminant())) / (2 * request.getA()));
                return response;
            } else if (response.getDiscriminant() == 0) {
                response.setFormula(formula);
                response.setX1(-request.getB() / (2 * request.getA()));
                return response;
            }
//            throw new SOAPException("A < 0");
            throw new JAXBException("A must be != 0");
        } else {
//            throw new SOAPException("Coefficient 'A' mustn't be equal 0");
            throw new JAXBException("Coefficient 'A' mustn't be equal 0");
        }
    }
}
