package com.rameshsoft.automation.gmail.scripts;

import java.awt.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamTest {
public static void main(String[] args) {
	
	WebDriver d = new ChromeDriver();
	d.get("flipkart.com");
	;;;;;;;;;;;;;//10 window opened
	
	Set<String> windows = d.getWindowHandles();//10
	TargetLocator targetLocator = d.switchTo();
	for(String window : windows)//10
	{
		targetLocator.window(window);
		try
		{
		   d.findElement(By.id("rameshsoft")).click();
		   break;
		}
		catch(Exception e)
		{
			java.util.List<WebElement> frames = d.findElements(By.tagName("iframe"));
			for(int i=0;i<frames.size();i++){
				targetLocator.frame(i);
				try{
				  d.findElement(By.id("rameshsoft")).click();
				  break;
				}
				catch(Exception e1){
					System.out.println("Inside frame also not able to find");
				}
			}
			System.out.println(window +" :in this window element is not there");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
