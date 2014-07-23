package generator;

//1.login to esb
//2.upload a proxy to esb
//3.check whether it was deployed successfully
//4.send a payload to the proxy
//5.Get the response 
//6.Check the response is correct/incorrect

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import lib.AuthenticationLibrary;
import lib.AxisServiceClient;
import lib.ProxyServiceAdminLibrary;
import lib.Test;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.log4j.Logger;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import property.AutomationContext;

import com.predic8.wsdl.Definitions;
import com.predic8.wsdl.Operation;
import com.predic8.wsdl.PortType;
import com.predic8.wsdl.WSDLParser;

public class ClientGen {
	static Logger log = Logger.getLogger(ClientGen.class.getName());
	static ArrayList<String> operations;

	public static void main1(String[] args) {
		// AuthenticationLibrary au = new AuthenticationLibrary();
		// au.LoginAs("admin", "admin", "admin");
		// ProxyServiceAdminLibrary p=new ProxyServiceAdminLibrary();
		// try {
		// p.initProxyServiceAdmin();
		// Test t=new Test();
		// String s=p.addProxy(t.createProxyData("echo3",
		// "http://localhost:8082/axis2/services/echo?wsdl","http://localhost:8082/axis2/services/echo"));
		// System.out.println(s);
		// } catch (AxisFault e1) {
		// System.out.println(e1.getMessage());
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }
		//
		// if(true){
		// return;
		// }
		// EndpointReference targetEPR = new EndpointReference(
		// "http://ubuntu:8280/services/echo");
		// // http://ubuntu:8280/services/echo?wsdl
		EndpointReference targetEPR = new EndpointReference(
				"http://localhost:8082/axis2/services/AdvancedCalculator?wsdl");
		// //
		OMFactory fac = OMAbstractFactory.getOMFactory();
		OMNamespace omNs = fac.createOMNamespace(
				"http://calculator.util.ruks.com", "tns");
		// //
		String[] s = new String[10];
		for (int i = 0; i < s.length; i++) {
			s[i] = "ruks_" + i;
		}

		OMElement method = fac.createOMElement("getArray", omNs);

		// for (int i = 0; i < s.length; i++) {
		// OMElement value = fac.createOMElement("arr", omNs);
		// value.addChild(fac.createOMText(value, s[i]));
		// method.addChild(value);
		// }

		Options options = new Options();
		options.setTo(targetEPR);
		options.setTransportInProtocol(Constants.TRANSPORT_HTTP);

		ServiceClient sender;
		try {
			sender = new ServiceClient();
			sender.setOptions(options);

			OMElement result = sender.sendReceive(method);
			Iterator<OMElement> ite = result.getChildren();
			for (Iterator iterator = ite; iterator.hasNext();) {
				OMElement type = (OMElement) iterator.next();
				System.out.println(type.getText());
			}

		} catch (AxisFault e) {
			System.out.println(e.getMessage());
		}

		// AxisServiceClient cl = new AxisServiceClient();
		// String s="https://ubuntu:8243/services/echo3";
		// try {
		// OMElement o=cl.sendReceive(cl.getMethod("echoString",new
		// String[]{"in"},new String[]{"Rukshan"}),s, "echoString");
		// System.out.println(o.getFirstElement().getText());
		// } catch (AxisFault e) {
		// System.out.println("ex "+e.getMessage());
		// }

	}

	public static void main(String[] args) {
		ArrayList<String> libList = new ArrayList<String>();
		File test = new File("src/test/resources/robotframework/tests");
		File[] txtFiles = test.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".txt");
			}
		});

		if (txtFiles == null || txtFiles.length == 0) {
			System.out.println("error: no Files");
			return;
		}

		System.out.println("info: files= " + txtFiles.length);
		BufferedReader read = null;
		for (File file : txtFiles) {
			try {
				read = new BufferedReader(new FileReader(file));
				String str;
				while ((str = read.readLine()) != null) {
					if (str.startsWith("Library")) {
						String lib = str.replace("Library ", "").trim();
						if (lib.startsWith("robotlib")) {
							String lib1 = lib.replace("robotlib.", "").trim();
							System.out.println(lib1);
							libList.add(lib1);
						}
					}
				}
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} finally {
				if (read != null) {
					try {
						read.close();
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
				}
			}
		}

		// generate
		for (String nm : libList) {
			generate(nm);
			System.out.println("info: gen " + nm);
		}

	}

	public static void generate(String library) {
		Set<String> importLib = new HashSet<String>();
		STGroup group = new STGroupFile(
				"src/main/resources/template/templateR.stg");
		try {
			log.info("Hello this is an info message");
			String[] res = getServiceInfor(library);
			if (res == null) {
				System.out.println("error: No Service named " + library);
				return;
			}

			String servicestub = res[0];
			String wsdl = "/" + res[1] + ".wsdl";

			Class<?> c = Class.forName(servicestub);

			System.out.println(c.getPackage().getName());
			importLib.add(servicestub);

			String methods = "";

			operations = getOperations(c, wsdl);

			for (Method m : c.getMethods()) {
				if (!isMethodNameValid(m.getName())) {
					continue;
				}

				ST methodTem = group.getInstanceOf("method");
				methodTem.add("returnType", m.getReturnType().getSimpleName());
				methodTem.add("methodName", m.getName());
				String retType = m.getReturnType().getSimpleName();
				retType = retType.replace("[]", "");
				if (isNameValid(retType)) {
					importLib.add(m.getReturnType().getCanonicalName()
							.replace("[]", ""));
				}
				String paras = "";
				String parasRet = "";
				int i = 0;
				for (Class<?> pc : m.getParameterTypes()) {
					String retType1 = pc.getSimpleName();
					// System.out.println(retType1);
					retType1 = retType1.replace("[]", "");
					if (isNameValid(retType1)) {
						importLib.add(pc.getCanonicalName().replace("[]", ""));
					}
					paras += pc.getSimpleName() + " " + "arg" + (i) + ",";
					parasRet += "arg" + (i++) + ",";
				}
				if (!paras.equals("")) {
					methodTem.add("paras",
							paras.substring(0, paras.length() - 2));
					methodTem.add("parasRet",
							parasRet.substring(0, parasRet.length() - 2));

				}

				methodTem.add("cond", !m.getReturnType().getSimpleName()
						.equals("void"));
				methods += methodTem.render();
			}

			ST classTem = group.getInstanceOf("class");

			String serviceName = getServiceName(c, wsdl);
			System.out.println("className " + serviceName);

			classTem.add("name", serviceName);
			classTem.add("namestub", serviceName + "Stub");
			classTem.add("methods", methods);

			String imports = "";
			for (String s : importLib) {
				imports += "import " + s + ";\n";
			}

			classTem.add("clsimport", imports);

			save(serviceName, classTem.render());
			System.out.println("info: generated " + serviceName);
		} catch (ClassNotFoundException e) {
			System.out.println("error " + e.getMessage());
		}
	}

	private static void save(String className, String result) {
		try {
			String loc = AutomationContext
					.context(AutomationContext.PROJECT_LOCATION);
			
			File ff1 = new File(loc + "/src/main/java");
			if(!ff1.exists()){
				ff1.mkdir();
				log.debug("Client Gen: Create "+ff1.getAbsolutePath());
			}
			
			File ff2 = new File(loc + "/src/main/java/robotlib");
			if(!ff2.exists()){
				ff2.mkdir();
				log.debug("Client Gen: Create "+ff2.getAbsolutePath());
			}
			
			File f = new File(loc + "/src/main/java/robotlib/" + className
					+ "Library.java");
			BufferedWriter wri = new BufferedWriter(new FileWriter(f));
			wri.write(result);
			wri.close();
			log.debug("ClientGen Created " + f.getAbsolutePath());
		} catch (IOException e) {
			log.debug("ClientGen Created " + e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	private static boolean isMethodNameValid(String name) {

		if (operations.contains(name)) {
			return true;
		} else {
			return false;
		}

	}

	private static boolean isNameValid(String name) {
		// System.out.println(name);
		String[] type = { "int", "boolean", "String", "Class", "Object",
				"void", "java.lang.String", "double", "long" };
		for (String s : type) {
			if (name.equals(s)) {
				return false;
			}
		}

		return true;
	}

	private static ArrayList<String> getOperations(Class<?> c, String wsdl) {

		ArrayList<String> li = new ArrayList<String>();
		try {
			InputStream input = c.getResourceAsStream(wsdl);
			WSDLParser parser = new WSDLParser();
			Definitions defs = parser.parse(input);
			for (PortType pt : defs.getPortTypes()) {
				for (Operation op : pt.getOperations()) {
					li.add(op.getName());
				}
			}
		} catch (Exception x) {
			System.out.println(x.getMessage());
		}

		return li;

	}

	private static String getServiceName(Class<?> c, String wsdl) {

		InputStream input = c.getResourceAsStream(wsdl);
		WSDLParser parser = new WSDLParser();
		Definitions defs = parser.parse(input);

		try {
			return defs.getServices().get(0).getName();
		} catch (Exception e) {
			return "newLib";
		}

	}

	public static String[] getServiceInfor(String lib) {
		File pomfile = new File("service.xml");
		String[] res;
		try {

			DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder();
			Document doc = dBuilder.parse(pomfile);
			System.out.println("Root element :"
					+ doc.getDocumentElement().getNodeName());

			NodeList service = doc.getElementsByTagName("service");
			for (int i = 0; i < service.getLength(); i++) {
				Element ele = (Element) service.item(i);
				if (ele.getAttribute("lib").equals(lib)) {
					res = new String[2];
					res[0] = ele.getAttribute("stub");
					res[1] = ele.getAttribute("wsdl");
					return res;
				}

			}
			return null;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public static void generateClient(String[] res) {
		Set<String> importLib = new HashSet<String>();
		
		STGroup group = new STGroupFile(
				"src/main/resources/templateR.stg");
		try {
			if (res == null) {
				System.out.println("error: No Service named ");
				return;
			}

			String servicestub = res[0];
			String wsdl = "/" + res[1] + ".wsdl";

			Class<?> c = Class.forName(servicestub);

			System.out.println(c.getPackage().getName());
			importLib.add(servicestub);

			String methods = "";

			operations = getOperations(c, wsdl);

			for (Method m : c.getMethods()) {
				if (!isMethodNameValid(m.getName())) {
					continue;
				}

				ST methodTem = group.getInstanceOf("method");
				methodTem.add("returnType", m.getReturnType().getSimpleName());
				methodTem.add("methodName", m.getName());
				String retType = m.getReturnType().getSimpleName();
				retType = retType.replace("[]", "");
				if (isNameValid(retType)) {
					importLib.add(m.getReturnType().getCanonicalName()
							.replace("[]", ""));
				}
				String paras = "";
				String parasRet = "";
				int i = 0;
				for (Class<?> pc : m.getParameterTypes()) {
					String retType1 = pc.getSimpleName();
					// System.out.println(retType1);
					retType1 = retType1.replace("[]", "");
					if (isNameValid(retType1)) {
						importLib.add(pc.getCanonicalName().replace("[]", ""));
					}
					paras += pc.getSimpleName() + " " + "arg" + (i) + ",";
					parasRet += "arg" + (i++) + ",";
				}
				if (!paras.equals("")) {
					methodTem.add("paras",
							paras.substring(0, paras.length() - 2));
					methodTem.add("parasRet",
							parasRet.substring(0, parasRet.length() - 2));

				}

				methodTem.add("cond", !m.getReturnType().getSimpleName()
						.equals("void"));
				methods += methodTem.render();
			}

			ST classTem = group.getInstanceOf("class");

			String serviceName = getServiceName(c, wsdl);
			System.out.println("className " + serviceName);

			classTem.add("name", serviceName);
			classTem.add("namestub", serviceName + "Stub");
			classTem.add("methods", methods);

			String imports = "";
			for (String s : importLib) {
				imports += "import " + s + ";\n";
			}

			classTem.add("clsimport", imports);

			save(serviceName, classTem.render());
			log.debug("info: Client generated " + serviceName);
		} catch (ClassNotFoundException e) {
			System.out.println("error " + e.getMessage());
		}
	}
}
