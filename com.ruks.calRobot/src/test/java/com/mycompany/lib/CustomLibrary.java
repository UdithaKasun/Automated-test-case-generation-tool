package com.mycompany.lib;

import junit.framework.Assert;

public class CustomLibrary {
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	public void testME(int expected) {
		System.out.println("Testing Custom Library");
		Assert.assertEquals(expected, 100);
	}
}
