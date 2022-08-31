package ru.divanov.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSolutionQuadraticEducation", propOrder = {"a", "b", "c"})
public class GetQuadraticEducationSolution {
    @XmlElement(name = "A", required = true)
    private Double a;

    @XmlElement(name = "B", required = true)
    private Double b;

    @XmlElement(name = "C", required = true)
    private Double c;

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }
}
