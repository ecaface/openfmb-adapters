//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 02:07:42 PM EDT 
//


package com.greenenergycorp.openfmb.xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A multi-purpose curve or functional relationship between an independent variable (X-axis) and dependent (Y-axis) variables. 
 * 
 * <p>Java class for Curve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Curve"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}IdentifiedObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="curveStyle" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}CurveStyleKind" minOccurs="0"/&gt;
 *         &lt;element name="xMultiplier" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}UnitMultiplierKind" minOccurs="0"/&gt;
 *         &lt;element name="xUnit" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}UnitSymbolKind" minOccurs="0"/&gt;
 *         &lt;element name="y1Multiplier" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}UnitMultiplierKind" minOccurs="0"/&gt;
 *         &lt;element name="y1Unit" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}UnitSymbolKind" minOccurs="0"/&gt;
 *         &lt;element name="y2Multiplier" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}UnitMultiplierKind" minOccurs="0"/&gt;
 *         &lt;element name="y2Unit" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}UnitSymbolKind" minOccurs="0"/&gt;
 *         &lt;element name="y3Multiplier" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}UnitMultiplierKind" minOccurs="0"/&gt;
 *         &lt;element name="y3Unit" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}UnitSymbolKind" minOccurs="0"/&gt;
 *         &lt;element name="CurveData" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}CurveData" maxOccurs="100" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Curve", propOrder = {
    "curveStyle",
    "xMultiplier",
    "xUnit",
    "y1Multiplier",
    "y1Unit",
    "y2Multiplier",
    "y2Unit",
    "y3Multiplier",
    "y3Unit",
    "curveDatas"
})
@XmlSeeAlso({
    InterchangeSchedule.class
})
public class Curve
    extends IdentifiedObject
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlSchemaType(name = "string")
    protected CurveStyleKind curveStyle;
    @XmlSchemaType(name = "string")
    protected UnitMultiplierKind xMultiplier;
    @XmlSchemaType(name = "string")
    protected UnitSymbolKind xUnit;
    @XmlSchemaType(name = "string")
    protected UnitMultiplierKind y1Multiplier;
    @XmlSchemaType(name = "string")
    protected UnitSymbolKind y1Unit;
    @XmlSchemaType(name = "string")
    protected UnitMultiplierKind y2Multiplier;
    @XmlSchemaType(name = "string")
    protected UnitSymbolKind y2Unit;
    @XmlSchemaType(name = "string")
    protected UnitMultiplierKind y3Multiplier;
    @XmlSchemaType(name = "string")
    protected UnitSymbolKind y3Unit;
    @XmlElement(name = "CurveData")
    protected List<CurveData> curveDatas;

    /**
     * Gets the value of the curveStyle property.
     * 
     * @return
     *     possible object is
     *     {@link CurveStyleKind }
     *     
     */
    public CurveStyleKind getCurveStyle() {
        return curveStyle;
    }

    /**
     * Sets the value of the curveStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveStyleKind }
     *     
     */
    public void setCurveStyle(CurveStyleKind value) {
        this.curveStyle = value;
    }

    /**
     * Gets the value of the xMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link UnitMultiplierKind }
     *     
     */
    public UnitMultiplierKind getXMultiplier() {
        return xMultiplier;
    }

    /**
     * Sets the value of the xMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitMultiplierKind }
     *     
     */
    public void setXMultiplier(UnitMultiplierKind value) {
        this.xMultiplier = value;
    }

    /**
     * Gets the value of the xUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitSymbolKind }
     *     
     */
    public UnitSymbolKind getXUnit() {
        return xUnit;
    }

    /**
     * Sets the value of the xUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitSymbolKind }
     *     
     */
    public void setXUnit(UnitSymbolKind value) {
        this.xUnit = value;
    }

    /**
     * Gets the value of the y1Multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link UnitMultiplierKind }
     *     
     */
    public UnitMultiplierKind getY1Multiplier() {
        return y1Multiplier;
    }

    /**
     * Sets the value of the y1Multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitMultiplierKind }
     *     
     */
    public void setY1Multiplier(UnitMultiplierKind value) {
        this.y1Multiplier = value;
    }

    /**
     * Gets the value of the y1Unit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitSymbolKind }
     *     
     */
    public UnitSymbolKind getY1Unit() {
        return y1Unit;
    }

    /**
     * Sets the value of the y1Unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitSymbolKind }
     *     
     */
    public void setY1Unit(UnitSymbolKind value) {
        this.y1Unit = value;
    }

    /**
     * Gets the value of the y2Multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link UnitMultiplierKind }
     *     
     */
    public UnitMultiplierKind getY2Multiplier() {
        return y2Multiplier;
    }

    /**
     * Sets the value of the y2Multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitMultiplierKind }
     *     
     */
    public void setY2Multiplier(UnitMultiplierKind value) {
        this.y2Multiplier = value;
    }

    /**
     * Gets the value of the y2Unit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitSymbolKind }
     *     
     */
    public UnitSymbolKind getY2Unit() {
        return y2Unit;
    }

    /**
     * Sets the value of the y2Unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitSymbolKind }
     *     
     */
    public void setY2Unit(UnitSymbolKind value) {
        this.y2Unit = value;
    }

    /**
     * Gets the value of the y3Multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link UnitMultiplierKind }
     *     
     */
    public UnitMultiplierKind getY3Multiplier() {
        return y3Multiplier;
    }

    /**
     * Sets the value of the y3Multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitMultiplierKind }
     *     
     */
    public void setY3Multiplier(UnitMultiplierKind value) {
        this.y3Multiplier = value;
    }

    /**
     * Gets the value of the y3Unit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitSymbolKind }
     *     
     */
    public UnitSymbolKind getY3Unit() {
        return y3Unit;
    }

    /**
     * Sets the value of the y3Unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitSymbolKind }
     *     
     */
    public void setY3Unit(UnitSymbolKind value) {
        this.y3Unit = value;
    }

    /**
     * Gets the value of the curveDatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curveDatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurveDatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurveData }
     * 
     * 
     */
    public List<CurveData> getCurveDatas() {
        if (curveDatas == null) {
            curveDatas = new ArrayList<CurveData>();
        }
        return this.curveDatas;
    }

}
