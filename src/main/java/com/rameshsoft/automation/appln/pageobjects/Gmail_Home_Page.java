package com.rameshsoft.automation.appln.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.rameshsoft.automation.base.BaseTest;
import com.rameshsoft.automation.customisedexceptions.FrameworkException;

public class Gmail_Home_Page extends BaseTest{

	@FindBy(id="identifierId")
	static private WebElement userName;
	
	@FindBy(id="identifierNext")
	static private WebElement next;
	
	@FindBy(xpath="//button[text()='Forgot email?']")
	static private WebElement frgtEmail;
	
	@FindBy(xpath="//*[text()='Create account']")
	static private WebElement createAcc;
	
	public static void enterUserName(String testData) throws FrameworkException {
		if (userName.isDisplayed()&&userName.isEnabled()) {
			userName.clear();
			userName.sendKeys(testData);
		}
		else{
			throw new FrameworkException();
		}
	}
	
	public static void clickOnNextBtn() throws FrameworkException {
		Assert.assertTrue(next.isDisplayed()&&next.isEnabled());
		next.click();
		/*if (next.isDisplayed()&&next.isEnabled()) {
			next.click();
		}
		else{
			throw new FrameworkException();
		}*/
	}
	
	public static void clickOnFrgtEmail() throws FrameworkException {
		if (frgtEmail.isDisplayed()&&frgtEmail.isEnabled()) {
			next.click();
		}
		else{
			throw new FrameworkException();
		}
	}
	
    public static void clickOnCreateAcc() throws FrameworkException {
    	if (createAcc.isDisplayed()&&createAcc.isEnabled()) {
			next.click();
		}
		else{
			throw new FrameworkException();
		}
	}
	
	static
	{
		PageFactory.initElements(getDriver(), Gmail_Home_Page.class);
	}
		
}
