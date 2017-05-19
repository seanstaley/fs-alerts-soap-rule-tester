
package com.flightstats.alerts.api.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.flightstats.alerts.api.v1 package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ByDepartingFlight_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "byDepartingFlight");
    private final static QName _AlertCapabilities_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "alertCapabilities");
    private final static QName _Airport_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "airport");
    private final static QName _ByRouteArrivalResponse_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "byRouteArrivalResponse");
    private final static QName _ByRouteArrival_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "byRouteArrival");
    private final static QName _GetByIdResponse_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "getByIdResponse");
    private final static QName _ByRouteDepartureResponse_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "byRouteDepartureResponse");
    private final static QName _Request_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "request");
    private final static QName _Appendix_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "appendix");
    private final static QName _ByArrivingFlightResponse_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "byArrivingFlightResponse");
    private final static QName _ByArrivingFlight_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "byArrivingFlight");
    private final static QName _DeleteById_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "deleteById");
    private final static QName _Airline_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "airline");
    private final static QName _APIException_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "APIException");
    private final static QName _ApiResponseError_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "apiResponseError");
    private final static QName _DeleteByIdResponse_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "deleteByIdResponse");
    private final static QName _ByDepartingFlightResponse_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "byDepartingFlightResponse");
    private final static QName _ByRouteDeparture_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "byRouteDeparture");
    private final static QName _Response_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "response");
    private final static QName _GetById_QNAME = new QName("http://v1.api.alerts.flightstats.com/", "getById");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.flightstats.alerts.api.v1
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlertRuleV1 }
     */
    public AlertRuleV1 createAlertRuleV1() {
        return new AlertRuleV1();
    }

    /**
     * Create an instance of {@link Appendices }
     */
    public Appendices createAppendices() {
        return new Appendices();
    }

    /**
     * Create an instance of {@link ByRouteDepartureResponse }
     */
    public ByRouteDepartureResponse createByRouteDepartureResponse() {
        return new ByRouteDepartureResponse();
    }

    /**
     * Create an instance of {@link ByRouteArrival }
     */
    public ByRouteArrival createByRouteArrival() {
        return new ByRouteArrival();
    }

    /**
     * Create an instance of {@link GetByIdResponse }
     */
    public GetByIdResponse createGetByIdResponse() {
        return new GetByIdResponse();
    }

    /**
     * Create an instance of {@link AlertCapabilities }
     */
    public AlertCapabilities createAlertCapabilities() {
        return new AlertCapabilities();
    }

    /**
     * Create an instance of {@link ByDepartingFlight }
     */
    public ByDepartingFlight createByDepartingFlight() {
        return new ByDepartingFlight();
    }

    /**
     * Create an instance of {@link ByRouteArrivalResponse }
     */
    public ByRouteArrivalResponse createByRouteArrivalResponse() {
        return new ByRouteArrivalResponse();
    }

    /**
     * Create an instance of {@link AirportV1 }
     */
    public AirportV1 createAirportV1() {
        return new AirportV1();
    }

    /**
     * Create an instance of {@link ByDepartingFlightResponse }
     */
    public ByDepartingFlightResponse createByDepartingFlightResponse() {
        return new ByDepartingFlightResponse();
    }

    /**
     * Create an instance of {@link ByRouteDeparture }
     */
    public ByRouteDeparture createByRouteDeparture() {
        return new ByRouteDeparture();
    }

    /**
     * Create an instance of {@link ApiResponseError }
     */
    public ApiResponseError createApiResponseError() {
        return new ApiResponseError();
    }

    /**
     * Create an instance of {@link DeleteByIdResponse }
     */
    public DeleteByIdResponse createDeleteByIdResponse() {
        return new DeleteByIdResponse();
    }

    /**
     * Create an instance of {@link APIException }
     */
    public APIException createAPIException() {
        return new APIException();
    }

    /**
     * Create an instance of {@link GetById }
     */
    public GetById createGetById() {
        return new GetById();
    }

    /**
     * Create an instance of {@link ByArrivingFlight }
     */
    public ByArrivingFlight createByArrivingFlight() {
        return new ByArrivingFlight();
    }

    /**
     * Create an instance of {@link DeleteById }
     */
    public DeleteById createDeleteById() {
        return new DeleteById();
    }

    /**
     * Create an instance of {@link ByArrivingFlightResponse }
     */
    public ByArrivingFlightResponse createByArrivingFlightResponse() {
        return new ByArrivingFlightResponse();
    }

    /**
     * Create an instance of {@link AirlineV1 }
     */
    public AirlineV1 createAirlineV1() {
        return new AirlineV1();
    }

    /**
     * Create an instance of {@link RequestBase }
     */
    public RequestBase createRequestBase() {
        return new RequestBase();
    }

    /**
     * Create an instance of {@link RequestedAirportV1 }
     */
    public RequestedAirportV1 createRequestedAirportV1() {
        return new RequestedAirportV1();
    }

    /**
     * Create an instance of {@link RequestRoute }
     */
    public RequestRoute createRequestRoute() {
        return new RequestRoute();
    }

    /**
     * Create an instance of {@link RuleEventV1 }
     */
    public RuleEventV1 createRuleEventV1() {
        return new RuleEventV1();
    }

    /**
     * Create an instance of {@link ResponseRule }
     */
    public ResponseRule createResponseRule() {
        return new ResponseRule();
    }

    /**
     * Create an instance of {@link RequestRuleById }
     */
    public RequestRuleById createRequestRuleById() {
        return new RequestRuleById();
    }

    /**
     * Create an instance of {@link NameValueV1 }
     */
    public NameValueV1 createNameValueV1() {
        return new NameValueV1();
    }

    /**
     * Create an instance of {@link ResponseRuleById }
     */
    public ResponseRuleById createResponseRuleById() {
        return new ResponseRuleById();
    }

    /**
     * Create an instance of {@link RequestedDate }
     */
    public RequestedDate createRequestedDate() {
        return new RequestedDate();
    }

    /**
     * Create an instance of {@link RequestFlight }
     */
    public RequestFlight createRequestFlight() {
        return new RequestFlight();
    }

    /**
     * Create an instance of {@link RequestedEnum }
     */
    public RequestedEnum createRequestedEnum() {
        return new RequestedEnum();
    }

    /**
     * Create an instance of {@link RequestedString }
     */
    public RequestedString createRequestedString() {
        return new RequestedString();
    }

    /**
     * Create an instance of {@link ResponseRoute }
     */
    public ResponseRoute createResponseRoute() {
        return new ResponseRoute();
    }

    /**
     * Create an instance of {@link ResponseFlight }
     */
    public ResponseFlight createResponseFlight() {
        return new ResponseFlight();
    }

    /**
     * Create an instance of {@link AlertDeliveryV1 }
     */
    public AlertDeliveryV1 createAlertDeliveryV1() {
        return new AlertDeliveryV1();
    }

    /**
     * Create an instance of {@link RequestedAirlineV1 }
     */
    public RequestedAirlineV1 createRequestedAirlineV1() {
        return new RequestedAirlineV1();
    }

    /**
     * Create an instance of {@link com.flightstats.alerts.api.v1.RequestRuleCreate.Events }
     */
    public com.flightstats.alerts.api.v1.RequestRuleCreate.Events createRequestRuleCreateEvents() {
        return new com.flightstats.alerts.api.v1.RequestRuleCreate.Events();
    }

    /**
     * Create an instance of {@link com.flightstats.alerts.api.v1.RequestRuleCreate.NameValues }
     */
    public com.flightstats.alerts.api.v1.RequestRuleCreate.NameValues createRequestRuleCreateNameValues() {
        return new com.flightstats.alerts.api.v1.RequestRuleCreate.NameValues();
    }

    /**
     * Create an instance of {@link AlertRuleV1 .RuleEvents }
     */
    public AlertRuleV1.RuleEvents createAlertRuleV1RuleEvents() {
        return new AlertRuleV1.RuleEvents();
    }

    /**
     * Create an instance of {@link AlertRuleV1 .NameValues }
     */
    public AlertRuleV1.NameValues createAlertRuleV1NameValues() {
        return new AlertRuleV1.NameValues();
    }

    /**
     * Create an instance of {@link Appendices.Airlines }
     */
    public Appendices.Airlines createAppendicesAirlines() {
        return new Appendices.Airlines();
    }

    /**
     * Create an instance of {@link Appendices.Airports }
     */
    public Appendices.Airports createAppendicesAirports() {
        return new Appendices.Airports();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByDepartingFlight }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "byDepartingFlight")
    public JAXBElement<ByDepartingFlight> createByDepartingFlight(ByDepartingFlight value) {
        return new JAXBElement<ByDepartingFlight>(_ByDepartingFlight_QNAME, ByDepartingFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertCapabilities }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "alertCapabilities")
    public JAXBElement<AlertCapabilities> createAlertCapabilities(AlertCapabilities value) {
        return new JAXBElement<AlertCapabilities>(_AlertCapabilities_QNAME, AlertCapabilities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportV1 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "airport")
    public JAXBElement<AirportV1> createAirport(AirportV1 value) {
        return new JAXBElement<AirportV1>(_Airport_QNAME, AirportV1.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByRouteArrivalResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "byRouteArrivalResponse")
    public JAXBElement<ByRouteArrivalResponse> createByRouteArrivalResponse(ByRouteArrivalResponse value) {
        return new JAXBElement<ByRouteArrivalResponse>(_ByRouteArrivalResponse_QNAME, ByRouteArrivalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByRouteArrival }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "byRouteArrival")
    public JAXBElement<ByRouteArrival> createByRouteArrival(ByRouteArrival value) {
        return new JAXBElement<ByRouteArrival>(_ByRouteArrival_QNAME, ByRouteArrival.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByIdResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "getByIdResponse")
    public JAXBElement<GetByIdResponse> createGetByIdResponse(GetByIdResponse value) {
        return new JAXBElement<GetByIdResponse>(_GetByIdResponse_QNAME, GetByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByRouteDepartureResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "byRouteDepartureResponse")
    public JAXBElement<ByRouteDepartureResponse> createByRouteDepartureResponse(ByRouteDepartureResponse value) {
        return new JAXBElement<ByRouteDepartureResponse>(_ByRouteDepartureResponse_QNAME, ByRouteDepartureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "request")
    public JAXBElement<Object> createRequest(Object value) {
        return new JAXBElement<Object>(_Request_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Appendices }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "appendix")
    public JAXBElement<Appendices> createAppendix(Appendices value) {
        return new JAXBElement<Appendices>(_Appendix_QNAME, Appendices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByArrivingFlightResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "byArrivingFlightResponse")
    public JAXBElement<ByArrivingFlightResponse> createByArrivingFlightResponse(ByArrivingFlightResponse value) {
        return new JAXBElement<ByArrivingFlightResponse>(_ByArrivingFlightResponse_QNAME, ByArrivingFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByArrivingFlight }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "byArrivingFlight")
    public JAXBElement<ByArrivingFlight> createByArrivingFlight(ByArrivingFlight value) {
        return new JAXBElement<ByArrivingFlight>(_ByArrivingFlight_QNAME, ByArrivingFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteById }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "deleteById")
    public JAXBElement<DeleteById> createDeleteById(DeleteById value) {
        return new JAXBElement<DeleteById>(_DeleteById_QNAME, DeleteById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirlineV1 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "airline")
    public JAXBElement<AirlineV1> createAirline(AirlineV1 value) {
        return new JAXBElement<AirlineV1>(_Airline_QNAME, AirlineV1.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIException }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "APIException")
    public JAXBElement<APIException> createAPIException(APIException value) {
        return new JAXBElement<APIException>(_APIException_QNAME, APIException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiResponseError }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "apiResponseError")
    public JAXBElement<ApiResponseError> createApiResponseError(ApiResponseError value) {
        return new JAXBElement<ApiResponseError>(_ApiResponseError_QNAME, ApiResponseError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteByIdResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "deleteByIdResponse")
    public JAXBElement<DeleteByIdResponse> createDeleteByIdResponse(DeleteByIdResponse value) {
        return new JAXBElement<DeleteByIdResponse>(_DeleteByIdResponse_QNAME, DeleteByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByDepartingFlightResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "byDepartingFlightResponse")
    public JAXBElement<ByDepartingFlightResponse> createByDepartingFlightResponse(ByDepartingFlightResponse value) {
        return new JAXBElement<ByDepartingFlightResponse>(_ByDepartingFlightResponse_QNAME, ByDepartingFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByRouteDeparture }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "byRouteDeparture")
    public JAXBElement<ByRouteDeparture> createByRouteDeparture(ByRouteDeparture value) {
        return new JAXBElement<ByRouteDeparture>(_ByRouteDeparture_QNAME, ByRouteDeparture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "response")
    public JAXBElement<Object> createResponse(Object value) {
        return new JAXBElement<Object>(_Response_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetById }{@code >}}
     */
    @XmlElementDecl(namespace = "http://v1.api.alerts.flightstats.com/", name = "getById")
    public JAXBElement<GetById> createGetById(GetById value) {
        return new JAXBElement<GetById>(_GetById_QNAME, GetById.class, null, value);
    }

}
