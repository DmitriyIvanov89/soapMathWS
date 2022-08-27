package ru.divanov.mathws.server.model;

import lombok.*;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@Getter
@Setter
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
}
