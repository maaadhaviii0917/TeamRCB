package com.testvagrant.hackerrank.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonFileReader {
	
	//Reads the Json File and converts to JsonObject
	public static JSONObject readInputJsonFile(String filename) {
		
		String path =commonFunctions.getuserdir()+"/src/main/resources/"+filename+".json";
		File inputFile =new File(path);
    	JSONObject json = null;
       
        try {
        // Read input file
        FileReader fileReader;
		
			fileReader = new FileReader(inputFile);
		
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        try {
			while ((line = bufferedReader.readLine()) != null) {
			    stringBuilder.append(line);
			}
			 bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        // Parse input file as JSON
        try {
			json = new JSONObject(stringBuilder.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
		return json;
    }
}
