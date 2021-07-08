package com.testNG;

import org.testng.annotations.Test;
//depends on methods
public class Dependency_TestNG {
	@Test
	private void browserLaunch() {
		System.out.println("browser launch");
	}
	@Test
	private void url() {
		System.out.println("amazon.com");
	}
	@Test (dependsOnMethods = "url")
	private void login() {
		System.out.println("login");
	}
	@Test(dependsOnMethods = "login")
	private void searchMobiles() {
		System.out.println("search mobiles");
	}
}
