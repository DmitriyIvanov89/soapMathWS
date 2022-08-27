package ru.divanov.mathws.server.model.exceptions;

import lombok.Getter;

import javax.xml.ws.WebFault;

@Getter
@WebFault(
        name = "MathException",
        faultBean = "ru.divanov.mathws.server.model.exceptions.QuadraticEducationFault",
        targetNamespace = "http://ru.divanov.mathws.server.service/")
public class MathException extends Exception {

    private QuadraticEducationFault faultInfo;

    public MathException(String message) {
        super(message);
    }

    public MathException(String message, QuadraticEducationFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }
}
