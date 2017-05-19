
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestFlight complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="requestFlight">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.api.alerts.flightstats.com/}requestRuleCreate">
 *       &lt;sequence>
 *         &lt;element name="airport" type="{http://v1.api.alerts.flightstats.com/}requestedAirportV1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestFlight", propOrder = {
        "airport"
})
public class RequestFlight
        extends RequestRuleCreate {

    protected RequestedAirportV1 airport;

    /**
     * Gets the value of the airport property.
     *
     * @return possible object is
     * {@link RequestedAirportV1 }
     */
    public RequestedAirportV1 getAirport() {
        return airport;
    }

    /**
     * Sets the value of the airport property.
     *
     * @param value allowed object is
     *              {@link RequestedAirportV1 }
     */
    public void setAirport(RequestedAirportV1 value) {
        this.airport = value;
    }

}
