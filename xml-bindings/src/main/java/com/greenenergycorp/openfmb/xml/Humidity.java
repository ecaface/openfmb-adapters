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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Humidity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Humidity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unit" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}UnitSymbolKind" minOccurs="0"/&gt;
 *         &lt;element name="HumidityData" type="{http://openfmb.org/xsd/2015/12/openfmb/weathermodule}HumidityData" maxOccurs="100" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Humidity", namespace = "http://openfmb.org/xsd/2015/12/openfmb/weathermodule", propOrder = {
    "unit",
    "humidityDatas"
})
@XmlRootElement(name = "Humidity", namespace = "http://openfmb.org/xsd/2015/12/openfmb/weathermodule")
public class Humidity
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlSchemaType(name = "string")
    protected UnitSymbolKind unit;
    @XmlElement(name = "HumidityData")
    protected List<HumidityData> humidityDatas;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitSymbolKind }
     *     
     */
    public UnitSymbolKind getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitSymbolKind }
     *     
     */
    public void setUnit(UnitSymbolKind value) {
        this.unit = value;
    }

    /**
     * Gets the value of the humidityDatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the humidityDatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHumidityDatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HumidityData }
     * 
     * 
     */
    public List<HumidityData> getHumidityDatas() {
        if (humidityDatas == null) {
            humidityDatas = new ArrayList<HumidityData>();
        }
        return this.humidityDatas;
    }

}
