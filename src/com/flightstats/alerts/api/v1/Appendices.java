
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for appendices complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="appendices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airlines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="airline" type="{http://v1.api.alerts.flightstats.com/}airlineV1" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="airports" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="airport" type="{http://v1.api.alerts.flightstats.com/}airportV1" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appendices", propOrder = {
        "airlines",
        "airports"
})
public class Appendices {

    protected Appendices.Airlines airlines;
    protected Appendices.Airports airports;

    /**
     * Gets the value of the airlines property.
     *
     * @return possible object is
     * {@link Appendices.Airlines }
     */
    public Appendices.Airlines getAirlines() {
        return airlines;
    }

    /**
     * Sets the value of the airlines property.
     *
     * @param value allowed object is
     *              {@link Appendices.Airlines }
     */
    public void setAirlines(Appendices.Airlines value) {
        this.airlines = value;
    }

    /**
     * Gets the value of the airports property.
     *
     * @return possible object is
     * {@link Appendices.Airports }
     */
    public Appendices.Airports getAirports() {
        return airports;
    }

    /**
     * Sets the value of the airports property.
     *
     * @param value allowed object is
     *              {@link Appendices.Airports }
     */
    public void setAirports(Appendices.Airports value) {
        this.airports = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="airline" type="{http://v1.api.alerts.flightstats.com/}airlineV1" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "airline"
    })
    public static class Airlines {

        protected List<AirlineV1> airline;

        /**
         * Gets the value of the airline property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airline property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirline().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirlineV1 }
         */
        public List<AirlineV1> getAirline() {
            if (airline == null) {
                airline = new ArrayList<AirlineV1>();
            }
            return this.airline;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="airport" type="{http://v1.api.alerts.flightstats.com/}airportV1" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "airport"
    })
    public static class Airports {

        protected List<AirportV1> airport;

        /**
         * Gets the value of the airport property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airport property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirport().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirportV1 }
         */
        public List<AirportV1> getAirport() {
            if (airport == null) {
                airport = new ArrayList<AirportV1>();
            }
            return this.airport;
        }

    }

}
