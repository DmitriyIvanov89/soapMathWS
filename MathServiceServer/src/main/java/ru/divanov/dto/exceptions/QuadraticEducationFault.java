package ru.divanov.dto.exceptions;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MathWSException")
public class QuadraticEducationFault {

    @XmlElement(required = true, name = "Formula")
    private String formula;

    @XmlElement(required = true, name = "D")
    private Double discriminant;

    public QuadraticEducationFault() {
    }

    public QuadraticEducationFault(String formula, Double discriminant) {
        this.formula = formula;
        this.discriminant = discriminant;
    }

    public String getFormula() {
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
}
