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

public class GmailLoginTest {

	static WebDriver driver;
	static String browserName;
	
@BeforeTest 
public void TrainerSocialBrowser() throws Exception {	
		PropertyConfigurator.configure("log4j.properties");
		browserName = Constant.browserName;	
		driver = BrowserSetup.openBrowser(browserName);	
	}	
@Test 
public static void GmailLogin1() throws Exception{	
		SocialLogins.SocialLogin(driver, Constant.SocialLoginGM);
		SocialLoginPage Gmail = PageFactory.initElements(driver,SocialLoginPage.class);
	    Gmail.TypeGmailUsername("myveritis");
	    ClickonWebElements.GmailNextUButton(driver);
	    Gmail.TypeGmailUserPswd("priyalaya");
	    ClickonWebElements.GmailNextPButton(driver);
	    Log.info("**************GMAIL LOGIN SUCCESFULL *************");
	}
@AfterTest 
public void ClosegmailBrowser() throws Exception{
	Thread.sleep(9000);
		driver.quit();
		Log.info("Closed browser opened by selenium");
		
	}
}
