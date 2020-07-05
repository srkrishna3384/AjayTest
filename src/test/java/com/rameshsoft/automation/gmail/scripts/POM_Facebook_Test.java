package com.rameshsoft.automation.gmail.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.rameshsoft.automation.base.CommonActions;
import com.rameshsoft.automation.supporters.PropertiesUtility;

public class POM_Facebook_Test extends CommonActions{

	@Test
	public void fbTest() throws IOException {
		enterUrl(PropertiesUtility.getPropertyValue("fb_url"));
	}
	
}
