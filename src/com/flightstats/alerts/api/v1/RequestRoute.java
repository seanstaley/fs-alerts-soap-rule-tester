
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestRoute complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="requestRoute">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.api.alerts.flightstats.com/}requestRuleCreate">
 *       &lt;sequence>
 *         &lt;element name="departureAirport" type="{http://v1.api.alerts.flightstats.com/}requestedAirportV1" minOccurs="0"/>
 *         &lt;element name="arrivalAirport" type="{http://v1.api.alerts.flightstats.com/}requestedAirportV1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestRoute", propOrder = {
        "departureAirport",
        "arrivalAirport"
})
public class RequestRoute
        extends RequestRuleCreate {

    protected RequestedAirportV1 departureAirport;
    protected RequestedAirportV1 arrivalAirport;

    /**
     * Gets the value of the departureAirport property.
     *
     * @return possible object is
     * {@link RequestedAirportV1 }
     */
    public RequestedAirportV1 getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Sets the value of the departureAirport property.
     *
     * @param value allowed object is
     *              {@link RequestedAirportV1 }
     */
    public void setDepartureAirport(RequestedAirportV1 value) {
        this.departureAirport = value;
    }

    /**
     * Gets the value of the arrivalAirport property.
     *
     * @return possible object is
     * {@link RequestedAirportV1 }
     */
    public RequestedAirportV1 getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     *
     * @param value allowed object is
     *              {@link RequestedAirportV1 }
     */
    public void setArrivalAirport(RequestedAirportV1 value) {
        this.arrivalAirport = value;
    }

}
