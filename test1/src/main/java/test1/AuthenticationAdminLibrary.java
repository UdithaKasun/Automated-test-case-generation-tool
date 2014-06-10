package test1;
import java.net.URL;

import org.junit.Assert;
import org.wso2.carbon.core.services.authentication.AuthenticationAdmin;
import org.wso2.carbon.core.services.authentication.AuthenticationAdminPortType;
import org.wso2.carbon.core.services.authentication.xsd.RememberMeData;


public class AuthenticationAdminLibrary{
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	private boolean loginWithRememberMeCookie;
	private String getAuthenticatorName;
	private boolean login;
	private RememberMeData loginWithRememberMeOption;
	private boolean isDisabled;
	private int getPriority;

	AuthenticationAdminPortType c;		
	public AuthenticationAdminLibrary(){
		AuthenticationAdmin cs = new AuthenticationAdmin();
		c = cs.getAuthenticationAdminHttpsSoap11Endpoint();
	}		

	public void logout() throws java.lang.Exception{
		 c.logout();
	}
	public void  AssertloginWithRememberMeCookie(boolean expected) {	
		Assert.assertEquals(expected, loginWithRememberMeCookie);		
	}
	public boolean loginWithRememberMeCookie(String cookie) {
		this.loginWithRememberMeCookie= c.loginWithRememberMeCookie(cookie);
		return this.loginWithRememberMeCookie;
	}
	public void  AssertgetAuthenticatorName(String expected) {	
		Assert.assertEquals(expected, getAuthenticatorName);		
	}
	public String getAuthenticatorName() {
		this.getAuthenticatorName= c.getAuthenticatorName();
		return this.getAuthenticatorName;
	}
	public void  Assertlogin(boolean expected) {	
		Assert.assertEquals(expected, login);		
	}
	public boolean login(String username,String password,String remoteAddress) throws java.lang.Exception{
		this.login= c.login(username,password,remoteAddress);
		return this.login;
	}
	public void  AssertloginWithRememberMeOption(RememberMeData expected) {	
		Assert.assertEquals(expected, loginWithRememberMeOption);		
	}
	public RememberMeData loginWithRememberMeOption(String username,String password,String remoteAddress) throws java.lang.Exception{
		this.loginWithRememberMeOption= c.loginWithRememberMeOption(username,password,remoteAddress);
		return this.loginWithRememberMeOption;
	}
	public void  AssertisDisabled(boolean expected) {	
		Assert.assertEquals(expected, isDisabled);		
	}
	public boolean isDisabled() {
		this.isDisabled= c.isDisabled();
		return this.isDisabled;
	}
	public void  AssertgetPriority(int expected) {	
		Assert.assertEquals(expected, getPriority);		
	}
	public int getPriority() {
		this.getPriority= c.getPriority();
		return this.getPriority;
	}


	public static void main(String[] args) {
		AuthenticationAdminLibrary l=new AuthenticationAdminLibrary();
		try {
			l.login("admin","admin","localhost:9443/services");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}