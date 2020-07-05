package com.rameshsoft.automation.gmail.scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseTest;

public class PopupsDemo extends BaseTest{
	
	@Test
public void popUpDemo() {
	getDriver().get("file:///C:/Users/RameshSir/Desktop/DeskTop21/DeskTop/alerts4/WindowUploadfile.html");
	getDriver().findElement(By.id("1")).sendKeys("C:\\Users\\RameshSir\\Desktop\\6AM.txt");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*getDriver().findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
	
	TargetLocator targetLocator = getDriver().switchTo();
	Alert alert = targetLocator.alert();
	
	getDriver().switchTo().alert();
	
	alert.sendKeys("RAMESHSOFT");
	String txt = alert.getText();
	System.out.println("Text is: " +txt);
	
	alert.accept();
	*/
	
	
	
	
	
	
	
	
	
	
	
	
}
}
