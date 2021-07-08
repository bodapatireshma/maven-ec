package com.testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Soft_TestNG {
	@Test
	private void userName() {
		SoftAssert s = new SoftAssert();
		String expected = "ABC123";
		String actual = "ABC";
		
		s.assertEquals(expected, actual);
		System.out.println("Validation");
		s.assertAll();
	}
}