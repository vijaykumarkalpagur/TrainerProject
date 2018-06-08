package com.trainer.qa.module.helpers;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.trainer.qa.module.actions.ClickonWebElements;
import com.trainer.qa.utility.Constant;
import com.trainer.qa.utility.Log;

public class BrowserSetup {

	public static WebDriver driver;

	public static WebDriver openBrowser(String browserName) throws Exception{
	
	try {
		if(browserName.equalsIgnoreCase("Chrome")){
				System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");	
				driver = new ChromeDriver();
				Log.info("Chrome Driver initiated ");}
		
		else if(browserName.equalsIgnoreCase("FireFox")){
			    System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
			    driver = new FirefoxDriver();
			    Log.info("FireFox Driver initiated ");}
		
		else if(browserName.equalsIgnoreCase("ie")){
				System.setProperty("webdriver.ie.driver",".\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				Log.info("InternetExplorer Driver initiated ");}
	}		
				catch (Exception e) {
					e.getMessage();}
	
	driver.get(Constant.URL);
	Log.info("Fitbase home page opened");
	driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	Log.info("Fitbase home page window maximised");
	
	driver.manage().deleteAllCookies();
	Log.info("Deleting all stored past cookies");
	driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);	

	ClickonWebElements.ClickSIGNUPASTRAINERbutton(driver);
	Log.info("Clicked on SIGNUP AS TRAINER button and Getting click action from actions");
	driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
	
	Set<String> WindowCount = driver.getWindowHandles(); 
	Log.info("Storing count of all windows opened by selenium in windowCount");
	
	Iterator<String> iter = WindowCount.iterator();
	Log.info("iterating between opened windows");
	
	@SuppressWarnings("unused")
	String parentwindowid = iter.next();
	Log.info("Focusing on parent tab ");
	
	String Childwindowid = iter.next();
	Log.info("Focus shifting to child tab ");
	
	driver.switchTo().window(Childwindowid);
	Log.info("Switched to child tab ");
	Thread.sleep(10000);
	
	ClickonWebElements.ClickSIGNLOGINbutton(driver);
	Log.info("Clicked on SIGNUP AS TRAINER button and Getting click action from actions");
	Thread.sleep(5000);  
	return driver;
	}
			
}		
		

















