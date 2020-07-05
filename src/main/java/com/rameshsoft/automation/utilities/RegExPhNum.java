package com.rameshsoft.automation.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface RegExPhNum {

	public static boolean isValidPhNum(String phNum){
		boolean flag = true;
		String pattern = "(0|91)?[6-9][0-9]{9}";
		
		Pattern pattern2 = Pattern.compile(pattern);
		Matcher matcher = pattern2.matcher(phNum);
		
		if (matcher.find()&&matcher.group().equalsIgnoreCase(phNum)) {
			System.out.println("It is valid ph num");
		}
		else{
			System.out.println("It is invalid ph num");
			flag = false;
		}
		return flag;
	}
	
}
