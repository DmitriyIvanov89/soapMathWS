package ru.divanov.dto.exceptions;

import javax.xml.ws.WebFault;

@WebFault(
        name = "MathException",
        faultBean = "ru.divanov.model.exceptions.QuadraticEducationFault",
        targetNamespace = "http://ru.divanov/")
public class MathException extends Exception {

    private QuadraticEducationFault faultInfo;

    public MathException() {
    }

    public MathException(String message) {
        super(message);
    }

    public MathException(String message, QuadraticEducationFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    public QuadraticEducationFault getFaultInfo() {
        return faultInfo;
    }

    public void setFaultInfo(QuadraticEducationFault faultInfo) {
        this.faultInfo = faultInfo;
    }
}
