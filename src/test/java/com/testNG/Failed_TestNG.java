package com.testNG;

import org.testng.annotations.Test;

public class Failed_TestNG {
	
	@Test
	private void demo() {
		System.out.println(10/10);
	}
	@Test(retryAnalyzer = Retry_Analyser_TestNG.class)
	private void divide() {
		System.out.println(10/0);
	}
}