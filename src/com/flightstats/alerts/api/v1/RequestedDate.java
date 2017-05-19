
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestedDate complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="requestedDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interpreted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestedDate", propOrder = {
        "year",
        "month",
        "day",
        "interpreted",
        "error"
})
public class RequestedDate {

    protected String year;
    protected String month;
    protected String day;
    protected String interpreted;
    protected String error;

    /**
     * Gets the value of the year property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMonth(String value) {
        this.month = value;
    }

    /**
     * Gets the value of the day property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDay(String value) {
        this.day = value;
    }

    /**
     * Gets the value of the interpreted property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInterpreted() {
        return interpreted;
    }

    /**
     * Sets the value of the interpreted property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInterpreted(String value) {
        this.interpreted = value;
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
