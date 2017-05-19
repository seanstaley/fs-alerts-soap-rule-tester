
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestRuleById complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="requestRuleById">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.api.alerts.flightstats.com/}requestBase">
 *       &lt;sequence>
 *         &lt;element name="ruleId" type="{http://v1.api.alerts.flightstats.com/}requestedString" minOccurs="0"/>
 *         &lt;element name="extendedOptions" type="{http://v1.api.alerts.flightstats.com/}requestedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestRuleById", propOrder = {
        "ruleId",
        "extendedOptions"
})
public class RequestRuleById
        extends RequestBase {

    protected RequestedString ruleId;
    protected RequestedString extendedOptions;

    /**
     * Gets the value of the ruleId property.
     *
     * @return possible object is
     * {@link RequestedString }
     */
    public RequestedString getRuleId() {
        return ruleId;
    }

    /**
     * Sets the value of the ruleId property.
     *
     * @param value allowed object is
     *              {@link RequestedString }
     */
    public void setRuleId(RequestedString value) {
        this.ruleId = value;
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

}
