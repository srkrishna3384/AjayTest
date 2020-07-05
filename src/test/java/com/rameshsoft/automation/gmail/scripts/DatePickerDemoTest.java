package com.rameshsoft.automation.gmail.scripts;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.ActionEngine;
import com.rameshsoft.automation.base.BaseTest;
import com.rameshsoft.automation.utilities.DateUtility;
import com.relevantcodes.extentreports.LogStatus;

public class DatePickerDemoTest extends BaseTest{

	@Test
	public void selectCurDate() throws InterruptedException {
		getDriver().get("https://www.jqueryui.com");
		getExtentTest().log(LogStatus.INFO, "URL is enetred as: https://www.jqueryui.com");
		Thread.sleep(3000);
		getDriver().findElement(By.linkText("Datepicker")).click();
		getExtentTest().log(LogStatus.INFO, "Clicked on date picker");
		Thread.sleep(3000);
		TargetLocator targetLocator = getDriver().switchTo();
		targetLocator.frame(0);
		getExtentTest().log(LogStatus.INFO, "Switched to frame");
		getDriver().findElement(By.id("datepicker")).click();
		Thread.sleep(3000);
		getExtentTest().log(LogStatus.INFO, "Clicked on Date table");
		//DateUtility dateUtil = new DateUtility();
		//dateUtil.selectCurDate("//table[@class='ui-datepicker-calendar']/tbody/tr/td");
		
		
		DateUtility.selectCurDate("//table[@class='ui-datepicker-calendar']/tbody/tr/td");
		getExtentTest().log(LogStatus.INFO, "Selected date from the calender as current date");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
