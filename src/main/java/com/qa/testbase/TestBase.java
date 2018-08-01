package com.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class TestBase {
	

	public  void ReadProp() throws IOException {
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\test.properties");
		prop.load(fis);
		prop.getProperty("URL");
		return;
				
	}
	
}

