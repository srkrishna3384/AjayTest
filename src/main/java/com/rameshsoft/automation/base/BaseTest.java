package com.rameshsoft.automation.base;

import java.lang.reflect.Method;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.rameshsoft.automation.utilities.DriverValues;
import com.rameshsoft.automation.utilities.TestCaseActivity;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {
	private static WebDriver driver;
	private static String projctPath;
	private static ExtentReports extentReports;
	private static ExtentTest extentTest;

	    @Parameters("browserName")
	    @BeforeSuite
		public void openBrowser(@org.testng.annotations.Optional("chrome")String browserName){
	    	projctPath = System.getProperty("user.dir");
	    	extentReports = new ExtentReports(projctPath+"\\Reports\\results.html");
			if (browserName.equalsIgnoreCase(TestCaseActivity.FIREFOX.toString())) {
				System.setProperty(DriverValues.firefoxKey, DriverValues.firefoxValue);
				WebDriver driver = new FirefoxDriver();
				driverInit();
			}
			else if (browserName.equalsIgnoreCase(TestCaseActivity.CHROME.toString())) {
				System.setProperty(DriverValues.chromeKey,DriverValues.chromeValue );
				driver = new ChromeDriver();
				driverInit();
			}
			else if (browserName.equalsIgnoreCase(TestCaseActivity.IE.toString())) {
				System.setProperty(DriverValues.ieKey, DriverValues.ieValue);
				WebDriver driver = new InternetExplorerDriver();
				driverInit();
			}
			//extentTest.log(LogStatus.INFO, browserName+ " Browser is opened succesfully");
		}
	    @AfterSuite
		public void closeBrowser() throws InterruptedException {
			/*if (driver!=null) {
				driver.close();
			}
			else{
				System.out.println("DRIVER IS POINTING TO NULL");
			}*/
			Optional<WebDriver> optional = Optional.ofNullable(driver);
			if (optional.isPresent()) {
				Thread.sleep(5000);
				driver.close();
				System.out.println(optional.get().toString());
			}
			else{
				System.out.println("DRIVER IS POINTING TO NULL");
			}
			//extentTest.log(LogStatus.INFO, "Browser is closed");			
			extentReports.flush();
			extentReports.close();
			
		}
	    
	    @BeforeMethod
	    public void beforeTCExecution(Method method) {
			String tcName = method.getName();
			extentTest = extentReports.startTest(tcName);
		}
	    @AfterMethod
	    public void afterTCExecution(ITestResult result) {
			if (result.getStatus() == ITestResult.FAILURE) {
				extentTest.log(LogStatus.FAIL, "TC IS FAILED:" +result.getName());
				extentTest.log(LogStatus.FAIL, result.getThrowable());
			}
			extentReports.endTest(extentTest);
			
		}
	    private void driverInit(){
	    	driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(DriverValues.MIN_WAIT, TimeUnit.SECONDS);
	    }
	    
	    public static WebDriver getDriver() {
			return driver;
		}
	    public static String getProjctPath() {
			return projctPath;
		}
	    public static ExtentTest getExtentTest() {
			return extentTest;
		}
}
