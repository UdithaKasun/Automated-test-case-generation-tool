package test1;
import org.junit.Assert;
import java.util.List;

import org.wso2.carbon.registry.custom.services.Exception;
import org.wso2.carbon.registry.custom.services.*;


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
		CustomUIAdminServiceLibrary l=new CustomUIAdminServiceLibrary();
		//l.setX(10);
		//l.setY(25);
		//System.out.println(l.getSum());
	}
}