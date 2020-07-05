package com.rameshsoft.automation.listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.rameshsoft.automation.utilities.CaptureScreenshot;

public class TCTrackingAdapter extends TestListenerAdapter{

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
	public void onTestSuccess(ITestResult arg0) {
		String tcName = arg0.getName().toString();
		System.out.println("TC IS PASSED: " +tcName);
		//CaptureScreenshot.captureImage(tcName);

	}
}
