
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseRule complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="responseRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rule" type="{http://v1.api.alerts.flightstats.com/}alertRuleV1" minOccurs="0"/>
 *         &lt;element name="error" type="{http://v1.api.alerts.flightstats.com/}apiResponseError" minOccurs="0"/>
 *         &lt;element name="appendix" type="{http://v1.api.alerts.flightstats.com/}appendices" minOccurs="0"/>
 *         &lt;element name="alertCapabilities" type="{http://v1.api.alerts.flightstats.com/}alertCapabilities" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseRule", propOrder = {
        "rule",
        "error",
        "appendix",
        "alertCapabilities"
})
@XmlSeeAlso({
        ResponseRuleById.class,
        ResponseRoute.class,
        ResponseFlight.class
})
public class ResponseRule {

    protected AlertRuleV1 rule;
    protected ApiResponseError error;
    protected Appendices appendix;
    protected AlertCapabilities alertCapabilities;

    /**
     * Gets the value of the rule property.
     *
     * @return possible object is
     * {@link AlertRuleV1 }
     */
    public AlertRuleV1 getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     *
     * @param value allowed object is
     *              {@link AlertRuleV1 }
     */
    public void setRule(AlertRuleV1 value) {
        this.rule = value;
    }

    /**
     * Gets the value of the error property.
     *
     * @return possible object is
     * {@link ApiResponseError }
     */
    public ApiResponseError getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     *
     * @param value allowed object is
     *              {@link ApiResponseError }
     */
    public void setError(ApiResponseError value) {
        this.error = value;
    }

    /**
     * Gets the value of the appendix property.
     *
     * @return possible object is
     * {@link Appendices }
     */
    public Appendices getAppendix() {
        return appendix;
    }

    /**
     * Sets the value of the appendix property.
     *
     * @param value allowed object is
     *              {@link Appendices }
     */
    public void setAppendix(Appendices value) {
        this.appendix = value;
    }

    /**
     * Gets the value of the alertCapabilities property.
     *
     * @return possible object is
     * {@link AlertCapabilities }
     */
    public AlertCapabilities getAlertCapabilities() {
        return alertCapabilities;
    }

    /**
     * Sets the value of the alertCapabilities property.
     *
     * @param value allowed object is
     *              {@link AlertCapabilities }
     */
    public void setAlertCapabilities(AlertCapabilities value) {
        this.alertCapabilities = value;
    }

}
