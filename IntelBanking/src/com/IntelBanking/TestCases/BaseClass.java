package com.IntelBanking.TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.IntelBanking.Utilities.ReadConfig;

public class BaseClass {

	ReadConfig config=new ReadConfig();
	
	public String baseurl=config.getAppurl();
	public String username=config.getUsername();
	public String password=config.getPassword();
	
	Logger logger;
	public static WebDriver driver;
	public String path=config.getChromePath();
	
	@BeforeClass
	public void setup() {
		ChromeBrowser();
		ManagerBrowser();
		logger=Logger.getLogger("Guru99Demo");
		PropertyConfigurator.configure("log4j.properties");
		
	}
	
	public void ManagerBrowser() {
		driver.manage().window().maximize();
	}

	public void ChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
	}

	@AfterClass
	public void teardown() {
		driver.quit();
		logger.info("Driver Closed");
	}
	
}
