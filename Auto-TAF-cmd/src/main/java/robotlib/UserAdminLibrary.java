package robotlib;
import lib.AuthenticationLibrary;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
//import org.junit.Assert;
import org.testng.Assert;
import property.PropertyInfo;
import property.AutomationContext;
import org.wso2.carbon.user.mgt.stub.types.carbon.UserRealmInfo;
import org.wso2.carbon.user.mgt.stub.types.carbon.UIPermissionNode;
import org.wso2.carbon.user.mgt.stub.types.carbon.FlaggedName;
import org.wso2.carbon.user.mgt.stub.types.carbon.ClaimValue;
import org.wso2.carbon.user.mgt.stub.UserAdminStub;
import javax.activation.DataHandler;


public class UserAdminLibrary{
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	private UserAdminStub stub;


	//Constructor		
	public UserAdminLibrary(){

	}		

	public FlaggedName[] listAllUsers(String arg0,int arg)  throws java.lang.Exception{

		this.listAllUsers=stub.listAllUsers(arg0,arg);
		return this.listAllUsers;

	}

	private FlaggedName[] listAllUsers;

	public void  AssertlistAllUsers(FlaggedName[] expected) {	
		Assert.assertEquals(listAllUsers , expected );		
	}
	public UIPermissionNode getRolePermissions(String arg)  throws java.lang.Exception{

		this.getRolePermissions=stub.getRolePermissions(arg);
		return this.getRolePermissions;

	}

	private UIPermissionNode getRolePermissions;

	public void  AssertgetRolePermissions(UIPermissionNode expected) {	
		Assert.assertEquals(getRolePermissions , expected );		
	}
	public void deleteUser(String arg)  throws java.lang.Exception{

	stub.deleteUser(arg);

	}

	public void deleteRole(String arg)  throws java.lang.Exception{

	stub.deleteRole(arg);

	}

	public void updateRolesOfUser(String arg0,String[] arg)  throws java.lang.Exception{

	stub.updateRolesOfUser(arg0,arg);

	}

	public void updateUsersOfRole(String arg0,FlaggedName[] arg)  throws java.lang.Exception{

	stub.updateUsersOfRole(arg0,arg);

	}

	public void addRemoveUsersOfRole(String arg0,String[] arg1,String[] arg)  throws java.lang.Exception{

	stub.addRemoveUsersOfRole(arg0,arg1,arg);

	}

	public void changePasswordByUser(String arg0,String arg)  throws java.lang.Exception{

	stub.changePasswordByUser(arg0,arg);

	}

	public void addUser(String arg0,String arg1,String[] arg2,ClaimValue[] arg3,String arg)  throws java.lang.Exception{

	stub.addUser(arg0,arg1,arg2,arg3,arg);

	}

	public void changePassword(String arg0,String arg)  throws java.lang.Exception{

	stub.changePassword(arg0,arg);

	}

	public void addInternalRole(String arg0,String[] arg1,String[] arg)  throws java.lang.Exception{

	stub.addInternalRole(arg0,arg1,arg);

	}

	public void addRole(String arg0,String[] arg1,String[] arg2,boolean arg)  throws java.lang.Exception{

	stub.addRole(arg0,arg1,arg2,arg);

	}

	public FlaggedName[] listUserByClaim(ClaimValue arg0,String arg1,int arg)  throws java.lang.Exception{

		this.listUserByClaim=stub.listUserByClaim(arg0,arg1,arg);
		return this.listUserByClaim;

	}

	private FlaggedName[] listUserByClaim;

	public void  AssertlistUserByClaim(FlaggedName[] expected) {	
		Assert.assertEquals(listUserByClaim , expected );		
	}
	public FlaggedName[] getRolesOfCurrentUser()  throws java.lang.Exception{

		this.getRolesOfCurrentUser=stub.getRolesOfCurrentUser();
		return this.getRolesOfCurrentUser;

	}

	private FlaggedName[] getRolesOfCurrentUser;

	public void  AssertgetRolesOfCurrentUser(FlaggedName[] expected) {	
		Assert.assertEquals(getRolesOfCurrentUser , expected );		
	}
	public void addRemoveRolesOfUser(String arg0,String[] arg1,String[] arg)  throws java.lang.Exception{

	stub.addRemoveRolesOfUser(arg0,arg1,arg);

	}

	public FlaggedName[] getUsersOfRole(String arg0,String arg1,int arg)  throws java.lang.Exception{

		this.getUsersOfRole=stub.getUsersOfRole(arg0,arg1,arg);
		return this.getUsersOfRole;

	}

	private FlaggedName[] getUsersOfRole;

	public void  AssertgetUsersOfRole(FlaggedName[] expected) {	
		Assert.assertEquals(getUsersOfRole , expected );		
	}
	public UIPermissionNode getAllUIPermissions()  throws java.lang.Exception{

		this.getAllUIPermissions=stub.getAllUIPermissions();
		return this.getAllUIPermissions;

	}

	private UIPermissionNode getAllUIPermissions;

	public void  AssertgetAllUIPermissions(UIPermissionNode expected) {	
		Assert.assertEquals(getAllUIPermissions , expected );		
	}
	public String[] listUsers(String arg0,int arg)  throws java.lang.Exception{

		this.listUsers=stub.listUsers(arg0,arg);
		return this.listUsers;

	}

	private String[] listUsers;

	public void  AssertlistUsers(String[] expected) {	
		Assert.assertEquals(listUsers , expected );		
	}
	public FlaggedName[] getAllSharedRoleNames(String arg0,int arg)  throws java.lang.Exception{

		this.getAllSharedRoleNames=stub.getAllSharedRoleNames(arg0,arg);
		return this.getAllSharedRoleNames;

	}

	private FlaggedName[] getAllSharedRoleNames;

	public void  AssertgetAllSharedRoleNames(FlaggedName[] expected) {	
		Assert.assertEquals(getAllSharedRoleNames , expected );		
	}
	public FlaggedName[] getAllRolesNames(String arg0,int arg)  throws java.lang.Exception{

		this.getAllRolesNames=stub.getAllRolesNames(arg0,arg);
		return this.getAllRolesNames;

	}

	private FlaggedName[] getAllRolesNames;

	public void  AssertgetAllRolesNames(FlaggedName[] expected) {	
		Assert.assertEquals(getAllRolesNames , expected );		
	}
	public void bulkImportUsers(String arg0,DataHandler arg1,String arg)  throws java.lang.Exception{

	stub.bulkImportUsers(arg0,arg1,arg);

	}

	public void setRoleUIPermission(String arg0,String[] arg)  throws java.lang.Exception{

	stub.setRoleUIPermission(arg0,arg);

	}

	public boolean hasMultipleUserStores()  throws java.lang.Exception{

		this.hasMultipleUserStores=stub.hasMultipleUserStores();
		return this.hasMultipleUserStores;

	}

	private boolean hasMultipleUserStores;

	public void  AsserthasMultipleUserStores(boolean expected) {	
		Assert.assertEquals(hasMultipleUserStores , expected );		
	}
	public UserRealmInfo getUserRealmInfo()  throws java.lang.Exception{

		this.getUserRealmInfo=stub.getUserRealmInfo();
		return this.getUserRealmInfo;

	}

	private UserRealmInfo getUserRealmInfo;

	public void  AssertgetUserRealmInfo(UserRealmInfo expected) {	
		Assert.assertEquals(getUserRealmInfo , expected );		
	}
	public void updateRoleName(String arg0,String arg)  throws java.lang.Exception{

	stub.updateRoleName(arg0,arg);

	}

	public FlaggedName[] getRolesOfUser(String arg0,String arg1,int arg)  throws java.lang.Exception{

		this.getRolesOfUser=stub.getRolesOfUser(arg0,arg1,arg);
		return this.getRolesOfUser;

	}

	private FlaggedName[] getRolesOfUser;

	public void  AssertgetRolesOfUser(FlaggedName[] expected) {	
		Assert.assertEquals(getRolesOfUser , expected );		
	}
	public boolean isSharedRolesEnabled()  throws java.lang.Exception{

		this.isSharedRolesEnabled=stub.isSharedRolesEnabled();
		return this.isSharedRolesEnabled;

	}

	private boolean isSharedRolesEnabled;

	public void  AssertisSharedRolesEnabled(boolean expected) {	
		Assert.assertEquals(isSharedRolesEnabled , expected );		
	}


	public static void main(String[] args) {
		//UserAdminLibrary l=new UserAdminLibrary();
		//l.setX(10);
		//l.setY(25);
		//System.out.println(l.getSum());
	}

	public void initUserAdmin() throws AxisFault {
		String sessionCookie=AuthenticationLibrary.sessionString;
		String serviceName = "UserAdmin";
		String endPoint;
		//String host = PropertyInfo.read("host");
		//String port = PropertyInfo.read("port");
		String host = AutomationContext.context(AutomationContext.PRODUCT_HOST);
		String port = AutomationContext.context(AutomationContext.PRODUCT_PORT);
		String backEndUrl = "https://" + host + ":" + port + "/services/";
		endPoint = backEndUrl + serviceName;//+ "/services/" 
		stub = new UserAdminStub(endPoint);
		// Authenticate Your stub from sessionCooke
		ServiceClient serviceClient;
		Options option;

		serviceClient = stub._getServiceClient();
		option = serviceClient.getOptions();
		option.setManageSession(true);
		option.setProperty(org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,sessionCookie);
	}

}