
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alertCapabilities complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="alertCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baggage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="departureGateChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="arrivalGateChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="gateDeparture" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="gateArrival" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="runwayDeparture" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="runwayArrival" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alertCapabilities", propOrder = {
        "baggage",
        "departureGateChange",
        "arrivalGateChange",
        "gateDeparture",
        "gateArrival",
        "runwayDeparture",
        "runwayArrival"
})
public class AlertCapabilities {

    protected boolean baggage;
    protected boolean departureGateChange;
    protected boolean arrivalGateChange;
    protected boolean gateDeparture;
    protected boolean gateArrival;
    protected boolean runwayDeparture;
    protected boolean runwayArrival;

    /**
     * Gets the value of the baggage property.
     */
    public boolean isBaggage() {
        return baggage;
    }

    /**
     * Sets the value of the baggage property.
     */
    public void setBaggage(boolean value) {
        this.baggage = value;
    }

    /**
     * Gets the value of the departureGateChange property.
     */
    public boolean isDepartureGateChange() {
        return departureGateChange;
    }

    /**
     * Sets the value of the departureGateChange property.
     */
    public void setDepartureGateChange(boolean value) {
        this.departureGateChange = value;
    }

    /**
     * Gets the value of the arrivalGateChange property.
     */
    public boolean isArrivalGateChange() {
        return arrivalGateChange;
    }

    /**
     * Sets the value of the arrivalGateChange property.
     */
    public void setArrivalGateChange(boolean value) {
        this.arrivalGateChange = value;
    }

    /**
     * Gets the value of the gateDeparture property.
     */
    public boolean isGateDeparture() {
        return gateDeparture;
    }

    /**
     * Sets the value of the gateDeparture property.
     */
    public void setGateDeparture(boolean value) {
        this.gateDeparture = value;
    }

    /**
     * Gets the value of the gateArrival property.
     */
    public boolean isGateArrival() {
        return gateArrival;
    }

    /**
     * Sets the value of the gateArrival property.
     */
    public void setGateArrival(boolean value) {
        this.gateArrival = value;
    }

    /**
     * Gets the value of the runwayDeparture property.
     */
    public boolean isRunwayDeparture() {
        return runwayDeparture;
    }

    /**
     * Sets the value of the runwayDeparture property.
     */
    public void setRunwayDeparture(boolean value) {
        this.runwayDeparture = value;
    }

    /**
     * Gets the value of the runwayArrival property.
     */
    public boolean isRunwayArrival() {
        return runwayArrival;
    }

    /**
     * Sets the value of the runwayArrival property.
     */
    public void setRunwayArrival(boolean value) {
        this.runwayArrival = value;
    }

}
