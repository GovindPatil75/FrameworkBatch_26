package com.Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;

	public static void custom_Sendkeys(WebElement element,String Value,String fieldname) {

		try {
			element.sendKeys(Value);
			test.log(Status.PASS, fieldname+"==Value successfully send=="+Value);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}
	}

	public static void custom_Click(WebElement element,String filedname) {

		try {
			element.click();
			test.log(Status.PASS, "clicked successfully=="+filedname);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		}
	}
	
	public static void getExplicitwait(WebDriver driver,long time,WebElement element) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
	}
	
	
	
	
	
	
	
	
}
