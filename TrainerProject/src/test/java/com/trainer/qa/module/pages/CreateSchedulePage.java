package com.trainer.qa.module.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateSchedulePage {
	
@FindBy(how=How.XPATH,using = "//*[@id='name']")
WebElement NameoftheWorkoutSession;

@FindBy(how=How.XPATH,using = "/html/body/div/section/div/div/div[1]/div/div/div/div/div/div/form/div[1]/div[2]/div/select")
WebElement TypeofWorkout ;

@FindBy(how=How.XPATH,using = "/html/body/div/section/div/div/div[1]/div/div/div/div/div/div/form/div[1]/div[3]/div/select")
WebElement GroupSizeType ;

@FindBy(how=How.XPATH,using = "/html/body/div/section/div/div/div[1]/div/div/div/div/div/div/form/div[2]/div[1]/div/multiselect/div/ul/li[5]/div/input")
WebElement WorkoutActivity ;

@FindBy(how=How.XPATH,using = "/html/body/div/section/div/div/div[1]/div/div/div/div/div/div/form/div[2]/div[2]/div/select")
WebElement TrainingLevel ;

@FindBy(how=How.XPATH,using = "/html/body/ul/li/div/table/tbody/tr[2]/td[1]/input")
WebElement StartsfromTimeHoursSelect;

@FindBy(how=How.XPATH,using = "/html/body/ul/li/div/table/tbody/tr[2]/td[1]/input")
WebElement StartsfromTimeMntsSelect;

@FindBy(how=How.XPATH,using = "//*[@id='dateid']")
WebElement DateSelectinSessionon;

@FindBy(how=How.XPATH,using = "/html/body/div/section/div/div/div[1]/div/div/div/div/div/div/form/div[3]/div/div[2]/div[1]/div/div/div/div[2]/div/div/input")
WebElement SessionTimeSelect;

@FindBy(how=How.XPATH,using = "/html/body/div/section/div/div/div[1]/div/div/div/div/div/div/form/div[3]/div/div[2]/div[1]/div/div/div/div[3]/div/div/select")
WebElement SessionDuration;

@FindBy(how=How.XPATH,using = "//input[@name ='dailyScheduleStartDate']")
WebElement SessionNoon;

//***************************Recurring Sessions****************************************

@FindBy(how=How.XPATH,using = "//*[@id='dateid']")
WebElement DailySession;

 WebDriver driver;

public CreateSchedulePage(WebDriver driver){
	
	this.driver=driver;
}
public void TypeNameoftheWorkoutSession (String SessionName) throws Exception {
	NameoftheWorkoutSession.sendKeys(SessionName);
	Thread.sleep(3000);
}
public void TypeofWorkoutSession (String WorkoutType){
	TypeofWorkout.sendKeys(WorkoutType);
}
public void TypeGroupSize (String SessionGroupSize){
	GroupSizeType.sendKeys(SessionGroupSize);
}
public void TypeWorkoutActivity (String ActivityName) throws Exception {
	WorkoutActivity.sendKeys(ActivityName);
	Thread.sleep(3000);
}
public void TypeTrainingLevel (String ActivityLevelType) throws Exception {
	TrainingLevel.sendKeys(ActivityLevelType);
	Thread.sleep(9000);
}
public void TypeSessionon(String SessionDate) throws Exception {
	DateSelectinSessionon.sendKeys(SessionDate);
	Thread.sleep(3000);
}
public void TypeTimeSelect(String SessionTime) throws Exception {
	SessionTimeSelect.sendKeys(SessionTime);
	Thread.sleep(3000);
}
public void TypeSessionDuration(String SessionTime) throws Exception {
	SessionDuration.sendKeys(SessionTime);
	Thread.sleep(3000);
}
public void TypeAMandPM(String SessionDayorNight) throws Exception {
	SessionNoon.sendKeys(SessionDayorNight);
	Thread.sleep(3000);
}
//**************************Recurring Sesson************************

public void TypeDailySessions(String CurrentDate) throws Exception {
	SessionNoon.sendKeys(CurrentDate);
	Thread.sleep(1000);
}




}




