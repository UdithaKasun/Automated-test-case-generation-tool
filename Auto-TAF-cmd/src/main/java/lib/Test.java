package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.apache.axiom.om.OMElement;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.w3c.dom.Document;
import org.wso2.carbon.aarservices.stub.UploadService;
import org.wso2.carbon.aarservices.stub.types.carbon.AARServiceData;
import org.wso2.carbon.admin.mgt.stub.AdminManagementServiceStub;
import org.wso2.carbon.discovery.admin.stub.types.mgt.ServiceDiscoveryConfig;
import org.wso2.carbon.registry.info.stub.InfoAdminServiceStub;
import org.wso2.carbon.service.mgt.stub.ServiceAdminStub;
import org.wso2.carbon.service.mgt.stub.types.carbon.ServiceMetaData;
import org.wso2.carbon.statistics.stub.StatisticsAdminStub;
import org.wso2.carbon.statistics.stub.types.carbon.SystemStatistics;
import org.wso2.carbon.user.mgt.stub.UserAdminStub;
import org.wso2.carbon.user.mgt.stub.types.carbon.UserRealmInfo;

import property.AutomationContext;
import robotlib.ServiceUploaderLibrary;

import org.wso2.carbon.automation.utils.esb.StockQuoteClient;

public class Test {

	static String sessionCookie;

	public static void main1(String[] args) {
		// TODO Auto-generated method stub

		AuthenticationLibrary al = new AuthenticationLibrary();
		sessionCookie = al.LoginAs("admin", "admin", "localhost");

		// PropertyInfo.set("host","localhost");
		// PropertyInfo.set("port","9443");
		// PropertyInfo i=new PropertyInfo();
		// System.out.println(PropertyInfo.read("host"));
		// System.out.println(PropertyInfo.read("port"));
		// Class<?> c;
		// try {
		// c = Class
		// .forName("org.wso2.carbon.service.mgt.stub.ServiceAdminStub");
		// InputStream input = c.getResourceAsStream("/ServiceAdmin.wsdl");
		// WSDLParser parser = new WSDLParser();
		// Definitions defs = parser.parse(input);
		// for (PortType pt : defs.getPortTypes()) {
		// for (Operation op : pt.getOperations()) {
		// System.out.println(op.getName());
		// }
		// }
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// StringTemplate query = new StringTemplate("hello " +
		// "$if(paramEquals)$" +
		// " it works! " +
		// "$endif$ " +
		// "world");
		// query.setAttribute("paramEquals", param.equals("val1"));
		// System.out.println("result: "+query.toString());

		// ServiceAdmin();
		// discoveryAdmin();
		// InputStream input = c.getResourceAsStream(wsdl);
		// try {
		// WSDLParser parser = new WSDLParser();
		// String wsdl="http://ubuntu:8280/services/echo?wsdl";
		// Definitions defs = parser.parse(wsdl);
		// System.out.println(defs.getTargetNamespace());
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }

		// ServiceAdminLibrary l = new ServiceAdminLibrary();
		// try {
		// l.initServiceAdmin();
		// System.out.println(l.getNumberOfActiveServices());
		// System.out.println(l.getServiceData("echo").getServiceType());
		// ServiceMetaData m = new ServiceMetaData();
		// m.setActive(true);
		// m.setServiceType("proxy");
		// // OMElement o=new
		//
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }

	}

	public static void objectLog(ServiceDiscoveryConfig object) {
		System.out.println(object.isEnabledSpecified());
	}

	public static void discoveryAdmin() {
		// DiscoveryAdminLibrary l = new DiscoveryAdminLibrary();

		// try {
		// l.initDiscoveryAdmin();
		// System.out.println(l.getServiceDiscoveryConfig()
		// .isProxyURLSpecified());
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }
	}

	public static void ServiceAdmin() {
		try {
			String serviceName = "ServiceAdmin";
			ServiceAdminStub stub;
			String backEndUrl = "https://localhost:9443/services";
			String endPoint = backEndUrl + "/services/" + serviceName;
			stub = new ServiceAdminStub(endPoint);
			// Authenticate Your stub from sessionCooke
			ServiceClient serviceClient;
			Options option;

			serviceClient = stub._getServiceClient();
			option = serviceClient.getOptions();
			option.setManageSession(true);
			option.setProperty(
					org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,
					sessionCookie);

			System.out.println(stub.getNumberOfActiveServices());
			// System.out.println(stub.isUserValid("admin", "user"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// ServiceAdminLibrary li = new ServiceAdminLibrary();
		// try {
		// li.initServiceAdmin();
		// System.out.println(li.getNumberOfActiveServices());
		// li.AssertgetNumberOfActiveServices(4);
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }

	}

	public static void AdminManagementService() {
		try {
			String serviceName = "AdminManagementService";
			AdminManagementServiceStub stub;
			String backEndUrl = "https://localhost:9443";
			String endPoint = backEndUrl + "/services/" + serviceName;
			stub = new AdminManagementServiceStub(endPoint);
			// Authenticate Your stub from sessionCooke
			ServiceClient serviceClient;
			Options option;

			serviceClient = stub._getServiceClient();
			option = serviceClient.getOptions();
			option.setManageSession(true);
			option.setProperty(
					org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,
					sessionCookie);

			System.out.println(stub.generateRandomCaptcha());
			// System.out.println(stub.isUserValid("admin", "user"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void InfoAdminService() {
		try {
			String serviceName = "InfoAdminService";
			InfoAdminServiceStub stub;
			String backEndUrl = "https://localhost:9443";
			String endPoint = backEndUrl + "/services/" + serviceName;
			stub = new InfoAdminServiceStub(endPoint);
			// Authenticate Your stub from sessionCooke
			ServiceClient serviceClient;
			Options option;

			serviceClient = stub._getServiceClient();
			option = serviceClient.getOptions();
			option.setManageSession(true);
			option.setProperty(
					org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,
					sessionCookie);

			System.out.println(stub.isProfileExisting("admin", "admin"));
			System.out.println(stub.isUserValid("admin", "user"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void StatisticsAdmin() {
		try {
			String serviceName = "StatisticsAdmin";
			StatisticsAdminStub statisticsAdminStub;
			String backEndUrl = "https://localhost:9443/services/";
			String endPoint = backEndUrl + "/services/" + serviceName;
			statisticsAdminStub = new StatisticsAdminStub(endPoint);
			// Authenticate Your stub from sessionCooke
			ServiceClient serviceClient;
			Options option;

			serviceClient = statisticsAdminStub._getServiceClient();
			option = serviceClient.getOptions();
			option.setManageSession(true);
			option.setProperty(
					org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,
					sessionCookie);

			SystemStatistics stat = statisticsAdminStub.getSystemStatistics();
			System.out.println("Host :" + stat.getServerName());
			System.out.println("Server Start Time :"
					+ stat.getServerStartTime());
			System.out.println("System Up Time :" + stat.getSystemUpTime());
			System.out.print(stat.getUsedMemory().getValue()
					+ stat.getUsedMemory().getUnit() + " of ");
			System.out.println(stat.getTotalMemory().getValue()
					+ stat.getTotalMemory().getUnit() + " memory used");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void UserAdmin() {
		try {
			String serviceName = "UserAdmin";
			UserAdminStub statisticsAdminStub;
			String backEndUrl = "https://localhost:9443/services/";
			String endPoint = backEndUrl + "/services/" + serviceName;
			statisticsAdminStub = new UserAdminStub(endPoint);
			// Authenticate Your stub from sessionCooke
			ServiceClient serviceClient;
			Options option;

			serviceClient = statisticsAdminStub._getServiceClient();
			option = serviceClient.getOptions();
			option.setManageSession(true);
			option.setProperty(
					org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,
					sessionCookie);

			UserRealmInfo stat = statisticsAdminStub.getUserRealmInfo();
			System.out.println(stat.getAdminRole());
			System.out.println(stat.getAdminUser());
			System.out.println(stat.getEveryOneRole());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main2(String[] args) {
		AxisServiceClient c = new AxisServiceClient();

		String endPOint = "StockQuote";
		String operationName = "getSimpleQuote";
		String a = AutomationContext.context(AutomationContext.PRODUCT_AXIS2);
		endPOint = a + "/" + endPOint;

		String namespace = c.getTargetNamespace(endPOint + "?wsdl");
		OMElement method = c.getMethod(operationName, namespace, "", "WSO2");
		OMElement res = null;
		try {
			res = c.sendReceive(method, endPOint, operationName);
			String aa = res
					.getFirstElement()
					.getFirstChildWithName(
							new QName("http://services.samples/xsd", "last"))
					.getText();

			System.out.println(aa);
			System.out.println("finished");
		} catch (AxisFault e) {
			System.out.println(e.getMessage());
			System.out.println(e.getFaultAction());
		}

	}

	public static void main(String[] args) {
		AuthenticationLibrary al = new AuthenticationLibrary();
		sessionCookie = al.LoginAs("admin", "admin", "localhost");

		ProxyServiceAdminLibrary l=new ProxyServiceAdminLibrary();
		try{
		l.initProxyServiceAdmin();
		//System.out.println(l.addProxy("quote", "http://192.168.0.1:8080/axis2/services/SimpleStockQuoteService?wsdl"));
//		System.out.println(l.addProxy("secquote", "http://localhost:8080/axis2/services/SecureStockQuoteService?wsdl"));
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
//		
		
		AxisServiceClient c=new AxisServiceClient();
//		Object[] pa={"symbol","rukshan"};
//		String rr=c.getAttibuteValueOfOperationIn("quote", "getSimpleQuote","last",pa);
//		System.out.println(rr);
		
//		Object[] pa1={"symbol","wso2"};
//		Object rr1=c.invokeOperationIn("quote", "getQuote",pa1);
//		System.out.println(c.getOperationResponse().toString());
		
//		c.setServiceName("quote");
//		c.setServiceOperation("getQuote");
//		c.setServiceParentChild("request");
//		c.setServiceParas("symbol","wso2");
//		OMElement o=c.InvokeOperation();
//		System.out.println(o.toString());
//		System.out.println(c.getOperationValue("last"));
		
		c.setServiceName("quote");
		c.setServiceOperation("getQuote");
		c.setServiceParentChild("request");
		c.setServiceParas("symbol","wso2");
		c.InvokeOperation();
//		OMElement o=c.InvokeOperationSec("http://services.samples","http://services.samples","getQuote");
//		System.out.println(o.toString());
		System.out.println(c.getOperationValue("symbol"));
		System.out.println(c.getOperationValue("last"));
		
		
		
//		c.setServiceName("echo");
//		c.setServiceOperation("echoStringArrays");
//		c.setServiceParentChild(null);
//		c.setServiceParas("a","rukA");
//		c.setServiceParas("b","rukB");
//		c.setServiceParas("c","123");
//		OMElement o1=c.InvokeOperation();
////		System.out.println(o1.toString());
//		System.out.println(c.createArrayFromOMElement(o1));
//		Standard sd=new Standard();
//		Object[] arr=sd.createArray("1","2","3", "4", "5","6");
//		Object[] arr=new Object[]{"1","2","3", "4", "5","6"};				          
//		
//		c.setServiceName("Adcal");
//		c.setServiceOperation("getArrayLength");
//		c.setServiceParas("arr",arr);
//		OMElement o1=c.InvokeOperation();
//		Object[] oo1=c.getResponseValue(o1);
//		for (Object object : oo1) {
//			System.out.println(object);
//		}
//		
//		c.setServiceOperation("getArray");		
//		OMElement o2=c.InvokeOperation();
//		Object[] oo2=c.getResponseValue(o2);
//		for (Object object : oo2) {
//			System.out.println(object);
//		}
//		c.setServiceName("echo");
//		c.setServiceOperation("echoStringArrays");
//		c.setServiceParas("a","AA");
//		c.setServiceParas("b","BB");
//		c.setServiceParas("c","123");
//		OMElement o=c.InvokeOperation();
//		System.out.println(o.getFirstElement().getFirstChildWithName(new QName("http://echo.services.core.carbon.wso2.org","c")));
//		System.out.println(c.getOperationValue("c"));
		//assertNotNull  ${o}
		//Assert InvokeOperation  123
		
	}
}
