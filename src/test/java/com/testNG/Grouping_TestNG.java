package com.testNG;

import org.testng.annotations.Test;

public class Grouping_TestNG {
//scenario-red,blue,black,red,blue,blue,black
	
	@Test(groups = "RED")
	private void red() {
		System.out.println("RED");
	}
	@Test(groups = "RED")
	private void red1() {
		System.out.println("RED 1");
	}
	@Test
	private void blue() {
		System.out.println("BLUE");
	}
	@Test
	private void blue1() {
		System.out.println("BLUE 1");
	}
	@Test(groups = "BLACK")
	private void black() {
		System.out.println("BLACK");
	}
	@Test(groups = "BLACK")
	private void black1() {
		System.out.println("BLACK 1");
	}
}
