package com.rameshsoft.automation.appln.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rameshsoft.automation.base.BaseTest;

public class Facebook_Page extends BaseTest{

	@FindBy(id="day")
	static private WebElement dayDD;
	
	static public void performActionByValue(String value) {
		//ReportsDemo d = new ReportsDemo();
		if (dayDD.getTagName().equalsIgnoreCase("select")) {
			Select select = new Select(dayDD);
			select.selectByValue(value);
		}
		else{
			getDriver().findElement(By.xpath("//*[@value='value']")).click();;
		}
	}
    static public void performActionByVsbleTxt(String text) {
    	if (dayDD.getTagName().equalsIgnoreCase("select")) {
			Select select = new Select(dayDD);
			select.selectByVisibleText(text);
		}
		else{
			getDriver().findElement(By.xpath("//*[@value='value']")).click();;
		}
	}
    static public void performActionByIndex(int index) {
    	if (dayDD.getTagName().equalsIgnoreCase("select")) {
			Select select = new Select(dayDD);
			select.selectByIndex(index);
		}
		else{
			getDriver().findElement(By.xpath("//*[@value='value']")).click();;
		}
    }
	
}
