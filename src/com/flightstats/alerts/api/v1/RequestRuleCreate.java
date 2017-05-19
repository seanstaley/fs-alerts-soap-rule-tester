
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for requestRuleCreate complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="requestRuleCreate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.api.alerts.flightstats.com/}requestBase">
 *       &lt;sequence>
 *         &lt;element name="airlineCode" type="{http://v1.api.alerts.flightstats.com/}requestedAirlineV1" minOccurs="0"/>
 *         &lt;element name="flightNumber" type="{http://v1.api.alerts.flightstats.com/}requestedString" minOccurs="0"/>
 *         &lt;element name="date" type="{http://v1.api.alerts.flightstats.com/}requestedDate" minOccurs="0"/>
 *         &lt;element name="name" type="{http://v1.api.alerts.flightstats.com/}requestedString" minOccurs="0"/>
 *         &lt;element name="description" type="{http://v1.api.alerts.flightstats.com/}requestedString" minOccurs="0"/>
 *         &lt;element name="type" type="{http://v1.api.alerts.flightstats.com/}requestedEnum" minOccurs="0"/>
 *         &lt;element name="deliverTo" type="{http://v1.api.alerts.flightstats.com/}requestedString" minOccurs="0"/>
 *         &lt;element name="events" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="event" type="{http://v1.api.alerts.flightstats.com/}requestedString" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="nameValue" type="{http://v1.api.alerts.flightstats.com/}requestedString" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="codeType" type="{http://v1.api.alerts.flightstats.com/}requestedString" minOccurs="0"/>
 *         &lt;element name="extendedOptions" type="{http://v1.api.alerts.flightstats.com/}requestedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestRuleCreate", propOrder = {
        "airlineCode",
        "flightNumber",
        "date",
        "name",
        "description",
        "type",
        "deliverTo",
        "events",
        "nameValues",
        "codeType",
        "extendedOptions"
})
@XmlSeeAlso({
        RequestRoute.class,
        RequestFlight.class
})
public abstract class RequestRuleCreate
        extends RequestBase {

    protected RequestedAirlineV1 airlineCode;
    protected RequestedString flightNumber;
    protected RequestedDate date;
    protected RequestedString name;
    protected RequestedString description;
    protected RequestedEnum type;
    protected RequestedString deliverTo;
    protected RequestRuleCreate.Events events;
    protected RequestRuleCreate.NameValues nameValues;
    protected RequestedString codeType;
    protected RequestedString extendedOptions;

    /**
     * Gets the value of the airlineCode property.
     *
     * @return possible object is
     * {@link RequestedAirlineV1 }
     */
    public RequestedAirlineV1 getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     *
     * @param value allowed object is
     *              {@link RequestedAirlineV1 }
     */
    public void setAirlineCode(RequestedAirlineV1 value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the flightNumber property.
     *
     * @return possible object is
     * {@link RequestedString }
     */
    public RequestedString getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     *
     * @param value allowed object is
     *              {@link RequestedString }
     */
    public void setFlightNumber(RequestedString value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the date property.
     *
     * @return possible object is
     * {@link RequestedDate }
     */
    public RequestedDate getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     *
     * @param value allowed object is
     *              {@link RequestedDate }
     */
    public void setDate(RequestedDate value) {
        this.date = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link RequestedString }
     */
    public RequestedString getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link RequestedString }
     */
    public void setName(RequestedString value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is
     * {@link RequestedString }
     */
    public RequestedString getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is
     *              {@link RequestedString }
     */
    public void setDescription(RequestedString value) {
        this.description = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link RequestedEnum }
     */
    public RequestedEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link RequestedEnum }
     */
    public void setType(RequestedEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the deliverTo property.
     *
     * @return possible object is
     * {@link RequestedString }
     */
    public RequestedString getDeliverTo() {
        return deliverTo;
    }

    /**
     * Sets the value of the deliverTo property.
     *
     * @param value allowed object is
     *              {@link RequestedString }
     */
    public void setDeliverTo(RequestedString value) {
        this.deliverTo = value;
    }

    /**
     * Gets the value of the events property.
     *
     * @return possible object is
     * {@link RequestRuleCreate.Events }
     */
    public RequestRuleCreate.Events getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     *
     * @param value allowed object is
     *              {@link RequestRuleCreate.Events }
     */
    public void setEvents(RequestRuleCreate.Events value) {
        this.events = value;
    }

    /**
     * Gets the value of the nameValues property.
     *
     * @return possible object is
     * {@link RequestRuleCreate.NameValues }
     */
    public RequestRuleCreate.NameValues getNameValues() {
        return nameValues;
    }

    /**
     * Sets the value of the nameValues property.
     *
     * @param value allowed object is
     *              {@link RequestRuleCreate.NameValues }
     */
    public void setNameValues(RequestRuleCreate.NameValues value) {
        this.nameValues = value;
    }

    /**
     * Gets the value of the codeType property.
     *
     * @return possible object is
     * {@link RequestedString }
     */
    public RequestedString getCodeType() {
        return codeType;
    }

    /**
     * Sets the value of the codeType property.
     *
     * @param value allowed object is
     *              {@link RequestedString }
     */
    public void setCodeType(RequestedString value) {
        this.codeType = value;
    }

    /**
     * Gets the value of the extendedOptions property.
     *
     * @return possible object is
     * {@link RequestedString }
     */
    public RequestedString getExtendedOptions() {
        return extendedOptions;
    }

    /**
     * Sets the value of the extendedOptions property.
     *
     * @param value allowed object is
     *              {@link RequestedString }
     */
    public void setExtendedOptions(RequestedString value) {
        this.extendedOptions = value;
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
     *         &lt;element name="event" type="{http://v1.api.alerts.flightstats.com/}requestedString" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "event"
    })
    public static class Events {

        protected List<RequestedString> event;

        /**
         * Gets the value of the event property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the event property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEvent().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequestedString }
         */
        public List<RequestedString> getEvent() {
            if (event == null) {
                event = new ArrayList<RequestedString>();
            }
            return this.event;
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
     *         &lt;element name="nameValue" type="{http://v1.api.alerts.flightstats.com/}requestedString" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<RequestedString> nameValue;

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
         * {@link RequestedString }
         */
        public List<RequestedString> getNameValue() {
            if (nameValue == null) {
                nameValue = new ArrayList<RequestedString>();
            }
            return this.nameValue;
        }

    }

}
