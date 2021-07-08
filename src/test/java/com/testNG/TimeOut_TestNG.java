package com.testNG;

import org.testng.annotations.Test;

public class TimeOut_TestNG {

	@Test(timeOut = 5000)    //this should not be less than thread.sleep
	private void searchMobile() throws InterruptedException {
		System.out.println("Login");
		Thread.sleep(2000);
		System.out.println("search mobile");
	}
}
