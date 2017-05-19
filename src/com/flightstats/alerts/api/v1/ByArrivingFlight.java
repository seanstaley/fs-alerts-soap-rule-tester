
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for byArrivingFlight complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="byArrivingFlight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="appKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flightNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="arrivalAirport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deliverTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="events" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameValue" type="{http://v1.api.alerts.flightstats.com/}nameValueV1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extendedOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "byArrivingFlight", propOrder = {
        "appId",
        "appKey",
        "carrier",
        "flightNumber",
        "arrivalAirport",
        "year",
        "month",
        "day",
        "name",
        "desc",
        "type",
        "deliverTo",
        "events",
        "nameValue",
        "codeType",
        "extendedOptions"
})
public class ByArrivingFlight {

    @XmlElement(required = true)
    protected String appId;
    @XmlElement(required = true)
    protected String appKey;
    @XmlElement(required = true)
    protected String carrier;
    @XmlElement(required = true)
    protected String flightNumber;
    @XmlElement(required = true)
    protected String arrivalAirport;
    protected int year;
    protected int month;
    protected int day;
    protected String name;
    protected String desc;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String deliverTo;
    protected String events;
    protected List<NameValueV1> nameValue;
    protected String codeType;
    protected String extendedOptions;

    /**
     * Gets the value of the appId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * Gets the value of the appKey property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * Sets the value of the appKey property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAppKey(String value) {
        this.appKey = value;
    }

    /**
     * Gets the value of the carrier property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCarrier(String value) {
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
     * Gets the value of the arrivalAirport property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setArrivalAirport(String value) {
        this.arrivalAirport = value;
    }

    /**
     * Gets the value of the year property.
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Gets the value of the day property.
     */
    public int getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     */
    public void setDay(int value) {
        this.day = value;
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
     * Gets the value of the desc property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the deliverTo property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDeliverTo() {
        return deliverTo;
    }

    /**
     * Sets the value of the deliverTo property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDeliverTo(String value) {
        this.deliverTo = value;
    }

    /**
     * Gets the value of the events property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEvents(String value) {
        this.events = value;
    }

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

    /**
     * Gets the value of the codeType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodeType() {
        return codeType;
    }

    /**
     * Sets the value of the codeType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodeType(String value) {
        this.codeType = value;
    }

    /**
     * Gets the value of the extendedOptions property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getExtendedOptions() {
        return extendedOptions;
    }

    /**
     * Sets the value of the extendedOptions property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExtendedOptions(String value) {
        this.extendedOptions = value;
    }

}
