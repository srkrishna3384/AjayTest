package com.rameshsoft.automation.appln.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.automation.base.BaseTest;
import com.rameshsoft.automation.customisedexceptions.FrameworkException;

public class Gmail_Pwd_Page extends BaseTest{
	
	@FindBy(name="password")
	static private WebElement password;
	
	@FindBy(id="passwordNext")
	static private WebElement signIn;
	
	@FindBy(xpath="//*[text()='Forgot password?']")
	static private WebElement frgtPwd;
	
	public static void enterPaasword(String testData) throws FrameworkException {
		if (password.isDisplayed()&&password.isEnabled()) {
			password.clear();
			password.sendKeys(testData);
		}
		else{
			throw new FrameworkException();
		}
	}
	
	public static void clickOnSignInBtn() throws FrameworkException {
		if (signIn.isDisplayed()&&signIn.isEnabled()) {
			signIn.click();
		}
		else{
			throw new FrameworkException();
		}
	}
	
	public static void clickOnFrgtPwd() throws FrameworkException {
		if (frgtPwd.isDisplayed()&&frgtPwd.isEnabled()) {
			frgtPwd.click();
		}
		else{
			throw new FrameworkException();
		}
	}
	
   	static
	{
		PageFactory.initElements(getDriver(), Gmail_Pwd_Page.class);
	}
}
