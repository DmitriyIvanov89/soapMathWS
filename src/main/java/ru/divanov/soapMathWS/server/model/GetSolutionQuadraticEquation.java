package ru.divanov.soapMathWS.server.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSolutionQuadraticEquationRequest", propOrder = {"a", "b", "c"})
public class GetSolutionQuadraticEquation {
    @XmlElement(required = true)
    private double a;

    @XmlElement(required = true)
    private double b;

    @XmlElement(required = true)
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
