package com.rameshsoft.automation.utilities;

enum TCSTATUS
{
	PASS,//public static final TCSTATUS PASS;
	FAIL,
	SKIP,
	MEDIUM_WAIT,
	HIGH_WAIT,
	LOW_WAIT;
	private TCSTATUS(){
		System.out.println("CONSTRUCTOR");
	}
}

public class EnumDemo {
public static void main(String[] args) {
	System.out.println(TCSTATUS.PASS);
	System.out.println(TCSTATUS.FAIL);
	System.out.println(TCSTATUS.SKIP);
	TCSTATUS[] tcstatus = TCSTATUS.values();
	for(TCSTATUS tc : tcstatus)
	{
		System.out.println(tc);
	}
}
}


