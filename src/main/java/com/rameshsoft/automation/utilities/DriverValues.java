package com.rameshsoft.automation.utilities;

import com.rameshsoft.automation.base.BaseTest;

public interface DriverValues {

	String chromeKey = "webdriver.chrome.driver";
	String chromeValue = BaseTest.getProjctPath()+"//Drivers//chromedriver.exe";
	
	String ieKey = "webdriver.ie.driver";
	String ieValue = "";
	
	String firefoxKey = "webdriver.gecko.driver";
	String firefoxValue = "";
	
	String edgeKey = "webdriver.edge.driver";
	String edgeValue = "";
	
	int MIN_WAIT = 15;
	int MAX_WAIT = 60;
}
