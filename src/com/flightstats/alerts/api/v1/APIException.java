
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIException complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="APIException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="httpStatusCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIException", propOrder = {
        "httpStatusCode",
        "errorCode",
        "errorId",
        "errorMessage"
})
public class APIException {

    protected int httpStatusCode;
    protected String errorCode;
    protected String errorId;
    protected String errorMessage;

    /**
     * Gets the value of the httpStatusCode property.
     */
    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    /**
     * Sets the value of the httpStatusCode property.
     */
    public void setHttpStatusCode(int value) {
        this.httpStatusCode = value;
    }

    /**
     * Gets the value of the errorCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getErrorId() {
        return errorId;
    }

    /**
     * Sets the value of the errorId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setErrorId(String value) {
        this.errorId = value;
    }

    /**
     * Gets the value of the errorMessage property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
