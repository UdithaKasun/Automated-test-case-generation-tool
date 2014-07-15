package lib;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.log4j.Logger;
//import org.junit.Assert;
import org.testng.Assert;

import property.AutomationContext;
import property.PropertyInfo;

import org.wso2.carbon.proxyadmin.stub.ProxyServiceAdminStub;
import org.wso2.carbon.proxyadmin.stub.types.carbon.MetaData;
import org.wso2.carbon.proxyadmin.stub.types.carbon.ProxyData;

public class ProxyServiceAdminLibrary {
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";
	static final Logger logger = Logger.getLogger(ProxyServiceAdminLibrary.class);
	
	private ProxyServiceAdminStub stub;

	// Constructor
	public ProxyServiceAdminLibrary() {

	}

	public String[] getAvailableEndpoints() throws java.lang.Exception {

		this.getAvailableEndpoints = stub.getAvailableEndpoints();
		return this.getAvailableEndpoints;

	}

	private String[] getAvailableEndpoints;

	public void AssertgetAvailableEndpoints(String[] expected) {
		Assert.assertEquals(getAvailableEndpoints, expected);
	}

	public String getEndpoint(String arg) throws java.lang.Exception {

		this.getEndpoint = stub.getEndpoint(arg);
		return this.getEndpoint;

	}

	private String getEndpoint;

	public void AssertgetEndpoint(String expected) {
		Assert.assertEquals(getEndpoint, expected);
	}

	public String modifyProxy(ProxyData arg) throws java.lang.Exception {

		this.modifyProxy = stub.modifyProxy(arg);
		return this.modifyProxy;

	}

	private String modifyProxy;

	public void AssertmodifyProxy(String expected) {
		Assert.assertEquals(modifyProxy, expected);
	}

	public String disableTracing(String arg) throws java.lang.Exception {

		this.disableTracing = stub.disableTracing(arg);
		return this.disableTracing;

	}

	private String disableTracing;

	public void AssertdisableTracing(String expected) {
		Assert.assertEquals(disableTracing, expected);
	}

	public String redeployProxyService(String arg) throws java.lang.Exception {

		this.redeployProxyService = stub.redeployProxyService(arg);
		return this.redeployProxyService;

	}

	private String redeployProxyService;

	public void AssertredeployProxyService(String expected) {
		Assert.assertEquals(redeployProxyService, expected);
	}

	public String[] getAvailableTransports() throws java.lang.Exception {

		this.getAvailableTransports = stub.getAvailableTransports();
		return this.getAvailableTransports;

	}

	private String[] getAvailableTransports;

	public void AssertgetAvailableTransports(String[] expected) {
		Assert.assertEquals(getAvailableTransports, expected);
	}

	public String startProxyService(String arg) throws java.lang.Exception {

		this.startProxyService = stub.startProxyService(arg);
		return this.startProxyService;

	}

	private String startProxyService;

	public void AssertstartProxyService(String expected) {
		Assert.assertEquals(startProxyService, expected);
	}

	public MetaData getMetaData() throws java.lang.Exception {

		this.getMetaData = stub.getMetaData();
		return this.getMetaData;

	}

	private MetaData getMetaData;

	public void AssertgetMetaData(MetaData expected) {
		Assert.assertEquals(getMetaData, expected);
	}

	public String enableTracing(String arg) throws java.lang.Exception {

		this.enableTracing = stub.enableTracing(arg);
		return this.enableTracing;

	}

	private String enableTracing;

	public void AssertenableTracing(String expected) {
		Assert.assertEquals(enableTracing, expected);
	}

	public String getSourceView(ProxyData arg) throws java.lang.Exception {

		this.getSourceView = stub.getSourceView(arg);
		return this.getSourceView;

	}

	private String getSourceView;

	public void AssertgetSourceView(String expected) {
		Assert.assertEquals(getSourceView, expected);
	}

	public String stopProxyService(String arg) throws java.lang.Exception {

		this.stopProxyService = stub.stopProxyService(arg);
		return this.stopProxyService;

	}

	private String stopProxyService;

	public void AssertstopProxyService(String expected) {
		Assert.assertEquals(stopProxyService, expected);
	}

	public String enableStatistics(String arg) throws java.lang.Exception {

		this.enableStatistics = stub.enableStatistics(arg);
		return this.enableStatistics;

	}

	private String enableStatistics;

	public void AssertenableStatistics(String expected) {
		Assert.assertEquals(enableStatistics, expected);
	}

	public String[] getAvailableSequences() throws java.lang.Exception {

		this.getAvailableSequences = stub.getAvailableSequences();
		return this.getAvailableSequences;

	}

	private String[] getAvailableSequences;

	public void AssertgetAvailableSequences(String[] expected) {
		Assert.assertEquals(getAvailableSequences, expected);
	}

	public String deleteProxyService(String arg) throws java.lang.Exception {

		this.deleteProxyService = stub.deleteProxyService(arg);
		return this.deleteProxyService;

	}

	private String deleteProxyService;

	public void AssertdeleteProxyService(String expected) {
		Assert.assertEquals(deleteProxyService, expected);
	}

	public String disableStatistics(String arg) throws java.lang.Exception {

		this.disableStatistics = stub.disableStatistics(arg);
		return this.disableStatistics;

	}

	private String disableStatistics;

	public void AssertdisableStatistics(String expected) {
		Assert.assertEquals(disableStatistics, expected);
	}

	public String addProxy(String proxyName, String serviceEndPoint)
			throws java.lang.Exception {
		this.addProxy = null;
		try {
			String wsdlURI = serviceEndPoint;
			ProxyData arg = createProxyData(proxyName, wsdlURI, serviceEndPoint);
			this.addProxy = stub.addProxy(arg);
			logger.debug("INFO: add Proxy, ");
			return this.addProxy;			
		} catch (Exception e) {
			this.addProxy = "unsuccessful";
			logger.debug("INFO: add Proxy, "+e.getMessage());
			return "unsuccessful ";
		}

	}

	private String addProxy;

	public void AssertaddProxy(String expected) {
		Assert.assertEquals(addProxy, expected);
	}

	public ProxyData getProxy(String arg) throws java.lang.Exception {

		this.getProxy = stub.getProxy(arg);
		return this.getProxy;

	}

	private ProxyData getProxy;

	public void AssertgetProxy(ProxyData expected) {
		Assert.assertEquals(getProxy, expected);
	}

	public static void main(String[] args) {
		// ProxyServiceAdminLibrary l=new ProxyServiceAdminLibrary();
		// l.setX(10);
		// l.setY(25);
		// System.out.println(l.getSum());
	}

	public void initProxyServiceAdmin() throws AxisFault {
		String sessionCookie = AuthenticationLibrary.sessionString;
		String serviceName = "ProxyServiceAdmin";
		String endPoint;
		String host = AutomationContext.context(AutomationContext.PRODUCT_HOST);
		String port = AutomationContext.context(AutomationContext.PRODUCT_PORT);
		logger.debug("INFO: "+host+" "+port);
		String backEndUrl = "https://" + host + ":" + port + "/services/";
		endPoint = backEndUrl + serviceName;
		stub = new ProxyServiceAdminStub(endPoint);
		// Authenticate Your stub from sessionCooke
		ServiceClient serviceClient;
		Options option;

		serviceClient = stub._getServiceClient();
		option = serviceClient.getOptions();
		option.setManageSession(true);
		option.setProperty(
				org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,
				sessionCookie);
	}

	public ProxyData createProxyData(String name, String wsdlURI,
			String serviceEndPoint) {
		String[] transport = { "http", "https" };
		ProxyData data = new ProxyData();
		data.setName(name);
		data.setWsdlURI(wsdlURI);
		data.setTransports(transport);
		data.setStartOnLoad(true);
		// String serviceEndPoint = "https://localhost:8243/services";
		data.setEndpointXML("<endpoint xmlns=\"http://ws.apache.org/ns/synapse\"><address uri=\""
				+ serviceEndPoint + "\" /></endpoint>");
		data.setEnableSecurity(true);
		return data;
	}

}