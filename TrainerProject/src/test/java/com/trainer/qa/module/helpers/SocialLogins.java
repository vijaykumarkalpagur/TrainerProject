package com.trainer.qa.module.helpers;

import org.openqa.selenium.WebDriver;
import com.trainer.qa.module.actions.ClickonWebElements;

public class SocialLogins {
   
	public static WebDriver driver;
	public static String SocialLogin;	

public static WebDriver SocialLogin(WebDriver driver ,String SocialLogin) throws Exception{

try{
   if(SocialLogin.equalsIgnoreCase("Facebook")){
		
	   ClickonWebElements.ClickonFacebookbutton(driver);
	}
   else if(SocialLogin.equalsIgnoreCase("Gmail")){
	
		ClickonWebElements.ClickonGmailbutton(driver);
		Thread.sleep(2000);
	}
}
   catch(Exception e){
	   e.getMessage();
	}
   PopupWindow.PopupWindows(driver);
   return driver;
		
}
}


