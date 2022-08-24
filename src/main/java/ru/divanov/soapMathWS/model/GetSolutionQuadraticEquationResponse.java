package ru.divanov.soapMathWS.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {"formula", "x1", "x2"})
public class GetSolutionQuadraticEquationResponse {
    @XmlElement(required = true)
    @XmlSchemaType(name = "formula", namespace = "http://ru.divanov.soapMathWS.service/")
    private String formula;

    @XmlElement(required = true)
    @XmlSchemaType(name = "x1", namespace = "http://ru.divanov.soapMathWS.service/")
    private double x1;

    @XmlElement
    @XmlSchemaType(name = "x2", namespace = "http://ru.divanov.soapMathWS.service/")
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
