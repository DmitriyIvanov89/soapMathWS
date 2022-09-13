
package ru.divanov.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSolutionQuadraticEquationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSolutionQuadraticEquationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Formula" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="D" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="X1" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="X2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSolutionQuadraticEquationResponse", propOrder = {
    "formula",
    "d",
    "x1",
    "x2"
})
public class GetSolutionQuadraticEquationResponse {

    @XmlElement(name = "Formula", required = true)
    protected String formula;
    @XmlElement(name = "D")
    protected double d;
    @XmlElement(name = "X1")
    protected double x1;
    @XmlElement(name = "X2")
    protected Double x2;

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormula(String value) {
        this.formula = value;
    }

    /**
     * Gets the value of the d property.
     * 
     */
    public double getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     */
    public void setD(double value) {
        this.d = value;
    }

    /**
     * Gets the value of the x1 property.
     * 
     */
    public double getX1() {
        return x1;
    }

    /**
     * Sets the value of the x1 property.
     * 
     */
    public void setX1(double value) {
        this.x1 = value;
    }

    /**
     * Gets the value of the x2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX2() {
        return x2;
    }

    /**
     * Sets the value of the x2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX2(Double value) {
        this.x2 = value;
    }

    @Override
    public String toString() {
        return "GetSolutionQuadraticEquationResponse{" +
                "formula='" + formula + '\'' +
                ", d=" + d +
                ", x1=" + x1 +
                ", x2=" + x2 +
                '}';
    }
}
