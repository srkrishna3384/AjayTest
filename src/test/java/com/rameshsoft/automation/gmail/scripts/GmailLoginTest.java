package com.rameshsoft.automation.gmail.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseTest;
import com.rameshsoft.automation.supporters.ExcelUtility;

public class GmailLoginTest extends BaseTest{

	@Test
	public void gmailLogin() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException {
		FileInputStream fipOr = new FileInputStream("E:\\Rameshsoft\\thirdmavenproject\\src\\main\\java\\com\\rameshsoft\\automation\\objectrepository\\OR_Gmail.properties");
		Properties prOr = new Properties();
		prOr.load(fipOr);
		String value1 = prOr.getProperty("un_id");
		String value2 = prOr.getProperty("next_id");
		String value3 = prOr.getProperty("pwd_name");
		String value4 = prOr.getProperty("signin_xpath");
		
		System.out.println(value1 + "  "+value2 +"   "+value3+"  "+value4);
		
		FileInputStream fipConf = new FileInputStream("E:\\Rameshsoft\\thirdmavenproject\\config.properties");		
		Properties prConf = new Properties();
		prConf.load(fipConf);
		String URL = prConf.getProperty("prod_url");
		getDriver().get(URL);
		
		ExcelUtility excelUtility = new ExcelUtility("E:\\Rameshsoft\\thirdmavenproject\\TestData\\GmailTestData.xls");
		String un = excelUtility.getCellData("Sheet1", 0, 0);
		
		getDriver().findElement(By.id(value1)).sendKeys(un);
		getDriver().findElement(By.id(value2)).click();
		Thread.sleep(4000);
		String pwd = excelUtility.getCellData("Sheet1", 0, 1);
		getDriver().findElement(By.name(value3)).sendKeys(pwd);
		getDriver().findElement(By.xpath(value4)).click();
	}
	
}
