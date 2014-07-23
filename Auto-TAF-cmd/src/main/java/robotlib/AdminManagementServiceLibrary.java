package robotlib;
import lib.AuthenticationLibrary;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
//import org.junit.Assert;
import org.testng.Assert;
import property.PropertyInfo;
import property.AutomationContext;
import org.wso2.carbon.admin.mgt.stub.beans.xsd.AdminMgtInfoBean;
import org.wso2.carbon.admin.mgt.stub.AdminManagementServiceStub;
import org.wso2.carbon.admin.mgt.stub.beans.xsd.CaptchaInfoBean;


public class AdminManagementServiceLibrary{
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	private AdminManagementServiceStub stub;


	//Constructor		
	public AdminManagementServiceLibrary(){

	}		

	public boolean initiatePasswordReset(AdminMgtInfoBean arg0,CaptchaInfoBean arg)  throws java.lang.Exception{

		this.initiatePasswordReset=stub.initiatePasswordReset(arg0,arg);
		return this.initiatePasswordReset;

	}

	private boolean initiatePasswordReset;

	public void  AssertinitiatePasswordReset(boolean expected) {	
		Assert.assertEquals(initiatePasswordReset , expected );		
	}
	public boolean updatePasswordWithUserInput(AdminMgtInfoBean arg0,CaptchaInfoBean arg1,String arg)  throws java.lang.Exception{

		this.updatePasswordWithUserInput=stub.updatePasswordWithUserInput(arg0,arg1,arg);
		return this.updatePasswordWithUserInput;

	}

	private boolean updatePasswordWithUserInput;

	public void  AssertupdatePasswordWithUserInput(boolean expected) {	
		Assert.assertEquals(updatePasswordWithUserInput , expected );		
	}
	public CaptchaInfoBean generateRandomCaptcha()  throws java.lang.Exception{

		this.generateRandomCaptcha=stub.generateRandomCaptcha();
		return this.generateRandomCaptcha;

	}

	private CaptchaInfoBean generateRandomCaptcha;

	public void  AssertgenerateRandomCaptcha(CaptchaInfoBean expected) {	
		Assert.assertEquals(generateRandomCaptcha , expected );		
	}


	public static void main(String[] args) {
		//AdminManagementServiceLibrary l=new AdminManagementServiceLibrary();
		//l.setX(10);
		//l.setY(25);
		//System.out.println(l.getSum());
	}

	public void initAdminManagementService() throws AxisFault {
		String sessionCookie=AuthenticationLibrary.sessionString;
		String serviceName = "AdminManagementService";
		String endPoint;
		//String host = PropertyInfo.read("host");
		//String port = PropertyInfo.read("port");
		String host = AutomationContext.context(AutomationContext.PRODUCT_HOST);
		String port = AutomationContext.context(AutomationContext.PRODUCT_PORT);
		String backEndUrl = "https://" + host + ":" + port + "/services/";
		endPoint = backEndUrl + serviceName;//+ "/services/" 
		stub = new AdminManagementServiceStub(endPoint);
		// Authenticate Your stub from sessionCooke
		ServiceClient serviceClient;
		Options option;

		serviceClient = stub._getServiceClient();
		option = serviceClient.getOptions();
		option.setManageSession(true);
		option.setProperty(org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,sessionCookie);
	}

}