package com.rameshsoft.automation.utilities;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rameshsoft.automation.base.BaseTest;

public class DateUtility extends BaseTest{

	static public void selectCurDate(String xpath) throws InterruptedException {
		
      List<WebElement> dates = getDriver().findElements(By.xpath(xpath));		
		Date date = new Date();
		String curDate = date.getDate()+"";
		
		for(WebElement ele : dates){
			String dateTxt = ele.getText();
			
			if (curDate.equalsIgnoreCase(dateTxt)) {
				ele.click();
				Thread.sleep(8000);
				break;
			}
		}
	}
	
}
