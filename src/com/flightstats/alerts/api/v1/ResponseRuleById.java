
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseRuleById complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="responseRuleById">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.api.alerts.flightstats.com/}responseRule">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://v1.api.alerts.flightstats.com/}requestRuleById" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseRuleById", propOrder = {
        "request"
})
public class ResponseRuleById
        extends ResponseRule {

    protected RequestRuleById request;

    /**
     * Gets the value of the request property.
     *
     * @return possible object is
     * {@link RequestRuleById }
     */
    public RequestRuleById getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     *
     * @param value allowed object is
     *              {@link RequestRuleById }
     */
    public void setRequest(RequestRuleById value) {
        this.request = value;
    }

}
