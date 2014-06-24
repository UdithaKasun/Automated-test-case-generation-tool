package lib;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.axiom.om.OMElement;
import org.testng.Assert;

public class Standard {

	public Object[] CreateArray(Object... x) {
		return x;
	}
	
	public void AssertArrayLength(Object[] x,int y) {
		Assert.assertEquals(x.length, y);
	}
	
	public void AssertArrayLengths(Object[] x,Object[] y) {
		Assert.assertEquals(x.length, y.length);
		
		for (int i = 0; i < y.length; i++) {
			Assert.assertEquals(x[i], y[i]);
		}
		
	}
	
	public Object[] createArrayFromOME(OMElement result) {
		ArrayList<Object> q=new ArrayList<Object>();
		Iterator<OMElement> ite=result.getChildren();
		for (Iterator<?> iterator = ite; iterator.hasNext();) {
			OMElement type = (OMElement) iterator.next();
			System.out.println(type.getText());
			q.add(type.getText());
		}
		return q.toArray();
	}
}
