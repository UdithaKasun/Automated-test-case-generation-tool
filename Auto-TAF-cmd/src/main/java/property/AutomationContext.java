package property;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;

public class AutomationContext {
	
	public static final String PRODUCT_AXIS2 = "/automation/robotconfig/server/axis2";
	public static final String PRODUCT_LOCATION = "/automation/robotconfig/product/location";
	public static final String PRODUCT_HOST = "/automation/robotconfig/product/host";
	public static final String PRODUCT_PORT = "/automation/robotconfig/product/port";
	public static final String PROJECT_LOCATION = "/automation/robotconfig/project/location";

	public static String context(String xpath) {
		FileInputStream file;
		try {
			String s="src/main/resources/automation.xml";
			file = new FileInputStream(new File(s));
			
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			Document xmlDocument = builder.parse(file);
			XPath xPath = XPathFactory.newInstance().newXPath();

			String val = xPath.compile(xpath).evaluate(xmlDocument);
			return val;
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			return null;
		}

	}
}
