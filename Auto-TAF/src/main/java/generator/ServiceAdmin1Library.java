package generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import com.predic8.wsdl.Definitions;
import com.predic8.wsdl.Operation;
import com.predic8.wsdl.PortType;
import com.predic8.wsdl.WSDLParser;


public class ServiceAdmin1Library {
	static ArrayList<String> operations;

	public static void main(String[] args) {

		Set<String> importLib = new HashSet<String>();
		STGroup group = new STGroupFile(
				"src/main/resources/template/templateR.stg");
		try {
			Class<?> c = Class
					.forName("org.wso2.carbon.service.mgt.stub.ServiceAdminStub");
			System.out.println(c.getPackage().getName());
			importLib.add("org.wso2.carbon.service.mgt.stub.ServiceAdminStub");
			
			String methods = "";

			operations=getOperations(c);	
	
			
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
					importLib.add(m.getReturnType().getCanonicalName().replace("[]", ""));
				}
				String paras = "";
				String parasRet = "";
				int i = 0;
				for (Class<?> pc : m.getParameterTypes()) {
					String retType1 = pc.getName();
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
			classTem.add("name", "ServiceAdmin");
			classTem.add("namestub", "ServiceAdminStub");
			classTem.add("methods", methods);

			String imports = "";
			for (String s : importLib) {
				imports += "import " + s + ";\n";
			}

			classTem.add("clsimport", imports);

			save("NewClass1", classTem.render());

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
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

	private static boolean isMethodNameValid(String name) {
		String[] method = { "hashCode", "getClass", "notify", "notifyAll",
				"wait", "equals", "toString" };
		
		if(operations.contains(name)){
			return true;
		}else{
			return false;
		}
		
	}

	private static boolean isNameValid(String name) {
		String[] type = { "int", "boolean", "String", "Class", "Object", "void" };
		for (String s : type) {
			if (name.equals(s)) {
				return false;
			}
		}

		return true;
	}

	private static ArrayList<String> getOperations(Class<?> c){
		
		ArrayList<String> li=new ArrayList<String>();
		InputStream input = c.getResourceAsStream("/ServiceAdmin.wsdl");
		WSDLParser parser = new WSDLParser();
		Definitions defs = parser.parse(input);
		for (PortType pt : defs.getPortTypes()) {
			for (Operation op : pt.getOperations()) {
				li.add(op.getName());
			}
		}
		
		return li;
	}
}