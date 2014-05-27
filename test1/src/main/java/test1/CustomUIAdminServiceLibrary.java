package test1;
import org.junit.Assert;
import org.wso2.carbon.registry.custom.services.CustomUIAdminService;
import org.wso2.carbon.registry.custom.services.CustomUIAdminServiceException_Exception;
import org.wso2.carbon.registry.custom.services.CustomUIAdminServicePortType;


public class CustomUIAdminServiceLibrary{
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	private boolean isAuthorized;
	private boolean updateTextContent;
	private boolean addTextContent;
	private String getTextContent;

	CustomUIAdminServicePortType c;		
	public CustomUIAdminServiceLibrary(){
		CustomUIAdminService cs = new CustomUIAdminService();
		c = cs.getCustomUIAdminServiceHttpsSoap11Endpoint();
	}		

	public void  AssertisAuthorized(boolean expected) {	
		Assert.assertEquals(expected, isAuthorized);		
	}
	public boolean isAuthorized(String path,String action) {
		this.isAuthorized= c.isAuthorized(path,action);
		return this.isAuthorized;
	}
	public void  AssertupdateTextContent(boolean expected) {	
		Assert.assertEquals(expected, updateTextContent);		
	}
	public boolean updateTextContent(String path,String content) throws CustomUIAdminServiceException_Exception{
		this.updateTextContent= c.updateTextContent(path,content);
		return this.updateTextContent;
	}
	public void  AssertaddTextContent(boolean expected) {	
		Assert.assertEquals(expected, addTextContent);		
	}
	public boolean addTextContent(String parentPath,String resourceName,String mediaType,String description,String content) throws CustomUIAdminServiceException_Exception{
		this.addTextContent= c.addTextContent(parentPath,resourceName,mediaType,description,content);
		return this.addTextContent;
	}
	public void  AssertgetTextContent(String expected) {	
		Assert.assertEquals(expected, getTextContent);		
	}
	public String getTextContent(String path) throws CustomUIAdminServiceException_Exception{
		this.getTextContent= c.getTextContent(path);
		return this.getTextContent;
	}


	public static void main(String[] args) {
//		/home/rukshan/Desktop/companykeystore.jks
//		 System.setProperty("javax.net.ssl.trustStore", "/home/rukshan/Desktop/companykeystore.jks");
//		 System.setProperty("javax.net.ssl.trustStorePassword", "rukshan17806");
//		 System.setProperty("javax.net.ssl.trustStoreType", "JKS");
		 System.setProperty("javax.net.ssl.trustStore", "${carbon.home}/repository/resources/security/wso2Carbon.jks");
		 System.setProperty("javax.net.ssl.trustStorePassword","wso2Carbon");
		 System.setProperty("javax.net.ssl.trustStoreType", "JKS");
		 
		try {
			CustomUIAdminServiceLibrary l = new CustomUIAdminServiceLibrary();
			
			l.isAuthorized("", "");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}