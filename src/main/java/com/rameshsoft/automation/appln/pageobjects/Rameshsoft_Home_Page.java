package com.rameshsoft.automation.appln.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.automation.base.BaseTest;

public class Rameshsoft_Home_Page extends BaseTest{
	@FindBy(xpath="//a[text()='Videos']")
	static private WebElement videos;
	public static void clickOnVideo() {
		videos.click();
	}
	
	static {
		PageFactory.initElements(getDriver(), Rameshsoft_Home_Page.class);
	}

}
