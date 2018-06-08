package com.trainer.qa.module.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickonWebElements{

public static void ClickSIGNUPASTRAINERbutton(WebDriver driver){
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//li[@class='trainer']/a"))).click().build().perform();
}	
public static void ClickSIGNLOGINbutton(WebDriver driver) throws Exception{
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[@id='signuplogin']/a"))).click().build().perform();
    Thread.sleep(3000);
}	
public static void ClickonProfilebutton(WebDriver driver) throws Exception{
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("/html/body/div/nav/div[2]/div/div/div/div[1]/ul/li/a/div"))).click().build().perform();	
	Thread.sleep(9000);
}
public static void TrainerLogout(WebDriver driver) throws Exception{
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("/html/body/div/nav/div[2]/div/div/div/div[1]/ul/li/ul/li[8]/a"))).click().build().perform();	
    Thread.sleep(5000);
}
//******************************Social Logins Actions******************************************	
public static void ClickonFacebookbutton(WebDriver driver){
	Actions action = new Actions(driver);
//	action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Continue with Facebook')]"))).click().build().perform();
	action.moveToElement(driver.findElement(By.xpath("//*[@id='sign-in-fb']"))).click().build().perform();  
}
public static void ClickonGmailbutton(WebDriver driver){
	Actions action = new Actions(driver);
//	action.moveToElement(driver.findElement(By.xpath("//a[@id ='sign-in-google']"))).click().build().perform(); 
	action.moveToElement(driver.findElement(By.xpath("//*[@id='sign-in-google']/span[2]"))).click().build().perform(); 
}
public static void  FacebookLoginButton(WebDriver driver) throws Exception{
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[@id='u_0_0']"))).click().build().perform();
    Thread.sleep(10000);
}
public static void  GmailNextUButton(WebDriver driver) throws Exception{
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[@id='identifierNext']/content/span"))).click().build().perform();
    Thread.sleep(5000);
}
public static void  GmailNextPButton(WebDriver driver) throws Exception{
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[@id='passwordNext']/content/span"))).click().build().perform();
    Thread.sleep(10000);
}

//***********************************Create Single Schedule Actions***********************************

public static void CreateScheduleButton(WebDriver driver) throws Exception{
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[@ng-href = '/trainer/#/schedule/']"))).click().build().perform();
    Thread.sleep(9000);
}
public static void TypeofWorkout(WebDriver driver){
	Actions action = new Actions(driver);
    action.moveToElement(driver.findElement(By.xpath("/html/body/div/section/div/div/div[1]/div/div/div/div/div/div/form/div[1]/div[2]/div/select"))).click().build().perform();
}
public static void GroupSize(WebDriver driver){
	Actions action = new Actions(driver);
    action.moveToElement(driver.findElement(By.xpath("/html/body/div/section/div/div/div[1]/div/div/div/div/div/div/form/div[1]/div[3]/div/select"))).click().build().perform();
}
public static void WorkoutActivity(WebDriver driver) {
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//multiselect[@ng-model = 'vm.schedule.activity']/div/button"))).click().build().perform();
}
public static void WorkoutAcvtivitySelection(WebDriver driver) throws Exception{
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("/html/body/div/section/div/div/div[1]/div/div/div/div/div/div/form/div[2]/div[1]/div/multiselect/div/ul/li[7]/a"))).click().build().perform();
    Thread.sleep(1000);
}
public static void TrainingLevel(WebDriver driver) throws Exception{
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("/html/body/div/section/div/div/div[1]/div/div/div/div/div/div/form/div[2]/div[2]/div/select"))).click().build().perform();
	Thread.sleep(5000);
}
public static void Sessionon(WebDriver driver){
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("/html/body/div/section/div/div/div[1]/div/div/div/div/div/div/form/div[3]/div/div[2]/div[1]/div/div/div/div[1]/div/div/span/button"))).click().build().perform();
}
public static void Startsfrom(WebDriver driver){
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("/html/body/div/section/div/div/div[1]/div/div/div/div/div/div/form/div[3]/div/div[2]/div[1]/div/div/div/div[2]/div/div/span/button"))).click().build().perform();
}	
public static void Duration(WebDriver driver){
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("/html/body/div/section/div/div/div[1]/div/div/div/div/div/div/form/div[3]/div/div[2]/div[1]/div/div/div/div[3]/div/div/select"))).click().build().perform();
}	
public static void PublishButton(WebDriver driver) throws Exception{
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Publish')]"))).click().build().perform();
	Thread.sleep(10000);
}	

public static void CreateSchedulePageScroll(WebDriver driver){
	Actions action = new Actions(driver);
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
}

//**********************************Create multiple Schedule Actions******************************

public static void RecurringSession(WebDriver driver) throws Exception{
	Actions action = new Actions(driver);
    action.moveToElement(driver.findElement(By.xpath("//*[@id='recurring-session']"))).click().build().perform();
    Thread.sleep(3000);
}

// **********************************Actions on calender******************************

public static void CalenderDate(WebDriver driver){
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[@id='datepicker-2227-998-30']/button/span"))).click().build().perform();
}
}
