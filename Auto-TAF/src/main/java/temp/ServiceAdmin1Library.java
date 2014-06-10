package temp;
import lib.AuthenticationLibrary;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.junit.Assert;

import org.wso2.carbon.service.mgt.stub.types.carbon.Iterator;
import org.wso2.carbon.service.mgt.stub.types.carbon.Map;
import org.wso2.carbon.service.mgt.stub.types.axis2.Exception;
import org.wso2.carbon.service.mgt.stub.types.carbon.ServerException;
import org.wso2.carbon.service.mgt.stub.types.neethi.AbstractPolicyOperator;
import org.wso2.carbon.service.mgt.stub.types.neethi.PolicyComponent;
import org.wso2.carbon.service.mgt.stub.types.neethi.All;
import org.wso2.carbon.service.mgt.stub.types.neethi.Policy;
import org.wso2.carbon.service.mgt.stub.types.carbon.ServiceMetaDataWrapper;
import org.wso2.carbon.service.mgt.stub.types.carbon.ServiceMetaData;
import org.wso2.carbon.service.mgt.stub.types.carbon.ServiceGroupMetaData;
import org.wso2.carbon.service.mgt.stub.types.carbon.PolicyMetaData;
import org.wso2.carbon.service.mgt.stub.types.carbon.FaultyServicesWrapper;
import org.wso2.carbon.service.mgt.stub.types.carbon.FaultyService;
import org.wso2.carbon.service.mgt.stub.types.carbon.ServiceDownloadData;
import org.wso2.carbon.service.mgt.stub.*;


public class ServiceAdmin1Library{
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	private ServiceAdminStub stub;


	private int getNumberOfInactiveServices;
	private String[] getServiceBindings;
	private int getNumberOfServiceGroups;
	private int getNumberOfActiveServices;
	private String getBindingOperationPolicy;
	private String addTransportBinding;
	private ServiceGroupMetaData listServiceGroup;
	private boolean checkForGroupedServices;
	private PolicyMetaData[] getPolicies;
	private String[] getServiceParameters;
	private int getNumberOfFaultyServices;
	private ServiceDownloadData downloadServiceArchive;
	private String getOperationMessagePolicy;
	private String getModulePolicy;
	private boolean deleteFaultyServiceGroup;
	private FaultyServicesWrapper getFaultyServiceArchives;
	private String[] getExposedTransports;
	private String getOperationPolicy;
	private String removeTransportBinding;
	private String getBindingPolicy;
	private ServiceMetaDataWrapper listServices;
	private ServiceMetaData getServiceData;
	private Object getWSDL;
	private String getBindingOperationMessagePolicy;
	private String getPolicy;

	//Constructor		
	public ServiceAdmin1Library(){

	}		

	public void removeServicePoliciesByNamespace(String serviceName,String namesapce)  throws java.lang.Exception{
		 stub.removeServicePoliciesByNamespace(serviceName,namesapce);
	}
	public void setServicePolicy(String serviceName,String policyString)  throws java.lang.Exception{
		 stub.setServicePolicy(serviceName,policyString);
	}
	public void  AssertgetNumberOfInactiveServices(int expected) {	
		Assert.assertEquals(expected, getNumberOfInactiveServices);		
	}
	public int getNumberOfInactiveServices()  throws java.lang.Exception{
		this.getNumberOfInactiveServices= stub.getNumberOfInactiveServices();
		return this.getNumberOfInactiveServices;
	}
	public void setModulePolicy(String moduleName,String moduleVersion,String policyString)  throws java.lang.Exception{
		 stub.setModulePolicy(moduleName,moduleVersion,policyString);
	}
	public void deleteServiceGroups(String[] serviceGroups)  throws java.lang.Exception{
		 stub.deleteServiceGroups(serviceGroups);
	}
	public void  AssertgetServiceBindings(String[] expected) {	
		Assert.assertEquals(expected, getServiceBindings);		
	}
	public String[] getServiceBindings(String serviceName)  throws java.lang.Exception{
		this.getServiceBindings= stub.getServiceBindings(serviceName);
		return this.getServiceBindings;
	}
	public void engageModuleToService(String serviceName,String moduleName,String version)  throws java.lang.Exception{
		 stub.engageModuleToService(serviceName,moduleName,version);
	}
	public void deleteFaultyServiceGroups(String[] fileNames)  throws java.lang.Exception{
		 stub.deleteFaultyServiceGroups(fileNames);
	}
	public void setBindingPolicy(String serviceName,String bindingName,String policyString)  throws java.lang.Exception{
		 stub.setBindingPolicy(serviceName,bindingName,policyString);
	}
	public void removeBindingPolicy(String serviceName,String policyKey,String[] moduleNames)  throws java.lang.Exception{
		 stub.removeBindingPolicy(serviceName,policyKey,moduleNames);
	}
	public void  AssertgetNumberOfServiceGroups(int expected) {	
		Assert.assertEquals(expected, getNumberOfServiceGroups);		
	}
	public int getNumberOfServiceGroups()  throws java.lang.Exception{
		this.getNumberOfServiceGroups= stub.getNumberOfServiceGroups();
		return this.getNumberOfServiceGroups;
	}
	public void setServiceOperationPolicy(String serviceName,String operationName,String policyString)  throws java.lang.Exception{
		 stub.setServiceOperationPolicy(serviceName,operationName,policyString);
	}
	public void  AssertgetNumberOfActiveServices(int expected) {	
		Assert.assertEquals(expected, getNumberOfActiveServices);		
	}
	public int getNumberOfActiveServices()  throws java.lang.Exception{
		this.getNumberOfActiveServices= stub.getNumberOfActiveServices();
		return this.getNumberOfActiveServices;
	}
	public void  AssertgetBindingOperationPolicy(String expected) {	
		Assert.assertEquals(expected, getBindingOperationPolicy);		
	}
	public String getBindingOperationPolicy(String serviceName,String bindingName,String operationName)  throws java.lang.Exception{
		this.getBindingOperationPolicy= stub.getBindingOperationPolicy(serviceName,bindingName,operationName);
		return this.getBindingOperationPolicy;
	}
	public void setPolicy(String serviceName,String policyString)  throws java.lang.Exception{
		 stub.setPolicy(serviceName,policyString);
	}
	public void  AssertaddTransportBinding(String expected) {	
		Assert.assertEquals(expected, addTransportBinding);		
	}
	public String addTransportBinding(String serviceId,String transportProtocol)  throws java.lang.Exception{
		this.addTransportBinding= stub.addTransportBinding(serviceId,transportProtocol);
		return this.addTransportBinding;
	}
	public void  AssertlistServiceGroup(ServiceGroupMetaData expected) {	
		Assert.assertEquals(expected, listServiceGroup);		
	}
	public ServiceGroupMetaData listServiceGroup(String serviceGroupName)  throws java.lang.Exception{
		this.listServiceGroup= stub.listServiceGroup(serviceGroupName);
		return this.listServiceGroup;
	}
	public void setServiceOperationMessagePolicy(String serviceName,String operationName,String messageType,String policyString)  throws java.lang.Exception{
		 stub.setServiceOperationMessagePolicy(serviceName,operationName,messageType,policyString);
	}
	public void  AssertcheckForGroupedServices(boolean expected) {	
		Assert.assertEquals(expected, checkForGroupedServices);		
	}
	public boolean checkForGroupedServices(String[] serviceGroupsList)  throws java.lang.Exception{
		this.checkForGroupedServices= stub.checkForGroupedServices(serviceGroupsList);
		return this.checkForGroupedServices;
	}
	public void  AssertgetPolicies(PolicyMetaData[] expected) {	
		Assert.assertEquals(expected, getPolicies);		
	}
	public PolicyMetaData[] getPolicies(String serviceName)  throws java.lang.Exception{
		this.getPolicies= stub.getPolicies(serviceName);
		return this.getPolicies;
	}
	public void setServiceParameters(String serviceName,String[] parameters)  throws java.lang.Exception{
		 stub.setServiceParameters(serviceName,parameters);
	}
	public void  AssertgetServiceParameters(String[] expected) {	
		Assert.assertEquals(expected, getServiceParameters);		
	}
	public String[] getServiceParameters(String serviceName)  throws java.lang.Exception{
		this.getServiceParameters= stub.getServiceParameters(serviceName);
		return this.getServiceParameters;
	}
	public void  AssertgetNumberOfFaultyServices(int expected) {	
		Assert.assertEquals(expected, getNumberOfFaultyServices);		
	}
	public int getNumberOfFaultyServices()  throws java.lang.Exception{
		this.getNumberOfFaultyServices= stub.getNumberOfFaultyServices();
		return this.getNumberOfFaultyServices;
	}
	public void  AssertdownloadServiceArchive(ServiceDownloadData expected) {	
		Assert.assertEquals(expected, downloadServiceArchive);		
	}
	public ServiceDownloadData downloadServiceArchive(String serviceGroupName)  throws java.lang.Exception{
		this.downloadServiceArchive= stub.downloadServiceArchive(serviceGroupName);
		return this.downloadServiceArchive;
	}
	public void  AssertgetOperationMessagePolicy(String expected) {	
		Assert.assertEquals(expected, getOperationMessagePolicy);		
	}
	public String getOperationMessagePolicy(String serviceName,String operationName,String messageType)  throws java.lang.Exception{
		this.getOperationMessagePolicy= stub.getOperationMessagePolicy(serviceName,operationName,messageType);
		return this.getOperationMessagePolicy;
	}
	public void  AssertgetModulePolicy(String expected) {	
		Assert.assertEquals(expected, getModulePolicy);		
	}
	public String getModulePolicy(String moduleName,String moduleVersion)  throws java.lang.Exception{
		this.getModulePolicy= stub.getModulePolicy(moduleName,moduleVersion);
		return this.getModulePolicy;
	}
	public void setBindingOperationPolicy(String serviceName,String bindingName,String operationName,String policyString)  throws java.lang.Exception{
		 stub.setBindingOperationPolicy(serviceName,bindingName,operationName,policyString);
	}
	public void deleteAllNonAdminServiceGroups()  throws java.lang.Exception{
		 stub.deleteAllNonAdminServiceGroups();
	}
	public void  AssertdeleteFaultyServiceGroup(boolean expected) {	
		Assert.assertEquals(expected, deleteFaultyServiceGroup);		
	}
	public boolean deleteFaultyServiceGroup(String archiveName)  throws java.lang.Exception{
		this.deleteFaultyServiceGroup= stub.deleteFaultyServiceGroup(archiveName);
		return this.deleteFaultyServiceGroup;
	}
	public void  AssertgetFaultyServiceArchives(FaultyServicesWrapper expected) {	
		Assert.assertEquals(expected, getFaultyServiceArchives);		
	}
	public FaultyServicesWrapper getFaultyServiceArchives(int pageNumber)  throws java.lang.Exception{
		this.getFaultyServiceArchives= stub.getFaultyServiceArchives(pageNumber);
		return this.getFaultyServiceArchives;
	}
	public void configureMTOM(String flag,String serviceName)  throws java.lang.Exception{
		 stub.configureMTOM(flag,serviceName);
	}
	public void deleteAllFaultyServiceGroups()  throws java.lang.Exception{
		 stub.deleteAllFaultyServiceGroups();
	}
	public void  AssertgetExposedTransports(String[] expected) {	
		Assert.assertEquals(expected, getExposedTransports);		
	}
	public String[] getExposedTransports(String serviceId)  throws java.lang.Exception{
		this.getExposedTransports= stub.getExposedTransports(serviceId);
		return this.getExposedTransports;
	}
	public void  AssertgetOperationPolicy(String expected) {	
		Assert.assertEquals(expected, getOperationPolicy);		
	}
	public String getOperationPolicy(String serviceName,String operationName)  throws java.lang.Exception{
		this.getOperationPolicy= stub.getOperationPolicy(serviceName,operationName);
		return this.getOperationPolicy;
	}
	public void  AssertremoveTransportBinding(String expected) {	
		Assert.assertEquals(expected, removeTransportBinding);		
	}
	public String removeTransportBinding(String serviceId,String transportProtocol)  throws java.lang.Exception{
		this.removeTransportBinding= stub.removeTransportBinding(serviceId,transportProtocol);
		return this.removeTransportBinding;
	}
	public void  AssertgetBindingPolicy(String expected) {	
		Assert.assertEquals(expected, getBindingPolicy);		
	}
	public String getBindingPolicy(String serviceName,String bindingName)  throws java.lang.Exception{
		this.getBindingPolicy= stub.getBindingPolicy(serviceName,bindingName);
		return this.getBindingPolicy;
	}
	public void startService(String serviceName)  throws java.lang.Exception{
		 stub.startService(serviceName);
	}
	public void  AssertlistServices(ServiceMetaDataWrapper expected) {	
		Assert.assertEquals(expected, listServices);		
	}
	public ServiceMetaDataWrapper listServices(String serviceTypeFilter,String serviceSearchString,int pageNumber)  throws java.lang.Exception{
		this.listServices= stub.listServices(serviceTypeFilter,serviceSearchString,pageNumber);
		return this.listServices;
	}
	public void stopService(String serviceName)  throws java.lang.Exception{
		 stub.stopService(serviceName);
	}
	public void changeServiceState(String serviceName,boolean isActive)  throws java.lang.Exception{
		 stub.changeServiceState(serviceName,isActive);
	}
	public void  AssertgetServiceData(ServiceMetaData expected) {	
		Assert.assertEquals(expected, getServiceData);		
	}
	public ServiceMetaData getServiceData(String serviceName)  throws java.lang.Exception{
		this.getServiceData= stub.getServiceData(serviceName);
		return this.getServiceData;
	}
	public void  AssertgetWSDL(Object expected) {	
		Assert.assertEquals(expected, getWSDL);		
	}
	public Object getWSDL(String serviceName)  throws java.lang.Exception{
		this.getWSDL= stub.getWSDL(serviceName);
		return this.getWSDL;
	}
	public void setBindingOperationMessagePolicy(String serviceName,String bindingName,String operationName,String messageType,String policyString)  throws java.lang.Exception{
		 stub.setBindingOperationMessagePolicy(serviceName,bindingName,operationName,messageType,policyString);
	}
	public void  AssertgetBindingOperationMessagePolicy(String expected) {	
		Assert.assertEquals(expected, getBindingOperationMessagePolicy);		
	}
	public String getBindingOperationMessagePolicy(String serviceName,String bindingName,String operationName,String messageType)  throws java.lang.Exception{
		this.getBindingOperationMessagePolicy= stub.getBindingOperationMessagePolicy(serviceName,bindingName,operationName,messageType);
		return this.getBindingOperationMessagePolicy;
	}
	public void removeServiceParameter(String serviceName,String parameterName)  throws java.lang.Exception{
		 stub.removeServiceParameter(serviceName,parameterName);
	}
	public void  AssertgetPolicy(String expected) {	
		Assert.assertEquals(expected, getPolicy);		
	}
	public String getPolicy(String serviceName)  throws java.lang.Exception{
		this.getPolicy= stub.getPolicy(serviceName);
		return this.getPolicy;
	}
	public void addPoliciesToService(String serviceName,Policy policy,int policyType,String[] modulePaths)  throws java.lang.Exception{
		 stub.addPoliciesToService(serviceName,policy,policyType,modulePaths);
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
		String backEndUrl = "https://localhost:9443/services/";
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