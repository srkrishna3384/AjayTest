package com.rameshsoft.automation.base;

public class CommonActions extends BaseTest{

	public static void enterUrl(String url) {
		getDriver().get(url);
	}
	
	public static void navigateToUrl(String url) {
		getDriver().navigate().to(url);
	}
	
}
