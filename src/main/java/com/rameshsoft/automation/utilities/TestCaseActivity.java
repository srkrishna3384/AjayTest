package com.rameshsoft.automation.utilities;

public enum TestCaseActivity {

	PASS("1"),//public static final TCSTATUS PASS;
	FAIL("2"),
	SKIP("3"),
	MEDIUM_WAIT("3000"),
	HIGH_WAIT("6000"),
	LOW_WAIT("1000"),
	IE("ie"),
	CHROME("chrome"),
	FIREFOX("firefox"),
	EDGE("edge"),
	PHANTOMJS("phantom");
	
	private String activity;
	
	private TestCaseActivity(String activity){
		this.activity = activity;
	}
	
	public String getActivity() {
		return activity;
	}
	
}
