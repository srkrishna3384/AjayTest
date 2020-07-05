package com.rameshsoft.automation.gmail.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.rameshsoft.automation.appln.pageobjects.NewsConsumptionPage;
import com.rameshsoft.automation.appln.pageobjects.ShareAndPocket_Page;
import com.rameshsoft.automation.base.BaseTest;
import com.rameshsoft.automation.supporters.PropertiesUtility;
import com.relevantcodes.extentreports.LogStatus;

public class ShareAndPocketIcons extends BaseTest {
	
	String l1Title;
	@Test
	public void sharePocket() throws IOException {
		String url = PropertiesUtility.getPropertyValue("news18_url");
		getDriver().get(url);
		getExtentTest().log(LogStatus.INFO, "URL is entered as :"+url);
//		ActionEngine.waitForVisible(ShareAndPocket_Page.home);
		ShareAndPocket_Page.clickOnHomeBtn();
		getExtentTest().log(LogStatus.INFO, "User clicked on: "+l1Title);
		ShareAndPocket_Page.clickOnAllowStatus();
		ShareAndPocket_Page.clickOnArticle();
		NewsConsumptionPage.verifyStatusOfBredCrum();
		NewsConsumptionPage.categoryDisplay();
		NewsConsumptionPage.displayDate();
		NewsConsumptionPage.displayFBIcon();
		
		
		

	}

}
