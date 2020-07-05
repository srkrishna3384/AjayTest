package com.rameshsoft.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.rameshsoft.automation.utilities.FilePaths;

public class PropertiesUtility {

	static public String getPropertyValue(String key) throws IOException
	{
		FileInputStream fip = new FileInputStream(FilePaths.confFilePath);
		Properties properties = new Properties();
		properties.load(fip);
		String value = properties.getProperty(key);
		return value;
	}
	
	static public String getPropertyValue(String key,String defaultValue) throws IOException
	{
		FileInputStream fip = new FileInputStream(FilePaths.confFilePath);
		Properties properties = new Properties();
		properties.load(fip);
		String value = properties.getProperty(key);
		if (value==null) {
			value = defaultValue;
		}
		return value;
	}
	
}
