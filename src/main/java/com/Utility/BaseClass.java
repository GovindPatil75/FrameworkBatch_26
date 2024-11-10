package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;

	   @BeforeSuite 
	   public void initilization() throws Exception {
		   
		    excel=new ExcelDataProvider();
		    config=new ConfigDataProvider();
		    
	   }
		
		@BeforeMethod
		public void setUp() {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(config.getBaseUrlQA1());
			driver.manage().window().maximize();
			
		}
		
		@AfterMethod
		public void tearDown() {
			
			driver.quit();
		}

}
