package lib;

import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.wso2.carbon.admin.mgt.stub.AdminManagementServiceStub;
import org.wso2.carbon.discovery.admin.stub.types.mgt.ServiceDiscoveryConfig;
import org.wso2.carbon.registry.info.stub.InfoAdminServiceStub;
import org.wso2.carbon.service.mgt.stub.ServiceAdminStub;
import org.wso2.carbon.statistics.stub.StatisticsAdminStub;
import org.wso2.carbon.statistics.stub.types.carbon.SystemStatistics;
import org.wso2.carbon.user.mgt.stub.UserAdminStub;
import org.wso2.carbon.user.mgt.stub.types.carbon.UserRealmInfo;

import robotlib.DiscoveryAdminLibrary;
import robotlib.ServiceAdminLibrary;

public class Test {

	static String sessionCookie;

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		AuthenticationLibrary al = new AuthenticationLibrary();
		sessionCookie = al.LoginAs("admin", "admin", "localhost");

//		ServiceAdmin();
		discoveryAdmin();

	}
	
	public static void objectLog(ServiceDiscoveryConfig object){
		System.out.println(object.isEnabledSpecified());
	}
	
	public static void discoveryAdmin() {
		DiscoveryAdminLibrary l=new DiscoveryAdminLibrary();
		
		try {
			l.initDiscoveryAdmin();
			System.out.println(l.getServiceDiscoveryConfig().isProxyURLSpecified());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void ServiceAdmin(){
		try {
			String serviceName = "ServiceAdmin";
			ServiceAdminStub stub;
			String backEndUrl = "https://localhost:9443/services";
			String endPoint = backEndUrl + "/services/" + serviceName;
			stub = new ServiceAdminStub(endPoint);
			// Authenticate Your stub from sessionCooke
			ServiceClient serviceClient;
			Options option;

			serviceClient = stub._getServiceClient();
			option = serviceClient.getOptions();
			option.setManageSession(true);
			option.setProperty(
					org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,
					sessionCookie);

			System.out.println(stub.getNumberOfActiveServices());
//			System.out.println(stub.isUserValid("admin", "user"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		ServiceAdminLibrary li=new ServiceAdminLibrary();
		try {
			li.initServiceAdmin();
			System.out.println(li.getNumberOfActiveServices());
			li.AssertgetNumberOfActiveServices(4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void AdminManagementService(){
		try {
			String serviceName = "AdminManagementService";
			AdminManagementServiceStub stub;
			String backEndUrl = "https://localhost:9443";
			String endPoint = backEndUrl + "/services/" + serviceName;
			stub = new AdminManagementServiceStub(endPoint);
			// Authenticate Your stub from sessionCooke
			ServiceClient serviceClient;
			Options option;

			serviceClient = stub._getServiceClient();
			option = serviceClient.getOptions();
			option.setManageSession(true);
			option.setProperty(
					org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,
					sessionCookie);

			System.out.println(stub.generateRandomCaptcha());
//			System.out.println(stub.isUserValid("admin", "user"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void InfoAdminService() {
		try {
			String serviceName = "InfoAdminService";
			InfoAdminServiceStub stub;
			String backEndUrl = "https://localhost:9443";
			String endPoint = backEndUrl + "/services/" + serviceName;
			stub = new InfoAdminServiceStub(endPoint);
			// Authenticate Your stub from sessionCooke
			ServiceClient serviceClient;
			Options option;

			serviceClient = stub._getServiceClient();
			option = serviceClient.getOptions();
			option.setManageSession(true);
			option.setProperty(
					org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,
					sessionCookie);

			System.out.println(stub.isProfileExisting("admin", "admin"));
			System.out.println(stub.isUserValid("admin", "user"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void StatisticsAdmin() {
		try {
			String serviceName = "StatisticsAdmin";
			StatisticsAdminStub statisticsAdminStub;
			String backEndUrl = "https://localhost:9443/services/";
			String endPoint = backEndUrl + "/services/" + serviceName;
			statisticsAdminStub = new StatisticsAdminStub(endPoint);
			// Authenticate Your stub from sessionCooke
			ServiceClient serviceClient;
			Options option;

			serviceClient = statisticsAdminStub._getServiceClient();
			option = serviceClient.getOptions();
			option.setManageSession(true);
			option.setProperty(
					org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,
					sessionCookie);

			SystemStatistics stat = statisticsAdminStub.getSystemStatistics();
			System.out.println("Host :" + stat.getServerName());
			System.out.println("Server Start Time :"
					+ stat.getServerStartTime());
			System.out.println("System Up Time :" + stat.getSystemUpTime());
			System.out.print(stat.getUsedMemory().getValue()
					+ stat.getUsedMemory().getUnit() + " of ");
			System.out.println(stat.getTotalMemory().getValue()
					+ stat.getTotalMemory().getUnit() + " memory used");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void UserAdmin() {
		try {
			String serviceName = "UserAdmin";
			UserAdminStub statisticsAdminStub;
			String backEndUrl = "https://localhost:9443/services/";
			String endPoint = backEndUrl + "/services/" + serviceName;
			statisticsAdminStub = new UserAdminStub(endPoint);
			// Authenticate Your stub from sessionCooke
			ServiceClient serviceClient;
			Options option;

			serviceClient = statisticsAdminStub._getServiceClient();
			option = serviceClient.getOptions();
			option.setManageSession(true);
			option.setProperty(
					org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,
					sessionCookie);

			UserRealmInfo stat = statisticsAdminStub.getUserRealmInfo();
			System.out.println(stat.getAdminRole());
			System.out.println(stat.getAdminUser());
			System.out.println(stat.getEveryOneRole());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
