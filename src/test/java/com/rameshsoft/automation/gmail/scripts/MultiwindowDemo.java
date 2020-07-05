package com.rameshsoft.automation.gmail.scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.rameshsoft.automation.appln.pageobjects.Rameshsoft_Home_Page;
import com.rameshsoft.automation.appln.pageobjects.Rameshsoft_Youtube;
import com.rameshsoft.automation.base.ActionEngine;
import com.rameshsoft.automation.base.BaseTest;
import com.rameshsoft.automation.customisedexceptions.FrameworkException;
import com.rameshsoft.automation.supporters.ExcelUtility;
import com.rameshsoft.automation.supporters.PropertiesUtility;
import com.rameshsoft.automation.utilities.FilePaths;
import com.relevantcodes.extentreports.LogStatus;

public class MultiwindowDemo extends BaseTest {
	
	@Test
	private void instituteDemo() throws IOException, InterruptedException, FrameworkException, EncryptedDocumentException, InvalidFormatException {
		String url = PropertiesUtility.getPropertyValue("inst_url");
		getDriver().get(url);
		getExtentTest().log(LogStatus.INFO, "URL is entered as :"+url);
		Rameshsoft_Home_Page.clickOnVideo();
		getExtentTest().log(LogStatus.INFO, "Clicked On Videos");
		Thread.sleep(2000);
		ActionEngine.handleMuliWindows(1);
		getExtentTest().log(LogStatus.INFO, "Switched to 1st window");
		ExcelUtility excelUtility = new ExcelUtility(FilePaths.excelFilePath);
		getExtentTest().log(LogStatus.INFO, "Data typing action is done on youtube search "+excelUtility.getCellData("Sheet1", 0, 0));
		Rameshsoft_Youtube.enterChannel(excelUtility.getCellData("Sheet1", 0, 0));


	}

}
