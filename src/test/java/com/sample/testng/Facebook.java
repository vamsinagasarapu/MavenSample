package com.sample.testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Facebook {
	
	
	
	public static void main(String[] args) throws IOException {
		
		String url="https://www.facebook.com/";
		WebDriver driver=Helper.getDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		
		//email.sendKeys("hello@gmail.com");
		
		
		// creating Actions class object
		Actions ac=new Actions(driver);
		
		//code for passing input in capital letters
		ac.keyDown(email,Keys.SHIFT).perform();
		ac.sendKeys(email,"hello@gmail.com").perform();
		ac.keyUp(email,Keys.SHIFT).perform();
		
		// Taking screen shot
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		// creating a png file in the desktop
		File des=new File("C:\\Users\\Vamsi Krishna\\Desktop\\FB_Screenshot.png");
		
		
		//copying the file from Temp to the permanent path
		FileUtils.copyFile(src, des);
		
		System.out.println("screenshot of Facebook login page is taken and placed in desktop");
		
		
	}

}
