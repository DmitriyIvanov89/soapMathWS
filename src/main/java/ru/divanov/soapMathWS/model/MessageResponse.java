package ru.divanov.soapMathWS.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "")
public class MessageResponse {
    private String formula;
    private double x1;
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
