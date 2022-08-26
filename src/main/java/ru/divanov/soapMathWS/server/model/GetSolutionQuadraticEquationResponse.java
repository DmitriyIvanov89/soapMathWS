package ru.divanov.soapMathWS.server.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSolutionQuadraticEquationResponse", propOrder = {"formula", "discriminant", "x1", "x2"})
public class GetSolutionQuadraticEquationResponse {
    @XmlElement(required = true, name = "Formula")
    private String formula;

    @XmlElement(required = true, name = "D")
    private double discriminant;

    @XmlElement(required = true, name = "X1")
    private double x1;

    @XmlElement(name = "X2")
    private double x2;

    public String getFormula() {
        return formula;
    }
}
