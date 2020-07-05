package com.rameshsoft.automation.appln.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.rameshsoft.automation.base.ActionEngine;
import com.rameshsoft.automation.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;
public class ShareAndPocket_Page extends BaseTest {
	@FindBy(xpath="//ul[@class='fleft nav-box' or contains(@class,'topnav')]//a[text()='Home']")
	static private WebElement home;
	
	public static void clickOnHomeBtn() {
		// TODO Auto-generated method stub
		ActionEngine.waitForVisible(ShareAndPocket_Page.home);
		ActionEngine.delay(5000);
		String l1Title = ActionEngine.getElementText(home);
		home.click();

	}
	@FindBy(xpath="//button[@class='iz_allow_button']")
	static private WebElement allow;
	public static void clickOnAllowStatus() {
		Boolean allowStatus = ActionEngine.isWebElementVisible(allow);
		if (allowStatus)
			ActionEngine.clickJS(allow);
		getExtentTest().log(LogStatus.INFO, "User clicked on Allow button");

	}
	@FindBy(xpath="//ul[@class='lead-mstory']/li[4]/a")
	static private WebElement article;
	@FindBy(xpath="//h1")
	static private WebElement titleHeader;
	public static void clickOnArticle() {
		ActionEngine.waitForVisible(article);
		String title = ActionEngine.getElementText(article);
		Boolean status = ActionEngine.isWebElementVisible(article);
		String l1Title = ActionEngine.getElementText(home);

		if (status) {
			ActionEngine.clickJS(article);
			ActionEngine.waitForVisible(titleHeader);
			String actualTitle = ActionEngine.getElementText(titleHeader);
			if(title.toLowerCase().replace(" ", "").equals(actualTitle.toLowerCase().replace(" ", "")))
			{
				//Reporter.addStepLog("<font color='green'> The title <font color='blue'>" + title+ "</font> is navigated to respective page</font>");
				getExtentTest().log(LogStatus.INFO, "<font color='green'> The title <font color='blue'>" + title+ "</font> is navigated to respective page</font>");

			} else {
				getExtentTest().log(LogStatus.INFO, "<font color='red'> The title <font color='blue'>" + title+ "</font> is not navigated to respective page</font>");
					Assert.fail(" The title " + title+ " is not navigated to respective page");
			}

		} else {
			getExtentTest().log(LogStatus.INFO, "<font color='red'> The title <font color='blue'>" + title+ "</font> is not displayed in <font color='blue'>" + l1Title + "</font></font>");

			//Reporter.addStepLog("<font color='red'> The title <font color='blue'>" + title+ "</font> is not displayed in <font color='blue'>" + l1Title + "</font></font>");
			Assert.fail("The title " + title+ " is not displayed in " + l1Title );
		}
	}
	
	static {
		PageFactory.initElements(getDriver(), ShareAndPocket_Page.class);
	}

}
