
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteById complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="deleteById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="appKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ruleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extendedOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteById", propOrder = {
        "appId",
        "appKey",
        "ruleId",
        "extendedOptions"
})
public class DeleteById {

    @XmlElement(required = true)
    protected String appId;
    @XmlElement(required = true)
    protected String appKey;
    @XmlElement(required = true)
    protected String ruleId;
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
     * Gets the value of the ruleId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * Sets the value of the ruleId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRuleId(String value) {
        this.ruleId = value;
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
