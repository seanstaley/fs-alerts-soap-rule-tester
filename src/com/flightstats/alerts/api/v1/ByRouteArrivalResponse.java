
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for byRouteArrivalResponse complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="byRouteArrivalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://v1.api.alerts.flightstats.com/}responseRoute" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "byRouteArrivalResponse", propOrder = {
        "_return"
})
public class ByRouteArrivalResponse {

    @XmlElement(name = "return")
    protected ResponseRoute _return;

    /**
     * Gets the value of the return property.
     *
     * @return possible object is
     * {@link ResponseRoute }
     */
    public ResponseRoute getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     *
     * @param value allowed object is
     *              {@link ResponseRoute }
     */
    public void setReturn(ResponseRoute value) {
        this._return = value;
    }

}
