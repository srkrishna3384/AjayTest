package com.rameshsoft.automation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.rameshsoft.automation.base.BaseTest;

public interface CaptureScreenshot {

//	public String captureImage(String tcName){
//		String imgLoc = BaseTest.getProjctPath()+"\\Screenshots\\"+tcName+".jpeg";
//		TakesScreenshot ts = (TakesScreenshot) BaseTest.getDriver();
//		File image = ts.getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(image, new File(imgLoc));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return imgLoc;
//	}
//	
//	public void captureImage(String tcName,String description){
//		TakesScreenshot ts = (TakesScreenshot) BaseTest.getDriver();
//		File image = ts.getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(image, new File(BaseTest.getProjctPath()+"\\Screenshots\\"+tcName+".jpeg"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}




