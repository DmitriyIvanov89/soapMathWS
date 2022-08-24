package ru.divanov.soapMathWS.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {"a", "b", "c"})
public class GetSolutionQuadraticEquation {
    @XmlElement(required = true)
    private double a;

    @XmlElement(required = true)
    private double b;

    @XmlElement(required = true)
    private double c;
}
