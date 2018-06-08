package com.trainer.qa.module.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	@FindBy(xpath = "//*[@id='username']")
	WebElement TrainerUsername;

	@FindBy(how=How.XPATH,using= "//*[@id='loginpassword']")
	WebElement TrainerPassword;

	@FindBy(how=How.XPATH,using = "//button[@id='login-form' and @type='submit']")
	WebElement TrainerLoginBtn;
	
	WebDriver driver;
	
public LoginPage(WebDriver driver){
		
	this.driver =driver;
	}

public void TypeLoginCredentials(String Uname,String Pswd) throws Exception{
	TrainerUsername.sendKeys(Uname);
	TrainerPassword.sendKeys(Pswd);
	TrainerLoginBtn.click();
	Thread.sleep(4000);
}
}
