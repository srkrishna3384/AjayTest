package com.rameshsoft.automation.gmail.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseTest;

public class FaceBookTest extends BaseTest{
	
	@Test
	public void fbTest() {
		getDriver().get("https://www.facebook.com");
		getDriver().findElement(By.id("email")).sendKeys("9177791456");
	}

	@Test
	public void fbTest1() {
		getDriver().get("https://www.facebook.com");
		//getDriver().findElement(By.id("email12")).sendKeys("91777 91456");
	}
}
