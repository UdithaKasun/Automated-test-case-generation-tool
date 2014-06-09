package lib;

import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.wso2.carbon.admin.mgt.stub.AdminManagementServiceStub;
import org.wso2.carbon.event.stub.service.EventingAdminServiceStub;
import org.wso2.carbon.registry.info.stub.InfoAdminServiceStub;
import org.wso2.carbon.statistics.stub.StatisticsAdminStub;
import org.wso2.carbon.statistics.stub.types.carbon.SystemStatistics;
import org.wso2.carbon.user.mgt.stub.UserAdminStub;
import org.wso2.carbon.user.mgt.stub.types.carbon.UserRealmInfo;

public class Test {

	static String sessionCookie;

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		AuthenticationLibrary al = new AuthenticationLibrary();
		sessionCookie = al.doLogin("admin", "admin", "localhost");

		EventingAdminService();

	}
	
	public static void EventingAdminService(){
		try {
			String serviceName = "EventingAdminService";
			EventingAdminServiceStub stub;
			String backEndUrl = "https://localhost:9443/services";
			String endPoint = backEndUrl + "/services/" + serviceName;
			stub = new EventingAdminServiceStub(endPoint);
			// Authenticate Your stub from sessionCooke
			ServiceClient serviceClient;
			Options option;

			serviceClient = stub._getServiceClient();
			option = serviceClient.getOptions();
			option.setManageSession(true);
			option.setProperty(
					org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,
					sessionCookie);

			System.out.println(stub.getExpiredSubscriptions("").length);
//			System.out.println(stub.isUserValid("admin", "user"));

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
