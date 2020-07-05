package com.rameshsoft.automation.appln.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.automation.base.BaseTest;

public class Rameshsoft_Youtube extends BaseTest {
	@FindBy(xpath="//div[@id='search-input']/input")
	static private WebElement youtube_search;
	public static void enterChannel(String testData) {
		youtube_search.sendKeys(testData);
	}
	
	static {
		PageFactory.initElements(getDriver(), Rameshsoft_Youtube.class);
	}
}
