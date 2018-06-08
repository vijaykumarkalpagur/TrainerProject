package com.trainer.qa.testcases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.trainer.qa.module.actions.ClickonWebElements;
import com.trainer.qa.module.helpers.BrowserSetup;
import com.trainer.qa.module.pages.LoginPage;
import com.trainer.qa.utility.Constant;
import com.trainer.qa.utility.Log;

public class LoginPageTest {

	WebDriver driver;
	String browserName;

@BeforeTest
public void TrainerLogin() throws Exception {	
	PropertyConfigurator.configure("log4j.properties");
	browserName = Constant.browserName;
	
	driver = BrowserSetup.openBrowser(browserName);
	Log.info("Passed variable value to open browser and calling browsersetup class to open trainer login page ");
	
	LoginPage log = PageFactory.initElements(driver, LoginPage.class);
	Log.info("using page factory getting Login class");
	
	log.TypeLoginCredentials("sunilkumar101@mailinator.com", "password");
	Log.info("Passing credentials to login");	
}

@Test (priority =1)
  public void TrainerLogout() throws Exception{
	ClickonWebElements.ClickonProfilebutton(driver);
	Log.info("Clicked on Trainer Profile button and clicked action response got from actions ");
	
	ClickonWebElements.TrainerLogout(driver);
	Log.info("Clicked on Trainer Logout button and clicked action response got from actions ");
	Log.info("*************NORMAL LOGIN SUCCESFULL *************");
}

@AfterTest 
   public void CloseBrowser(){	
	driver.quit();
	Log.info("Closed browser opened by selenium");
	Log.info("*************NORMAL LOGIN SUCCESFULL *************");
}
}
