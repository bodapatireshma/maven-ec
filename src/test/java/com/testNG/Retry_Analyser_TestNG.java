package com.testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyser_TestNG implements IRetryAnalyzer {

	int count = 1;
	int limit = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		if (count <= limit) {
			count++;
			return true;
		}	
		return false;
	}
}