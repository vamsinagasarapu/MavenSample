package com.sample.testng;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SampleJSON {

	public static void main(String[] args) throws IOException, ParseException {
		
		
		//Reading from JSON file
		/*
		JSONParser parser=new JSONParser();
		
		FileReader f=new FileReader("C:\\Users\\Vamsi Krishna\\projects\\eclipse-workspace\\MavenSample\\sample.json");
		
		Object obj=parser.parse(f);
		
		JSONObject j1 =(JSONObject)obj;
		Object o1=j1.get("name");
		String n=o1.toString();
		System.out.println("your ame is: "+n);
		
		Object o2=j1.get("age");
		System.out.println("Your age is : "+o2.toString());
		
		*/
		
		// writing to JSON file
		
		FileWriter f2=new FileWriter("C:\\Users\\Vamsi Krishna\\projects\\eclipse-workspace\\MavenSample\\sample.json");
		
		JSONObject j2=new JSONObject();
		j2.put("country","India");
		j2.put("name", "Vamsi Krishna");
		j2.put("age", "24");
		
		//JSONArray ja=new JSONArray();
		//ja.add(j2);
		
		
		f2.write(j2.toString());
		f2.flush();
		System.out.println("Program completed");
		
		
		
		
	
	
	}
	
	
	
}
