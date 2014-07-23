package robotlib;
import lib.AuthenticationLibrary;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
//import org.junit.Assert;
import org.testng.Assert;
import property.PropertyInfo;
import property.AutomationContext;
import org.wso2.carbon.service.mgt.stub.ServiceAdminStub;
import org.wso2.carbon.service.mgt.stub.types.carbon.ServiceDownloadData;
import org.wso2.carbon.service.mgt.stub.types.carbon.ServiceGroupMetaData;
import org.wso2.carbon.service.mgt.stub.types.carbon.ServiceMetaDataWrapper;
import org.wso2.carbon.service.mgt.stub.types.neethi.Policy;
import org.wso2.carbon.service.mgt.stub.types.carbon.PolicyMetaData;
import org.wso2.carbon.service.mgt.stub.types.carbon.ServiceMetaData;
import org.wso2.carbon.service.mgt.stub.types.carbon.FaultyServicesWrapper;


public class ServiceAdminLibrary{
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	private ServiceAdminStub stub;


	//Constructor		
	public ServiceAdminLibrary(){

	}		

	public String getPolicy(String arg)  throws java.lang.Exception{

		this.getPolicy=stub.getPolicy(arg);
		return this.getPolicy;

	}

	private String getPolicy;

	public void  AssertgetPolicy(String expected) {	
		Assert.assertEquals(getPolicy , expected );		
	}
	public PolicyMetaData[] getPolicies(String arg)  throws java.lang.Exception{

		this.getPolicies=stub.getPolicies(arg);
		return this.getPolicies;

	}

	private PolicyMetaData[] getPolicies;

	public void  AssertgetPolicies(PolicyMetaData[] expected) {	
		Assert.assertEquals(getPolicies , expected );		
	}
	public void removeServicePoliciesByNamespace(String arg0,String arg)  throws java.lang.Exception{

	stub.removeServicePoliciesByNamespace(arg0,arg);

	}

	public void setBindingOperationPolicy(String arg0,String arg1,String arg2,String arg)  throws java.lang.Exception{

	stub.setBindingOperationPolicy(arg0,arg1,arg2,arg);

	}

	public void setModulePolicy(String arg0,String arg1,String arg)  throws java.lang.Exception{

	stub.setModulePolicy(arg0,arg1,arg);

	}

	public String getBindingOperationMessagePolicy(String arg0,String arg1,String arg2,String arg)  throws java.lang.Exception{

		this.getBindingOperationMessagePolicy=stub.getBindingOperationMessagePolicy(arg0,arg1,arg2,arg);
		return this.getBindingOperationMessagePolicy;

	}

	private String getBindingOperationMessagePolicy;

	public void  AssertgetBindingOperationMessagePolicy(String expected) {	
		Assert.assertEquals(getBindingOperationMessagePolicy , expected );		
	}
	public void changeServiceState(String arg0,boolean arg)  throws java.lang.Exception{

	stub.changeServiceState(arg0,arg);

	}

	public void setServiceParameters(String arg0,String[] arg)  throws java.lang.Exception{

	stub.setServiceParameters(arg0,arg);

	}

	public void deleteServiceGroups(String[] arg)  throws java.lang.Exception{

	stub.deleteServiceGroups(arg);

	}

	public int getNumberOfInactiveServices()  throws java.lang.Exception{

		this.getNumberOfInactiveServices=stub.getNumberOfInactiveServices();
		return this.getNumberOfInactiveServices;

	}

	private int getNumberOfInactiveServices;

	public void  AssertgetNumberOfInactiveServices(int expected) {	
		Assert.assertEquals(getNumberOfInactiveServices , expected );		
	}
	public void setServiceOperationPolicy(String arg0,String arg1,String arg)  throws java.lang.Exception{

	stub.setServiceOperationPolicy(arg0,arg1,arg);

	}

	public boolean deleteFaultyServiceGroup(String arg)  throws java.lang.Exception{

		this.deleteFaultyServiceGroup=stub.deleteFaultyServiceGroup(arg);
		return this.deleteFaultyServiceGroup;

	}

	private boolean deleteFaultyServiceGroup;

	public void  AssertdeleteFaultyServiceGroup(boolean expected) {	
		Assert.assertEquals(deleteFaultyServiceGroup , expected );		
	}
	public void engageModuleToService(String arg0,String arg1,String arg)  throws java.lang.Exception{

	stub.engageModuleToService(arg0,arg1,arg);

	}

	public void deleteFaultyServiceGroups(String[] arg)  throws java.lang.Exception{

	stub.deleteFaultyServiceGroups(arg);

	}

	public void removeBindingPolicy(String arg0,String arg1,String[] arg)  throws java.lang.Exception{

	stub.removeBindingPolicy(arg0,arg1,arg);

	}

	public void deleteAllFaultyServiceGroups()  throws java.lang.Exception{

	stub.deleteAllFaultyServiceGroups();

	}

	public void deleteAllNonAdminServiceGroups()  throws java.lang.Exception{

	stub.deleteAllNonAdminServiceGroups();

	}

	public boolean checkForGroupedServices(String[] arg)  throws java.lang.Exception{

		this.checkForGroupedServices=stub.checkForGroupedServices(arg);
		return this.checkForGroupedServices;

	}

	private boolean checkForGroupedServices;

	public void  AssertcheckForGroupedServices(boolean expected) {	
		Assert.assertEquals(checkForGroupedServices , expected );		
	}
	public ServiceDownloadData downloadServiceArchive(String arg)  throws java.lang.Exception{

		this.downloadServiceArchive=stub.downloadServiceArchive(arg);
		return this.downloadServiceArchive;

	}

	private ServiceDownloadData downloadServiceArchive;

	public void  AssertdownloadServiceArchive(ServiceDownloadData expected) {	
		Assert.assertEquals(downloadServiceArchive , expected );		
	}
	public FaultyServicesWrapper getFaultyServiceArchives(int arg)  throws java.lang.Exception{

		this.getFaultyServiceArchives=stub.getFaultyServiceArchives(arg);
		return this.getFaultyServiceArchives;

	}

	private FaultyServicesWrapper getFaultyServiceArchives;

	public void  AssertgetFaultyServiceArchives(FaultyServicesWrapper expected) {	
		Assert.assertEquals(getFaultyServiceArchives , expected );		
	}
	public void addPoliciesToService(String arg0,Policy arg1,int arg2,String[] arg)  throws java.lang.Exception{

	stub.addPoliciesToService(arg0,arg1,arg2,arg);

	}

	public void startService(String arg)  throws java.lang.Exception{

	stub.startService(arg);

	}

	public String getModulePolicy(String arg0,String arg)  throws java.lang.Exception{

		this.getModulePolicy=stub.getModulePolicy(arg0,arg);
		return this.getModulePolicy;

	}

	private String getModulePolicy;

	public void  AssertgetModulePolicy(String expected) {	
		Assert.assertEquals(getModulePolicy , expected );		
	}
	public void setPolicy(String arg0,String arg)  throws java.lang.Exception{

	stub.setPolicy(arg0,arg);

	}

	public ServiceMetaDataWrapper listServices(String arg0,String arg1,int arg)  throws java.lang.Exception{

		this.listServices=stub.listServices(arg0,arg1,arg);
		return this.listServices;

	}

	private ServiceMetaDataWrapper listServices;

	public void  AssertlistServices(ServiceMetaDataWrapper expected) {	
		Assert.assertEquals(listServices , expected );		
	}
	public void setServiceOperationMessagePolicy(String arg0,String arg1,String arg2,String arg)  throws java.lang.Exception{

	stub.setServiceOperationMessagePolicy(arg0,arg1,arg2,arg);

	}

	public String getBindingPolicy(String arg0,String arg)  throws java.lang.Exception{

		this.getBindingPolicy=stub.getBindingPolicy(arg0,arg);
		return this.getBindingPolicy;

	}

	private String getBindingPolicy;

	public void  AssertgetBindingPolicy(String expected) {	
		Assert.assertEquals(getBindingPolicy , expected );		
	}
	public String[] getServiceBindings(String arg)  throws java.lang.Exception{

		this.getServiceBindings=stub.getServiceBindings(arg);
		return this.getServiceBindings;

	}

	private String[] getServiceBindings;

	public void  AssertgetServiceBindings(String[] expected) {	
		Assert.assertEquals(getServiceBindings , expected );		
	}
	public void stopService(String arg)  throws java.lang.Exception{

	stub.stopService(arg);

	}

	public String getOperationPolicy(String arg0,String arg)  throws java.lang.Exception{

		this.getOperationPolicy=stub.getOperationPolicy(arg0,arg);
		return this.getOperationPolicy;

	}

	private String getOperationPolicy;

	public void  AssertgetOperationPolicy(String expected) {	
		Assert.assertEquals(getOperationPolicy , expected );		
	}
	public String getOperationMessagePolicy(String arg0,String arg1,String arg)  throws java.lang.Exception{

		this.getOperationMessagePolicy=stub.getOperationMessagePolicy(arg0,arg1,arg);
		return this.getOperationMessagePolicy;

	}

	private String getOperationMessagePolicy;

	public void  AssertgetOperationMessagePolicy(String expected) {	
		Assert.assertEquals(getOperationMessagePolicy , expected );		
	}
	public int getNumberOfActiveServices()  throws java.lang.Exception{

		this.getNumberOfActiveServices=stub.getNumberOfActiveServices();
		return this.getNumberOfActiveServices;

	}

	private int getNumberOfActiveServices;

	public void  AssertgetNumberOfActiveServices(int expected) {	
		Assert.assertEquals(getNumberOfActiveServices , expected );		
	}
	public ServiceMetaData getServiceData(String arg)  throws java.lang.Exception{

		this.getServiceData=stub.getServiceData(arg);
		return this.getServiceData;

	}

	private ServiceMetaData getServiceData;

	public void  AssertgetServiceData(ServiceMetaData expected) {	
		Assert.assertEquals(getServiceData , expected );		
	}
	public String removeTransportBinding(String arg0,String arg)  throws java.lang.Exception{

		this.removeTransportBinding=stub.removeTransportBinding(arg0,arg);
		return this.removeTransportBinding;

	}

	private String removeTransportBinding;

	public void  AssertremoveTransportBinding(String expected) {	
		Assert.assertEquals(removeTransportBinding , expected );		
	}
	public int getNumberOfServiceGroups()  throws java.lang.Exception{

		this.getNumberOfServiceGroups=stub.getNumberOfServiceGroups();
		return this.getNumberOfServiceGroups;

	}

	private int getNumberOfServiceGroups;

	public void  AssertgetNumberOfServiceGroups(int expected) {	
		Assert.assertEquals(getNumberOfServiceGroups , expected );		
	}
	public void removeServiceParameter(String arg0,String arg)  throws java.lang.Exception{

	stub.removeServiceParameter(arg0,arg);

	}

	public String getBindingOperationPolicy(String arg0,String arg1,String arg)  throws java.lang.Exception{

		this.getBindingOperationPolicy=stub.getBindingOperationPolicy(arg0,arg1,arg);
		return this.getBindingOperationPolicy;

	}

	private String getBindingOperationPolicy;

	public void  AssertgetBindingOperationPolicy(String expected) {	
		Assert.assertEquals(getBindingOperationPolicy , expected );		
	}
	public ServiceGroupMetaData listServiceGroup(String arg)  throws java.lang.Exception{

		this.listServiceGroup=stub.listServiceGroup(arg);
		return this.listServiceGroup;

	}

	private ServiceGroupMetaData listServiceGroup;

	public void  AssertlistServiceGroup(ServiceGroupMetaData expected) {	
		Assert.assertEquals(listServiceGroup , expected );		
	}
	public void configureMTOM(String arg0,String arg)  throws java.lang.Exception{

	stub.configureMTOM(arg0,arg);

	}

	public void setServicePolicy(String arg0,String arg)  throws java.lang.Exception{

	stub.setServicePolicy(arg0,arg);

	}

	public String addTransportBinding(String arg0,String arg)  throws java.lang.Exception{

		this.addTransportBinding=stub.addTransportBinding(arg0,arg);
		return this.addTransportBinding;

	}

	private String addTransportBinding;

	public void  AssertaddTransportBinding(String expected) {	
		Assert.assertEquals(addTransportBinding , expected );		
	}
	public Object getWSDL(String arg)  throws java.lang.Exception{

		this.getWSDL=stub.getWSDL(arg);
		return this.getWSDL;

	}

	private Object getWSDL;

	public void  AssertgetWSDL(Object expected) {	
		Assert.assertEquals(getWSDL , expected );		
	}
	public int getNumberOfFaultyServices()  throws java.lang.Exception{

		this.getNumberOfFaultyServices=stub.getNumberOfFaultyServices();
		return this.getNumberOfFaultyServices;

	}

	private int getNumberOfFaultyServices;

	public void  AssertgetNumberOfFaultyServices(int expected) {	
		Assert.assertEquals(getNumberOfFaultyServices , expected );		
	}
	public String[] getServiceParameters(String arg)  throws java.lang.Exception{

		this.getServiceParameters=stub.getServiceParameters(arg);
		return this.getServiceParameters;

	}

	private String[] getServiceParameters;

	public void  AssertgetServiceParameters(String[] expected) {	
		Assert.assertEquals(getServiceParameters , expected );		
	}
	public void setBindingOperationMessagePolicy(String arg0,String arg1,String arg2,String arg3,String arg)  throws java.lang.Exception{

	stub.setBindingOperationMessagePolicy(arg0,arg1,arg2,arg3,arg);

	}

	public void setBindingPolicy(String arg0,String arg1,String arg)  throws java.lang.Exception{

	stub.setBindingPolicy(arg0,arg1,arg);

	}

	public String[] getExposedTransports(String arg)  throws java.lang.Exception{

		this.getExposedTransports=stub.getExposedTransports(arg);
		return this.getExposedTransports;

	}

	private String[] getExposedTransports;

	public void  AssertgetExposedTransports(String[] expected) {	
		Assert.assertEquals(getExposedTransports , expected );		
	}


	public static void main(String[] args) {
		//ServiceAdminLibrary l=new ServiceAdminLibrary();
		//l.setX(10);
		//l.setY(25);
		//System.out.println(l.getSum());
	}

	public void initServiceAdmin() throws AxisFault {
		String sessionCookie=AuthenticationLibrary.sessionString;
		String serviceName = "ServiceAdmin";
		String endPoint;
		//String host = PropertyInfo.read("host");
		//String port = PropertyInfo.read("port");
		String host = AutomationContext.context(AutomationContext.PRODUCT_HOST);
		String port = AutomationContext.context(AutomationContext.PRODUCT_PORT);
		String backEndUrl = "https://" + host + ":" + port + "/services/";
		endPoint = backEndUrl + serviceName;//+ "/services/" 
		stub = new ServiceAdminStub(endPoint);
		// Authenticate Your stub from sessionCooke
		ServiceClient serviceClient;
		Options option;

		serviceClient = stub._getServiceClient();
		option = serviceClient.getOptions();
		option.setManageSession(true);
		option.setProperty(org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,sessionCookie);
	}

}