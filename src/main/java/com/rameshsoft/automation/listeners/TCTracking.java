package com.rameshsoft.automation.listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.rameshsoft.automation.base.BaseTest;
import com.rameshsoft.automation.utilities.CaptureScreenshot;

public class TCTracking implements ITestListener{
	
	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("Suite execution is completed");
	}
	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("Suite execution is started");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	}
	@Override
	public void onTestFailure(ITestResult arg0) {
		String tcName = arg0.getName().toString();
		System.out.println("TC IS Failed: " +tcName);
		//CaptureScreenshot.captureImage(tcName);
	}
	@Override
	public void onTestSkipped(ITestResult arg0) {
		String tcName = arg0.getName().toString();
		System.out.println("TC IS Skipped: " +tcName);
		//CaptureScreenshot.captureImage(tcName);
	}
	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("TC Name is: " +arg0.getName().toString());
	}
	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("TC is Success: " +arg0.getName().toString());
	}
}
