package com.testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//parameter test----single set of data
//xml---parameter
public class Parameter_TestNG {
//credentials----username,password
	
//	@Parameters({"name"})
//	@Test
//	private void empUserName(String name) {
//		System.out.println("Username :"+name);
//	}
//	@Parameters({"pass"})
//	@Test
//	private void empPassword(String pass) {
//		System.out.println("Password :"+pass);
//	}
//testng test---optional
	
	@Parameters({"name"})
	@Test
	private void empUserName(@Optional("Queen") String name) {
		System.out.println("Username :"+name);
	}
	@Parameters({"pass"})
	@Test
	private void empPassword(@Optional("123") String pass) {
		System.out.println("Password :"+pass);
	}
}