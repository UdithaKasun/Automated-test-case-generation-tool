package test1;
import org.junit.Assert;
import java.util.List;

import org.wso2.carbon.user.mgt.common.xsd.UserAdminException;
import org.wso2.carbon.user.mgt.common.xsd.FlaggedName;
import org.wso2.carbon.user.mgt.common.xsd.ClaimValue;
import org.wso2.carbon.user.mgt.common.xsd.UserRealmInfo;
import org.wso2.carbon.user.mgt.common.xsd.UserStoreInfo;
import org.wso2.carbon.user.mgt.common.xsd.UIPermissionNode;
import org.wso2.carbon.user.mgt.*;


public class UserAdminLibrary{
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	private List<FlaggedName> getAllRolesNames;
	private List<FlaggedName> getAllSharedRoleNames;
	private List<FlaggedName> getRolesOfUser;
	private List<String> listUsers;
	private UIPermissionNode getRolePermissions;
	private boolean isSharedRolesEnabled;
	private List<FlaggedName> getUsersOfRole;
	private UserRealmInfo getUserRealmInfo;
	private List<FlaggedName> listAllUsers;
	private UIPermissionNode getAllUIPermissions;
	private List<FlaggedName> getRolesOfCurrentUser;
	private List<FlaggedName> listUserByClaim;
	private boolean hasMultipleUserStores;

	UserAdminPortType c;		
	public UserAdminLibrary(){
		UserAdmin cs = new UserAdmin();
		c = cs.getUserAdminHttpsSoap11Endpoint();
	}		

	public void addInternalRole(String roleName,List<String> userList,List<String> permissions) throws UserAdminUserAdminException{
		 c.addInternalRole(roleName,userList,permissions);
	}
	public void changePassword(String userName,String newPassword) throws UserAdminUserAdminException{
		 c.changePassword(userName,newPassword);
	}
	public void addRemoveUsersOfRole(String roleName,List<String> newUsers,List<String> deletedUsers) throws UserAdminUserAdminException{
		 c.addRemoveUsersOfRole(roleName,newUsers,deletedUsers);
	}
	public void  AssertgetAllRolesNames(List<FlaggedName> expected) {	
		Assert.assertEquals(expected, getAllRolesNames);		
	}
	public List<FlaggedName> getAllRolesNames(String filter,int limit) throws UserAdminUserAdminException{
		this.getAllRolesNames= c.getAllRolesNames(filter,limit);
		return this.getAllRolesNames;
	}
	public void  AssertgetAllSharedRoleNames(List<FlaggedName> expected) {	
		Assert.assertEquals(expected, getAllSharedRoleNames);		
	}
	public List<FlaggedName> getAllSharedRoleNames(String filter,int limit) throws UserAdminUserAdminException{
		this.getAllSharedRoleNames= c.getAllSharedRoleNames(filter,limit);
		return this.getAllSharedRoleNames;
	}
	public void updateUsersOfRole(String roleName,List<FlaggedName> userList) throws UserAdminUserAdminException{
		 c.updateUsersOfRole(roleName,userList);
	}
	public void  AssertgetRolesOfUser(List<FlaggedName> expected) {	
		Assert.assertEquals(expected, getRolesOfUser);		
	}
	public List<FlaggedName> getRolesOfUser(String userName,String filter,int limit) throws UserAdminUserAdminException{
		this.getRolesOfUser= c.getRolesOfUser(userName,filter,limit);
		return this.getRolesOfUser;
	}
	public void  AssertlistUsers(List<String> expected) {	
		Assert.assertEquals(expected, listUsers);		
	}
	public List<String> listUsers(String filter,int limit) throws UserAdminUserAdminException{
		this.listUsers= c.listUsers(filter,limit);
		return this.listUsers;
	}
	public void updateRolesOfUser(String userName,List<String> newUserList) throws UserAdminUserAdminException{
		 c.updateRolesOfUser(userName,newUserList);
	}
	public void deleteUser(String userName) throws UserAdminUserAdminException{
		 c.deleteUser(userName);
	}
	public void deleteRole(String roleName) throws UserAdminUserAdminException{
		 c.deleteRole(roleName);
	}
	public void bulkImportUsers(String fileName,base64Binary handler,String defaultPassword) throws UserAdminUserAdminException{
		 c.bulkImportUsers(fileName,handler,defaultPassword);
	}
	public void  AssertgetRolePermissions(UIPermissionNode expected) {	
		Assert.assertEquals(expected, getRolePermissions);		
	}
	public UIPermissionNode getRolePermissions(String roleName) throws UserAdminUserAdminException{
		this.getRolePermissions= c.getRolePermissions(roleName);
		return this.getRolePermissions;
	}
	public void  AssertisSharedRolesEnabled(boolean expected) {	
		Assert.assertEquals(expected, isSharedRolesEnabled);		
	}
	public boolean isSharedRolesEnabled() throws UserAdminUserAdminException{
		this.isSharedRolesEnabled= c.isSharedRolesEnabled();
		return this.isSharedRolesEnabled;
	}
	public void updateRoleName(String roleName,String newRoleName) throws UserAdminUserAdminException{
		 c.updateRoleName(roleName,newRoleName);
	}
	public void  AssertgetUsersOfRole(List<FlaggedName> expected) {	
		Assert.assertEquals(expected, getUsersOfRole);		
	}
	public List<FlaggedName> getUsersOfRole(String roleName,String filter,int limit) throws UserAdminUserAdminException{
		this.getUsersOfRole= c.getUsersOfRole(roleName,filter,limit);
		return this.getUsersOfRole;
	}
	public void  AssertgetUserRealmInfo(UserRealmInfo expected) {	
		Assert.assertEquals(expected, getUserRealmInfo);		
	}
	public UserRealmInfo getUserRealmInfo() throws UserAdminUserAdminException{
		this.getUserRealmInfo= c.getUserRealmInfo();
		return this.getUserRealmInfo;
	}
	public void setRoleUIPermission(String roleName,List<String> rawResources) throws UserAdminUserAdminException{
		 c.setRoleUIPermission(roleName,rawResources);
	}
	public void changePasswordByUser(String oldPassword,String newPassword) throws UserAdminUserAdminException{
		 c.changePasswordByUser(oldPassword,newPassword);
	}
	public void  AssertlistAllUsers(List<FlaggedName> expected) {	
		Assert.assertEquals(expected, listAllUsers);		
	}
	public List<FlaggedName> listAllUsers(String filter,int limit) throws UserAdminUserAdminException{
		this.listAllUsers= c.listAllUsers(filter,limit);
		return this.listAllUsers;
	}
	public void addRemoveRolesOfUser(String userName,List<String> newRoles,List<String> deletedRoles) throws UserAdminUserAdminException{
		 c.addRemoveRolesOfUser(userName,newRoles,deletedRoles);
	}
	public void addUser(String userName,String password,List<String> roles,List<ClaimValue> claims,String profileName) throws UserAdminUserAdminException{
		 c.addUser(userName,password,roles,claims,profileName);
	}
	public void addRole(String roleName,List<String> userList,List<String> permissions,boolean isSharedRole) throws UserAdminUserAdminException{
		 c.addRole(roleName,userList,permissions,isSharedRole);
	}
	public void  AssertgetAllUIPermissions(UIPermissionNode expected) {	
		Assert.assertEquals(expected, getAllUIPermissions);		
	}
	public UIPermissionNode getAllUIPermissions() throws UserAdminUserAdminException{
		this.getAllUIPermissions= c.getAllUIPermissions();
		return this.getAllUIPermissions;
	}
	public void  AssertgetRolesOfCurrentUser(List<FlaggedName> expected) {	
		Assert.assertEquals(expected, getRolesOfCurrentUser);		
	}
	public List<FlaggedName> getRolesOfCurrentUser() throws UserAdminUserAdminException{
		this.getRolesOfCurrentUser= c.getRolesOfCurrentUser();
		return this.getRolesOfCurrentUser;
	}
	public void  AssertlistUserByClaim(List<FlaggedName> expected) {	
		Assert.assertEquals(expected, listUserByClaim);		
	}
	public List<FlaggedName> listUserByClaim(ClaimValue claimValue,String filter,int maxLimit) throws UserAdminUserAdminException{
		this.listUserByClaim= c.listUserByClaim(claimValue,filter,maxLimit);
		return this.listUserByClaim;
	}
	public void  AsserthasMultipleUserStores(boolean expected) {	
		Assert.assertEquals(expected, hasMultipleUserStores);		
	}
	public boolean hasMultipleUserStores() throws UserAdminUserAdminException{
		this.hasMultipleUserStores= c.hasMultipleUserStores();
		return this.hasMultipleUserStores;
	}


	public static void main(String[] args) {
		UserAdminLibrary l=new UserAdminLibrary();
		//l.setX(10);
		//l.setY(25);
		//System.out.println(l.getSum());
	}
}