package ru.divanov.dto.exceptions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorResponseMessage", propOrder = {"formula", "discriminant"})
public class ErrorResponseMessage {
    @XmlElement(name = "Formula", required = true)
    private String formula;
    @XmlElement(name = "D", required = true)
    private Double discriminant;

    public ErrorResponseMessage() {
    }

    public ErrorResponseMessage(String formula, Double discriminant) {
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
