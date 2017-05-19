
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for airportV1 complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="airportV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="icao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeZoneRegionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weatherZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="utcOffsetHours" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="elevationFeet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="classification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delayIndexUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weatherUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "airportV1", propOrder = {
        "fs",
        "iata",
        "icao",
        "faa",
        "name",
        "street1",
        "street2",
        "city",
        "cityCode",
        "stateCode",
        "postalCode",
        "countryCode",
        "countryName",
        "regionName",
        "timeZoneRegionName",
        "weatherZone",
        "localTime",
        "utcOffsetHours",
        "latitude",
        "longitude",
        "elevationFeet",
        "classification",
        "active",
        "dateFrom",
        "dateTo",
        "delayIndexUrl",
        "weatherUrl"
})
public class AirportV1 {

    @XmlElement(required = true)
    protected String fs;
    protected String iata;
    protected String icao;
    protected String faa;
    protected String name;
    protected String street1;
    protected String street2;
    @XmlElement(required = true)
    protected String city;
    protected String cityCode;
    protected String stateCode;
    protected String postalCode;
    @XmlElement(required = true)
    protected String countryCode;
    @XmlElement(required = true)
    protected String countryName;
    @XmlElement(required = true)
    protected String regionName;
    @XmlElement(required = true)
    protected String timeZoneRegionName;
    protected String weatherZone;
    @XmlElement(required = true)
    protected String localTime;
    protected double utcOffsetHours;
    protected double latitude;
    protected double longitude;
    protected Integer elevationFeet;
    protected int classification;
    protected boolean active;
    protected String dateFrom;
    protected String dateTo;
    protected String delayIndexUrl;
    protected String weatherUrl;

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
     * Gets the value of the faa property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFaa() {
        return faa;
    }

    /**
     * Sets the value of the faa property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFaa(String value) {
        this.faa = value;
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
     * Gets the value of the street1 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * Sets the value of the street1 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStreet1(String value) {
        this.street1 = value;
    }

    /**
     * Gets the value of the street2 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * Sets the value of the street2 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStreet2(String value) {
        this.street2 = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the cityCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the stateCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the postalCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countryName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the regionName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Sets the value of the regionName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRegionName(String value) {
        this.regionName = value;
    }

    /**
     * Gets the value of the timeZoneRegionName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTimeZoneRegionName() {
        return timeZoneRegionName;
    }

    /**
     * Sets the value of the timeZoneRegionName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTimeZoneRegionName(String value) {
        this.timeZoneRegionName = value;
    }

    /**
     * Gets the value of the weatherZone property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWeatherZone() {
        return weatherZone;
    }

    /**
     * Sets the value of the weatherZone property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWeatherZone(String value) {
        this.weatherZone = value;
    }

    /**
     * Gets the value of the localTime property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLocalTime() {
        return localTime;
    }

    /**
     * Sets the value of the localTime property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLocalTime(String value) {
        this.localTime = value;
    }

    /**
     * Gets the value of the utcOffsetHours property.
     */
    public double getUtcOffsetHours() {
        return utcOffsetHours;
    }

    /**
     * Sets the value of the utcOffsetHours property.
     */
    public void setUtcOffsetHours(double value) {
        this.utcOffsetHours = value;
    }

    /**
     * Gets the value of the latitude property.
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the elevationFeet property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getElevationFeet() {
        return elevationFeet;
    }

    /**
     * Sets the value of the elevationFeet property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setElevationFeet(Integer value) {
        this.elevationFeet = value;
    }

    /**
     * Gets the value of the classification property.
     */
    public int getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     */
    public void setClassification(int value) {
        this.classification = value;
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

    /**
     * Gets the value of the delayIndexUrl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDelayIndexUrl() {
        return delayIndexUrl;
    }

    /**
     * Sets the value of the delayIndexUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDelayIndexUrl(String value) {
        this.delayIndexUrl = value;
    }

    /**
     * Gets the value of the weatherUrl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWeatherUrl() {
        return weatherUrl;
    }

    /**
     * Sets the value of the weatherUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWeatherUrl(String value) {
        this.weatherUrl = value;
    }

}
