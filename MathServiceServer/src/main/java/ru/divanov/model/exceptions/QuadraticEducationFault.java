package ru.divanov.model.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;
;

@Getter
@Setter
@NoArgsConstructor
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
