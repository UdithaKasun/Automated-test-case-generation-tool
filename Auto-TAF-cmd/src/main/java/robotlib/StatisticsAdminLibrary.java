package robotlib;
import lib.AuthenticationLibrary;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
//import org.junit.Assert;
import org.testng.Assert;
import property.PropertyInfo;
import property.AutomationContext;
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

	public int getServiceRequestCount(String arg)  throws java.lang.Exception{

		this.getServiceRequestCount=stub.getServiceRequestCount(arg);
		return this.getServiceRequestCount;

	}

	private int getServiceRequestCount;

	public void  AssertgetServiceRequestCount(int expected) {	
		Assert.assertEquals(getServiceRequestCount , expected );		
	}
	public int getSystemResponseCount()  throws java.lang.Exception{

		this.getSystemResponseCount=stub.getSystemResponseCount();
		return this.getSystemResponseCount;

	}

	private int getSystemResponseCount;

	public void  AssertgetSystemResponseCount(int expected) {	
		Assert.assertEquals(getSystemResponseCount , expected );		
	}
	public int getOperationResponseCount(String arg0,String arg)  throws java.lang.Exception{

		this.getOperationResponseCount=stub.getOperationResponseCount(arg0,arg);
		return this.getOperationResponseCount;

	}

	private int getOperationResponseCount;

	public void  AssertgetOperationResponseCount(int expected) {	
		Assert.assertEquals(getOperationResponseCount , expected );		
	}
	public double getAvgOperationResponseTime(String arg0,String arg)  throws java.lang.Exception{

		this.getAvgOperationResponseTime=stub.getAvgOperationResponseTime(arg0,arg);
		return this.getAvgOperationResponseTime;

	}

	private double getAvgOperationResponseTime;

	public void  AssertgetAvgOperationResponseTime(double expected) {	
		Assert.assertEquals(getAvgOperationResponseTime , expected );		
	}
	public OperationStatistics getOperationStatistics(String arg0,String arg)  throws java.lang.Exception{

		this.getOperationStatistics=stub.getOperationStatistics(arg0,arg);
		return this.getOperationStatistics;

	}

	private OperationStatistics getOperationStatistics;

	public void  AssertgetOperationStatistics(OperationStatistics expected) {	
		Assert.assertEquals(getOperationStatistics , expected );		
	}
	public long getMinSystemResponseTime()  throws java.lang.Exception{

		this.getMinSystemResponseTime=stub.getMinSystemResponseTime();
		return this.getMinSystemResponseTime;

	}

	private long getMinSystemResponseTime;

	public void  AssertgetMinSystemResponseTime(long expected) {	
		Assert.assertEquals(getMinSystemResponseTime , expected );		
	}
	public int getSystemFaultCount()  throws java.lang.Exception{

		this.getSystemFaultCount=stub.getSystemFaultCount();
		return this.getSystemFaultCount;

	}

	private int getSystemFaultCount;

	public void  AssertgetSystemFaultCount(int expected) {	
		Assert.assertEquals(getSystemFaultCount , expected );		
	}
	public long getMaxSystemResponseTime()  throws java.lang.Exception{

		this.getMaxSystemResponseTime=stub.getMaxSystemResponseTime();
		return this.getMaxSystemResponseTime;

	}

	private long getMaxSystemResponseTime;

	public void  AssertgetMaxSystemResponseTime(long expected) {	
		Assert.assertEquals(getMaxSystemResponseTime , expected );		
	}
	public int getServiceFaultCount(String arg)  throws java.lang.Exception{

		this.getServiceFaultCount=stub.getServiceFaultCount(arg);
		return this.getServiceFaultCount;

	}

	private int getServiceFaultCount;

	public void  AssertgetServiceFaultCount(int expected) {	
		Assert.assertEquals(getServiceFaultCount , expected );		
	}
	public long getMinServiceResponseTime(String arg)  throws java.lang.Exception{

		this.getMinServiceResponseTime=stub.getMinServiceResponseTime(arg);
		return this.getMinServiceResponseTime;

	}

	private long getMinServiceResponseTime;

	public void  AssertgetMinServiceResponseTime(long expected) {	
		Assert.assertEquals(getMinServiceResponseTime , expected );		
	}
	public long getMaxOperationResponseTime(String arg0,String arg)  throws java.lang.Exception{

		this.getMaxOperationResponseTime=stub.getMaxOperationResponseTime(arg0,arg);
		return this.getMaxOperationResponseTime;

	}

	private long getMaxOperationResponseTime;

	public void  AssertgetMaxOperationResponseTime(long expected) {	
		Assert.assertEquals(getMaxOperationResponseTime , expected );		
	}
	public ServiceStatistics getServiceStatistics(String arg)  throws java.lang.Exception{

		this.getServiceStatistics=stub.getServiceStatistics(arg);
		return this.getServiceStatistics;

	}

	private ServiceStatistics getServiceStatistics;

	public void  AssertgetServiceStatistics(ServiceStatistics expected) {	
		Assert.assertEquals(getServiceStatistics , expected );		
	}
	public int getOperationFaultCount(String arg0,String arg)  throws java.lang.Exception{

		this.getOperationFaultCount=stub.getOperationFaultCount(arg0,arg);
		return this.getOperationFaultCount;

	}

	private int getOperationFaultCount;

	public void  AssertgetOperationFaultCount(int expected) {	
		Assert.assertEquals(getOperationFaultCount , expected );		
	}
	public double getAvgServiceResponseTime(String arg)  throws java.lang.Exception{

		this.getAvgServiceResponseTime=stub.getAvgServiceResponseTime(arg);
		return this.getAvgServiceResponseTime;

	}

	private double getAvgServiceResponseTime;

	public void  AssertgetAvgServiceResponseTime(double expected) {	
		Assert.assertEquals(getAvgServiceResponseTime , expected );		
	}
	public int getServiceResponseCount(String arg)  throws java.lang.Exception{

		this.getServiceResponseCount=stub.getServiceResponseCount(arg);
		return this.getServiceResponseCount;

	}

	private int getServiceResponseCount;

	public void  AssertgetServiceResponseCount(int expected) {	
		Assert.assertEquals(getServiceResponseCount , expected );		
	}
	public int getSystemRequestCount()  throws java.lang.Exception{

		this.getSystemRequestCount=stub.getSystemRequestCount();
		return this.getSystemRequestCount;

	}

	private int getSystemRequestCount;

	public void  AssertgetSystemRequestCount(int expected) {	
		Assert.assertEquals(getSystemRequestCount , expected );		
	}
	public void setConfigurationContext(ConfigurationContext arg)  throws java.lang.Exception{

	stub.setConfigurationContext(arg);

	}

	public long getMinOperationResponseTime(String arg0,String arg)  throws java.lang.Exception{

		this.getMinOperationResponseTime=stub.getMinOperationResponseTime(arg0,arg);
		return this.getMinOperationResponseTime;

	}

	private long getMinOperationResponseTime;

	public void  AssertgetMinOperationResponseTime(long expected) {	
		Assert.assertEquals(getMinOperationResponseTime , expected );		
	}
	public double getAvgSystemResponseTime()  throws java.lang.Exception{

		this.getAvgSystemResponseTime=stub.getAvgSystemResponseTime();
		return this.getAvgSystemResponseTime;

	}

	private double getAvgSystemResponseTime;

	public void  AssertgetAvgSystemResponseTime(double expected) {	
		Assert.assertEquals(getAvgSystemResponseTime , expected );		
	}
	public SystemStatistics getSystemStatistics()  throws java.lang.Exception{

		this.getSystemStatistics=stub.getSystemStatistics();
		return this.getSystemStatistics;

	}

	private SystemStatistics getSystemStatistics;

	public void  AssertgetSystemStatistics(SystemStatistics expected) {	
		Assert.assertEquals(getSystemStatistics , expected );		
	}
	public int getOperationRequestCount(String arg0,String arg)  throws java.lang.Exception{

		this.getOperationRequestCount=stub.getOperationRequestCount(arg0,arg);
		return this.getOperationRequestCount;

	}

	private int getOperationRequestCount;

	public void  AssertgetOperationRequestCount(int expected) {	
		Assert.assertEquals(getOperationRequestCount , expected );		
	}
	public long getMaxServiceResponseTime(String arg)  throws java.lang.Exception{

		this.getMaxServiceResponseTime=stub.getMaxServiceResponseTime(arg);
		return this.getMaxServiceResponseTime;

	}

	private long getMaxServiceResponseTime;

	public void  AssertgetMaxServiceResponseTime(long expected) {	
		Assert.assertEquals(getMaxServiceResponseTime , expected );		
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
		//String host = PropertyInfo.read("host");
		//String port = PropertyInfo.read("port");
		String host = AutomationContext.context(AutomationContext.PRODUCT_HOST);
		String port = AutomationContext.context(AutomationContext.PRODUCT_PORT);
		String backEndUrl = "https://" + host + ":" + port + "/services/";
		endPoint = backEndUrl + serviceName;//+ "/services/" 
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