package com.testNG;

import org.testng.annotations.Test;

public class Exception_TestNG {

	@Test(expectedExceptions = ArithmeticException.class)
	private void divide() throws Exception {
		System.out.println("DIVISION");
		System.out.println(10/0);
	}
	
}
