package com.testNG;

import org.testng.annotations.Test;

public class Invocation_Multipletimes_TestNG {

	@Test(invocationCount = 5)
	private void searchLaptop() {
		System.out.println("click the search button");
	}
	@Test(invocationCount = 3)
	private void searchMobile() {
		System.out.println("searh mobile");
	}
}
