package com.rameshsoft.automation.utilities;

enum TestCaseActivities
{
	PASS("1"),//public static final TCSTATUS PASS;
	FAIL("2"),
	SKIP("3"),
	MEDIUM_WAIT("3000"),
	HIGH_WAIT("6000"),
	LOW_WAIT("1000");
	
	private String activity;
	
	private TestCaseActivities(String activity){
		this.activity = activity;
	}
	
	public String getActivity() {
		return activity;
	}
}

public class EnumTest {
public static void main(String[] args) {
	
	System.out.println(TestCaseActivities.PASS);
	System.out.println(TestCaseActivities.FAIL);
	System.out.println(TestCaseActivities.SKIP);
	
	TestCaseActivities[] tc = TestCaseActivities.values();
	
	for(TestCaseActivities testCase : tc){
		System.out.println("activity: " +testCase.getActivity()+" name is :"+testCase.name());
	}
	
	TestCaseActivities tc2 = TestCaseActivities.valueOf(TestCaseActivities.PASS.toString());
	System.out.println(tc2.name()+" .......... "+tc2.getActivity());
	
	TestCaseActivities tc3 = TestCaseActivities.valueOf(TestCaseActivities.FAIL.toString());
	System.out.println(tc3.name()+" .......... "+tc3.getActivity());
	
	TestCaseActivities tc4 = TestCaseActivities.valueOf(TestCaseActivities.SKIP.toString());
	System.out.println(tc4.name()+" .......... "+tc4.getActivity());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
