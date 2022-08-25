package ru.divanov.soapMathWS.server.service;

import com.fasterxml.jackson.core.json.async.NonBlockingJsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ru.divanov.soapMathWS.server.model.GetSolutionQuadraticEquation;
import ru.divanov.soapMathWS.server.model.GetSolutionQuadraticEquationResponse;

import javax.jws.WebService;
import javax.xml.bind.JAXBElement;

@WebService(
        serviceName = "SoapMathService",
        portName = "SoapMathServicePort",
        targetNamespace = "http://ru.divanov.soapMathWS.server.service/",
        endpointInterface = "ru.divanov.soapMathWS.server.service.SoapMathService")
public class SoapMathServiceImpl implements SoapMathService {

//    private ObjectFactory objectFactory;
//
//    @Autowired
//    public SoapMathServiceImpl() {
//        this.objectFactory = new ObjectFactory();
//    }

    @Override
//    @ResponsePayload
    public JAXBElement<GetSolutionQuadraticEquationResponse> getSolutionQuadraticEquation(GetSolutionQuadraticEquation request) {
//        GetSolutionQuadraticEquationResponse response = new GetSolutionQuadraticEquationResponse();
//        response.setFormula("String");
//        response.setX1(request.getA());
//        response.setX2(request.getB() + request.getC());
//        return objectFactory.createResponse(response);
        return null;
    }


//    @Override
//    public GetSolutionQuadraticEquationResponse getSolutionQuadraticEquation(GetSolutionQuadraticEquation request) {
//        GetSolutionQuadraticEquationResponse response = new GetSolutionQuadraticEquationResponse();
//        double discriminant = Math.pow(request.getB(), 2) - 4 * request.getA() * request.getC();
//        response.setX1(request.getA());
//        return response;
//    }

//    @WebResult(name = "return", targetNamespace = "http://ru.divanov.soapMathWS.service/")
//    @Override
//    public String getSolutionQuadraticEquation(double a, double b, double c) {
//        double discriminant = Math.pow(b, 2) - 4 * a * c;
//        double x, x1, x2;
//
//        if (discriminant > 0) {
//            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
//            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
//            return String.format("Solutions: x1 = %f, x2 = %f", x1, x2);
//        } else if (discriminant == 0) {
//            x = -b / (2 * a);
//            return String.format("Solutions: x1,2 = %f", x);
//        } else {
//            throw new ArithmeticException("Discriminant < 0");
//        }
//    }


}
