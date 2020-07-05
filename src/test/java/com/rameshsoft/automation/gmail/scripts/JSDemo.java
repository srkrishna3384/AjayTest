package com.rameshsoft.automation.gmail.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JSDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("google.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.name("q"));
		WebElement ele1 = driver.findElement(By.name("q"));
		js.executeScript("arguments[0].click();", ele,ele1);
		
		js.executeScript("window.scrollBy(0,600)");
		
		String url = js.executeScript("return document.URL;").toString();
		String title = js.executeScript("return document.title;").toString();
		
		js.executeScript("window.location='https://www.flipkart.com'");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
