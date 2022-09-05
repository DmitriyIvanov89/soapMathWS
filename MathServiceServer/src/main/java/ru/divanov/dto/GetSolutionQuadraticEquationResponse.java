package ru.divanov.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSolutionQuadraticEquationResponse", propOrder = {"formula", "discriminant", "x1", "x2"})
public class GetSolutionQuadraticEquationResponse {
    @XmlElement(required = true, name = "Formula")
    private String formula;

    @XmlElement(required = true, name = "D")
    private Double discriminant;

    @XmlElement(required = true, name = "X1")
    private Double x1;

    @XmlElement(name = "X2")
    private Double x2;

    public String getFormula(String s) {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public Double getDiscriminant() {
        return discriminant;
    }

    public void setDiscriminant(Double discriminant) {
        this.discriminant = discriminant;
    }

    public Double getX1() {
        return x1;
    }

    public void setX1(Double x1) {
        this.x1 = x1;
    }

    public Double getX2() {
        return x2;
    }

    public void setX2(Double x2) {
        this.x2 = x2;
    }
}
