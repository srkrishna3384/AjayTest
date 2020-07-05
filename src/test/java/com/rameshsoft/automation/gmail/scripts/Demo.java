package com.rameshsoft.automation.gmail.scripts;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseTest;

public class Demo extends BaseTest {
	@Test
public void datePick() throws InterruptedException {
	getDriver().get("https://www.jqueryui.com");
	getDriver().findElement(By.linkText("Datepicker")).click();
	Thread.sleep(3000);
	getDriver().switchTo().frame(0);
	getDriver().findElement(By.id("datepicker")).click();
	Thread.sleep(3000);
	List<WebElement> eles = getDriver().findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
	Date a = new Date();
	System.out.println("CDATE IS: " +a.getDate());;
	String h = a.getDate()+"";
	for(WebElement ele : eles){
		System.out.println("...."+ele.getText());
		String a1 = ele.getText();
		if (a1.equalsIgnoreCase(h)) {
			ele.click();
			Thread.sleep(6000);
			break;
		}
	}
	
	
	
	
	
	
	
	
	
}
	public static void main(String[] args) {
		
	}
}
