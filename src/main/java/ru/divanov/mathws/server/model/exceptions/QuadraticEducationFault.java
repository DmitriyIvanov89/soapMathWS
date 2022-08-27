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

    @XmlElement(required = true, name = "Formula")
    private String formula;

    @XmlElement(required = true, name = "D")
    private Double discriminant;

    public QuadraticEducationFault(String formula, Double discriminant) {
        this.formula = formula;
        this.discriminant = discriminant;
    }
}
