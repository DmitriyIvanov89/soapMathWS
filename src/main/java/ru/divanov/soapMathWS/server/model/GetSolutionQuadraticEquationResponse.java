package ru.divanov.soapMathWS.server.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSolutionQuadraticEquationResponse", propOrder = {"formula", "x1", "x2"})
public class GetSolutionQuadraticEquationResponse {
    @XmlElement(required = true)
    private String formula;

    @XmlElement(required = true)
    private double x1;

    @XmlElement
    private double x2;

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }
}
