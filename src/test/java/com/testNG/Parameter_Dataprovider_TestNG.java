

package com.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameter_Dataprovider_TestNG {
//set of data
	
	@Test(dataProvider = "MY DATA")
	public void login(String name,String pass) {
		
		System.out.println("UserName :"+name);
		System.out.println("password :"+pass);
	}
	@DataProvider(name = "MY DATA")
	private Object[][] testData() {
		//dataprovider return type=Object    [][] 2d array
		return new Object[][] {{"ABC","123"},{"HIJ","456"},{"xyz","987"},{"tre","455"}
		};
	}
}