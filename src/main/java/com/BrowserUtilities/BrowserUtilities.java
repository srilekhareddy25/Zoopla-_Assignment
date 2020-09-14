package com.BrowserUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtilities {
	
	public static WebDriver driver = null;
	
	public static void launchBrowser() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.zoopla.co.uk/"); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
		Thread.sleep(2000);
	}
	
	public static void quitBrowser(){
		driver.quit();
	}
	
	public static void waitElementToVisible(WebElement eleToWait) {
		WebDriverWait wait = new WebDriverWait(BrowserUtilities.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(eleToWait));
		
	}
	
	static void waitElementToVisibleLocated(By eleToWait) {
		WebDriverWait wait = new WebDriverWait(BrowserUtilities.driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(eleToWait));
		
	}
	

}
