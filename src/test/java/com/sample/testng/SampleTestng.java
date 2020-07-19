package com.sample.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestng {
	
	//setting the test case priority and skipping test cases
	
	@Test(priority=-5)
	public void test3() {
		System.out.println("This is test case 3");
	}
	@Test(priority=4,enabled=true)
	public void test1() {
		System.out.println("This is test case 1");
		
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Test case execution is started");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Start of the test execution");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Test case execution is completed");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("End of the test execution");
	}
	@Test(priority=2,enabled=false)
	public void test2() {
		System.out.println("This is test case 2");
	}

}
