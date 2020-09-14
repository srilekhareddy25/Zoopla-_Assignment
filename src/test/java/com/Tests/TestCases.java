package com.Tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.EReport.EReport;
import com.relevantcodes.extentreports.ExtentTest;
import com.utilities.Baseclass;

public class TestCases extends Baseclass{
	
	Logger log = Logger.getLogger(getClass().getSimpleName());
	

	@Test(priority=1)
	public void enterLocation() throws InterruptedException  {
		
		EReport.logger = extrp.reports.startTest("enterLocation");
		WebElement location = browUtil.driver.findElement(By.id("search-input-location"));
		location.sendKeys("London");
		log.info("london is entered");
//		Select selectByIndex = new Select(location);
//        selectByIndex.selectByIndex(0);
//        Thread.sleep(3000);       
		browUtil.driver.findElement(By.id("search-submit")).click();
		log.info("properties list page is opened");
		Thread.sleep(2000);
		extrp.reports.endTest(EReport.logger);
		
	}
	
	@Test(priority=2)
	public void propertiesList() throws InterruptedException  {
		
		
		
	}
	}


