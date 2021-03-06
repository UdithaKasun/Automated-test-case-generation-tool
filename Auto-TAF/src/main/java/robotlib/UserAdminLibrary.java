package robotlib;
import javax.activation.DataHandler;

import lib.AuthenticationLibrary;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.testng.Assert;
import org.wso2.carbon.user.mgt.stub.UserAdminStub;
import org.wso2.carbon.user.mgt.stub.types.carbon.ClaimValue;
import org.wso2.carbon.user.mgt.stub.types.carbon.FlaggedName;
import org.wso2.carbon.user.mgt.stub.types.carbon.UIPermissionNode;
import org.wso2.carbon.user.mgt.stub.types.carbon.UserRealmInfo;


public class UserAdminLibrary{
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	private UserAdminStub stub;


	private FlaggedName[] getAllRolesNames;
	private FlaggedName[] getAllSharedRoleNames;
	private FlaggedName[] getRolesOfUser;
	private String[] listUsers;
	private UIPermissionNode getRolePermissions;
	private boolean isSharedRolesEnabled;
	private FlaggedName[] getUsersOfRole;
	private UserRealmInfo getUserRealmInfo;
	private FlaggedName[] listAllUsers;
	private UIPermissionNode getAllUIPermissions;
	private FlaggedName[] getRolesOfCurrentUser;
	private FlaggedName[] listUserByClaim;
	private boolean hasMultipleUserStores;

	//Constructor		
	public UserAdminLibrary(){

	}		

	public void addInternalRole(String roleName,String[] userList,String[] permissions)  throws java.lang.Exception{
		 stub.addInternalRole(roleName,userList,permissions);
	}
	public void changePassword(String userName,String newPassword)  throws java.lang.Exception{
		 stub.changePassword(userName,newPassword);
	}
	public void addRemoveUsersOfRole(String roleName,String[] newUsers,String[] deletedUsers)  throws java.lang.Exception{
		 stub.addRemoveUsersOfRole(roleName,newUsers,deletedUsers);
	}
	public void  AssertgetAllRolesNames(FlaggedName[] expected) {	
		Assert.assertEquals(expected, getAllRolesNames);		
	}
	public FlaggedName[] getAllRolesNames(String filter,int limit)  throws java.lang.Exception{
		this.getAllRolesNames= stub.getAllRolesNames(filter,limit);
		return this.getAllRolesNames;
	}
	public void  AssertgetAllSharedRoleNames(FlaggedName[] expected) {	
		Assert.assertEquals(expected, getAllSharedRoleNames);		
	}
	public FlaggedName[] getAllSharedRoleNames(String filter,int limit)  throws java.lang.Exception{
		this.getAllSharedRoleNames= stub.getAllSharedRoleNames(filter,limit);
		return this.getAllSharedRoleNames;
	}
	public void updateUsersOfRole(String roleName,FlaggedName[] userList)  throws java.lang.Exception{
		 stub.updateUsersOfRole(roleName,userList);
	}
	public void  AssertgetRolesOfUser(FlaggedName[] expected) {	
		Assert.assertEquals(expected, getRolesOfUser);		
	}
	public FlaggedName[] getRolesOfUser(String userName,String filter,int limit)  throws java.lang.Exception{
		this.getRolesOfUser= stub.getRolesOfUser(userName,filter,limit);
		return this.getRolesOfUser;
	}
	public void  AssertlistUsers(String[] expected) {	
		Assert.assertEquals(expected, listUsers);		
	}
	public String[] listUsers(String filter,int limit)  throws java.lang.Exception{
		this.listUsers= stub.listUsers(filter,limit);
		return this.listUsers;
	}
	public void updateRolesOfUser(String userName,String[] newUserList)  throws java.lang.Exception{
		 stub.updateRolesOfUser(userName,newUserList);
	}
	public void deleteUser(String userName)  throws java.lang.Exception{
		 stub.deleteUser(userName);
	}
	public void deleteRole(String roleName)  throws java.lang.Exception{
		 stub.deleteRole(roleName);
	}
	public void bulkImportUsers(String fileName,DataHandler handler,String defaultPassword)  throws java.lang.Exception{
		 stub.bulkImportUsers(fileName,handler,defaultPassword);
	}
	public void  AssertgetRolePermissions(UIPermissionNode expected) {	
		Assert.assertEquals(expected, getRolePermissions);		
	}
	public UIPermissionNode getRolePermissions(String roleName)  throws java.lang.Exception{
		this.getRolePermissions= stub.getRolePermissions(roleName);
		return this.getRolePermissions;
	}
	public void  AssertisSharedRolesEnabled(boolean expected) {	
		Assert.assertEquals(expected, isSharedRolesEnabled);		
	}
	public boolean isSharedRolesEnabled()  throws java.lang.Exception{
		this.isSharedRolesEnabled= stub.isSharedRolesEnabled();
		return this.isSharedRolesEnabled;
	}
	public void updateRoleName(String roleName,String newRoleName)  throws java.lang.Exception{
		 stub.updateRoleName(roleName,newRoleName);
	}
	public void  AssertgetUsersOfRole(FlaggedName[] expected) {	
		Assert.assertEquals(expected, getUsersOfRole);		
	}
	public FlaggedName[] getUsersOfRole(String roleName,String filter,int limit)  throws java.lang.Exception{
		this.getUsersOfRole= stub.getUsersOfRole(roleName,filter,limit);
		return this.getUsersOfRole;
	}
	public void  AssertgetUserRealmInfo(UserRealmInfo expected) {	
		Assert.assertEquals(expected, getUserRealmInfo);		
	}
	public UserRealmInfo getUserRealmInfo()  throws java.lang.Exception{
		this.getUserRealmInfo= stub.getUserRealmInfo();
		return this.getUserRealmInfo;
	}
	public void setRoleUIPermission(String roleName,String[] rawResources)  throws java.lang.Exception{
		 stub.setRoleUIPermission(roleName,rawResources);
	}
	public void changePasswordByUser(String oldPassword,String newPassword)  throws java.lang.Exception{
		 stub.changePasswordByUser(oldPassword,newPassword);
	}
	public void  AssertlistAllUsers(FlaggedName[] expected) {	
		Assert.assertEquals(expected, listAllUsers);		
	}
	public FlaggedName[] listAllUsers(String filter,int limit)  throws java.lang.Exception{
		this.listAllUsers= stub.listAllUsers(filter,limit);
		return this.listAllUsers;
	}
	public void addRemoveRolesOfUser(String userName,String[] newRoles,String[] deletedRoles)  throws java.lang.Exception{
		 stub.addRemoveRolesOfUser(userName,newRoles,deletedRoles);
	}
	public void addUser(String userName,String password,String[] roles,ClaimValue[] claims,String profileName)  throws java.lang.Exception{
		 stub.addUser(userName,password,roles,claims,profileName);
	}
	public void addRole(String roleName,String[] userList,String[] permissions,boolean isSharedRole)  throws java.lang.Exception{
		 stub.addRole(roleName,userList,permissions,isSharedRole);
	}
	public void  AssertgetAllUIPermissions(UIPermissionNode expected) {	
		Assert.assertEquals(expected, getAllUIPermissions);		
	}
	public UIPermissionNode getAllUIPermissions()  throws java.lang.Exception{
		this.getAllUIPermissions= stub.getAllUIPermissions();
		return this.getAllUIPermissions;
	}
	public void  AssertgetRolesOfCurrentUser(FlaggedName[] expected) {	
		Assert.assertEquals(expected, getRolesOfCurrentUser);		
	}
	public FlaggedName[] getRolesOfCurrentUser()  throws java.lang.Exception{
		this.getRolesOfCurrentUser= stub.getRolesOfCurrentUser();
		return this.getRolesOfCurrentUser;
	}
	public void  AssertlistUserByClaim(FlaggedName[] expected) {	
		Assert.assertEquals(expected, listUserByClaim);		
	}
	public FlaggedName[] listUserByClaim(ClaimValue claimValue,String filter,int maxLimit)  throws java.lang.Exception{
		this.listUserByClaim= stub.listUserByClaim(claimValue,filter,maxLimit);
		return this.listUserByClaim;
	}
	public void  AsserthasMultipleUserStores(boolean expected) {	
		Assert.assertEquals(expected, hasMultipleUserStores);		
	}
	public boolean hasMultipleUserStores()  throws java.lang.Exception{
		this.hasMultipleUserStores= stub.hasMultipleUserStores();
		return this.hasMultipleUserStores;
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
		String backEndUrl = "https://localhost:9443/services/";
		endPoint = backEndUrl + "/services/" + serviceName;
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