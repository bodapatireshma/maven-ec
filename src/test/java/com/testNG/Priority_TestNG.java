package com.testNG;

import org.testng.annotations.Test;
//priority test
public class Priority_TestNG {
	@Test(priority = 1)
	private void starttheCar() {
		System.out.println("car started");
	}
	@Test(priority = 2)
	private void firstGear() {
		System.out.println("First gear");
	}
	@Test(priority = 3)
	private void secondGear() {
		System.out.println("second gear");
	}
	@Test(priority = 4)
	private void stoptheCar() {
		System.out.println("stop the car");
	}
	@Test(priority = 5)
	private void keyOff() {
		System.out.println("off the key");
	}
	
}