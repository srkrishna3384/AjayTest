package com.rameshsoft.automation.customisedexceptions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
public static void main(String[] args) throws IOException {
	BufferedReader br = null;
	System.out.println("1");
	try
	{
	FileInputStream fip = new FileInputStream("D:\\6AM-ONLINE\\secondapp\\config1.properties");
	br = new BufferedReader(new FileReader(""));
	}
	catch(Exception e){
		System.out.println("Catch block");
		//e.printStackTrace();
		//System.out.println(e.getMessage());
		//System.out.println(e.toString());
	}
	finally
	{
		br.close();
		;
	}
	System.out.println("2");
	System.out.println("3");
	
}
}
