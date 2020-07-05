package com.rameshsoft.automation.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.rameshsoft.automation.customisedexceptions.FrameworkException;
import com.rameshsoft.automation.utilities.TestCaseActivity;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.HTMLReporter;
import com.relevantcodes.extentreports.LogStatus;



abstract public class ActionEngine extends CommonActions {

	private static WebElement element;
	private static List<WebElement> elements;
	private static Actions actions = new Actions(getDriver());
	private static JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();
	private static final int DEFAULT_WAIT_SECONDS = 60;
	private static final int DEFAULT_WAIT_MORE_SECONDS = 60;
	private static final int MIN_WAIT_SECONDS=10;
	public static String lastAction = "";
	public static String pageLoadStatus = "";



	public static boolean identifyElementValidate(String locMech, String locValue) throws FrameworkException {
		boolean status = true;
		switch (locMech) {
		case "id":
			for(int i=0;i<=10;i++){
				try{
					Thread.sleep(500);
					element = getDriver().findElement(By.id(locValue));
					}
					catch(Exception e){
						
					}
			}
			
			break;
		case "name":
			element = getDriver().findElement(By.name(locValue));
			break;
		case "classname":
			element = getDriver().findElement(By.className(locValue));
			break;
		case "css":
			element = getDriver().findElement(By.cssSelector(locValue));
			break;
		case "xpath":
			element = getDriver().findElement(By.xpath(locValue));
			break;
		case "tagName":
			element = getDriver().findElement(By.tagName(locValue));
			break;
		case "linkText":
			element = getDriver().findElement(By.linkText(locValue));
			break;
		case "partialLinkText":
			element = getDriver().findElement(By.partialLinkText(locValue));
			break;

		default:
			break;
		}
		if (element.isDisplayed() && element.isEnabled()) {
			status = true;
		} else {
			status = false;
			FrameworkException exce = new FrameworkException("Element is not visible: " + element);
			throw exce;
		}
		return status;
	}

	public static List<WebElement> identifyElements(String locMech, String locValue) throws FrameworkException {

		switch (locMech) {
		case "id":
			elements = getDriver().findElements(By.id(locValue));
			break;
		case "name":
			elements = getDriver().findElements(By.name(locValue));
			break;
		case "classname":
			elements = getDriver().findElements(By.className(locValue));
			break;
		case "css":
			elements = getDriver().findElements(By.cssSelector(locValue));
			break;
		case "xpath":
			elements = getDriver().findElements(By.xpath(locValue));
			break;
		case "tagName":
			elements = getDriver().findElements(By.tagName(locValue));
			break;
		case "linkText":
			elements = getDriver().findElements(By.linkText(locValue));
			break;
		case "partialLinkText":
			elements = getDriver().findElements(By.partialLinkText(locValue));
			break;

		default:
			break;
		}

		return elements;
	}

	public static WebElement identifyElement(String locMech, String locValue) throws FrameworkException {

		switch (locMech) {
		case "id":
			element = getDriver().findElement(By.id(locValue));
			break;
		case "name":
			element = getDriver().findElement(By.name(locValue));
			break;
		case "classname":
			element = getDriver().findElement(By.className(locValue));
			break;
		case "css":
			element = getDriver().findElement(By.cssSelector(locValue));
			break;
		case "xpath":
			element = getDriver().findElement(By.xpath(locValue));
			break;
		case "tagName":
			element = getDriver().findElement(By.tagName(locValue));
			break;
		case "linkText":
			element = getDriver().findElement(By.linkText(locValue));
			break;
		case "partialLinkText":
			element = getDriver().findElement(By.partialLinkText(locValue));
			break;

		default:
			break;
		}
		return element;
	}

	public static void DTA(String locMech, String locValue, String testData) throws FrameworkException {
		element = identifyElement(locMech, locValue);
		if (isOperatable(element)) {
			element.clear();
			element.sendKeys(testData);
		} else {
			FrameworkException exce = new FrameworkException(
					"with :" + locMech + ": not able to identify ele with the value: " + locValue);
			throw exce;
		}
	}
	public static WebElement waitForVisible(By locator) {
		String imagePath;
		String pathForLogger;
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_MORE_SECONDS);
			return wait.until(ExpectedConditions.visibilityOfElementLocated((By) locator));

		} catch (Exception e) {
			Assert.fail(locator+" Element is not visible");
		}
		return element;
	}
	public static WebElement waitForVisible(WebElement element) {
		String imagePath;
		String pathForLogger;
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_MORE_SECONDS);
			return wait.until(ExpectedConditions.visibilityOf(element));

		} catch (Exception e) {
			Assert.fail(element+" Element is not visible");
		}
		return element;
	}
	
	public static WebElement waitForPresent(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(), MIN_WAIT_SECONDS);
		wait.ignoring(ElementNotVisibleException.class);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public static WebElement waitForPresent(WebElement element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), MIN_WAIT_SECONDS);
		wait.ignoring(ElementNotVisibleException.class);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static boolean clickJS(By locator) {
		lastAction = "Click : " + locator.toString();
		// LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
		WebElement element = waitForVisible(locator);
		Object obj = ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", element);

		return obj == null;
	}
	public static boolean clickJS(WebElement element) {
		lastAction = "Click : " + element.toString();
		// LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
		WebElement element1 = waitForVisible(element);
		Object obj = ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", element1);

		return obj == null;
	}
	public static boolean clickJS(By locator, String logStep) {
		lastAction = "Click : " + locator.toString();
		// LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
		WebElement element = waitForVisible(locator);
		Object obj = ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", element);
		//RunCukesTest.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
		getExtentTest().log(LogStatus.PASS, logStep);

		return obj == null;
	}
	public static boolean isWebElementVisible(By locator) {
		try {
			lastAction = "Check Element visible: " + locator.toString();
			WebElement elm = waitForPresent(locator);

			return elm.isDisplayed();
		} catch (Exception e) {
			return false;
		}

	}
	public static boolean isWebElementVisible(WebElement element) {
		try {
			lastAction = "Check Element visible: " + element.toString();
			WebElement elm = waitForPresent(element);

			return elm.isDisplayed();
		} catch (Exception e) {
			return false;
		}

	}
	public static String getElementText(By locator) {
		lastAction = "Get Element text: " + locator.toString();

		WebElement elm = waitForVisible(locator);
		return elm.getText().trim();
	}
	public static String getElementText(WebElement element) {
		lastAction = "Get Element text: " + element.toString();

		WebElement elm = waitForVisible(element);
		return elm.getText().trim();
	}
	public static void waitForPageToLoad() {
		try {
			do {
				JavascriptExecutor js = (JavascriptExecutor) getDriver();
				pageLoadStatus = (String) js.executeScript("return document.readyState");
			} while (!pageLoadStatus.equals("complete"));
		} catch (Exception e) {
			//LogUtil.infoLog("Page load", " to load the page" + e.getStackTrace());
		}

	}	public static void delay(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			System.err.println("InterruptedException occured when waiting for " + time + " milliseconds");
		}
	}
	public static boolean isOperatable(WebElement elem) {
		boolean status = true;
		if (elem.isDisplayed() && elem.isEnabled()) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}

	public static void click(String locMech, String locValue) throws FrameworkException {
		element = identifyElement(locMech, locValue);
		if (isOperatable(element)) {
			element.click();
		} else {
			FrameworkException exce = new FrameworkException(
					"with :" + locMech + ": not able to identify ele with the value: " + locValue);
			throw exce;
		}
	}

	public static void DTAActions(String locMech, String locValue, String testData) throws FrameworkException {
		element = identifyElement(locMech, locValue);
		actions.sendKeys(element, testData).build().perform();
		;
	}

	public static void DTA(String locMech, String locValue, String testData, String how) throws FrameworkException {
		element = identifyElement(locMech, locValue);
		if (isOperatable(element)) {
			if (how.equalsIgnoreCase("actions")) {
				// element = identifyElement(locMech, locValue);
				actions.sendKeys(element, testData).build().perform();
				;
			} else {
				element.clear();
				element.sendKeys(testData);
			}
		} else {
			FrameworkException exce = new FrameworkException(
					"with :" + locMech + ": not able to identify ele with the value: " + locValue);
			throw exce;
		}
	}

	public static void click(String locMech, String locValue, String how) throws FrameworkException {
		element = identifyElement(locMech, locValue);
		if (isOperatable(element)) {
			if (how.equalsIgnoreCase("actions")) {
				actions.click(element).build().perform();
			} else {
				element.click();
			}
		} else {
			FrameworkException exce = new FrameworkException(
					"with :" + locMech + ": not able to identify ele with the value: " + locValue);
			throw exce;
		}
	}

	public static void switchToFrame(String locMech, String locValue, String how, String howValue)
			throws FrameworkException {
		TargetLocator targetLocator = getDriver().switchTo();
		element = identifyElement(locMech, locValue);
		if (how.equalsIgnoreCase("index")) {
			int indexVal = Integer.parseInt(howValue);
			targetLocator.frame(indexVal);
		} else if (how.equalsIgnoreCase("id")) {
			targetLocator.frame(howValue);
		} else if (how.equalsIgnoreCase("webelement")) {
			targetLocator.frame(element);
		}
	}

	public static void mouseHover(String locMech, String locValue) throws FrameworkException {
		element = identifyElement(locMech, locValue);
		actions.moveToElement(element).build().perform();
	}

	public static void mouseHover(WebElement element) throws FrameworkException {
		actions.moveToElement(element).build().perform();
	}

	public static void rightClick(String locMech, String locValue) throws FrameworkException {
		element = identifyElement(locMech, locValue);
		actions.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build()
				.perform();
	}

	/*
	 * This method is to handle any number of windows
	 */
	public static void handleMuliWindows(int windowIndexNum) throws FrameworkException {
		Set<String> windows = getDriver().getWindowHandles();
		List<String> windows1 = new ArrayList<String>(windows);
		TargetLocator targetLocator = getDriver().switchTo();
		Optional<TargetLocator> optional = Optional.ofNullable(targetLocator);
		if (optional.isPresent()) {
			String windowName = windows1.get(windowIndexNum);
			targetLocator.window(windowName);
		} else {
			FrameworkException excep = new FrameworkException(
					"TargetLocator is pointing to null value in handleMuliWindows()");
			throw excep;
		}
	}

	public static void handleMuliWindows() {
		Set<String> windows = getDriver().getWindowHandles();
		String curWindow = getDriver().getWindowHandle();
		for (String win : windows) {
			if (!win.equalsIgnoreCase(curWindow)) {
				TargetLocator targetLocator = getDriver().switchTo();
				targetLocator.window(win);
			}
		}
	}
	public static void switchToWindow(String windowName) {

		try {
			getDriver().switchTo().window(windowName);

		} catch (Exception e) {
			//LogUtil.infoLog("switchFrameToBack", windowName + " TO FRAME FAILED" + e.getStackTrace());
		}
	}

	public static void validateTitleOfPage(String expectedTitle) {
		String actualTitle = getTitleOfPage();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	public static void validateNameOfWindow(String expectedWindowName) {
		String actualWindowName = getNameOfWindow();
		Assert.assertEquals(actualWindowName, expectedWindowName);
	}

	public static String getTitleOfPage() {
		String title = getDriver().getTitle();
		Optional<String> optional = Optional.ofNullable(title);
		if (optional.isPresent()) {
			title = getDriver().getTitle();
		} else {
			;
			;
		}
		return title;
	}

	public static String getNameOfWindow() {
		String title = getDriver().getWindowHandle();
		Optional<String> optional = Optional.ofNullable(title);
		if (optional.isPresent()) {
			title = getDriver().getTitle();
		} else {
			;
			;
		}
		return title;
	}

	public static void enterUrlJS(String url) {
		javascriptExecutor.executeScript("window.location='url'");
	}

	public static void clickByJS(WebElement element) {
		javascriptExecutor.executeScript("arguments[0].click();", element);
	}

	public static void DTAByJS(WebElement element, String testData) {
		javascriptExecutor.executeScript("arguments[0].value=;", element);
	}

	public static void verticalScrollUPByJS() {
		javascriptExecutor.executeScript("window.scrollBy(0,600)");
	}

	public static void minimumWait(WebElement element) throws InterruptedException {

		for (int i = 0; i <= 25; i++) {
			Thread.sleep(2000);
			if (element.isDisplayed() && element.isEnabled()) {
				break;
			}
		}

	}
	
	public static void MIN_WAIT() throws NumberFormatException, InterruptedException {
		String tc = TestCaseActivity.LOW_WAIT.getActivity();
		long longTime = Long.parseLong(tc);
		Thread.sleep(longTime);
	}
	
	public static void MEDIUM_WAIT() throws NumberFormatException, InterruptedException {
		String tc = TestCaseActivity.MEDIUM_WAIT.getActivity();
		long longTime = Long.parseLong(tc);
		Thread.sleep(longTime);
	}
	
	public static void HIGH_WAIT() throws NumberFormatException, InterruptedException {
		String tc = TestCaseActivity.HIGH_WAIT.getActivity();
		long longTime = Long.parseLong(tc);
		Thread.sleep(longTime);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
