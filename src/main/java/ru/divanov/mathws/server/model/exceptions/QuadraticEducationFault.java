package ru.divanov.mathws.server.model.exceptions;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MathWSException")
public class QuadraticEducationFault {

    @XmlElement(required = true)
    private String errorMessage;

    @XmlElement
    private String formula;

    @XmlElement
    private Double discriminant;

}
