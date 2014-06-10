package robotlib;
import lib.AuthenticationLibrary;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.junit.Assert;

//import org.wso2.carbon.statistics.stub.webapp.StatisticData;
import org.wso2.carbon.statistics.stub.types.axis2.transaction.TransactionConfiguration;
import org.wso2.carbon.statistics.stub.types.axis2.threadpool.ThreadFactory;
import org.wso2.carbon.statistics.stub.types.axis2.util.TargetResolver;
import org.wso2.carbon.statistics.stub.types.other.Set;
import org.wso2.carbon.statistics.stub.types.other.Map;
import org.wso2.carbon.statistics.stub.types.other.Iterator;
import org.wso2.carbon.statistics.stub.types.axis2.clustering.NodeManager;
import org.wso2.carbon.statistics.stub.types.axis2.description.AxisOperation;
import org.wso2.carbon.statistics.stub.types.axis2.description.AxisService;
import org.wso2.carbon.statistics.stub.types.axis2.description.AxisServiceGroup;
import org.wso2.carbon.statistics.stub.types.axis2.context.ConfigurationContext;
import org.wso2.carbon.statistics.stub.types.axis2.deployment.PhasesInfo;
import org.wso2.carbon.statistics.stub.types.axis2.deployment.ExcludeInfo;
import org.wso2.carbon.statistics.stub.types.other.URL;
import org.wso2.carbon.statistics.stub.SystemStatisticsUtil;
import org.wso2.carbon.statistics.stub.SecretResolver;
import org.wso2.carbon.statistics.stub.types.axis2.engine.AxisConfiguration;
import org.wso2.carbon.statistics.stub.types.axis2.engine.AxisConfigurator;
import org.wso2.carbon.statistics.stub.types.axis2.engine.ObjectSupplier;
import org.wso2.carbon.statistics.stub.types.axis2.engine.ServiceLifeCycle;
import org.wso2.carbon.statistics.stub.types.axis2.engine.MessageReceiver;
import org.wso2.carbon.statistics.stub.types.axis2.engine.ListenerManager;
import org.wso2.carbon.statistics.stub.types.axis2.clustering.StateManager;
import org.wso2.carbon.statistics.stub.types.carbon.SystemStatistics;
import org.wso2.carbon.statistics.stub.types.carbon.Metric;
import org.wso2.carbon.statistics.stub.types.carbon.ServiceStatistics;
import org.wso2.carbon.statistics.stub.types.carbon.OperationStatistics;
import org.wso2.carbon.statistics.stub.types.axis2.clustering.ClusteringAgent;
import org.wso2.carbon.statistics.stub.types.axis2.description.TypeTable;
import org.wso2.carbon.statistics.stub.*;


public class StatisticsAdminLibrary{
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	private StatisticsAdminStub stub;


	private SystemStatistics getSystemStatistics;
	private long getMinOperationResponseTime;
	private int getOperationRequestCount;
	private long getMaxSystemResponseTime;
	private ServiceStatistics getServiceStatistics;
	private int getServiceFaultCount;
	private int getSystemRequestCount;
	private long getMinSystemResponseTime;
//	private StatisticData getWebappRelatedData;
	private long getMinServiceResponseTime;
	private double getAvgServiceResponseTime;
	private int getSystemResponseCount;
	private long getMaxOperationResponseTime;
	private double getAvgOperationResponseTime;
	private double getAvgSystemResponseTime;
	private long getMaxServiceResponseTime;
	private int getServiceResponseCount;
	private OperationStatistics getOperationStatistics;
	private int getServiceRequestCount;
	private int getSystemFaultCount;
	private int getOperationResponseCount;
	private int getOperationFaultCount;

	//Constructor		
	public StatisticsAdminLibrary(){

	}		

	public void  AssertgetSystemStatistics(SystemStatistics expected) {	
		Assert.assertEquals(expected, getSystemStatistics);		
	}
	public SystemStatistics getSystemStatistics()  throws java.lang.Exception{
		this.getSystemStatistics= stub.getSystemStatistics();
		return this.getSystemStatistics;
	}
	public void  AssertgetMinOperationResponseTime(long expected) {	
		Assert.assertEquals(expected, getMinOperationResponseTime);		
	}
	public long getMinOperationResponseTime(String serviceName,String operationName)  throws java.lang.Exception{
		this.getMinOperationResponseTime= stub.getMinOperationResponseTime(serviceName,operationName);
		return this.getMinOperationResponseTime;
	}
	public void  AssertgetOperationRequestCount(int expected) {	
		Assert.assertEquals(expected, getOperationRequestCount);		
	}
	public int getOperationRequestCount(String serviceName,String operationName)  throws java.lang.Exception{
		this.getOperationRequestCount= stub.getOperationRequestCount(serviceName,operationName);
		return this.getOperationRequestCount;
	}
	public void  AssertgetMaxSystemResponseTime(long expected) {	
		Assert.assertEquals(expected, getMaxSystemResponseTime);		
	}
	public long getMaxSystemResponseTime()  throws java.lang.Exception{
		this.getMaxSystemResponseTime= stub.getMaxSystemResponseTime();
		return this.getMaxSystemResponseTime;
	}
	public void  AssertgetServiceStatistics(ServiceStatistics expected) {	
		Assert.assertEquals(expected, getServiceStatistics);		
	}
	public ServiceStatistics getServiceStatistics(String serviceName)  throws java.lang.Exception{
		this.getServiceStatistics= stub.getServiceStatistics(serviceName);
		return this.getServiceStatistics;
	}
	public void  AssertgetServiceFaultCount(int expected) {	
		Assert.assertEquals(expected, getServiceFaultCount);		
	}
	public int getServiceFaultCount(String serviceName)  throws java.lang.Exception{
		this.getServiceFaultCount= stub.getServiceFaultCount(serviceName);
		return this.getServiceFaultCount;
	}
	public void  AssertgetSystemRequestCount(int expected) {	
		Assert.assertEquals(expected, getSystemRequestCount);		
	}
	public int getSystemRequestCount()  throws java.lang.Exception{
		this.getSystemRequestCount= stub.getSystemRequestCount();
		return this.getSystemRequestCount;
	}
	public void  AssertgetMinSystemResponseTime(long expected) {	
		Assert.assertEquals(expected, getMinSystemResponseTime);		
	}
	public long getMinSystemResponseTime()  throws java.lang.Exception{
		this.getMinSystemResponseTime= stub.getMinSystemResponseTime();
		return this.getMinSystemResponseTime;
	}
//	public void  AssertgetWebappRelatedData(StatisticData expected) {	
//		Assert.assertEquals(expected, getWebappRelatedData);		
//	}
//	public StatisticData getWebappRelatedData(String webAppName)  throws java.lang.Exception{
//		this.getWebappRelatedData= stub.getWebappRelatedData(webAppName);
//		return this.getWebappRelatedData;
//	}
	public void  AssertgetMinServiceResponseTime(long expected) {	
		Assert.assertEquals(expected, getMinServiceResponseTime);		
	}
	public long getMinServiceResponseTime(String serviceName)  throws java.lang.Exception{
		this.getMinServiceResponseTime= stub.getMinServiceResponseTime(serviceName);
		return this.getMinServiceResponseTime;
	}
	public void  AssertgetAvgServiceResponseTime(double expected) {	
		Assert.assertEquals(expected, getAvgServiceResponseTime);		
	}
	public double getAvgServiceResponseTime(String serviceName)  throws java.lang.Exception{
		this.getAvgServiceResponseTime= stub.getAvgServiceResponseTime(serviceName);
		return this.getAvgServiceResponseTime;
	}
	public void  AssertgetSystemResponseCount(int expected) {	
		Assert.assertEquals(expected, getSystemResponseCount);		
	}
	public int getSystemResponseCount()  throws java.lang.Exception{
		this.getSystemResponseCount= stub.getSystemResponseCount();
		return this.getSystemResponseCount;
	}
	public void  AssertgetMaxOperationResponseTime(long expected) {	
		Assert.assertEquals(expected, getMaxOperationResponseTime);		
	}
	public long getMaxOperationResponseTime(String serviceName,String operationName)  throws java.lang.Exception{
		this.getMaxOperationResponseTime= stub.getMaxOperationResponseTime(serviceName,operationName);
		return this.getMaxOperationResponseTime;
	}
	public void  AssertgetAvgOperationResponseTime(double expected) {	
		Assert.assertEquals(expected, getAvgOperationResponseTime);		
	}
	public double getAvgOperationResponseTime(String serviceName,String operationName)  throws java.lang.Exception{
		this.getAvgOperationResponseTime= stub.getAvgOperationResponseTime(serviceName,operationName);
		return this.getAvgOperationResponseTime;
	}
	public void  AssertgetAvgSystemResponseTime(double expected) {	
		Assert.assertEquals(expected, getAvgSystemResponseTime);		
	}
	public double getAvgSystemResponseTime()  throws java.lang.Exception{
		this.getAvgSystemResponseTime= stub.getAvgSystemResponseTime();
		return this.getAvgSystemResponseTime;
	}
	public void  AssertgetMaxServiceResponseTime(long expected) {	
		Assert.assertEquals(expected, getMaxServiceResponseTime);		
	}
	public long getMaxServiceResponseTime(String serviceName)  throws java.lang.Exception{
		this.getMaxServiceResponseTime= stub.getMaxServiceResponseTime(serviceName);
		return this.getMaxServiceResponseTime;
	}
	public void  AssertgetServiceResponseCount(int expected) {	
		Assert.assertEquals(expected, getServiceResponseCount);		
	}
	public int getServiceResponseCount(String serviceName)  throws java.lang.Exception{
		this.getServiceResponseCount= stub.getServiceResponseCount(serviceName);
		return this.getServiceResponseCount;
	}
	public void  AssertgetOperationStatistics(OperationStatistics expected) {	
		Assert.assertEquals(expected, getOperationStatistics);		
	}
	public OperationStatistics getOperationStatistics(String serviceName,String operationName)  throws java.lang.Exception{
		this.getOperationStatistics= stub.getOperationStatistics(serviceName,operationName);
		return this.getOperationStatistics;
	}
	public void setConfigurationContext(ConfigurationContext configurationContext)  throws java.lang.Exception{
		 stub.setConfigurationContext(configurationContext);
	}
	public void  AssertgetServiceRequestCount(int expected) {	
		Assert.assertEquals(expected, getServiceRequestCount);		
	}
	public int getServiceRequestCount(String serviceName)  throws java.lang.Exception{
		this.getServiceRequestCount= stub.getServiceRequestCount(serviceName);
		return this.getServiceRequestCount;
	}
	public void  AssertgetSystemFaultCount(int expected) {	
		Assert.assertEquals(expected, getSystemFaultCount);		
	}
	public int getSystemFaultCount()  throws java.lang.Exception{
		this.getSystemFaultCount= stub.getSystemFaultCount();
		return this.getSystemFaultCount;
	}
	public void  AssertgetOperationResponseCount(int expected) {	
		Assert.assertEquals(expected, getOperationResponseCount);		
	}
	public int getOperationResponseCount(String serviceName,String operationName)  throws java.lang.Exception{
		this.getOperationResponseCount= stub.getOperationResponseCount(serviceName,operationName);
		return this.getOperationResponseCount;
	}
	public void  AssertgetOperationFaultCount(int expected) {	
		Assert.assertEquals(expected, getOperationFaultCount);		
	}
	public int getOperationFaultCount(String serviceName,String operationName)  throws java.lang.Exception{
		this.getOperationFaultCount= stub.getOperationFaultCount(serviceName,operationName);
		return this.getOperationFaultCount;
	}


	public static void main(String[] args) {
		//StatisticsAdminLibrary l=new StatisticsAdminLibrary();
		//l.setX(10);
		//l.setY(25);
		//System.out.println(l.getSum());
	}

	public void initStatisticsAdmin() throws AxisFault {
		String sessionCookie=AuthenticationLibrary.sessionString;
		String serviceName = "StatisticsAdmin";
		String endPoint;
		String backEndUrl = "https://localhost:9443/services/";
		endPoint = backEndUrl + "/services/" + serviceName;
		stub = new StatisticsAdminStub(endPoint);
		// Authenticate Your stub from sessionCooke
		ServiceClient serviceClient;
		Options option;

		serviceClient = stub._getServiceClient();
		option = serviceClient.getOptions();
		option.setManageSession(true);
		option.setProperty(org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,sessionCookie);
	}

}