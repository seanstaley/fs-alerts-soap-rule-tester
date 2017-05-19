
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for airlineV1 complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="airlineV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="icao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "airlineV1", propOrder = {
        "fs",
        "iata",
        "icao",
        "name",
        "phoneNumber",
        "active",
        "dateFrom",
        "dateTo"
})
public class AirlineV1 {

    @XmlElement(required = true)
    protected String fs;
    protected String iata;
    protected String icao;
    @XmlElement(required = true)
    protected String name;
    protected String phoneNumber;
    protected boolean active;
    protected String dateFrom;
    protected String dateTo;

    /**
     * Gets the value of the fs property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFs() {
        return fs;
    }

    /**
     * Sets the value of the fs property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFs(String value) {
        this.fs = value;
    }

    /**
     * Gets the value of the iata property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIata() {
        return iata;
    }

    /**
     * Sets the value of the iata property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIata(String value) {
        this.iata = value;
    }

    /**
     * Gets the value of the icao property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIcao() {
        return icao;
    }

    /**
     * Sets the value of the icao property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIcao(String value) {
        this.icao = value;
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
     * Gets the value of the phoneNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the active property.
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the dateFrom property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateFrom(String value) {
        this.dateFrom = value;
    }

    /**
     * Gets the value of the dateTo property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateTo(String value) {
        this.dateTo = value;
    }

}
