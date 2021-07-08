package com.testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_TestNG {
//@Ignore,enabled=false
	
	@Ignore
	@Test
	private void red() {
		System.out.println("red");
	}
	@Test(enabled = false)
	private void gren() {
		System.out.println("Green");
	}
	@Test
	private void yellow() {
		System.out.println("yellow");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
