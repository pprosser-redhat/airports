package operators;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.5.redhat-00001
 * 2019-02-28T16:42:47.363Z
 * Generated source version: 3.2.5.redhat-00001
 *
 */
@WebServiceClient(name = "OperatorsServiceService",
                  wsdlLocation = "file:/Users/pprosser/git/airports/airports/src/main/resources/airports.wsdl",
                  targetNamespace = "http://operators/")
public class OperatorsServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://operators/", "OperatorsServiceService");
    public final static QName OperatorsServicePort = new QName("http://operators/", "OperatorsServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/pprosser/git/airports/airports/src/main/resources/airports.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OperatorsServiceService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/pprosser/git/airports/airports/src/main/resources/airports.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OperatorsServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OperatorsServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OperatorsServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public OperatorsServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public OperatorsServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public OperatorsServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns OperatorsService
     */
    @WebEndpoint(name = "OperatorsServicePort")
    public OperatorsService getOperatorsServicePort() {
        return super.getPort(OperatorsServicePort, OperatorsService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OperatorsService
     */
    @WebEndpoint(name = "OperatorsServicePort")
    public OperatorsService getOperatorsServicePort(WebServiceFeature... features) {
        return super.getPort(OperatorsServicePort, OperatorsService.class, features);
    }

}