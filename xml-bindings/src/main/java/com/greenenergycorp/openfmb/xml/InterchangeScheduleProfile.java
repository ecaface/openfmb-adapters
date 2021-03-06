//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 02:07:42 PM EDT 
//


package com.greenenergycorp.openfmb.xml;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Set of values obtained from the meter.
 * 
 * <p>Java class for InterchangeScheduleProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterchangeScheduleProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Container"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InterchangeSchedule" type="{http://openfmb.org/xsd/2015/12/openfmb/interchangemodule}InterchangeSchedule"/&gt;
 *         &lt;element name="PowerSystemResource" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}PowerSystemResource"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterchangeScheduleProfile", namespace = "http://openfmb.org/xsd/2015/12/openfmb/interchangemodule", propOrder = {
    "interchangeSchedule",
    "powerSystemResource"
})
@XmlRootElement(name = "InterchangeScheduleProfile", namespace = "http://openfmb.org/xsd/2015/12/openfmb/interchangemodule")
public class InterchangeScheduleProfile
    extends Container
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InterchangeSchedule", required = true)
    protected InterchangeSchedule interchangeSchedule;
    @XmlElement(name = "PowerSystemResource", required = true)
    protected PowerSystemResource powerSystemResource;

    /**
     * Gets the value of the interchangeSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeSchedule }
     *     
     */
    public InterchangeSchedule getInterchangeSchedule() {
        return interchangeSchedule;
    }

    /**
     * Sets the value of the interchangeSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeSchedule }
     *     
     */
    public void setInterchangeSchedule(InterchangeSchedule value) {
        this.interchangeSchedule = value;
    }

    /**
     * Gets the value of the powerSystemResource property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSystemResource }
     *     
     */
    public PowerSystemResource getPowerSystemResource() {
        return powerSystemResource;
    }

    /**
     * Sets the value of the powerSystemResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSystemResource }
     *     
     */
    public void setPowerSystemResource(PowerSystemResource value) {
        this.powerSystemResource = value;
    }

}
