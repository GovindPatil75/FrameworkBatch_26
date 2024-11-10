package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyLoginTest extends BaseClass {

	@Test
	public void TC_001() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		String email=excel.getStringTestData("Login", 0, 0);
		String password=excel.getStringTestData("Login", 0, 1);
		Library.custom_Sendkeys(login.getEmail(), email,"Email");
	    Library.custom_Sendkeys(login.getPassword(), password,"Password");
	    Library.custom_Click(login.getLoginBtn(),"Login Button");
	    
	    
	}
}
