package com.trainer.qa.module.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SocialLoginPage {

@FindBy(how=How.XPATH,using= "//*[@id='email']")
 WebElement FacebookUserName;

@FindBy(how=How.XPATH,using= "//input[@type ='password']")
WebElement FacebookUserPassword;

@FindBy(how=How.XPATH,using="//*[@id='identifierId']")
WebElement GmailUserName;
	
@FindBy(how=How.XPATH,using= "//*[@id='password']/div[1]/div/div[1]/input")
WebElement GmailUserPassword;
   
 WebDriver driver;
  
public SocialLoginPage(WebDriver driver){
	
	this.driver=driver;
}
  
public void TypeFacebookCredentials(String FBUname ,String FBPswd) throws Exception{
	FacebookUserName.sendKeys(FBUname);
	FacebookUserPassword.sendKeys(FBPswd);
	Thread.sleep(3000);
}

public void TypeGmailUsername(String GMUname) throws Exception{
	GmailUserName.sendKeys(GMUname);;
	Thread.sleep(1000);
}
public void TypeGmailUserPswd(String GMPswd) throws Exception{
	GmailUserPassword.sendKeys(GMPswd);
    Thread.sleep(1000);
}
}
