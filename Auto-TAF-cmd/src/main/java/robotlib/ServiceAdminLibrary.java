package robotlib;
import lib.AuthenticationLibrary;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
//import org.junit.Assert;
import org.testng.Assert;
import property.PropertyInfo;
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

	public PolicyMetaData[] getPolicies(String arg)  throws java.lang.Exception{

		this.getPolicies=stub.getPolicies(arg);
		return stub.getPolicies(arg);

	}

	private PolicyMetaData[] getPolicies;

	public void  AssertgetPolicies(PolicyMetaData[] expected) {	
		Assert.assertEquals(expected, getPolicies);		
	}
	public String[] getServiceParameters(String arg)  throws java.lang.Exception{

		this.getServiceParameters=stub.getServiceParameters(arg);
		return stub.getServiceParameters(arg);

	}

	private String[] getServiceParameters;

	public void  AssertgetServiceParameters(String[] expected) {	
		Assert.assertEquals(expected, getServiceParameters);		
	}
	public void setBindingOperationMessagePolicy(String arg0,String arg1,String arg2,String arg3,String arg)  throws java.lang.Exception{

	 stub.setBindingOperationMessagePolicy(arg0,arg1,arg2,arg3,arg);

	}

	public ServiceGroupMetaData listServiceGroup(String arg)  throws java.lang.Exception{

		this.listServiceGroup=stub.listServiceGroup(arg);
		return stub.listServiceGroup(arg);

	}

	private ServiceGroupMetaData listServiceGroup;

	public void  AssertlistServiceGroup(ServiceGroupMetaData expected) {	
		Assert.assertEquals(expected, listServiceGroup);		
	}
	public void startService(String arg)  throws java.lang.Exception{

	 stub.startService(arg);

	}

	public FaultyServicesWrapper getFaultyServiceArchives(int arg)  throws java.lang.Exception{

		this.getFaultyServiceArchives=stub.getFaultyServiceArchives(arg);
		return stub.getFaultyServiceArchives(arg);

	}

	private FaultyServicesWrapper getFaultyServiceArchives;

	public void  AssertgetFaultyServiceArchives(FaultyServicesWrapper expected) {	
		Assert.assertEquals(expected, getFaultyServiceArchives);		
	}
	public void addPoliciesToService(String arg0,Policy arg1,int arg2,String[] arg)  throws java.lang.Exception{

	 stub.addPoliciesToService(arg0,arg1,arg2,arg);

	}

	public void setServicePolicy(String arg0,String arg)  throws java.lang.Exception{

	 stub.setServicePolicy(arg0,arg);

	}

	public ServiceDownloadData downloadServiceArchive(String arg)  throws java.lang.Exception{

		this.downloadServiceArchive=stub.downloadServiceArchive(arg);
		return stub.downloadServiceArchive(arg);

	}

	private ServiceDownloadData downloadServiceArchive;

	public void  AssertdownloadServiceArchive(ServiceDownloadData expected) {	
		Assert.assertEquals(expected, downloadServiceArchive);		
	}
	public int getNumberOfActiveServices()  throws java.lang.Exception{

		this.getNumberOfActiveServices=stub.getNumberOfActiveServices();
		return stub.getNumberOfActiveServices();

	}

	private int getNumberOfActiveServices;

	public void  AssertgetNumberOfActiveServices(int expected) {	
		Assert.assertEquals(expected, getNumberOfActiveServices);		
	}
	public ServiceMetaData getServiceData(String arg)  throws java.lang.Exception{

		this.getServiceData=stub.getServiceData(arg);
		return stub.getServiceData(arg);

	}

	private ServiceMetaData getServiceData;

	public void  AssertgetServiceData(ServiceMetaData expected) {	
		Assert.assertEquals(expected, getServiceData);		
	}
	public String removeTransportBinding(String arg0,String arg)  throws java.lang.Exception{

		this.removeTransportBinding=stub.removeTransportBinding(arg0,arg);
		return stub.removeTransportBinding(arg0,arg);

	}

	private String removeTransportBinding;

	public void  AssertremoveTransportBinding(String expected) {	
		Assert.assertEquals(expected, removeTransportBinding);		
	}
	public int getNumberOfServiceGroups()  throws java.lang.Exception{

		this.getNumberOfServiceGroups=stub.getNumberOfServiceGroups();
		return stub.getNumberOfServiceGroups();

	}

	private int getNumberOfServiceGroups;

	public void  AssertgetNumberOfServiceGroups(int expected) {	
		Assert.assertEquals(expected, getNumberOfServiceGroups);		
	}
	public void removeServiceParameter(String arg0,String arg)  throws java.lang.Exception{

	 stub.removeServiceParameter(arg0,arg);

	}

	public String getBindingOperationPolicy(String arg0,String arg1,String arg)  throws java.lang.Exception{

		this.getBindingOperationPolicy=stub.getBindingOperationPolicy(arg0,arg1,arg);
		return stub.getBindingOperationPolicy(arg0,arg1,arg);

	}

	private String getBindingOperationPolicy;

	public void  AssertgetBindingOperationPolicy(String expected) {	
		Assert.assertEquals(expected, getBindingOperationPolicy);		
	}
	public void deleteServiceGroups(String[] arg)  throws java.lang.Exception{

	 stub.deleteServiceGroups(arg);

	}

	public int getNumberOfInactiveServices()  throws java.lang.Exception{

		this.getNumberOfInactiveServices=stub.getNumberOfInactiveServices();
		return stub.getNumberOfInactiveServices();

	}

	private int getNumberOfInactiveServices;

	public void  AssertgetNumberOfInactiveServices(int expected) {	
		Assert.assertEquals(expected, getNumberOfInactiveServices);		
	}
	public void setServiceOperationPolicy(String arg0,String arg1,String arg)  throws java.lang.Exception{

	 stub.setServiceOperationPolicy(arg0,arg1,arg);

	}

	public boolean deleteFaultyServiceGroup(String arg)  throws java.lang.Exception{

		this.deleteFaultyServiceGroup=stub.deleteFaultyServiceGroup(arg);
		return stub.deleteFaultyServiceGroup(arg);

	}

	private boolean deleteFaultyServiceGroup;

	public void  AssertdeleteFaultyServiceGroup(boolean expected) {	
		Assert.assertEquals(expected, deleteFaultyServiceGroup);		
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
		return stub.checkForGroupedServices(arg);

	}

	private boolean checkForGroupedServices;

	public void  AssertcheckForGroupedServices(boolean expected) {	
		Assert.assertEquals(expected, checkForGroupedServices);		
	}
	public String getModulePolicy(String arg0,String arg)  throws java.lang.Exception{

		this.getModulePolicy=stub.getModulePolicy(arg0,arg);
		return stub.getModulePolicy(arg0,arg);

	}

	private String getModulePolicy;

	public void  AssertgetModulePolicy(String expected) {	
		Assert.assertEquals(expected, getModulePolicy);		
	}
	public ServiceMetaDataWrapper listServices(String arg0,String arg1,int arg)  throws java.lang.Exception{

		this.listServices=stub.listServices(arg0,arg1,arg);
		return stub.listServices(arg0,arg1,arg);

	}

	private ServiceMetaDataWrapper listServices;

	public void  AssertlistServices(ServiceMetaDataWrapper expected) {	
		Assert.assertEquals(expected, listServices);		
	}
	public void setServiceOperationMessagePolicy(String arg0,String arg1,String arg2,String arg)  throws java.lang.Exception{

	 stub.setServiceOperationMessagePolicy(arg0,arg1,arg2,arg);

	}

	public String getBindingPolicy(String arg0,String arg)  throws java.lang.Exception{

		this.getBindingPolicy=stub.getBindingPolicy(arg0,arg);
		return stub.getBindingPolicy(arg0,arg);

	}

	private String getBindingPolicy;

	public void  AssertgetBindingPolicy(String expected) {	
		Assert.assertEquals(expected, getBindingPolicy);		
	}
	public String[] getServiceBindings(String arg)  throws java.lang.Exception{

		this.getServiceBindings=stub.getServiceBindings(arg);
		return stub.getServiceBindings(arg);

	}

	private String[] getServiceBindings;

	public void  AssertgetServiceBindings(String[] expected) {	
		Assert.assertEquals(expected, getServiceBindings);		
	}
	public void stopService(String arg)  throws java.lang.Exception{

	 stub.stopService(arg);

	}

	public String getOperationPolicy(String arg0,String arg)  throws java.lang.Exception{

		this.getOperationPolicy=stub.getOperationPolicy(arg0,arg);
		return stub.getOperationPolicy(arg0,arg);

	}

	private String getOperationPolicy;

	public void  AssertgetOperationPolicy(String expected) {	
		Assert.assertEquals(expected, getOperationPolicy);		
	}
	public Object getWSDL(String arg)  throws java.lang.Exception{

		this.getWSDL=stub.getWSDL(arg);
		return stub.getWSDL(arg);

	}

	private Object getWSDL;

	public void  AssertgetWSDL(Object expected) {	
		Assert.assertEquals(expected, getWSDL);		
	}
	public int getNumberOfFaultyServices()  throws java.lang.Exception{

		this.getNumberOfFaultyServices=stub.getNumberOfFaultyServices();
		return stub.getNumberOfFaultyServices();

	}

	private int getNumberOfFaultyServices;

	public void  AssertgetNumberOfFaultyServices(int expected) {	
		Assert.assertEquals(expected, getNumberOfFaultyServices);		
	}
	public void configureMTOM(String arg0,String arg)  throws java.lang.Exception{

	 stub.configureMTOM(arg0,arg);

	}

	public String addTransportBinding(String arg0,String arg)  throws java.lang.Exception{

		this.addTransportBinding=stub.addTransportBinding(arg0,arg);
		return stub.addTransportBinding(arg0,arg);

	}

	private String addTransportBinding;

	public void  AssertaddTransportBinding(String expected) {	
		Assert.assertEquals(expected, addTransportBinding);		
	}
	public String[] getExposedTransports(String arg)  throws java.lang.Exception{

		this.getExposedTransports=stub.getExposedTransports(arg);
		return stub.getExposedTransports(arg);

	}

	private String[] getExposedTransports;

	public void  AssertgetExposedTransports(String[] expected) {	
		Assert.assertEquals(expected, getExposedTransports);		
	}
	public void setBindingPolicy(String arg0,String arg1,String arg)  throws java.lang.Exception{

	 stub.setBindingPolicy(arg0,arg1,arg);

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
		return stub.getBindingOperationMessagePolicy(arg0,arg1,arg2,arg);

	}

	private String getBindingOperationMessagePolicy;

	public void  AssertgetBindingOperationMessagePolicy(String expected) {	
		Assert.assertEquals(expected, getBindingOperationMessagePolicy);		
	}
	public void changeServiceState(String arg0,boolean arg)  throws java.lang.Exception{

	 stub.changeServiceState(arg0,arg);

	}

	public void setServiceParameters(String arg0,String[] arg)  throws java.lang.Exception{

	 stub.setServiceParameters(arg0,arg);

	}

	public String getOperationMessagePolicy(String arg0,String arg1,String arg)  throws java.lang.Exception{

		this.getOperationMessagePolicy=stub.getOperationMessagePolicy(arg0,arg1,arg);
		return stub.getOperationMessagePolicy(arg0,arg1,arg);

	}

	private String getOperationMessagePolicy;

	public void  AssertgetOperationMessagePolicy(String expected) {	
		Assert.assertEquals(expected, getOperationMessagePolicy);		
	}
	public String getPolicy(String arg)  throws java.lang.Exception{

		this.getPolicy=stub.getPolicy(arg);
		return stub.getPolicy(arg);

	}

	private String getPolicy;

	public void  AssertgetPolicy(String expected) {	
		Assert.assertEquals(expected, getPolicy);		
	}
	public void setPolicy(String arg0,String arg)  throws java.lang.Exception{

	 stub.setPolicy(arg0,arg);

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
		String host = PropertyInfo.read("host");
		String port = PropertyInfo.read("port");
		String backEndUrl = "https://" + host + ":" + port + "/services/";
		endPoint = backEndUrl + "/services/" + serviceName;
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