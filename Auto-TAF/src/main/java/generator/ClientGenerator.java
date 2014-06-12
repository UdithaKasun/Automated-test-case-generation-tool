package generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.predic8.schema.ComplexType;
import com.predic8.schema.Element;
import com.predic8.schema.Schema;
import com.predic8.wsdl.Definitions;
import com.predic8.wsdl.Fault;
import com.predic8.wsdl.Operation;
import com.predic8.wsdl.PortType;
import com.predic8.wsdl.Service;
import com.predic8.wsdl.Types;
import com.predic8.wsdl.WSDLParser;
//import com.ruks.serivces.CalculatorService;
//import com.ruks.serivces.CalculatorServicePortType;

public class ClientGenerator {

	public static void main(String[] args) {

		WSDLParser parser = new WSDLParser();
		// String fname="AuthenticationAdmin";
		// String fname="CustomUIAdminService";
		// String fname="SynapseApplicationAdmin";
		// String fname="OperationAdmin";
		// String fname="UserAdmin";

		String ser1 = "DiscoveryAdmin.wsdl";
		String folder1 = "org.wso2.carbon.discovery.admin.stub";
		String file1 = "service-stubs/org.wso2.carbon.discovery.admin.stub/src/main/resources/";

		// String ser1 = "StatisticsAdmin.wsdl";
		// String folder1 = "org.wso2.carbon.statistics.stub";
		// String file1 =
		// "service-stubs/org.wso2.carbon.statistics.stub/src/main/resources/";

		// String ser1 = "UserAdmin.wsdl";
		// String folder1="org.wso2.carbon.user.mgt.stub";
		// String file1 =
		// "service-stubs/org.wso2.carbon.user.mgt.stub/src/main/resources/";

		// String ser1 = "AdminManagementService.wsdl";
		// String folder1="org.wso2.carbon.admin.mgt.stub";
		// String file1 =
		// "service-stubs/org.wso2.carbon.admin.mgt.stub/src/main/resources/";

		// String ser1 = "ServiceAdmin.wsdl";
		// String folder1 = "org.wso2.carbon.service.mgt.stub";
		// String file1 =
		// "service-stubs/org.wso2.carbon.service.mgt.stub/src/main/resources/";

		// Definitions defs =
		// parser.parse("src\\main\\resources\\CalculatorService.wsdl");
		// Definitions defs =
		// parser.parse("src\\main\\resources\\StatisticsAdmin.wsdl");
		// Definitions defs =
		// parser.parse("src\\main\\resources\\SynapseApplicationAdmin.wsdl");
		// Definitions defs =
		// parser.parse("src\\main\\resources\\OperationAdmin.wsdl");
		// Definitions defs =
		// parser.parse("src\\main\\resources\\AuthenticationAdmin.wsdl");
		// Definitions defs = parser.parse("src/main/resources/"+fname+".wsdl");

		Definitions defs = parser.parse(file1 + ser1);

		String className = null;
		for (Service pt : defs.getServices()) {
			className = pt.getName();
		}

		STGroup group = new STGroupFile(
				"src/main/resources/template/template.stg");
		ArrayList<String> methods = new ArrayList<String>();
		ArrayList<String> fields = new ArrayList<String>();
		ArrayList<String> importList = new ArrayList<String>();
		ArrayList<String[]> map = readPom(folder1, ser1);

		for (Types pt : defs.getTypes()) {
			for (Schema pt1 : pt.getAllSchemas()) {
				for (ComplexType pt2 : pt1.getComplexTypes()) {
					// importList.add(getImportString(pt1.getTargetNamespace(),
					// pt2.getName()));
					for (String[] mp : map) {
						if (mp[0].equals(pt1.getTargetNamespace())) {
							importList.add("import " + mp[1] + "."
									+ pt2.getName() + ";");
						} else {
							// importList.add(getImportString(pt1.getTargetNamespace(),
							// pt2.getName()));
						}
					}
				}
			}
		}
		importList.add("import " + readPomPac(folder1, ser1).trim() + ";");
		// importList.add(getImportString(defs.getTargetNamespace(),
		// "").replace(";", "")+"stub."+className+"Stub;");
		// importList.add(getImportString(defs.getTargetNamespace(), "*"));
		// if(true) return;

		String importes = "";
		for (String str : importList) {
			importes += str + "\n";
		}

		// if(className==null || className.isEmpty()){
		// className="StatisticsAdmin";
		// }

		System.out.println("classname: " + className);

		for (PortType pt : defs.getPortTypes()) {
			for (Operation op : pt.getOperations()) {
				String opname = op.getName();
				ArrayList<String[]> list = new ArrayList<String[]>();
				try {
					list = listParameters(defs.getElement(op.getInput()
							.getMessage().getParts().get(0).getElement()
							.getQname()));
				} catch (Exception e) {
					// TODO: handle exception
				}

				ArrayList<String[]> list1 = null;
				try {
					list1 = listParameters(defs.getElement(op.getOutput()
							.getMessage().getParts().get(0).getElement()
							.getQname()));
				} catch (java.lang.Exception e) {
					// System.out.println(e.getMessage());
				}

				// if(true) continue;

				String exception = "";
				for (Fault f : op.getFaults()) {
					// exception="throws "+f.getName()+"_Exception";
					// exception="throws "+f.getName();
					String exc;
					String s = "";
					try {
						s = getImportString(defs.getTargetNamespace(),
								f.getName());
						s = s.replaceAll("import", "").replace(";", "").trim();
						// System.out.println(s);
						Class<?> c = Class.forName(s);
						Constructor<?> cn = c.getConstructor();
						Object o = cn.newInstance();
						if (o instanceof Throwable) {
							// System.out.println("Throwable");
							exc = f.getName();
						} else {
							// System.out.println("not Throwable");
							exc = f.getName() + "_Exception";
						}
					} catch (ClassNotFoundException x) {
						exc = "RemoteException";
					} catch (Exception e) {
						// System.out.println(e.getClass());
						exc = "java.lang.Exception";
					}
					exc = "java.lang.Exception";
					exception = "throws " + exc;
					// System.out.println(s);
				}

				String paras = "";
				String parasVals = "";
				int i = 0;
				for (String[] s : list) {
					i++;

					String ret = "";
					if (s[1].contains("List<")) {
						ret = s[1].replaceAll("List<|>", "") + "[]";
					} else {
						ret = s[1];
					}

					paras += ret + " " + s[0];
					parasVals += s[0];
					if (i < list.size()) {
						paras += ",";
						parasVals += ",";
					}
					// System.out.println(s[1]);
				}

				String nameResult = "";
				ST importImpl = group.getInstanceOf("method");
				if (list1 == null || list1.isEmpty()) {
					importImpl.add("returnType", "void");
					importImpl.add("return", "");
					importImpl.add("content", " stub." + opname + "("
							+ parasVals + ");");
				} else {
					String ret = "void";
					if (list1.get(0)[1].contains("List<")) {
						ret = list1.get(0)[1].replaceAll("List<|>", "") + "[]";
					} else {
						ret = list1.get(0)[1];
					}
					// System.out.println(ret);
					ret = ret.replaceAll("anyType", "Object");

					// importImpl.add("returnType",list1.get(0)[1]);
					importImpl.add("returnType", ret);
					// System.out.println(list1.get(0)[1]);
					importImpl.add("content", "this." + opname + "=" + " stub."
							+ opname + "(" + parasVals + ");");
					importImpl
							.add("return", "return" + " this." + opname + ";");

					ST assertMethod = group.getInstanceOf("assert");
					assertMethod.add("methodName", opname);
					assertMethod.add("actual", opname);
					// assertMethod.add("paraType",list1.get(0)[1]);
					assertMethod.add("paraType", ret);
					methods.add(assertMethod.render());

					ST field = group.getInstanceOf("field");
					field.add("methodName", opname);
					field.add("paraType", ret);
					fields.add(field.render());

				}
				// importImpl.add("excep", exception);
				importImpl.add("methodName", opname);
				importImpl.add("paras", paras);
				nameResult = importImpl.render();
				methods.add(nameResult);

			}
		}
		ST cls = group.getInstanceOf("class");
		cls.add("name", className);
		cls.add("clsimport", importes);
		String me = "";
		for (String s : methods) {
			me += s;
		}

		String feils = "";
		for (String s : fields) {
			feils += s;
		}

		cls.add("methods", me);
		cls.add("fields", feils);
		String result = cls.render();

		save(className, result);

	}

	private static void save(String className, String result) {
		try {
			BufferedWriter wri = new BufferedWriter(new FileWriter(new File(
					"src/main/java/robotlib/" + className + "Library.java")));
			wri.write(result);
			wri.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static ArrayList<String[]> listParameters(Element element) {
		ComplexType ct = (ComplexType) element.getEmbeddedType();
		ArrayList<String[]> list = new ArrayList<String[]>();
		String[] st = null;
		for (Element e : ct.getSequence().getElements()) {
			st = new String[2];
			st[0] = e.getName();
			if (e.getType().getLocalPart() == "string") {
				st[1] = "String";
			} else {
				st[1] = e.getType().getLocalPart();
			}
			if (e.getMaxOccurs().equals("unbounded")) {
				st[1] = "List<" + st[1] + ">";
			}
			list.add(st);
			// System.out.println(e.getName() + " " +
			// e.getType().getQualifiedName());
			// System.out.println(e.getType().getQualifiedName());
		}
		return list;
	}

	private static String getImportString(String tns, String name) {
		String[] s = tns.replace("http://", "").split("//|/");
		String im = "";
		for (int i = 0; i < s.length; i++) {
			if (i == 0) {
				String[] a = s[i].split("\\.");
				for (int j = a.length - 1; j >= 0; j--) {
					im += a[j] + ".";
				}
			} else {
				im += s[i] + ".";
			}

		}
		return "import " + im + name + ";";
	}

	private static ArrayList<String[]> readPom(String folder, String wsdl) {
		File pomfile = new File("service-stubs/" + folder + "/pom.xml");
		ArrayList<String[]> mapp = new ArrayList<String[]>();
		try {
			DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder();
			Document doc = dBuilder.parse(pomfile);
			System.out.println("Root element :"
					+ doc.getDocumentElement().getNodeName());

			NodeList args = doc.getElementsByTagName("arg");
			for (int i = 0; i < args.getLength(); i++) {
				Node arg = args.item(i);
				for (int k = 0; k < arg.getAttributes().getLength(); k++) {
					Node line = arg.getAttributes().item(k);
					if (line.getNodeName().equals("line")
							&& line.getNodeValue().toString()
									.contains("src/main/resources/" + wsdl))
						for (String s : line.getNodeValue().toString()
								.split(" |,")) {
							try {
								String[] res = s.split("=");
								if (res.length == 2) {
									// System.out.println(res[0]);
									// System.out.println(res[1]);
									mapp.add(res);
								}
							} catch (Exception e2) {
							}

						}
				}

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return mapp;
	}

	private static String readPomPac(String folder, String wsdl) {
		File pomfile = new File("service-stubs/" + folder + "/pom.xml");
		try {

			DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder();
			Document doc = dBuilder.parse(pomfile);
			System.out.println("Root element :"
					+ doc.getDocumentElement().getNodeName());

			NodeList ExportPackage = doc.getElementsByTagName("Export-Package");
			for (int i = 0; i < ExportPackage.getLength(); i++) {
				System.out.println();
				String d = ExportPackage.item(i).getTextContent().trim();
				if (d.split(";").length > 0)
					;
				{
					System.out.println(d.split(";")[0]);
					return d.split(";")[0];
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;

	}
}
