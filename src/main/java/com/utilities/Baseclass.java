package com.utilities;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.BrowserUtilities.BrowserUtilities;
import com.EReport.EReport;
import com.PropertyLoader.Property;
import com.relevantcodes.extentreports.ExtentTest;


public class Baseclass {
	
	public static BrowserUtilities browUtil = new BrowserUtilities();
	public static Property  prop = new Property();
	public static EReport  extrp = new EReport();
	
	Property pl = new Property();
	ExtentTest test; 
	
	@BeforeSuite
	public void on() throws Exception  {
		
		BrowserUtilities.launchBrowser();
		prop.loadLog4jPropertyFile(pl.getProperty("log4"));
		
		
	}

	
	@AfterSuite
	public void off() {
		BrowserUtilities.quitBrowser();
		
		
	}
	

}
