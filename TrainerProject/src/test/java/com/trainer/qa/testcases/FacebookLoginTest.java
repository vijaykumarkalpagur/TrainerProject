package com.trainer.qa.testcases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.trainer.qa.module.actions.ClickonWebElements;
import com.trainer.qa.module.helpers.BrowserSetup;
import com.trainer.qa.module.helpers.SocialLogins;
import com.trainer.qa.module.pages.SocialLoginPage;
import com.trainer.qa.utility.Constant;
import com.trainer.qa.utility.Log;

public class FacebookLoginTest {

	static WebDriver driver;
	static String browserName;
	
@BeforeTest 
public void TrainerSocialBrowser() throws Exception {	
		PropertyConfigurator.configure("log4j.properties");
		browserName = Constant.browserName;	
		driver = BrowserSetup.openBrowser(browserName);	
}
@Test 
public void facbookTrainerLogin() throws Exception{
		SocialLogins.SocialLogin(driver, Constant.SocialLoginFB);
		SocialLoginPage facebook = PageFactory.initElements(driver, SocialLoginPage.class);
	    facebook.TypeFacebookCredentials("dev@fitbase.com", "f1tbas3d3v123");
		ClickonWebElements.FacebookLoginButton(driver);
		
		Log.info("***********FACEBOOK LOGIN SUCCESFULL *************");
}
@AfterTest 
public void CloseFacebookBrowser() throws Exception{	
		Thread.sleep(9000);
		driver.quit();
		Log.info("Closed browser opened by selenium");
		Log.info("***********FACEBOOK LOGIN SUCCESFULL *************");
}
}
