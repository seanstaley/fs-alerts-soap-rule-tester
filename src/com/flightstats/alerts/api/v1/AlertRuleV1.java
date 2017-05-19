
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for alertRuleV1 complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="alertRuleV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carrierFsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carrier" type="{http://v1.api.alerts.flightstats.com/}airlineV1" minOccurs="0"/>
 *         &lt;element name="flightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureAirportFsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureAirport" type="{http://v1.api.alerts.flightstats.com/}airportV1" minOccurs="0"/>
 *         &lt;element name="arrivalAirportFsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalAirport" type="{http://v1.api.alerts.flightstats.com/}airportV1" minOccurs="0"/>
 *         &lt;element name="departure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrival" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruleEvents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ruleEvent" type="{http://v1.api.alerts.flightstats.com/}ruleEventV1" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="nameValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nameValue" type="{http://v1.api.alerts.flightstats.com/}nameValueV1" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="delivery" type="{http://v1.api.alerts.flightstats.com/}alertDeliveryV1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alertRuleV1", propOrder = {
        "id",
        "name",
        "description",
        "carrierFsCode",
        "carrier",
        "flightNumber",
        "departureAirportFsCode",
        "departureAirport",
        "arrivalAirportFsCode",
        "arrivalAirport",
        "departure",
        "arrival",
        "ruleEvents",
        "nameValues",
        "delivery"
})
public class AlertRuleV1 {

    protected String id;
    protected String name;
    protected String description;
    protected String carrierFsCode;
    protected AirlineV1 carrier;
    protected String flightNumber;
    protected String departureAirportFsCode;
    protected AirportV1 departureAirport;
    protected String arrivalAirportFsCode;
    protected AirportV1 arrivalAirport;
    protected String departure;
    protected String arrival;
    protected AlertRuleV1.RuleEvents ruleEvents;
    protected AlertRuleV1.NameValues nameValues;
    protected AlertDeliveryV1 delivery;

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the carrierFsCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCarrierFsCode() {
        return carrierFsCode;
    }

    /**
     * Sets the value of the carrierFsCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCarrierFsCode(String value) {
        this.carrierFsCode = value;
    }

    /**
     * Gets the value of the carrier property.
     *
     * @return possible object is
     * {@link AirlineV1 }
     */
    public AirlineV1 getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     *
     * @param value allowed object is
     *              {@link AirlineV1 }
     */
    public void setCarrier(AirlineV1 value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the flightNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the departureAirportFsCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDepartureAirportFsCode() {
        return departureAirportFsCode;
    }

    /**
     * Sets the value of the departureAirportFsCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDepartureAirportFsCode(String value) {
        this.departureAirportFsCode = value;
    }

    /**
     * Gets the value of the departureAirport property.
     *
     * @return possible object is
     * {@link AirportV1 }
     */
    public AirportV1 getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Sets the value of the departureAirport property.
     *
     * @param value allowed object is
     *              {@link AirportV1 }
     */
    public void setDepartureAirport(AirportV1 value) {
        this.departureAirport = value;
    }

    /**
     * Gets the value of the arrivalAirportFsCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getArrivalAirportFsCode() {
        return arrivalAirportFsCode;
    }

    /**
     * Sets the value of the arrivalAirportFsCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setArrivalAirportFsCode(String value) {
        this.arrivalAirportFsCode = value;
    }

    /**
     * Gets the value of the arrivalAirport property.
     *
     * @return possible object is
     * {@link AirportV1 }
     */
    public AirportV1 getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     *
     * @param value allowed object is
     *              {@link AirportV1 }
     */
    public void setArrivalAirport(AirportV1 value) {
        this.arrivalAirport = value;
    }

    /**
     * Gets the value of the departure property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDeparture(String value) {
        this.departure = value;
    }

    /**
     * Gets the value of the arrival property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setArrival(String value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the ruleEvents property.
     *
     * @return possible object is
     * {@link AlertRuleV1 .RuleEvents }
     */
    public AlertRuleV1.RuleEvents getRuleEvents() {
        return ruleEvents;
    }

    /**
     * Sets the value of the ruleEvents property.
     *
     * @param value allowed object is
     *              {@link AlertRuleV1 .RuleEvents }
     */
    public void setRuleEvents(AlertRuleV1.RuleEvents value) {
        this.ruleEvents = value;
    }

    /**
     * Gets the value of the nameValues property.
     *
     * @return possible object is
     * {@link AlertRuleV1 .NameValues }
     */
    public AlertRuleV1.NameValues getNameValues() {
        return nameValues;
    }

    /**
     * Sets the value of the nameValues property.
     *
     * @param value allowed object is
     *              {@link AlertRuleV1 .NameValues }
     */
    public void setNameValues(AlertRuleV1.NameValues value) {
        this.nameValues = value;
    }

    /**
     * Gets the value of the delivery property.
     *
     * @return possible object is
     * {@link AlertDeliveryV1 }
     */
    public AlertDeliveryV1 getDelivery() {
        return delivery;
    }

    /**
     * Sets the value of the delivery property.
     *
     * @param value allowed object is
     *              {@link AlertDeliveryV1 }
     */
    public void setDelivery(AlertDeliveryV1 value) {
        this.delivery = value;
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
     *         &lt;element name="nameValue" type="{http://v1.api.alerts.flightstats.com/}nameValueV1" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "nameValue"
    })
    public static class NameValues {

        protected List<NameValueV1> nameValue;

        /**
         * Gets the value of the nameValue property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nameValue property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNameValue().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NameValueV1 }
         */
        public List<NameValueV1> getNameValue() {
            if (nameValue == null) {
                nameValue = new ArrayList<NameValueV1>();
            }
            return this.nameValue;
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
     *         &lt;element name="ruleEvent" type="{http://v1.api.alerts.flightstats.com/}ruleEventV1" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "ruleEvent"
    })
    public static class RuleEvents {

        protected List<RuleEventV1> ruleEvent;

        /**
         * Gets the value of the ruleEvent property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ruleEvent property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRuleEvent().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RuleEventV1 }
         */
        public List<RuleEventV1> getRuleEvent() {
            if (ruleEvent == null) {
                ruleEvent = new ArrayList<RuleEventV1>();
            }
            return this.ruleEvent;
        }

    }

}
