package com.rameshsoft.automation.appln.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.rameshsoft.automation.base.BaseTest;

public class FlipKart_Electronics_Page extends BaseTest{
	
	@FindBy(xpath="//span[text()='Electronics'][contains(@class,'_1QZ6fC _3Lgyp8')]")
	static private WebElement electronics;
	
	@FindBy(xpath="//a[@title='Mobiles']")
	static private WebElement electronics_mobiles;
	
	@FindBy(xpath="//option[@value='Min']/parent::select/option[@value='10000']")
	static private WebElement electronics_mobiles_min_price;
	
	@FindBy(xpath="//option[@value='Max']/parent::select/option[@value='30000']")
	static private WebElement electronics_mobiles_max_price;
	
	@FindBy(xpath="//*[contains(text(),'4 GB')][@class='_1GEhLw']")
	static private WebElement electronics_mobiles_GB; 
	
	@FindBy(xpath="//div[text()='Samsung'][@class='_1GEhLw']")
	static private WebElement electronics_mobiles_Type;
	
	public static void pefrom_MouseHover() {
		Actions actions = new Actions(getDriver());
		actions.moveToElement(electronics).build().perform();
	}
	
	public static void clickOnMobiles() {
		electronics_mobiles.click();
	}
	
	public static void click_Min_Price() {
		//Assert.assertTrue(electronics_mobiles_min_price.isDisplayed()&&electronics_mobiles_min_price.isEnabled());
		electronics_mobiles_min_price.click();
	}
	
	public static void click_Max_Price() {
		//Assert.assertTrue(electronics_mobiles_max_price.isDisplayed()&&electronics_mobiles_max_price.isEnabled());
		electronics_mobiles_min_price.click();
	}
	
	public static void select_Mobile_RAM_GB() {
		//Assert.assertTrue(electronics_mobiles_GB.isDisplayed()&&electronics_mobiles_GB.isEnabled());
		electronics_mobiles_GB.click();
	}
	
	public static void select_Mobile_Type() {
		//Assert.assertTrue(electronics_mobiles_Type.isDisplayed()&&electronics_mobiles_Type.isEnabled());
		electronics_mobiles_Type.click();
	}
	
	static
	{
		PageFactory.initElements(getDriver(), FlipKart_Electronics_Page.class);
	}
	

}
