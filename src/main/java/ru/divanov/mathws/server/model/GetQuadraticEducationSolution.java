package ru.divanov.mathws.server.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSolutionQuadraticEducation", propOrder = {"a", "b", "c"})
public class GetQuadraticEducationSolution {
    @XmlElement(name = "A", required = true, defaultValue = "0")
    private Double a;

    @XmlElement(name = "B", required = true)
    private Double b;

    @XmlElement(name = "C", required = true)
    private Double c;
}
