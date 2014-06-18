package robotlib;
import lib.AuthenticationLibrary;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
//import org.junit.Assert;
import org.testng.Assert;
import property.PropertyInfo;
import org.wso2.carbon.statistics.stub.types.carbon.OperationStatistics;
import org.wso2.carbon.statistics.stub.types.axis2.context.ConfigurationContext;
import org.wso2.carbon.statistics.stub.types.carbon.ServiceStatistics;
import org.wso2.carbon.statistics.stub.StatisticsAdminStub;
import org.wso2.carbon.statistics.stub.types.carbon.SystemStatistics;


public class StatisticsAdminLibrary{
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	private StatisticsAdminStub stub;


	//Constructor		
	public StatisticsAdminLibrary(){

	}		

	public long getMinSystemResponseTime()  throws java.lang.Exception{

		this.getMinSystemResponseTime=stub.getMinSystemResponseTime();
		return stub.getMinSystemResponseTime();

	}

	private long getMinSystemResponseTime;

	public void  AssertgetMinSystemResponseTime(long expected) {	
		Assert.assertEquals(expected, getMinSystemResponseTime);		
	}
	public int getSystemFaultCount()  throws java.lang.Exception{

		this.getSystemFaultCount=stub.getSystemFaultCount();
		return stub.getSystemFaultCount();

	}

	private int getSystemFaultCount;

	public void  AssertgetSystemFaultCount(int expected) {	
		Assert.assertEquals(expected, getSystemFaultCount);		
	}
	public long getMaxSystemResponseTime()  throws java.lang.Exception{

		this.getMaxSystemResponseTime=stub.getMaxSystemResponseTime();
		return stub.getMaxSystemResponseTime();

	}

	private long getMaxSystemResponseTime;

	public void  AssertgetMaxSystemResponseTime(long expected) {	
		Assert.assertEquals(expected, getMaxSystemResponseTime);		
	}
	public int getServiceFaultCount(String arg)  throws java.lang.Exception{

		this.getServiceFaultCount=stub.getServiceFaultCount(arg);
		return stub.getServiceFaultCount(arg);

	}

	private int getServiceFaultCount;

	public void  AssertgetServiceFaultCount(int expected) {	
		Assert.assertEquals(expected, getServiceFaultCount);		
	}
	public long getMinServiceResponseTime(String arg)  throws java.lang.Exception{

		this.getMinServiceResponseTime=stub.getMinServiceResponseTime(arg);
		return stub.getMinServiceResponseTime(arg);

	}

	private long getMinServiceResponseTime;

	public void  AssertgetMinServiceResponseTime(long expected) {	
		Assert.assertEquals(expected, getMinServiceResponseTime);		
	}
	public long getMaxOperationResponseTime(String arg0,String arg)  throws java.lang.Exception{

		this.getMaxOperationResponseTime=stub.getMaxOperationResponseTime(arg0,arg);
		return stub.getMaxOperationResponseTime(arg0,arg);

	}

	private long getMaxOperationResponseTime;

	public void  AssertgetMaxOperationResponseTime(long expected) {	
		Assert.assertEquals(expected, getMaxOperationResponseTime);		
	}
	public ServiceStatistics getServiceStatistics(String arg)  throws java.lang.Exception{

		this.getServiceStatistics=stub.getServiceStatistics(arg);
		return stub.getServiceStatistics(arg);

	}

	private ServiceStatistics getServiceStatistics;

	public void  AssertgetServiceStatistics(ServiceStatistics expected) {	
		Assert.assertEquals(expected, getServiceStatistics);		
	}
	public int getOperationFaultCount(String arg0,String arg)  throws java.lang.Exception{

		this.getOperationFaultCount=stub.getOperationFaultCount(arg0,arg);
		return stub.getOperationFaultCount(arg0,arg);

	}

	private int getOperationFaultCount;

	public void  AssertgetOperationFaultCount(int expected) {	
		Assert.assertEquals(expected, getOperationFaultCount);		
	}
	public int getOperationRequestCount(String arg0,String arg)  throws java.lang.Exception{

		this.getOperationRequestCount=stub.getOperationRequestCount(arg0,arg);
		return stub.getOperationRequestCount(arg0,arg);

	}

	private int getOperationRequestCount;

	public void  AssertgetOperationRequestCount(int expected) {	
		Assert.assertEquals(expected, getOperationRequestCount);		
	}
	public int getServiceRequestCount(String arg)  throws java.lang.Exception{

		this.getServiceRequestCount=stub.getServiceRequestCount(arg);
		return stub.getServiceRequestCount(arg);

	}

	private int getServiceRequestCount;

	public void  AssertgetServiceRequestCount(int expected) {	
		Assert.assertEquals(expected, getServiceRequestCount);		
	}
	public int getSystemResponseCount()  throws java.lang.Exception{

		this.getSystemResponseCount=stub.getSystemResponseCount();
		return stub.getSystemResponseCount();

	}

	private int getSystemResponseCount;

	public void  AssertgetSystemResponseCount(int expected) {	
		Assert.assertEquals(expected, getSystemResponseCount);		
	}
	public int getOperationResponseCount(String arg0,String arg)  throws java.lang.Exception{

		this.getOperationResponseCount=stub.getOperationResponseCount(arg0,arg);
		return stub.getOperationResponseCount(arg0,arg);

	}

	private int getOperationResponseCount;

	public void  AssertgetOperationResponseCount(int expected) {	
		Assert.assertEquals(expected, getOperationResponseCount);		
	}
	public double getAvgOperationResponseTime(String arg0,String arg)  throws java.lang.Exception{

		this.getAvgOperationResponseTime=stub.getAvgOperationResponseTime(arg0,arg);
		return stub.getAvgOperationResponseTime(arg0,arg);

	}

	private double getAvgOperationResponseTime;

	public void  AssertgetAvgOperationResponseTime(double expected) {	
		Assert.assertEquals(expected, getAvgOperationResponseTime);		
	}
	public OperationStatistics getOperationStatistics(String arg0,String arg)  throws java.lang.Exception{

		this.getOperationStatistics=stub.getOperationStatistics(arg0,arg);
		return stub.getOperationStatistics(arg0,arg);

	}

	private OperationStatistics getOperationStatistics;

	public void  AssertgetOperationStatistics(OperationStatistics expected) {	
		Assert.assertEquals(expected, getOperationStatistics);		
	}
	public long getMaxServiceResponseTime(String arg)  throws java.lang.Exception{

		this.getMaxServiceResponseTime=stub.getMaxServiceResponseTime(arg);
		return stub.getMaxServiceResponseTime(arg);

	}

	private long getMaxServiceResponseTime;

	public void  AssertgetMaxServiceResponseTime(long expected) {	
		Assert.assertEquals(expected, getMaxServiceResponseTime);		
	}
	public double getAvgServiceResponseTime(String arg)  throws java.lang.Exception{

		this.getAvgServiceResponseTime=stub.getAvgServiceResponseTime(arg);
		return stub.getAvgServiceResponseTime(arg);

	}

	private double getAvgServiceResponseTime;

	public void  AssertgetAvgServiceResponseTime(double expected) {	
		Assert.assertEquals(expected, getAvgServiceResponseTime);		
	}
	public int getServiceResponseCount(String arg)  throws java.lang.Exception{

		this.getServiceResponseCount=stub.getServiceResponseCount(arg);
		return stub.getServiceResponseCount(arg);

	}

	private int getServiceResponseCount;

	public void  AssertgetServiceResponseCount(int expected) {	
		Assert.assertEquals(expected, getServiceResponseCount);		
	}
	public int getSystemRequestCount()  throws java.lang.Exception{

		this.getSystemRequestCount=stub.getSystemRequestCount();
		return stub.getSystemRequestCount();

	}

	private int getSystemRequestCount;

	public void  AssertgetSystemRequestCount(int expected) {	
		Assert.assertEquals(expected, getSystemRequestCount);		
	}
	public void setConfigurationContext(ConfigurationContext arg)  throws java.lang.Exception{

	 stub.setConfigurationContext(arg);

	}

	public long getMinOperationResponseTime(String arg0,String arg)  throws java.lang.Exception{

		this.getMinOperationResponseTime=stub.getMinOperationResponseTime(arg0,arg);
		return stub.getMinOperationResponseTime(arg0,arg);

	}

	private long getMinOperationResponseTime;

	public void  AssertgetMinOperationResponseTime(long expected) {	
		Assert.assertEquals(expected, getMinOperationResponseTime);		
	}
	public double getAvgSystemResponseTime()  throws java.lang.Exception{

		this.getAvgSystemResponseTime=stub.getAvgSystemResponseTime();
		return stub.getAvgSystemResponseTime();

	}

	private double getAvgSystemResponseTime;

	public void  AssertgetAvgSystemResponseTime(double expected) {	
		Assert.assertEquals(expected, getAvgSystemResponseTime);		
	}
	public SystemStatistics getSystemStatistics()  throws java.lang.Exception{

		this.getSystemStatistics=stub.getSystemStatistics();
		return stub.getSystemStatistics();

	}

	private SystemStatistics getSystemStatistics;

	public void  AssertgetSystemStatistics(SystemStatistics expected) {	
		Assert.assertEquals(expected, getSystemStatistics);		
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
		String host = PropertyInfo.read("host");
		String port = PropertyInfo.read("port");
		String backEndUrl = "https://" + host + ":" + port + "/services/";
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