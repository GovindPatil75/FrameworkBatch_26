package com.Utility;

import org.openqa.selenium.WebElement;

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
}
