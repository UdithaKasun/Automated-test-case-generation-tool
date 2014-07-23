package lib;

import generator.ClientGen;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathExpressionException;

import org.apache.axiom.om.OMElement;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import property.AutomationContext;

public class Standard {
	static final Logger logger = Logger.getLogger(Standard.class);

	public Standard() {
		// TODO Auto-generated constructor stub
//		File f=new File
		PropertyConfigurator.configure("src/main/resources/log4j.properties");
	}

	public Object[] CreateArray(Object... x) {
		return x;
	}

	public void AssertArrayLength(Object[] x, int y) {
		Assert.assertEquals(x.length, y);
	}

	public void AssertArrayLengths(Object[] x, Object[] y) {
		Assert.assertEquals(x.length, y.length);

		for (int i = 0; i < y.length; i++) {
			Assert.assertEquals(x[i], y[i]);
		}

	}

	public Object[] createArrayFromOME(OMElement result) {
		ArrayList<Object> q = new ArrayList<Object>();
		Iterator<OMElement> ite = result.getChildren();
		for (Iterator<?> iterator = ite; iterator.hasNext();) {
			OMElement type = (OMElement) iterator.next();
			System.out.println(type.getText());
			q.add(type.getText());
		}
		return q.toArray();
	}

	public String testContext() throws XPathExpressionException {

		String a = AutomationContext.context(AutomationContext.PRODUCT_AXIS2);

		ClassLoader loader = Standard.class.getClassLoader();
		a = loader.getResource(".").toString();

		return a;
	}

	private static void log() {
		
		File f = new File("/home/rukshan/log4j/log.out");
		f.delete();

//		InputStream io = Standard.class.getResourceAsStream("/log4j.properties");
//		URL re = Standard.class.getResource("/log4j.properties");
//		System.out.println(re.getFile());
//		
//		PropertyConfigurator.configure("src/main/resources/log4j.properties");
		
//		if(true)return;

		File pomfile = new File("src/main/resources/service.xml");
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
				res = new String[2];
				res[0] = ele.getAttribute("stub");
				res[1] = ele.getAttribute("wsdl");

				ClientGen.generateClient(res);

			}
			logger.debug("Standard class: Client Generated");
			System.out.println("Standard class: Client Generated");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.debug("Standard class: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		log();
	}
}
