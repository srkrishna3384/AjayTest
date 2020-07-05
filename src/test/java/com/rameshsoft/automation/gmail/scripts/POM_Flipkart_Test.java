package com.rameshsoft.automation.gmail.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.rameshsoft.automation.appln.pageobjects.FlipKart_Electronics_Page;
import com.rameshsoft.automation.base.ActionEngine;
import com.rameshsoft.automation.base.BaseTest;
import com.rameshsoft.automation.base.CommonActions;
import com.rameshsoft.automation.supporters.ExcelUtility;
import com.rameshsoft.automation.supporters.PropertiesUtility;
import com.rameshsoft.automation.utilities.FilePaths;
import com.relevantcodes.extentreports.LogStatus;

public class POM_Flipkart_Test extends CommonActions {

	@Test
	public void electronics_MouseHover_Test() throws IOException, EncryptedDocumentException, InvalidFormatException, NumberFormatException, InterruptedException {		
		String url = PropertiesUtility.getPropertyValue("fp_url");
		enterUrl(url);
		getExtentTest().log(LogStatus.INFO, "URL is entered as : " +url);
		ExcelUtility exUtility = new ExcelUtility(FilePaths.excelFilePath);
		//validateTitleOfPage(exUtility.getCellData("Sheet1", 0, 5));
		getExtentTest().log(LogStatus.INFO, "Validating title of the page");
		FlipKart_Electronics_Page.pefrom_MouseHover();
		getExtentTest().log(LogStatus.INFO, "Performed mouse hover on electronics");
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
