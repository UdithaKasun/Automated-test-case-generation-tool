package lib;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.wso2.carbon.statistics.stub.StatisticsAdminStub;
import org.wso2.carbon.statistics.stub.types.carbon.SystemStatistics;

public class StatisticsLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private final String serviceName = "StatisticsAdmin";
	private StatisticsAdminStub statisticsAdminStub;
	private String endPoint;

	public void init(String sessionCookie) throws AxisFault {
		String backEndUrl = "https://localhost:9443/services/";
		this.endPoint = backEndUrl + "/services/" + serviceName;
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
	}

	public SystemStatistics getSystemStatistics() throws RemoteException {
		SystemStatistics stat = statisticsAdminStub.getSystemStatistics();
		System.out.println("Host :" + stat.getServerName());
		System.out.println("Server Start Time :" + stat.getServerStartTime());
		System.out.println("System Up Time :" + stat.getSystemUpTime());
		System.out.print(stat.getUsedMemory().getValue()
				+ stat.getUsedMemory().getUnit() + " of ");
		System.out.println(stat.getTotalMemory().getValue()
				+ stat.getTotalMemory().getUnit() + " memory used");

		return statisticsAdminStub.getSystemStatistics();
	}

	public StatisticsLibrary() {

	}
}
