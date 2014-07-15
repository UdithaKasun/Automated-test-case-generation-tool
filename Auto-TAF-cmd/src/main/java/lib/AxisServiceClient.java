package lib;

import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.Assert;

import property.AutomationContext;

import com.predic8.wsdl.Definitions;
import com.predic8.wsdl.WSDLParser;


public class AxisServiceClient {
	private static final Log log = LogFactory.getLog(AxisServiceClient.class);

	public OMElement sendReceive(OMElement payload, String endPointReference,
			String operation) throws AxisFault {
		ServiceClient sender;
		Options options;
		OMElement response = null;
		if (log.isDebugEnabled()) {
			log.debug("Service Endpoint : " + endPointReference);
			log.debug("Service Operation : " + operation);
			log.debug("Payload : " + payload);
		}
		try {
			sender = new ServiceClient();
			options = new Options();
			options.setTo(new EndpointReference(endPointReference));
			options.setProperty(
					org.apache.axis2.transport.http.HTTPConstants.CHUNKED,
					Boolean.FALSE);
			options.setTimeOutInMilliSeconds(45000);
			options.setAction("urn:" + operation);
			sender.setOptions(options);
			response = sender.sendReceive(payload);
			if (log.isDebugEnabled()) {
				log.debug("Response Message : " + response);
			}
		} catch (AxisFault axisFault) {
			log.error(axisFault.getMessage());
			throw new AxisFault("AxisFault while getting response :"
					+ axisFault.getMessage(), axisFault);
		}
		Assert.assertNotNull(response);
		return response;
	}

	// axis2 client with header setting
	public OMElement sendReceive(OMElement payload, String endPointReference,
			String operation, String localName, String ns, String value)
			throws AxisFault {
		ServiceClient sender;
		Options options;
		OMElement response = null;
		if (log.isDebugEnabled()) {
			log.debug("Service Endpoint : " + endPointReference);
			log.debug("Service Operation : " + operation);
			log.debug("Payload : " + payload);
		}
		try {
			sender = new ServiceClient();
			sender.addStringHeader(new QName(ns, localName), value); // Set
																		// headers
			options = new Options();
			options.setTo(new EndpointReference(endPointReference));
			options.setProperty(
					org.apache.axis2.transport.http.HTTPConstants.CHUNKED,
					Boolean.FALSE);
			options.setAction("urn:" + operation);
			sender.setOptions(options);
			response = sender.sendReceive(payload);
			if (log.isDebugEnabled()) {
				log.debug("Response Message : " + response);
			}
		} catch (AxisFault axisFault) {
			log.error(axisFault.getMessage());
			throw new AxisFault("AxisFault while getting response :"
					+ axisFault.getMessage(), axisFault);
		}
		Assert.assertNotNull(response);
		return response;
	}

	public OMElement sendReceive(OMElement payload, String endPointReference,
			String operation, String contentType) throws AxisFault {
		ServiceClient sender;
		Options options;
		OMElement response = null;
		if (log.isDebugEnabled()) {
			log.debug("Service Endpoint : " + endPointReference);
			log.debug("Service Operation : " + operation);
			log.debug("Payload : " + payload);
		}
		try {
			sender = new ServiceClient();
			options = new Options();
			options.setTo(new EndpointReference(endPointReference));
			options.setProperty(
					org.apache.axis2.transport.http.HTTPConstants.CHUNKED,
					Boolean.FALSE);
			options.setTimeOutInMilliSeconds(45000);
			options.setAction("urn:" + operation);
			options.setProperty(Constants.Configuration.MESSAGE_TYPE,
					contentType);
			sender.setOptions(options);
			response = sender.sendReceive(payload);
			if (log.isDebugEnabled()) {
				log.debug("Response Message : " + response);
			}
		} catch (AxisFault axisFault) {
			log.error(axisFault.getMessage());
			throw new AxisFault("AxisFault while getting response :"
					+ axisFault.getMessage(), axisFault);
		}
		Assert.assertNotNull(response);
		return response;
	}

	// one way communication
	public void sendRobust(OMElement payload, String endPointReference,
			String operation) throws AxisFault {
		ServiceClient sender;
		Options options;
		if (log.isDebugEnabled()) {
			log.info("Service Endpoint : " + endPointReference);
			log.info("Service Operation : " + operation);
			log.debug("Payload : " + payload);
		}
		try {
			sender = new ServiceClient();
			options = new Options();
			options.setTo(new EndpointReference(endPointReference));
			options.setProperty(
					org.apache.axis2.transport.http.HTTPConstants.CHUNKED,
					Boolean.FALSE);
			options.setAction("urn:" + operation);
			sender.setOptions(options);
			sender.sendRobust(payload);
		} catch (AxisFault axisFault) {
			log.error(axisFault.getMessage());
			throw new AxisFault("AxisFault while getting response :"
					+ axisFault.getMessage(), axisFault);
		}
	}

	// one way communication
	public void fireAndForget(OMElement payload, String endPointReference,
			String operation) throws AxisFault {
		ServiceClient sender;
		Options options;
		if (log.isDebugEnabled()) {
			log.info("Service Endpoint : " + endPointReference);
			log.info("Service Operation : " + operation);
			log.debug("Payload : " + payload);
		}
		try {
			sender = new ServiceClient();
			options = new Options();
			options.setTo(new EndpointReference(endPointReference));
			options.setProperty(
					org.apache.axis2.transport.http.HTTPConstants.CHUNKED,
					Boolean.FALSE);
			options.setAction("urn:" + operation);
			sender.setOptions(options);
			sender.fireAndForget(payload);
		} catch (AxisFault axisFault) {
			log.error(axisFault.getMessage());
			throw new AxisFault("AxisFault while getting response :"
					+ axisFault.getMessage(), axisFault);
		}
	}

	// create OMElement for method
	public OMElement getMethod(String method, String namespace, Object... paras) {
		int l = paras.length;
		if (l % 2 != 0) {
			return null;
		}

		OMFactory fac = OMAbstractFactory.getOMFactory();
		OMNamespace omNs = fac.createOMNamespace(namespace, "tns");
		OMElement meth = fac.createOMElement(method, omNs);

		for (int i = 0; i < l; i += 2) {
			if (paras[i + 1].getClass().getCanonicalName().equals("java.lang.Object[]")) {
				Object[] s=(Object[]) paras[i + 1];
				for (int j = 0; j < s.length; j++) {
					OMElement value = fac.createOMElement((String)paras[i], omNs);
					value.addChild(fac.createOMText(value, (String)s[j]));
					meth.addChild(value);
				}
			} else {
				OMElement value = fac.createOMElement((String) paras[i], omNs);
				value.addChild(fac.createOMText(value, (String) paras[i + 1]));
				meth.addChild(value);
			}
		}

		return meth;
	}

	public String getValue(OMElement om) {
		return om.getFirstElement().getText();
	}	

	public Object invokeOperationIn(String endPOint, String operationName, Object... paras) {
//		endPOint=PropertyInfo.read("axis2")+"/"+endPOint;
		
		String a = AutomationContext.context(AutomationContext.PRODUCT_AXIS2);
		endPOint=a+"/"+endPOint;
		
		String namespace=getTargetNamespace(endPOint+"?wsdl");
		OMElement method = getMethod(operationName, namespace, paras);
		OMElement res = null;
		try {
			res = sendReceive(method, endPOint, operationName);
			Object[] val = createArrayFromOMElement(res);
			invokeOperation = val;
			return val;
		} catch (AxisFault e) {
			System.out.println(e.getFaultAction());
			return null;
		}

	}

	private Object[] invokeOperation = null;

	public void AssertInvokeOperation(Object... expected) {
		System.out.println(invokeOperation.length);
		System.out.println(expected.length);
		
		Assert.assertEquals(invokeOperation.length, expected.length);
		
		for (int i = 0; i < expected.length; i++) {
			Assert.assertEquals(invokeOperation[i], expected[i]);
		}
//		Assert.assertEquals(invokeOperation, expected);
	}

	public void test1(String[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public Object[] createArrayFromOMElement(OMElement result) {
		ArrayList<Object> q=new ArrayList<Object>();
		Iterator<OMElement> ite=result.getChildren();
		for (Iterator<?> iterator = ite; iterator.hasNext();) {
			OMElement type = (OMElement) iterator.next();
			System.out.println(type.getText());
			q.add(type.getText());
		}
		return q.toArray();
	}

	public String getTargetNamespace(String wsdlUrl) {
		WSDLParser parser = new WSDLParser();
//		String wsdl="http://localhost:8082/axis2/services/echo?wsdl";
		Definitions defs = parser.parse(wsdlUrl);
		return defs.getTargetNamespace();
	}
}
