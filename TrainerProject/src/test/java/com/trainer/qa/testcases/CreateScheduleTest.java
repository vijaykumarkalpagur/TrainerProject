package com.trainer.qa.testcases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.trainer.qa.module.actions.ClickonWebElements;
import com.trainer.qa.module.helpers.BrowserSetup;
import com.trainer.qa.module.helpers.CreateSchedule;
import com.trainer.qa.module.pages.CreateSchedulePage;
import com.trainer.qa.module.pages.LoginPage;
import com.trainer.qa.utility.Constant;
import com.trainer.qa.utility.Log;

public class CreateScheduleTest {

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
@Test (priority = 1)
public void TypeCreateSchedule() throws Exception{
	ClickonWebElements.CreateScheduleButton(driver);
	Log.info("Clicked on Create Schedule Module tab in dashboard");
}	
@Test (priority = 2)
public void WorkoutSessionName() throws Exception{
	CreateSchedulePage CreateSchedulePage = PageFactory.initElements(driver, CreateSchedulePage.class);
	Log.info("using page factory for getting CreateSchedulePage class");
	CreateSchedulePage.TypeNameoftheWorkoutSession(CreateSchedule.randomString());
	Log.info("Passing WorkoutSessionName in edit field after getting random session name for createSchedule helper");
}	
@Test (priority = 3)
public void WorkoutSessionType() throws Exception{
	ClickonWebElements.TypeofWorkout(driver);
	CreateSchedulePage CreateSchedulePage = PageFactory.initElements(driver, CreateSchedulePage.class);
	CreateSchedulePage.TypeofWorkoutSession(CreateSchedule.TypeofWorkout());
	Log.info("Selected workoutType randomly from dropdown list");
}	
@Test (priority = 4)
public void WorkoutActivitySelection() throws Exception{
	ClickonWebElements.WorkoutActivity(driver);
	CreateSchedulePage CreateSchedulePage = PageFactory.initElements(driver, CreateSchedulePage.class);
	CreateSchedulePage.TypeWorkoutActivity(CreateSchedule.activity());
	Log.info("Selected workout Activity randomly from dropdown list");
	ClickonWebElements.WorkoutAcvtivitySelection(driver);
}	
@Test (priority = 5)
public void TrainingLevelType() throws Exception{
	ClickonWebElements.TrainingLevel(driver);
	CreateSchedulePage CreateSchedulePage = PageFactory.initElements(driver, CreateSchedulePage.class);
	CreateSchedulePage.TypeTrainingLevel(CreateSchedule.TrainingLevel());
	Log.info("Selected Training Level randomly from dropdown list");
}	
@Test (priority = 6)
public void SessiononType() throws Exception{
	CreateSchedulePage CreateSchedulePage = PageFactory.initElements(driver, CreateSchedulePage.class);
	CreateSchedulePage.TypeSessionon(CreateSchedule.AddDates("mm/dd/yyyy", "007/07/2018"));
	Log.info("Selected Sessionon randomly from dropdown list");
}	
@Test (priority = 7)
public void SessionTime() throws Exception{
	CreateSchedulePage CreateSchedulePage = PageFactory.initElements(driver, CreateSchedulePage.class);
	CreateSchedulePage.TypeTimeSelect(CreateSchedule.randomTimeGenerate("hh:mm a"));
	Log.info("Selected Session Time randomly from dropdown list");
}
@Test (priority = 8)
public void SessionDurationType() throws Exception{
	CreateSchedulePage CreateSchedulePage = PageFactory.initElements(driver, CreateSchedulePage.class);
	CreateSchedulePage.TypeSessionDuration(CreateSchedule.Duration("Minutes"));
	Log.info("Selected Duration Minutes from dropdow list");
	ClickonWebElements.CreateSchedulePageScroll(driver);
	driver.findElement(By.xpath("//*[@id='price']")).clear();
	driver.findElement(By.xpath("//*[@id='price']")).sendKeys("0");
	ClickonWebElements.PublishButton(driver);
	Log.info("Clicked on Publish button to publish workout Session ");
	
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//div[@class ='fb-pay-opt' and @id ='paymentDisable']//ul[@class ='nav nav-tabs']//li[2]//button"))).click().build().perform();
	driver.switchTo().frame("__privateStripeFrame8");
//	driver.findElement(By.xpath("//*[@id='root']/form/div/div[2]/span[1]/span[2]/label/input")).click();
	driver.findElement(By.xpath("//*[@id='root']/form/div/div[2]/span[1]/span[2]/label/input")).sendKeys("4242 4242 4242 4242");
	driver.findElement(By.xpath("//*[@id='root']/form/div/div[2]/span[1]/span[2]/label/input")).sendKeys("4242424");

	
}

//@Test (priority = 9)
//public void TrainerLogout() throws Exception{
//	ClickonWebElements.ClickonProfilebutton(driver);
//	ClickonWebElements.TrainerLogout(driver);
//	Log.info("Clicked on Trainer Profile and Logout button to logout from trainer application ");
//}
//
//@AfterTest 
// public void CloseBrowser(){	
//	driver.quit();
//	Log.info("Closed browser opened by selenium")};
}


