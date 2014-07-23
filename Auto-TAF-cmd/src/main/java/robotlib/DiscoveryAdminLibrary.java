package robotlib;
import lib.AuthenticationLibrary;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
//import org.junit.Assert;
import org.testng.Assert;
import property.PropertyInfo;
import property.AutomationContext;
import org.wso2.carbon.discovery.admin.stub.types.mgt.TargetServiceDetails;
import org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdminStub;
import org.wso2.carbon.discovery.admin.stub.types.mgt.DiscoveryProxyDetails;
import org.wso2.carbon.discovery.admin.stub.types.mgt.ProbeDetails;
import org.wso2.carbon.discovery.admin.stub.types.mgt.ServiceDiscoveryConfig;


public class DiscoveryAdminLibrary{
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	private DiscoveryAdminStub stub;


	//Constructor		
	public DiscoveryAdminLibrary(){

	}		

	public DiscoveryProxyDetails getDiscoveryProxy(String arg)  throws java.lang.Exception{

		this.getDiscoveryProxy=stub.getDiscoveryProxy(arg);
		return this.getDiscoveryProxy;

	}

	private DiscoveryProxyDetails getDiscoveryProxy;

	public void  AssertgetDiscoveryProxy(DiscoveryProxyDetails expected) {	
		Assert.assertEquals(getDiscoveryProxy , expected );		
	}
	public void addDiscoveryProxy(DiscoveryProxyDetails arg)  throws java.lang.Exception{

	stub.addDiscoveryProxy(arg);

	}

	public ServiceDiscoveryConfig getServiceDiscoveryConfig()  throws java.lang.Exception{

		this.getServiceDiscoveryConfig=stub.getServiceDiscoveryConfig();
		return this.getServiceDiscoveryConfig;

	}

	private ServiceDiscoveryConfig getServiceDiscoveryConfig;

	public void  AssertgetServiceDiscoveryConfig(ServiceDiscoveryConfig expected) {	
		Assert.assertEquals(getServiceDiscoveryConfig , expected );		
	}
	public void removeDiscoveryProxy(String arg)  throws java.lang.Exception{

	stub.removeDiscoveryProxy(arg);

	}

	public DiscoveryProxyDetails[] getDiscoveryProxies()  throws java.lang.Exception{

		this.getDiscoveryProxies=stub.getDiscoveryProxies();
		return this.getDiscoveryProxies;

	}

	private DiscoveryProxyDetails[] getDiscoveryProxies;

	public void  AssertgetDiscoveryProxies(DiscoveryProxyDetails[] expected) {	
		Assert.assertEquals(getDiscoveryProxies , expected );		
	}
	public TargetServiceDetails[] probeDiscoveryProxy(String arg0,ProbeDetails arg)  throws java.lang.Exception{

		this.probeDiscoveryProxy=stub.probeDiscoveryProxy(arg0,arg);
		return this.probeDiscoveryProxy;

	}

	private TargetServiceDetails[] probeDiscoveryProxy;

	public void  AssertprobeDiscoveryProxy(TargetServiceDetails[] expected) {	
		Assert.assertEquals(probeDiscoveryProxy , expected );		
	}
	public void updateDiscoveryProxy(DiscoveryProxyDetails arg)  throws java.lang.Exception{

	stub.updateDiscoveryProxy(arg);

	}

	public TargetServiceDetails resolveTargetService(String arg0,String arg)  throws java.lang.Exception{

		this.resolveTargetService=stub.resolveTargetService(arg0,arg);
		return this.resolveTargetService;

	}

	private TargetServiceDetails resolveTargetService;

	public void  AssertresolveTargetService(TargetServiceDetails expected) {	
		Assert.assertEquals(resolveTargetService , expected );		
	}
	public void enableServiceDiscovery(String arg)  throws java.lang.Exception{

	stub.enableServiceDiscovery(arg);

	}

	public void disableServiceDiscovery(boolean arg)  throws java.lang.Exception{

	stub.disableServiceDiscovery(arg);

	}



	public static void main(String[] args) {
		//DiscoveryAdminLibrary l=new DiscoveryAdminLibrary();
		//l.setX(10);
		//l.setY(25);
		//System.out.println(l.getSum());
	}

	public void initDiscoveryAdmin() throws AxisFault {
		String sessionCookie=AuthenticationLibrary.sessionString;
		String serviceName = "DiscoveryAdmin";
		String endPoint;
		//String host = PropertyInfo.read("host");
		//String port = PropertyInfo.read("port");
		String host = AutomationContext.context(AutomationContext.PRODUCT_HOST);
		String port = AutomationContext.context(AutomationContext.PRODUCT_PORT);
		String backEndUrl = "https://" + host + ":" + port + "/services/";
		endPoint = backEndUrl + serviceName;//+ "/services/" 
		stub = new DiscoveryAdminStub(endPoint);
		// Authenticate Your stub from sessionCooke
		ServiceClient serviceClient;
		Options option;

		serviceClient = stub._getServiceClient();
		option = serviceClient.getOptions();
		option.setManageSession(true);
		option.setProperty(org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,sessionCookie);
	}

}