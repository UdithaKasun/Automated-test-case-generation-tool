package test1;

import groovy.xml.MarkupBuilder;
import groovy.xml.QName;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import com.predic8.schema.ComplexType;
import com.predic8.schema.Element;
import com.predic8.schema.Schema;
import com.predic8.wsdl.Definitions;
import com.predic8.wsdl.Fault;
import com.predic8.wsdl.Operation;
import com.predic8.wsdl.Part;
import com.predic8.wsdl.PortType;
import com.predic8.wsdl.Service;
import com.predic8.wsdl.Types;
import com.predic8.wsdl.WSDLParser;
import com.predic8.wstool.creator.RequestTemplateCreator;
import com.predic8.wstool.creator.RequestTemplateCreatorContext;
//import com.ruks.serivces.CalculatorService;
//import com.ruks.serivces.CalculatorServicePortType;

public class Apptest {


	public static void main1(String a) {
		WSDLParser parser = new WSDLParser();

		Definitions defs = parser
				.parse("src\\main\\resources\\CalculatorService.wsdl");

		for (PortType pt : defs.getPortTypes()) {
			System.out.println(pt.getName());
			for (Operation op : pt.getOperations()) {
				System.out.println(" -" + op.getName());
				// System.out.println(op.getOutput().getMessage().getProperty("element"));

				try {
					for (Part part : op.getInput().getMessage().getParts()) {
						System.out.println(part.getName() + " "
								+ part.getElement());
					}
					for (Part part : op.getOutput().getMessage().getParts()) {
						System.out.println(part.getName() + " "
								+ part.getElement());
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				//
			}
		}
	}

	public static void main2(String[] args) {

		WSDLParser parser = new WSDLParser();
		Definitions defs = parser
				.parse("src\\main\\resources\\CalculatorService.wsdl");
		for (PortType pt : defs.getPortTypes()) {
			System.out.println(pt.getName());
			for (Operation op : pt.getOperations()) {
				System.out.println(" -" + op.getName());
				System.out.println("Request Template");
				QName n = op.getInput().getMessage().getParts().get(0)
						.getElement().getQname();
				printTemplate(defs.getElement(n));
				System.out.println();
				System.out.println("Response Template");
				// printTemplate(defs.getElement(op.getOutput().getMessage().getParts().get(0).getElement()));

			}

		}

	}

	private static void printTemplate(Element e) {
		StringWriter writer = new StringWriter();
		RequestTemplateCreator creator = new RequestTemplateCreator();
		creator.setBuilder(new MarkupBuilder(writer));
		e.create(creator, new RequestTemplateCreatorContext());
		System.out.println(writer);
	}

	public static void main(String[] args) {

		WSDLParser parser = new WSDLParser();
		String fname="AuthenticationAdmin";
//		String fname="CustomUIAdminService";
//		String fname="SynapseApplicationAdmin";
//		String fname="OperationAdmin";
//		String fname="UserAdmin";
		
//		Definitions defs = parser.parse("src\\main\\resources\\CalculatorService.wsdl");
//		Definitions defs = parser.parse("src\\main\\resources\\StatisticsAdmin.wsdl");
//		Definitions defs = parser.parse("src\\main\\resources\\SynapseApplicationAdmin.wsdl");
//		Definitions defs = parser.parse("src\\main\\resources\\OperationAdmin.wsdl");
//		Definitions defs = parser.parse("src\\main\\resources\\AuthenticationAdmin.wsdl");
		Definitions defs = parser.parse("src/main/resources/"+fname+".wsdl");
		
		STGroup group = new STGroupFile("src/main/java/test1/test.stg");
		ArrayList<String> methods=new ArrayList<String>();
		ArrayList<String> fields=new ArrayList<String>();
		ArrayList<String> importList=new ArrayList<String>();		

		for (Types pt : defs.getTypes()) {
			for (Schema pt1 : pt.getAllSchemas()) {
			for (ComplexType pt2 : pt1.getComplexTypes()) {
				importList.add(getImportString(pt1.getTargetNamespace(),pt2.getName()));
			}
			}
		}
		
		importList.add(getImportString(defs.getTargetNamespace(),"*"));
//		if(true) return;
		
		String importes="";
		for (String str : importList) {						
			importes+=str+"\n";			
		}
		
		String className=null;		
		for (Service pt : defs.getServices()) {
			className=pt.getName();			
		}				
//		if(className==null || className.isEmpty()){
//			className="StatisticsAdmin";
//		}
		
		System.out.println("classname: "+className);		
		
		
		for (PortType pt : defs.getPortTypes()) {			
			for (Operation op : pt.getOperations()) {
				String opname=op.getName();
				ArrayList<String[]> list=listParameters(defs.getElement(op.getInput().getMessage()
						.getParts().get(0).getElement().getQname()));
				
				ArrayList<String[]> list1=null;
				try {
					list1=listParameters(defs.getElement(op.getOutput().getMessage()
							.getParts().get(0).getElement().getQname()));
				} catch (java.lang.Exception e) {
//					System.out.println(e.getMessage());
				}
				
//				if(true) continue;
				
				String exception="";
				for(Fault f:op.getFaults()){
//					exception="throws "+f.getName()+"_Exception";
//					exception="throws "+f.getName();
					String exc;
					try {
						String s=getImportString(defs.getTargetNamespace(),f.getName());
						s=s.replaceAll("import","").replace(";", "").trim();
//						System.out.println(s);
						Class<?> c=Class.forName(s);
						Constructor<?> cn=c.getConstructor();
						Object o=cn.newInstance();
						if(o instanceof Throwable){
//							System.out.println("Throwable");
							exc=f.getName();
						}else{
//							System.out.println("not Throwable");
							exc=f.getName()+"_Exception";
						}
					} catch (java.lang.Exception e) {
						exc="java.lang.Exception";
					} 
					exception="throws "+exc;
					System.out.println(f.getName());
				}
				
				String paras="";
				String parasVals="";
				int i=0;
				for(String[] s : list){
					i++;
					paras+=s[1]+" "+s[0];
					parasVals+=s[0];
					if(i<list.size()){
						paras+=",";
						parasVals+=",";
					}					
				}				
								    
				String nameResult ="";		        
	        	ST importImpl = group.getInstanceOf("method");
	        	if(list1==null || list1.isEmpty()){
	        		importImpl.add("returnType","void");
	        		importImpl.add("return","");
	        		importImpl.add("content"," c."+opname+"("+parasVals+");");
	        	}else{
	        		importImpl.add("returnType",list1.get(0)[1]);	        		
	        		importImpl.add("content","this."+opname+"="+" c."+opname+"("+parasVals+");");
	        		importImpl.add("return","return"+" this."+opname+";");
	        		
	        		ST assertMethod = group.getInstanceOf("assert");
	        		assertMethod.add("methodName",opname);
	        		assertMethod.add("actual",opname);	        		
	        		assertMethod.add("paraType",list1.get(0)[1]);
	        		methods.add(assertMethod.render());
	        		
	        		ST field = group.getInstanceOf("field");
	        		field.add("methodName",opname);
	        		field.add("paraType",list1.get(0)[1]);
	        		fields.add(field.render());

	        	}
	        	importImpl.add("excep",exception);
	        	importImpl.add("methodName",opname);
	        	importImpl.add("paras",paras);
	        	nameResult=importImpl.render();	        	
	        	methods.add(nameResult);				     
	        									
			}			
		}
		ST cls = group.getInstanceOf("class");
		cls.add("name",className);
    	cls.add("clsimport",importes);    	
    	String me="";
    	for(String s:methods){
    		me+=s;
    	}
    	
    	String feils="";
    	for(String s:fields){
    		feils+=s;
    	}
    	
    	cls.add("methods",me);
    	cls.add("fields",feils);
    	String result=cls.render();
    	
    	try {
			BufferedWriter wri=new BufferedWriter(new FileWriter(new File("src/main/java/test1/"+className+"Library.java")));
			wri.write(result);
			wri.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static ArrayList<String[]> listParameters(Element element) {
		ComplexType ct = (ComplexType) element.getEmbeddedType();
		ArrayList<String[]> list=new ArrayList<String[]>();
		String[] st=null;
		for (Element e : ct.getSequence().getElements()) {
			st=new String[2];
			st[0]=e.getName();
			if(e.getType().getLocalPart()=="string"){
				st[1]="String";
			}else{
				st[1]=e.getType().getLocalPart();
			}
			if(e.getMaxOccurs().equals("unbounded")){
				st[1]="List<"+st[1]+">";
			}
			list.add(st);
//			System.out.println(e.getName() + " " + e.getType().getQualifiedName());
//			System.out.println(e.getType().getQualifiedName());
		}
		return list;
	}

	private static String getImportString(String tns,String name){
		String[] s=tns.replace("http://","").split("//|/");
		String im="";
		for (int i = 0; i < s.length; i++) {
			if(i==0){
				String[] a=s[i].split("\\.");
				for (int j=a.length - 1; j >= 0; j--) {
					im+=a[j]+".";
				}
			}else{
				im+=s[i]+".";
			}
			
		}
		return "import "+im+name+";";
	}
}
