package com.sample.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {

	
	public static WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vamsi Krishna\\Programming_support_files\\browser-drivers\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
		
	}
	
}
