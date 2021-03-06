//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 02:07:42 PM EDT 
//


package com.greenenergycorp.openfmb.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExecutionKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExecutionKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DA"/&gt;
 *     &lt;enumeration value="HASP"/&gt;
 *     &lt;enumeration value="RTPD"/&gt;
 *     &lt;enumeration value="RTD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExecutionKind")
@XmlEnum
public enum ExecutionKind {


    /**
     * Day Ahead
     * 
     */
    DA,

    /**
     * Real TIme Hour Ahead Execution
     * 
     */
    HASP,

    /**
     * Real Time Pre-dispatch
     * 
     */
    RTPD,

    /**
     * Real Time Dispatch
     * 
     */
    RTD;

    public String value() {
        return name();
    }

    public static ExecutionKind fromValue(String v) {
        return valueOf(v);
    }

}
