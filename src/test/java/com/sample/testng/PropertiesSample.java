package com.sample.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesSample {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Vamsi Krishna\\projects\\eclipse-workspace\\MavenSample\\sample.properties");
		Properties prop=new Properties();
		
		// 
		FileInputStream fis=new FileInputStream(f);
		prop.load(fis);
		System.out.println("your name is : "+prop.getProperty("name"));
		
		FileOutputStream fos=new FileOutputStream(f);
		prop.setProperty("designation","software Engineer");
		prop.store(fos, "designation is added");
		
		
		
	}

}
