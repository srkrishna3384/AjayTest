package com.rameshsoft.automation.gmail.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.rameshsoft.automation.appln.pageobjects.Gmail_Home_Page;
import com.rameshsoft.automation.base.ActionEngine;
import com.rameshsoft.automation.base.CommonActions;
import com.rameshsoft.automation.customisedexceptions.FrameworkException;
import com.rameshsoft.automation.supporters.ExcelUtility;
import com.rameshsoft.automation.supporters.PropertiesUtility;
import com.rameshsoft.automation.utilities.FilePaths;
import com.relevantcodes.extentreports.LogStatus;

public class POM_Gmail_Test extends CommonActions{

	//tcid
	//tc name
	@Test
	public void flipkart_electronics_mobile_Test() throws FrameworkException, IOException, EncryptedDocumentException, InvalidFormatException {
		String url = PropertiesUtility.getPropertyValue("prod_url");
		enterUrl(url);
		ActionEngine.validateTitleOfPage("Gmail");
		getExtentTest().log(LogStatus.INFO, "URL IS ENTERED AS: "+url);
		
		ExcelUtility excelUtility = new ExcelUtility(FilePaths.excelFilePath);
		String unData = excelUtility.getCellData("Sheet1", 0, 0);
		getExtentTest().log(LogStatus.INFO, "DTA is done on UN with test data : " +unData);
		
		Gmail_Home_Page.enterUserName(unData);
		
		
		Gmail_Home_Page.clickOnNextBtn();
		getExtentTest().log(LogStatus.INFO, "Clicked on next button");
		
	//	Gmail_Pwd_Page.enterPaasword(excelUtility.getCellData("Sheet1", 0, 1));
		//Gmail_Pwd_Page.clickOnSignInBtn();
		
		
	}
	
	
}
