package robotlib;
import lib.AuthenticationLibrary;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.testng.Assert;
import org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdminStub;
import org.wso2.carbon.discovery.admin.stub.types.mgt.DiscoveryProxyDetails;
import org.wso2.carbon.discovery.admin.stub.types.mgt.ProbeDetails;
import org.wso2.carbon.discovery.admin.stub.types.mgt.ServiceDiscoveryConfig;
import org.wso2.carbon.discovery.admin.stub.types.mgt.TargetServiceDetails;


public class DiscoveryAdminLibrary{
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	private DiscoveryAdminStub stub;


	private TargetServiceDetails[] probeDiscoveryProxy;
	private DiscoveryProxyDetails[] getDiscoveryProxies;
	private ServiceDiscoveryConfig getServiceDiscoveryConfig;
	private TargetServiceDetails resolveTargetService;
	private DiscoveryProxyDetails getDiscoveryProxy;

	//Constructor		
	public DiscoveryAdminLibrary(){

	}		

	public void  AssertprobeDiscoveryProxy(TargetServiceDetails[] expected) {	
		Assert.assertEquals(expected, probeDiscoveryProxy);		
	}
	public TargetServiceDetails[] probeDiscoveryProxy(String name,ProbeDetails probe)  throws java.lang.Exception{
		this.probeDiscoveryProxy= stub.probeDiscoveryProxy(name,probe);
		return this.probeDiscoveryProxy;
	}
	public void removeDiscoveryProxy(String name)  throws java.lang.Exception{
		 stub.removeDiscoveryProxy(name);
	}
	public void  AssertgetDiscoveryProxies(DiscoveryProxyDetails[] expected) {	
		Assert.assertEquals(expected, getDiscoveryProxies);		
	}
	public DiscoveryProxyDetails[] getDiscoveryProxies()  throws java.lang.Exception{
		this.getDiscoveryProxies= stub.getDiscoveryProxies();
		return this.getDiscoveryProxies;
	}
	public void  AssertgetServiceDiscoveryConfig(ServiceDiscoveryConfig expected) {	
		Assert.assertEquals(expected, getServiceDiscoveryConfig);		
	}
	public ServiceDiscoveryConfig getServiceDiscoveryConfig()  throws java.lang.Exception{
		this.getServiceDiscoveryConfig= stub.getServiceDiscoveryConfig();
		return this.getServiceDiscoveryConfig;
	}
	public void disableServiceDiscovery(boolean sendBye)  throws java.lang.Exception{
		 stub.disableServiceDiscovery(sendBye);
	}
	public void updateDiscoveryProxy(DiscoveryProxyDetails pd)  throws java.lang.Exception{
		 stub.updateDiscoveryProxy(pd);
	}
	public void  AssertresolveTargetService(TargetServiceDetails expected) {	
		Assert.assertEquals(expected, resolveTargetService);		
	}
	public TargetServiceDetails resolveTargetService(String name,String serviceId)  throws java.lang.Exception{
		this.resolveTargetService= stub.resolveTargetService(name,serviceId);
		return this.resolveTargetService;
	}
	public void addDiscoveryProxy(DiscoveryProxyDetails pd)  throws java.lang.Exception{
		 stub.addDiscoveryProxy(pd);
	}
	public void enableServiceDiscovery(String proxyURL)  throws java.lang.Exception{
		 stub.enableServiceDiscovery(proxyURL);
	}
	public void  AssertgetDiscoveryProxy(DiscoveryProxyDetails expected) {	
		Assert.assertEquals(expected, getDiscoveryProxy);		
	}
	public DiscoveryProxyDetails getDiscoveryProxy(String name)  throws java.lang.Exception{
		this.getDiscoveryProxy= stub.getDiscoveryProxy(name);
		return this.getDiscoveryProxy;
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
		String backEndUrl = "https://localhost:9443/services/";
		endPoint = backEndUrl + "/services/" + serviceName;
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