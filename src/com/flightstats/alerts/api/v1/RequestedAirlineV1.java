
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestedAirlineV1 complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="requestedAirlineV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="airline" type="{http://v1.api.alerts.flightstats.com/}airlineV1" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestedAirlineV1", propOrder = {
        "requestedCode",
        "fsCode",
        "airline",
        "error"
})
public class RequestedAirlineV1 {

    protected String requestedCode;
    protected String fsCode;
    protected AirlineV1 airline;
    protected String error;

    /**
     * Gets the value of the requestedCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRequestedCode() {
        return requestedCode;
    }

    /**
     * Sets the value of the requestedCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRequestedCode(String value) {
        this.requestedCode = value;
    }

    /**
     * Gets the value of the fsCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFsCode() {
        return fsCode;
    }

    /**
     * Sets the value of the fsCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFsCode(String value) {
        this.fsCode = value;
    }

    /**
     * Gets the value of the airline property.
     *
     * @return possible object is
     * {@link AirlineV1 }
     */
    public AirlineV1 getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     *
     * @param value allowed object is
     *              {@link AirlineV1 }
     */
    public void setAirline(AirlineV1 value) {
        this.airline = value;
    }

    /**
     * Gets the value of the error property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setError(String value) {
        this.error = value;
    }

}
