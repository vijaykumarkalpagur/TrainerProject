package com.trainer.qa.testcases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.trainer.qa.module.actions.ClickonWebElements;
import com.trainer.qa.module.helpers.BrowserSetup;
import com.trainer.qa.module.helpers.CreateSchedule;
import com.trainer.qa.module.pages.CreateSchedulePage;
import com.trainer.qa.module.pages.LoginPage;
import com.trainer.qa.utility.Constant;
import com.trainer.qa.utility.Log;

public class CreateRecurringSession {

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
	ClickonWebElements.GroupSize(driver);
	CreateSchedulePage.TypeGroupSize(CreateSchedule.GroupSession());
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

//@Test (priority = 6)
//public void RecurringSession() throws Exception{
//	ClickonWebElements.RecurringSession(driver);
//	CreateSchedulePage CreateSchedulePage = PageFactory.initElements(driver, CreateSchedulePage.class);
//	CreateSchedulePage.TypeDailySessions(CreateSchedule.CurrentDateType("mm/dd/yyyy"));
//	
//}

}
