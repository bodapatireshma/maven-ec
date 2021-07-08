package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Hard_TestNG {
	
	@Test
	private void userName() {
		String expected = "John 456";
		String actual = "John 123";
		Assert.assertEquals(expected, actual);
	}
	@Test
	private void userPassword() {
		String expected = "John Smith";
		String actual = "John Smith";
		Assert.assertEquals(expected, actual);
	}	
}