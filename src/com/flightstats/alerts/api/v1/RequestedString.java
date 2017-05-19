
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestedString complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="requestedString">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requested" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interpreted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestedString", propOrder = {
        "requested",
        "interpreted",
        "error"
})
@XmlSeeAlso({
        RequestedEnum.class
})
public class RequestedString {

    protected String requested;
    protected String interpreted;
    protected String error;

    /**
     * Gets the value of the requested property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRequested() {
        return requested;
    }

    /**
     * Sets the value of the requested property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRequested(String value) {
        this.requested = value;
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
