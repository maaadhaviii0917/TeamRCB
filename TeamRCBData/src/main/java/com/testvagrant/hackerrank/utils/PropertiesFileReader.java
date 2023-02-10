package com.testvagrant.hackerrank.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileReader {
	
	Properties prop;
	
	public PropertiesFileReader() {
		
	}
	
	//load the properties file from requested file
	public void loadProperties(String testDataFile) {
		String path =commonFunctions.getuserdir()+"/src/main/resources/"+testDataFile+".properties";
		
		//File file= new File(path);
		try {
			InputStream input = new FileInputStream(path);
			prop = new Properties();
			prop.load(input);
			input.close();			

		} catch (IOException e) {
			System.out.println("unable to find : "+testDataFile);
			e.printStackTrace();
		}
	}
	
	public String getValue(String key) {
		if (prop.containsKey(key)) {
			return prop.getProperty(key);
		}
		return null;
	}

}
