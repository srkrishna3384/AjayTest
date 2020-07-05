package com.rameshsoft.automation.appln.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rameshsoft.automation.base.ActionEngine;
import com.rameshsoft.automation.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class NewsConsumptionPage extends BaseTest {

	static String title="";

	@FindBy(xpath="//div[@class='brade_crum abrdacrum' or @class='bredcrum']")
	static private WebElement bredCrum;

	public static void verifyStatusOfBredCrum() {
		Boolean status = ActionEngine.isWebElementVisible(bredCrum);

		if(status)
		{
			getExtentTest().log(LogStatus.INFO, "<font color='green'> The Bredcrum is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
		} else {
			getExtentTest().log(LogStatus.INFO, "<font color='red'> The Bredcrum is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
			Assert.fail("The Bredcrum is not displayed for the article : " + title);
		}

	}
	@FindBy(xpath="//div[@class='brade_crum abrdacrum' or @class='bredcrum']//a[2]/span")
	static private WebElement category;
	public static void categoryDisplay() {
		//String title="";
		Boolean status = ActionEngine.isWebElementVisible(category);
		if(status)
		{
			getExtentTest().log(LogStatus.INFO, "<font color='green'> The Category is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
		} else {
			getExtentTest().log(LogStatus.INFO, "<font color='red'> The Category is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
			Assert.fail("The Category is not displayed for the article : " + title);
		}

	}
	@FindBy(xpath="//div[@class='article-share']")
	static private WebElement article;
	@FindBy(xpath="//ul[@class='article-bnow']/li[2]")
	static private WebElement date;
	static Boolean status = ActionEngine.isWebElementVisible(NewsConsumptionPage.article);
	static String homePage;
	public static void displayDate() {
		String homePage = getDriver().getWindowHandle();
		 status = ActionEngine.isWebElementVisible(NewsConsumptionPage.article);
		if(status)
		{
			String date = ActionEngine.getElementText(NewsConsumptionPage.date);
			if(!date.equals(null))
				//Reporter.addStepLog("<font color='green'> Date is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
				getExtentTest().log(LogStatus.INFO, "<font color='green'> Date is displayed for the article : <font color='blue'>" + title+ "</font> </font>");

			else
			{
				getExtentTest().log(LogStatus.INFO, "<font color='red'> Date is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
			}

		}
	}
	@FindBy(xpath="//div[@class='article-share']/a[contains(@class,'fbicon')]")
	static private WebElement fbIcon;
	public static void displayFBIcon() {
		status = ActionEngine.isWebElementVisible(NewsConsumptionPage.fbIcon);
		if(status)
		{
			getExtentTest().log(LogStatus.INFO, "<font color='green'> The Facebook icon is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
			ActionEngine.waitForVisible(fbIcon);
			ActionEngine.clickJS(NewsConsumptionPage.fbIcon);
			ActionEngine.handleMuliWindows();
			ActionEngine.waitForPageToLoad();
			ActionEngine.delay(5000);
			String url = getDriver().getCurrentUrl();
			if (url.contains("facebook"))
			getExtentTest().log(LogStatus.INFO, " <font color='green'> Navigated to  <font color='magenta'> Facebook  </font> page successfully </font> :"+ url);

			else {
				getExtentTest().log(LogStatus.INFO, " <font color='red'> Not navigated to Facebook page</font> :" + url);
				Assert.fail("Not navigated to Facebook page");
			}

			getDriver().close();
			ActionEngine.switchToWindow(homePage);
		} else {
			getExtentTest().log(LogStatus.INFO, "<font color='red'> The Facebook icon is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
			Assert.fail("The Facebook icon is not displayed for the article : " + title);
		}
		
	}
	

}
