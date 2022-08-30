package ru.divanov.model.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.ws.WebFault;

@Getter
@NoArgsConstructor
@WebFault(
        name = "MathException",
        faultBean = "ru.divanov.model.exceptions.QuadraticEducationFault",
        targetNamespace = "http://ru.divanov/")
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
