package com.rameshsoft.automation.utilities;

import java.sql.Driver;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Seconds;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.rameshsoft.automation.base.ActionEngine;
import com.rameshsoft.automation.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;



public class ApplicationFunctions extends BaseTest {
	public static By liveNow = By.xpath("//div[@id='liveblog-header']//div[@class='lvt-leftbox fleft' and contains(text(),'LIVE NOW')]");
	public static By article = By.xpath("//div[@class='article-share']");
	public static By bredcrum = By.xpath("//div[@class='brade_crum abrdacrum' or @class='bredcrum']");
	public static By category = By.xpath("//div[@class='brade_crum abrdacrum' or @class='bredcrum']//a[2]/span");
	//public static By article = By.xpath("//div[@class='article-share']");
	public static By fbIcon = By.xpath("//div[@class='article-share']/a[contains(@class,'fbicon')]");
	public static By twIcon = By.xpath("//div[@class='article-share']/a[contains(@class,'twicon')]");
	WebElement eletwIcon = getDriver().findElement(By.xpath("//div[@class='article-share']/a[contains(@class,'twicon')]"));
	public static By watsIcon = By.xpath("//div[@class='article-share']/a[contains(@class,'whatsapp')]");
	public static By poIcon = By.xpath("//div[@class='article-share']/a[contains(@class,'waicon')]");
	public static By facebookIcon = By.xpath("//div[@class='fright shre-icon']//img[@title='facebook']");
	public static By twitterIcon = By.xpath("//div[@class='fright shre-icon']//img[@title='Twitter']");
	public static By pocketIcon = By.xpath("//div[@class='fright shre-icon']//img[@title='Pocket']");
	public static By date = By.xpath("//ul[@class='article-bnow']/li[2]");
	public static By articleDate = By.xpath("//div[@class='author fleft']/span");
	
	
	
	public static By liveDate = By.xpath("//div[@id='liveblog-header']//date");
	public static By liveNews = By.xpath("//div[@id='liveblog-header']//div[contains(text(),'LIVE NOW')]");
	public static By articlesDate = By.xpath("//div[@class='article-byno-limg']//li[2]");
	public static By shareIcon = By.xpath("//div[@class='fxt_share']");
	public static By share = By.xpath("//a[@class='sprite-img share-icon']");
	public static By getArticleDate = By.xpath("//div[@class='author']/span");


	public static By Logo = By.xpath("//aside[@class='logo-for-mbl']/a");
	public static By block = By.xpath("//android.widget.Button[@text='Block']");
	public static By l1Count = By.xpath("//div[@class='mobheader']//li/a");
	public static By promotedContent = By.xpath("//span[text()='PROMOTED CONTENT']");
	public static By searchIcon = By.xpath("//aside[@class='srch-for-mbl']/a");
	public static By homePageLinks = By.xpath("//div[@class='mobile-navigation-list']/ul");
	public static By menu = By.xpath("//aside[@class='mbl-nav']");
	public static By languagesCount = By.xpath("//div[@class='language-box']//a");
	public static By download = By.xpath("//a[@class='geta-app']");
	public static By playStore = By.id("com.android.vending:id/action_bar_container");
	
	public static By figure = By.xpath("//div[@class='mlead-story']/figure//img");
	public static By mainTitle = By.xpath("//h1[@class='mlead-head']/a");
	
	public static By homepageNews = By.xpath("//div[@class='mstory-thumb-wrap']//div[@class='mstory-row']");
	public static By newsList = By.xpath("//div[@class='mtopstory-wrap']//li");
	
	public static By waIcon = By.xpath("//div[@class='social-icon']//a[contains(@href,'whatsapp')]");
	

	public static By whatsappIcon = By.xpath("//a[@class='sprite-img waicon']");
	
	public static By listofTrendingItems = By.xpath("//div[@class='hntranding']//ul/li[not(@style='display:none;')]");
	public static By moreHotAndTrendingItems = By.xpath("//a[@class='hnt-mlisting']");
	public static By hotAndTrendingCount = By.xpath("//div[@class='hntranding']//ul/li");
	
	public static By photoGallery = By.xpath("//h2//span[text()='Photogalleries']");
	public static By activePhoto = By.xpath("//span[text()='Photogalleries']/../following-sibling::div//li[@class='glide__slide--active']/a[2]");
	public static By imageOfArticle = By.xpath("//span[text()='Photogalleries']/../following-sibling::div//li[@class='glide__slide--active']//img");
	public static By photoRightButton = By.xpath("//div[contains(@class,'photo-gallery-slider')]//a[@class='right-arrow r1 act']");
	public static By photoLeftButton = By.xpath("//div[contains(@class,'photo-gallery-slider')]//a[@class='left-arrow l1 act']");
	
	public static By podcast = By.xpath("//h2//span[text()='Podcast']");
	public static By activepodcast = By.xpath("//span[text()='Podcast']/../following-sibling::div//li[@class='glide__slide--active']/a[2]");
	public static By imageOfpodcast = By.xpath("//span[text()='Podcast']/../following-sibling::div//li[@class='glide__slide--active']//img");
	public static By podcastRightButton = By.xpath("//div[contains(@class,'podcast-gallery-slider')]//a[@class='right-arrow l1 act']");
	public static By podcastLeftButton = By.xpath("//div[contains(@class,'podcast-gallery-slider')]//a[@class='left-arrow l1 act']");
	
	public static By videos = By.xpath("//h2//span[text()='Videos']");
	public static By activeIVideo = By.xpath("//span[text()='Videos']/../following-sibling::div//li[@class='glide__slide--active']/a[2]");
	public static By imageOfIVideo = By.xpath("//span[text()='Videos']/../following-sibling::div//li[@class='glide__slide--active']//img");
	public static By videoRightButton = By.xpath("//div[contains(@class,'video-gallery-slider')]//a[@class='right-arrow r1 act']");
	public static By videoLeftButton = By.xpath("//div[contains(@class,'video-gallery-slider')]//a[@class='left-arrow l1 act']");
	
	public static By videoWall = By.xpath("//h2//span[text()='Video Wall']");
	public static By activeVideoWall = By.xpath("//span[text()='Video Wall']/../following-sibling::div//li[@class='glide__slide--active']//h2/a");
	public static By imageOfVideoWall = By.xpath("//span[text()='Video Wall']/../following-sibling::div//li[@class='glide__slide--active']//img");
	public static By videoWallRightButton = By.xpath("//div[contains(@class,'video-wall-slider')]//a[@class='right-arrow r1 act']");
	public static By videoWallLeftButton = By.xpath("//div[contains(@class,'video-wall-slider')]//a[@class='left-arrow l1 act']");
	
	public static By techSection = By.xpath("//h2/span[text()='Tech']");
	public static By techArticlesCount = By.xpath("//span[text()='Tech']/parent::h2/following-sibling::ul/li");
	public static By techArticle = By.xpath("//span[text()='Tech']/parent::h2/following-sibling::ul/li[1]");
	public static By techImage = By.xpath("//span[text()='Tech']/parent::h2/following-sibling::ul/li[1]//img");
	public static By moreTechArticles = By.xpath("//a[@class='more-listing' and @href='https://www.news18.com/tech/']");
	public static By moreMovieArticles = By.xpath("//a[@class='more-listing' and @href='https://www.news18.com/movies/']");
	public static By moreIndiaArticles = By.xpath("//a[@class='more-listing' and @href='https://www.news18.com/india/']");
	public static By moreCricketNextArticles = By.xpath("//a[@class='more-listing' and @title='Cricketnext']");
	public static By moreBuzzArticles = By.xpath("//a[@class='more-listing' and @title='Buzz']");
	public static By moreSportsArticles = By.xpath("//a[@class='more-listing' and @title='Sports']");
	public static By moreAutoArticles = By.xpath("//a[@class='more-listing' and @title='Auto']");
	
	public static By latest = By.xpath("//div[@class='secont-lnav']//a[text()='Latest']");
	public static By title = By.xpath("//div[@class='hotTopic clearfix']//div[@class='title-content']//a");
	
	public static By ads = By.xpath("//div[contains(@id,'google_ads_iframe_/1039154/')]");
	public static By outBrain = By.xpath("//div[@class='OUTBRAIN']");
	public static By ourShows = By.xpath("//div[@class='our-show vspacer30']//h2");
	public static By countOurShows = By.xpath("//div[@class='our-show vspacer30']//ul/li");
	
	public static By countJumpToShows = By.xpath("//select[@id='show_drop_down']/option");
	public static By jumpToShow = By.xpath("//select[@id='show_drop_down']");




	public static void dateDiff(String date,String title) throws ParseException
	{

		SimpleDateFormat sdfDate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		System.out.println("Current date : "+strDate);
		Date d1 = sdfDate.parse(strDate);

		DateTime dt1 = new DateTime(d1);

		SimpleDateFormat sdf1 = new SimpleDateFormat("MMM dd, yyyy, hh:mm aa z");

		Date date1 = sdf1.parse(date);

		DateFormat outputformat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String output = outputformat.format(date1);
		System.out.println("Past date : "+output);
		Date d2 = sdfDate.parse(output);

		DateTime dt2 = new DateTime(d2);

		int day = Days.daysBetween(dt2, dt1).getDays();
		int hour = Hours.hoursBetween(dt2, dt1).getHours() % 24 ;
		int minutes = Minutes.minutesBetween(dt2, dt1).getMinutes() % 60 ;

		String difference = day+" days, "+hour+" hours, "+minutes+"  minutes ";

		System.out.print(Days.daysBetween(dt2, dt1).getDays() + " days, ");
		System.out.print(Hours.hoursBetween(dt2, dt1).getHours() % 24 + " hours, ");
		System.out.print(Minutes.minutesBetween(dt2, dt1).getMinutes() % 60 + " minutes, ");
		System.out.print(Seconds.secondsBetween(dt2, dt1).getSeconds() % 60 + " seconds."); 

		if(day<=0)
		{
			if(hour<24)
			{	
				//Reporter.addStepLog(" <font color='green'> <font color='magenta'> "+title+" :  </font> Time Difference : "+difference+" </font> ");
				getExtentTest().log(LogStatus.INFO, " <font color='green'> <font color='magenta'> "+title+" :  </font> Time Difference : "+difference+" </font> ");
			}
			else {
				//Reporter.addStepLog(" <font color='red'> <font color='magenta'> "+title+" :  </font> Time Difference : "+difference+" </font> ");
				getExtentTest().log(LogStatus.INFO, " <font color='red'> <font color='magenta'> "+title+" :  </font> Time Difference : "+difference+" </font> ");
			}
		}
		else {
			//Reporter.addStepLog(" <font color='red'> <font color='magenta'> "+title+" :  </font> Time Difference : "+difference+" </font> ");
			getExtentTest().log(LogStatus.INFO, " <font color='red'> <font color='magenta'> "+title+" :  </font> Time Difference : "+difference+" </font> ");
		}
	}

	/*public static void dateDifference(String date) throws ParseException
	{

		SimpleDateFormat sdfDate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		System.out.println("Current date : "+strDate);
		Date d1 = sdfDate.parse(strDate);

		DateTime dt1 = new DateTime(d1);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");

		Date date1 = sdf1.parse(date);

		DateFormat outputformat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String output = outputformat.format(date1);
		System.out.println("Past date : "+output);
		Date d2 = sdfDate.parse(output);

		DateTime dt2 = new DateTime(d2);

		int day = Days.daysBetween(dt2, dt1).getDays();
		int hour = Hours.hoursBetween(dt2, dt1).getHours() % 24 ;
		int minutes = Minutes.minutesBetween(dt2, dt1).getMinutes() % 60 ;

		String difference = minutes+"  minutes ";

		System.out.print(Days.daysBetween(dt2, dt1).getDays() + " days, ");
		System.out.print(Hours.hoursBetween(dt2, dt1).getHours() % 24 + " hours, ");
		System.out.print(Minutes.minutesBetween(dt2, dt1).getMinutes() % 60 + " minutes, ");
		System.out.print(Seconds.secondsBetween(dt2, dt1).getSeconds() % 60 + " seconds."); 

		if(minutes<=10)
		{			
			Reporter.addStepLog(" <font color='green'>  Time Difference is : <font color='magenta'>"+difference+" </font> </font> ");			
		}
		else {
			Reporter.addStepLog(" <font color='red'>  Time Difference is : <font color='magenta'>"+difference+" </font> </font> ");
			Assert.fail("Time difference is more than 10 mins");
		}
	}
*/
	public static void articleDetails(String title)
	{
		String homePage = getDriver().getWindowHandle();

		Boolean status = ActionEngine.isWebElementVisible(liveNow);
		if(status)
		{
			//Reporter.addStepLog("<font color='green'> <font color='blue'>" + title+ "</font> is navigated to live blog </font>");
			getExtentTest().log(LogStatus.INFO, "<font color='green'> <font color='blue'>" + title+ "</font> is navigated to live blog </font>");
		}
		else
		{
			status = ActionEngine.isWebElementVisible(article);
			if(status)
			{		
				String date = ActionEngine.getElementText(date);
				if(!date.equals(null))
					//Reporter.addStepLog("<font color='green'> Date is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
					getExtentTest().log(LogStatus.INFO, "<font color='green'> Date is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
				else
				{
					//Reporter.addStepLog("<font color='green'> Date is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
					getExtentTest().log(LogStatus.INFO, "<font color='green'> Date is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
				}

				ActionEngine.delay(2000);
				status = ActionEngine.isWebElementVisible(shareIcon);

				if(status)
				{
					ActionEngine.clickJS(shareIcon);
					status = ActionEngine.isWebElementVisible(fbIcon);
					if(status)
					{
						//Reporter.addStepLog("<font color='green'> The Facebook icon is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
						getExtentTest().log(LogStatus.INFO, "<font color='green'> The Facebook icon is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
						ActionEngine.waitForVisible(fbIcon);
						ActionEngine.clickJS(fbIcon);
						ActionEngine.handleMuliWindows();
						ActionEngine.waitForPageToLoad();
						ActionEngine.delay(5000);
						String url = getDriver().getCurrentUrl();
						if (url.contains("facebook"))
//							Reporter.addStepLog(" <font color='green'> Navigated to  <font color='magenta'> Facebook  </font> page successfully </font> :"+ url);
							getExtentTest().log(LogStatus.INFO, " <font color='green'> Navigated to  <font color='magenta'> Facebook  </font> page successfully </font> :"+ url);
						else {
//							Reporter.addStepLog(" <font color='red'> Not navigated to Facebook page</font> :" + url);
							getExtentTest().log(LogStatus.FAIL, " <font color='red'> Not navigated to Facebook page</font> :" + url);
							Assert.fail("Not navigated to Facebook page");
						}

						getDriver().close();
						ActionEngine.switchToWindow(homePage);
					} else {
						//Reporter.addStepLog("<font color='red'> The Facebook icon is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
						getExtentTest().log(LogStatus.FAIL, "<font color='red'> The Facebook icon is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
						Assert.fail("The Facebook icon is not displayed for the article : " + title);
					}
					status = ActionEngine.isWebElementVisible(twIcon);
					if(status)
					{
//						Reporter.addStepLog("<font color='green'> The Twitter icon is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
						getExtentTest().log(LogStatus.INFO, "<font color='green'> The Twitter icon is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
						ActionEngine.mouseHover(eletwIcon);
						ActionEngine.handleMuliWindows();
						ActionEngine.waitForPageToLoad();
						ActionEngine.delay(5000);

						String url = GlobalUtil.getDriver().getCurrentUrl();
						System.out.println(url);
						if (url.contains("twitter"))
							Reporter.addStepLog(
									" <font color='green'> Navigated to  <font color='magenta'> Twitter  </font> page successfully </font> :"
											+ url);
						else {
							Reporter.addStepLog(" <font color='red'> Not navigated to Twitter page</font> :" + url);
							Assert.fail("Not navigated to Twitter page");
						}

						GlobalUtil.getDriver().close();
						ActionEngine.switchToWindow(homePage);
					} else {
						Reporter.addStepLog("<font color='red'> The Twitter icon is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
						Assert.fail("The Twitter icon is not displayed for the article : " + title);
					}

					status = ActionEngine.isWebElementVisible(waIcon);
					if(status)
					{
						Reporter.addStepLog("<font color='green'> The Whatsapp icon is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
						ActionEngine.hoverOnElement(waIcon);
						ActionEngine.handleMuliWindows();
						ActionEngine.waitForPageToLoad();
						ActionEngine.delay(5000);
						String url = GlobalUtil.getDriver().getCurrentUrl();
						if (url.contains("whatsapp"))
							Reporter.addStepLog(" <font color='green'> Navigated to  <font color='magenta'> Whatsapp  </font> page successfully </font> :"+ url);
						else {
							Reporter.addStepLog(" <font color='red'> Not navigated to Whatsapp page</font> :" + url);
							Assert.fail("Not navigated to Whatsapp page");
						}

						GlobalUtil.getDriver().close();
						ActionEngine.switchToWindow(homePage);
					} else {
						Reporter.addStepLog("<font color='red'> The Whatsapp icon is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
						Assert.fail("The Whatsapp icon is not displayed for the article : " + title);
					}
				}


			}

			status = ActionEngine.isWebElementVisible(NewsConsumptionPage.share);

			if(status)
			{
				String date = ActionEngine.getElementText(NewsConsumptionPage.getArticleDate);
				if(!date.equals(null))
					Reporter.addStepLog("<font color='green'> Date is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
				else
				{
					Reporter.addStepLog("<font color='green'> Date is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
				}

				status = ActionEngine.isWebElementVisible(facebookIcon);
				if(status)
				{
					Reporter.addStepLog("<font color='green'> The Facebook icon is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
					ActionEngine.waitForVisible(facebookIcon);
					ActionEngine.clickJS(facebookIcon);
					ActionEngine.handleMuliWindows();
					ActionEngine.waitForPageToLoad();
					ActionEngine.delay(5000);
					String url = GlobalUtil.getDriver().getCurrentUrl();
					if (url.contains("facebook"))
						Reporter.addStepLog(" <font color='green'> Navigated to  <font color='magenta'> Facebook  </font> page successfully </font> :"+ url);
					else {
						Reporter.addStepLog(" <font color='red'> Not navigated to Facebook page</font> :" + url);
						Assert.fail("Not navigated to Facebook page");
					}

					GlobalUtil.getDriver().close();
					ActionEngine.switchToWindow(homePage);
				} else {
					Reporter.addStepLog("<font color='red'> The Facebook icon is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
					Assert.fail("The Facebook icon is not displayed for the article : " + title);
				}
				status = ActionEngine.isWebElementVisible(twitterIcon);
				if(status)
				{
					Reporter.addStepLog("<font color='green'> The Twitter icon is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
					ActionEngine.clickJS(twitterIcon);
					ActionEngine.handleMuliWindows();
					ActionEngine.waitForPageToLoad();
					ActionEngine.delay(5000);

					String url = GlobalUtil.getDriver().getCurrentUrl();
					System.out.println(url);
					if (url.contains("twitter"))
						Reporter.addStepLog(
								" <font color='green'> Navigated to  <font color='magenta'> Twitter  </font> page successfully </font> :"
										+ url);
					else {
						Reporter.addStepLog(" <font color='red'> Not navigated to Twitter page</font> :" + url);
						Assert.fail("Not navigated to Twitter page");
					}

					GlobalUtil.getDriver().close();
					ActionEngine.switchToWindow(homePage);
				} else {
					Reporter.addStepLog("<font color='red'> The Twitter icon is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
					Assert.fail("The Twitter icon is not displayed for the article : " + title);
				}

				status = ActionEngine.isWebElementVisible(whatsappIcon);
				if(status)
				{
					Reporter.addStepLog("<font color='green'> The Whatsapp icon is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
					ActionEngine.clickJS(whatsappIcon);
					ActionEngine.handleMuliWindows();
					ActionEngine.waitForPageToLoad();
					ActionEngine.delay(5000);
					String url = GlobalUtil.getDriver().getCurrentUrl();
					if (url.contains("whatsapp"))
						Reporter.addStepLog(
								" <font color='green'> Navigated to  <font color='magenta'> Whatsapp  </font> page successfully </font> :"
										+ url);
					else {
						Reporter.addStepLog(" <font color='red'> Not navigated to Whatsapp page</font> :" + url);
						Assert.fail("Not navigated to Whatsapp page");
					}

					GlobalUtil.getDriver().close();
					ActionEngine.switchToWindow(homePage);
				} else {
					Reporter.addStepLog("<font color='red'> The Whatsapp icon is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
					Assert.fail("The Whatsapp icon is not displayed for the article : " + title);
				}

				status = ActionEngine.isWebElementVisible(pocketIcon);
				if(status)
				{
					Reporter.addStepLog("<font color='green'> The Pocket icon is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
					ActionEngine.clickJS(pocketIcon);
					ActionEngine.handleMuliWindows();
					ActionEngine.waitForPageToLoad();
					ActionEngine.delay(5000);
					String url = GlobalUtil.getDriver().getCurrentUrl();
					if (url.contains("pocket"))
						Reporter.addStepLog(
								" <font color='green'> Navigated to  <font color='magenta'> Pocket  </font> page successfully </font> :"
										+ url);
					else {
						Reporter.addStepLog(" <font color='red'> Not navigated to Pocket page</font> :" + url);
						Assert.fail("Not navigated to Pocket page");
					}

					GlobalUtil.getDriver().close();
					ActionEngine.switchToWindow(homePage);
				} else {
					Reporter.addStepLog("<font color='red'> The Pocket icon is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
					Assert.fail("The Pocket icon is not displayed for the article : " + title);
				}
				GlobalUtil.getDriver().navigate().back();
			}


			status = ActionEngine.isWebElementVisible(NewsConsumptionPage.articleDate);
			if(status)	
			{
				String date = ActionEngine.getElementText(NewsConsumptionPage.articleDate);
				if(!date.equals(null))
					Reporter.addStepLog("<font color='green'> Date is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
				else
				{
					Reporter.addStepLog("<font color='green'> Date is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
				}

				status = ActionEngine.isWebElementVisible(NewsConsumptionPage.facebookIcon);
				if(status)
				{
					Reporter.addStepLog("<font color='green'> The Facebook icon is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
					ActionEngine.hoverOnElement(NewsConsumptionPage.facebookIcon);
					ActionEngine.handleMuliWindows();
					ActionEngine.waitForPageToLoad();
					ActionEngine.delay(5000);
					String url = GlobalUtil.getDriver().getCurrentUrl();
					System.out.println(url);
					if (url.contains("facebook"))
						Reporter.addStepLog(
								" <font color='green'> Navigated to  <font color='magenta'> Facebook  </font> page successfully </font> :"
										+ url);
					else {
						Reporter.addStepLog(" <font color='red'> Not navigated to Facebook page</font> :" + url);
						Assert.fail("Not navigated to Facebook page");
					}

					GlobalUtil.getDriver().close();
					ActionEngine.switchToWindow(homePage);
				} else {
					Reporter.addStepLog("<font color='red'> The Facebook icon is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
					Assert.fail("The Facebook icon is not displayed for the article : " + title);
				}
				status = ActionEngine.isWebElementVisible(NewsConsumptionPage.twitterIcon);
				if(status)
				{
					Reporter.addStepLog("<font color='green'> The Twitter icon is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
					ActionEngine.hoverOnElement(NewsConsumptionPage.twitterIcon);
					ActionEngine.handleMuliWindows();
					ActionEngine.waitForPageToLoad();
					ActionEngine.delay(5000);
					String url = GlobalUtil.getDriver().getCurrentUrl();
					if (url.contains("twitter"))
						Reporter.addStepLog(" <font color='green'> Navigated to  <font color='magenta'> Twitter  </font> page successfully </font> :"+ url);
					else {
						Reporter.addStepLog(" <font color='red'> Not navigated to Twitter page</font> :" + url);
						Assert.fail("Not navigated to Twitter page");
					}

					GlobalUtil.getDriver().close();
					ActionEngine.switchToWindow(homePage);
				} else {
					Reporter.addStepLog("<font color='red'> The Twitter icon is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
					Assert.fail("The Twitter icon is not displayed for the article : " + title);
				}

				status = ActionEngine.isWebElementVisible(NewsConsumptionPage.pocketIcon);
				if(status)
				{
					Reporter.addStepLog("<font color='green'> The Pocket icon is displayed for the article : <font color='blue'>" + title+ "</font> </font>");
					ActionEngine.hoverOnElement(NewsConsumptionPage.pocketIcon);
					ActionEngine.handleMuliWindows();
					ActionEngine.waitForPageToLoad();

					ActionEngine.delay(5000);
					String url = GlobalUtil.getDriver().getCurrentUrl();
					if (url.contains("pocket"))
						Reporter.addStepLog(
								" <font color='green'> Navigated to  <font color='magenta'> Pocket  </font> page successfully </font> :"
										+ url);
					else {
						Reporter.addStepLog(" <font color='red'> Not navigated to Pocket page</font> :" + url);
						Assert.fail("Not navigated to Pocket page");
					}

					GlobalUtil.getDriver().close();
					ActionEngine.switchToWindow(homePage);
				} else {
					Reporter.addStepLog("<font color='red'> The Pocket icon is not displayed for the article : <font color='blue'>" + title+ "</font> </font>");
					Assert.fail("The Pocket icon is not displayed for the article : " + title);
				}
				GlobalUtil.getDriver().navigate().back();
			}	  
		}
	}
	
	public static void dateDifference(String date) throws ParseException
	{

		SimpleDateFormat sdfDate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		System.out.println("Current date : "+strDate);
		Date d1 = sdfDate.parse(strDate);

		DateTime dt1 = new DateTime(d1);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");

		Date date1 = sdf1.parse(date);

		DateFormat outputformat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String output = outputformat.format(date1);
		System.out.println("Past date : "+output);
		Date d2 = sdfDate.parse(output);

		DateTime dt2 = new DateTime(d2);

		int day = Days.daysBetween(dt2, dt1).getDays();
		int hour = Hours.hoursBetween(dt2, dt1).getHours() % 24 ;
		int minutes = Minutes.minutesBetween(dt2, dt1).getMinutes() % 60 ;
		int seconds = Seconds.secondsBetween(dt2, dt1).getSeconds() % 60;

		String difference = day+" days, "+hour+" hours, "+minutes+"  minutes "+seconds +" seconds ";

		System.out.print(Days.daysBetween(dt2, dt1).getDays() + " days, ");
		System.out.print(Hours.hoursBetween(dt2, dt1).getHours() % 24 + " hours, ");
		System.out.print(Minutes.minutesBetween(dt2, dt1).getMinutes() % 60 + " minutes, ");
		System.out.print(Seconds.secondsBetween(dt2, dt1).getSeconds() % 60 + " seconds."); 

		if(minutes<=10)
		{			
			//Reporter.addStepLog(" <font color='green'>  Time Difference is : <font color='magenta'>"+difference+" </font> </font> ");
			getExtentTest().log(LogStatus.INFO, " <font color='green'>  Time Difference is : <font color='magenta'>"+difference+" </font> </font> ");
		}
		else {
			//Reporter.addStepLog(" <font color='red'>  Time Difference is : <font color='magenta'>"+difference+" </font> </font> ");
			getExtentTest().log(LogStatus.INFO, " <font color='red'>  Time Difference is : <font color='magenta'>"+difference+" </font> </font> ");
			Assert.fail("Time difference is more than 10 mins");
		}
	}
	
	public static void dateDiff(String date) throws ParseException
	{

		SimpleDateFormat sdfDate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		System.out.println("Current date : "+strDate);
		Date d1 = sdfDate.parse(strDate);

		DateTime dt1 = new DateTime(d1);

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");

		Date date1 = sdf1.parse(date);

		DateFormat outputformat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String output = outputformat.format(date1);
		System.out.println("Past date : "+output);
		Date d2 = sdfDate.parse(output);

		DateTime dt2 = new DateTime(d2);

		int day = Days.daysBetween(dt2, dt1).getDays();
		int hour = Hours.hoursBetween(dt2, dt1).getHours() % 24 ;
		int minutes = Minutes.minutesBetween(dt2, dt1).getMinutes() % 60 ;
		int seconds = Seconds.secondsBetween(dt2, dt1).getSeconds() % 60 ;

		String difference = day+" days, "+hour+" hours, "+minutes+"  minutes "+seconds +" seconds ";

		System.out.print(Days.daysBetween(dt2, dt1).getDays() + " days, ");
		System.out.print(Hours.hoursBetween(dt2, dt1).getHours() % 24 + " hours, ");
		System.out.print(Minutes.minutesBetween(dt2, dt1).getMinutes() % 60 + " minutes, ");
		System.out.print(Seconds.secondsBetween(dt2, dt1).getSeconds() % 60 + " seconds."); 

		if(minutes<=10)
		{			
			//Reporter.addStepLog(" <font color='green'>  Time Difference is : <font color='magenta'>"+difference+" </font> </font> ");
			getExtentTest().log(LogStatus.INFO, " <font color='green'>  Time Difference is : <font color='magenta'>"+difference+" </font> </font> ");
		}
		else {
			//Reporter.addStepLog(" <font color='red'>  Time Difference is : <font color='magenta'>"+difference+" </font> </font> ");
			getExtentTest().log(LogStatus.INFO, " <font color='red'>  Time Difference is : <font color='magenta'>"+difference+" </font> </font> ");
			Assert.fail("Time difference is more than 10 mins");
		}
	}
}
