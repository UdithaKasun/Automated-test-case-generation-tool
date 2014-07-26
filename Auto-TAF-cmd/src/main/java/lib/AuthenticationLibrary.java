package lib;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Stub;
import org.apache.axis2.context.ServiceContext;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.authenticator.stub.AuthenticationAdminStub;
import org.wso2.carbon.authenticator.stub.LoginAuthenticationExceptionException;
import org.wso2.carbon.authenticator.stub.LogoutAuthenticationExceptionException;
import org.wso2.carbon.statistics.stub.types.carbon.SystemStatistics;

import property.AutomationContext;
import property.PropertyInfo;

public class AuthenticationLibrary {

	public String name() {
		System.out.println(this.getClass().toString());
		return this.getClass().toString();
	}
	
	private static AuthenticationLibrary c;
	private static final Log log = LogFactory
			.getLog(AuthenticationLibrary.class);
	private AuthenticationAdminStub authenticationAdminStub;
	public static String sessionString;

	public AuthenticationLibrary(String backendUrl) throws AxisFault {
		String serviceName = "AuthenticationAdmin";
		String endPoint = backendUrl + serviceName;
		if (log.isDebugEnabled()) {
			log.debug("EndPoint" + endPoint);
		}
		try {
			authenticationAdminStub = new AuthenticationAdminStub(endPoint);
		} catch (AxisFault axisFault) {
			log.info("authenticationAdminStub initialization fails");
			throw new AxisFault("authenticationAdminStub initialization fails");
		}
	}

	public Stub getServiceStub() {
		return this.authenticationAdminStub;
	}

	public String login(String userName, String password, String host)
			throws LoginAuthenticationExceptionException, RemoteException {
		Boolean loginStatus;
		ServiceContext serviceContext;
		String sessionCookie;
		loginStatus = authenticationAdminStub.login(userName, password, host);
		if (!loginStatus) {
			throw new LoginAuthenticationExceptionException(
					"Login Unsuccessful. Return false as a login status by Server");
		}
		log.info("Login Successful");
		serviceContext = authenticationAdminStub._getServiceClient()
				.getLastOperationContext().getServiceContext();
		sessionCookie = (String) serviceContext
				.getProperty(HTTPConstants.COOKIE_STRING);
		if (log.isDebugEnabled()) {
			log.debug("SessionCookie :" + sessionCookie);
		}
		return sessionCookie;
	}

	public Boolean unsuccessfulLogin(String userName, String password,
			String backEndURL) throws LoginAuthenticationExceptionException,
			RemoteException {
		return authenticationAdminStub.login(userName, password, backEndURL);
	}

	public void logOut() throws LogoutAuthenticationExceptionException,
			RemoteException {
		authenticationAdminStub.logout();
		log.info("log out");
	}

	public Stub getAuthenticationAdminStub() {
		return authenticationAdminStub;
	}

	 public AuthenticationLibrary() {
		String jks = AutomationContext.context(AutomationContext.PRODUCT_LOCATION)+"/repository/resources/security/client-truststore.jks";
//		String jks = "/media/rukshan/Stuff/ubunto back/wso2esb-4.8.1"+"/repository/resources/security/client-truststore.jks";
		String pass = "wso2carbon";// wso2Carbon
//System.out.println(jks);
		System.setProperty("javax.net.ssl.trustStore", jks);
		System.setProperty("javax.net.ssl.trustStorePassword", pass);

		String host = AutomationContext.context(AutomationContext.PRODUCT_HOST);
		String port = AutomationContext.context(AutomationContext.PRODUCT_PORT);
		String backEndUrl = "https://" + host + ":" + port + "/services/";
//		String u = "https://localhost:9443/services/";
//		System.out.println(backEndUrl);
		try {
			c = new AuthenticationLibrary(backEndUrl);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String LoginAs(String userName, String password, String host) {
		try {
			String log = c.login(userName, password, host);
			System.out.println(log);
			sessionString=log;
			return log;
		} catch (AxisFault e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("re " + e.getMessage());
		}
		
		return "error";
	}

}
