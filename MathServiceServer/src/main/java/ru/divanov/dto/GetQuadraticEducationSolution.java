package ru.divanov.dto;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSolutionQuadraticEducation", propOrder = {"a", "b", "c"})
public class GetQuadraticEducationSolution {
    @XmlElement(name = "A", required = true)
    private Double a;

    @XmlElement(name = "B", required = true)
    private Double b;

    @XmlElement(name = "C", required = true)
    private Double c;
}
