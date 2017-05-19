
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseRoute complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="responseRoute">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.api.alerts.flightstats.com/}responseRule">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://v1.api.alerts.flightstats.com/}requestRoute" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseRoute", propOrder = {
        "request"
})
public class ResponseRoute
        extends ResponseRule {

    protected RequestRoute request;

    /**
     * Gets the value of the request property.
     *
     * @return possible object is
     * {@link RequestRoute }
     */
    public RequestRoute getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     *
     * @param value allowed object is
     *              {@link RequestRoute }
     */
    public void setRequest(RequestRoute value) {
        this.request = value;
    }

}
