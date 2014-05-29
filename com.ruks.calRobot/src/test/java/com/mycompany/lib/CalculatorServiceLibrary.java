package com.mycompany.lib;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.junit.Assert;

import com.itcuties.ws.CalculatorServiceStub;
import com.ruks.serivces.GetSumDocument;
import com.ruks.serivces.GetSumDocument.GetSum;
import com.ruks.serivces.GetSumResponseDocument;
import com.ruks.serivces.GetSumResponseDocument.GetSumResponse;
import com.ruks.serivces.SetXDocument;
import com.ruks.serivces.SetXDocument.SetX;
import com.ruks.serivces.SetYDocument;
import com.ruks.serivces.SetYDocument.SetY;


public class CalculatorServiceLibrary {

	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	public CalculatorServiceLibrary() {
		
	}

	public void testSetX(int x) {		
		CalculatorServiceStub stub = null;
		try {
			stub = new CalculatorServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
			Assert.fail();
		}

		Assert.assertNotNull(stub);

		SetXDocument requestDoc = SetXDocument.Factory
				.newInstance();

		SetX request = SetX.Factory.newInstance();

		SetX newSetX = SetX.Factory.newInstance();
		newSetX.setX(x);	
		request.setX(x);

		requestDoc.setSetX(request);

		try {
			stub.setX(requestDoc);
		} catch (RemoteException e) {
			e.printStackTrace();
			Assert.fail();
		}

		Assert.assertTrue(true);
	}

	//test Set x  15
	
	public void testSetY(int y) {
		CalculatorServiceStub stub = null;
		try {
			stub = new CalculatorServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
			Assert.fail();
		}

		Assert.assertNotNull(stub);

		SetYDocument requestDoc = SetYDocument.Factory
				.newInstance();

		SetY request = SetY.Factory.newInstance();

		SetY newSetY = SetY.Factory.newInstance();
		newSetY.setY(y);	
		request.setY(y);

		requestDoc.setSetY(request);

		try {
			stub.setY(requestDoc);
		} catch (RemoteException e) {
			e.printStackTrace();
			Assert.fail();
		}

		Assert.assertTrue(true);
	}

	public void testGetSum(int val) {
		CalculatorServiceStub stub = null;
		try {
			stub = new CalculatorServiceStub();
		} catch (AxisFault e) {
			System.out.println(e.getMessage());
		}
		
		GetSumDocument requestDoc = GetSumDocument.Factory.newInstance();
		GetSum request = GetSum.Factory.newInstance();

		requestDoc.setGetSum(request);

		GetSumResponseDocument responseDoc = null;
		try {
			responseDoc = stub.getSum(requestDoc);
		} catch (RemoteException e) {
			e.printStackTrace();
			Assert.fail();
		}

		Assert.assertNotNull(responseDoc);

		GetSumResponse response = responseDoc.getGetSumResponse();

		Assert.assertNotNull(response);

		int result = response.getReturn();
		Assert.assertEquals(val, result);
		if(result==val){
			System.out.println("testGetSum passed : ");
		}else{
			System.out.println("testGetSum failed : actual "+result+" expected "+val );
		}
//		System.out.println("result : "+result);
		
	}
	
}
