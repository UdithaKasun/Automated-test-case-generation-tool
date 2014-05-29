package test1;
import org.junit.Assert;
import java.util.List;

import org.wso2.carbon.application.mgt.synapse.Exception;
import org.wso2.carbon.application.mgt.synapse.xsd.SynapseApplicationMetadata;
import org.wso2.carbon.application.mgt.synapse.xsd.EndpointMetadata;
import org.wso2.carbon.application.mgt.synapse.xsd.TaskMetadata;
import org.wso2.carbon.application.mgt.synapse.*;


public class SynapseApplicationAdminLibrary{
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	private SynapseApplicationMetadata getSynapseAppData;

	SynapseApplicationAdminPortType c;		
	public SynapseApplicationAdminLibrary(){
		SynapseApplicationAdmin cs = new SynapseApplicationAdmin();
		c = cs.getSynapseApplicationAdminHttpsSoap11Endpoint();
	}		

	public void  AssertgetSynapseAppData(SynapseApplicationMetadata expected) {	
		Assert.assertEquals(expected, getSynapseAppData);		
	}
	public SynapseApplicationMetadata getSynapseAppData(String appName) throws SynapseApplicationAdminException_Exception{
		this.getSynapseAppData= c.getSynapseAppData(appName);
		return this.getSynapseAppData;
	}


	public static void main(String[] args) {
		SynapseApplicationAdminLibrary l=new SynapseApplicationAdminLibrary();
		//l.setX(10);
		//l.setY(25);
		//System.out.println(l.getSum());
	}
}