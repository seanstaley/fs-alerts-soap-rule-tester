import com.flightstats.alerts.api.v1.FlightAlertsService;
import com.flightstats.alerts.api.v1.FlightAlertsV1SoapService;
import com.flightstats.alerts.api.v1.ResponseFlight;

public class Main {

    private static final String APPLICATION_ID = "";
    private static final String APPLICATION_KEY = "";

    private static final String CARRIER = "AA";
    private static final String FLIGHT_NUMBER = "100";
    private static final String DEPARTURE_AIRPORT = "JFK";
    private static final int YEAR = 2017;
    private static final int MONTH = 5;
    private static final int DAY = 19;
    private static final String SOAP_TESTER = "SOAP Tester";
    private static final String FS_TESTING_SOAP_TESTER = "FS Testing SOAP tester";
    private static final String TYPE = "XML";
    private static final String DELIVER_TO = "http://doesnotgoanywhere/";
    private static final String EVENTS = "dep,arr,div,can,preDep240,preDep60,bag240";
    private static final String CODE_TYPE = "FS";
    private static final String EXTENDED_OPTIONS = "testRun";

    public static void main(String[] args) {
        final Metrics metrics = new Metrics();
        while (true) {
            try {
                makeSoapCall();
                metrics.recordSuccess();
            } catch (Exception e) {
                e.printStackTrace();
                metrics.recordFailure();
            }

            System.out.println("Current Error Rate: " + metrics.errorRate());
            System.out.println("Total number of runs: " + metrics.totalRuns());
        }
    }

    private static void makeSoapCall() throws Exception {
        FlightAlertsV1SoapService service = new FlightAlertsV1SoapService();
        FlightAlertsService flightAlertsService = service.getFlightAlertsServicePort();
        ResponseFlight responseFlight = flightAlertsService.byDepartingFlight(APPLICATION_ID, APPLICATION_KEY,
                CARRIER, FLIGHT_NUMBER,
                DEPARTURE_AIRPORT,
                YEAR, MONTH, DAY,
                SOAP_TESTER, FS_TESTING_SOAP_TESTER, TYPE,
                DELIVER_TO, EVENTS,
                null, CODE_TYPE, EXTENDED_OPTIONS);
        if (failure(responseFlight)) {
            throw new Exception("Got an error!");
        } else {
            System.out.println("Would have generated Rule: " + responseFlight.getRule().getId());
        }
    }

    private static boolean failure(ResponseFlight responseFlight) {
        if (responseFlight.getError() != null) {
            System.out.println("HTTP " + responseFlight.getError().getErrorCode() + ": " + responseFlight.getError().getErrorMessage());
            return true;
        }

        return false;
    }

    private static class Metrics {

        private int totalSuccesses = 0;
        private int totalFailures = 0;

        void recordSuccess() {
            this.totalSuccesses++;
        }

        void recordFailure() {
            this.totalFailures++;
        }

        double errorRate() {
            return totalFailures / (totalRuns() * 1.0);
        }

        int totalRuns() {
            return this.totalSuccesses + this.totalFailures;
        }
    }
}
