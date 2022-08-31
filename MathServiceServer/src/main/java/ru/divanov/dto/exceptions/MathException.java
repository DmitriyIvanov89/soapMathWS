package ru.divanov.dto.exceptions;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.ws.WebFault;

@WebFault(
        name = "MathException",
        faultBean = "ru.divanov.model.exceptions.QuadraticEducationFault",
        targetNamespace = "http://ru.divanov/")
public class MathException extends RuntimeException {

    private static final long serialVersionUID = -672804070691541883L;

    private QuadraticEducationFault faultInfo;

    public MathException() {
        super();
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

    @XmlTransient
    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

    @XmlTransient
    @Override
    public Throwable getCause() {
        return super.getCause();
    }
}
