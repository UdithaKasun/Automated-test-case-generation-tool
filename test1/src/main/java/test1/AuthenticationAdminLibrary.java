package test1;
import java.lang.reflect.Method;

import org.apache.axis2.context.xsd.MessageContext;
import org.junit.Assert;
import org.wso2.carbon.core.services.authentication.AuthenticationAdmin;
import org.wso2.carbon.core.services.authentication.AuthenticationAdminAuthenticationException_Exception;
import org.wso2.carbon.core.services.authentication.AuthenticationAdminPortType;
import org.wso2.carbon.core.services.authentication.xsd.RememberMeData;


public class AuthenticationAdminLibrary{
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	private boolean loginWithRememberMeCookie;
	private boolean authenticateWithRememberMe;
	private String getAuthenticatorName;
	private RememberMeData loginWithRememberMeOption;
	private boolean login;
	private boolean isDisabled;
	private int getPriority;

	AuthenticationAdminPortType c;		
	public AuthenticationAdminLibrary(){
		AuthenticationAdmin cs = new AuthenticationAdmin();
		c = cs.getAuthenticationAdminHttpsSoap11Endpoint();
	}		

	public void logout() throws AuthenticationAdminAuthenticationException_Exception{
		 c.logout();
	}
	public void  AssertloginWithRememberMeCookie(boolean expected) {	
		Assert.assertEquals(expected, loginWithRememberMeCookie);		
	}
	public boolean loginWithRememberMeCookie(String cookie) {
		this.loginWithRememberMeCookie= c.loginWithRememberMeCookie(cookie);
		return this.loginWithRememberMeCookie;
	}
	public void  AssertauthenticateWithRememberMe(boolean expected) {	
		Assert.assertEquals(expected, authenticateWithRememberMe);		
	}
	public boolean authenticateWithRememberMe(MessageContext messageContext) {
		this.authenticateWithRememberMe= c.authenticateWithRememberMe(messageContext);
		return this.authenticateWithRememberMe;
	}
	public void  AssertgetAuthenticatorName(String expected) {	
		Assert.assertEquals(expected, getAuthenticatorName);		
	}
	public String getAuthenticatorName() {
		this.getAuthenticatorName= c.getAuthenticatorName();
		return this.getAuthenticatorName;
	}
	public void  AssertloginWithRememberMeOption(RememberMeData expected) {	
		Assert.assertEquals(expected, loginWithRememberMeOption);		
	}
	public RememberMeData loginWithRememberMeOption(String username,String password,String remoteAddress) throws AuthenticationAdminAuthenticationException_Exception{
		this.loginWithRememberMeOption= c.loginWithRememberMeOption(username,password,remoteAddress);
		return this.loginWithRememberMeOption;
	}
	public void  Assertlogin(boolean expected) {	
		Assert.assertEquals(expected, login);		
	}
	public boolean login(String username,String password,String remoteAddress) throws AuthenticationAdminAuthenticationException_Exception{
		this.login= c.login(username,password,remoteAddress);
		return this.login;
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
		AuthenticationAdminLibrary li=null;
		
		Class<?> cl;
		try {
			cl = Class.forName("test1.AuthenticationAdminLibrary");
			for (Method m : cl.getMethods()) {
				System.out.println(m.getName());
				for (Class<?> c : m.getParameterTypes()) {
					System.out.print(c.getName()+" ");
				}
				System.out.println();
			}
		} catch (ClassNotFoundException e1) {
			System.out.println(e1.getMessage());
		}
		
		
		
		try {
			AuthenticationAdminLibrary l=new AuthenticationAdminLibrary();
			l.login("admin", "admin", "localhost");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}