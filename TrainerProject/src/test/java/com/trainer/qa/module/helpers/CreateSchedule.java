package com.trainer.qa.module.helpers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateSchedule {

//************************For using singal web element with the help of constant**************************************	
	
/*	public static void TypeofWorkoutSession(WebDriver driver,String TypeofWorkout,int index) {
 
	try
	{	
		WebElement  ClickOnElement= driver.findElement(By.xpath("/html/body/div/section/div/div/div[1]/div/div/div/div/div/div/form/div[1]/div[2]/div/select"));
		
		Select typeSession = new Select(ClickOnElement);
		
		if(TypeofWorkout.equalsIgnoreCase("1-To-1 Session")){
		
			typeSession.selectByIndex(0);
		}
		else if (TypeofWorkout.equalsIgnoreCase("Group Session")){
			
			typeSession.selectByIndex(1);
	}
}
	catch(Exception e){
		e.getMessage();
}
}*/
	
//************************Random TypeofWorkout**************************************	

public static String TypeofWorkout(){
		
	String values[] = {"1-To-1 Session" ,"Group Session"};
	int length = 1;
	String TypeofWorkout = "  ";
		
	Random rand = new Random();
	int size = values.length;
		
	for (int i =0 ; i<length ; i++ )
		TypeofWorkout = values[rand.nextInt(size)];
	return TypeofWorkout;
}
	
//************************For Multipal web elements**************************************	
	
//	NEED TO CHECK AGAIN,BELOW CODE NOT USED
	
	public static void TypeWorkoutActivity(WebDriver driver){
		
	WebElement activity =	driver.findElement(By.xpath("/html/body/div/section/div/div/div[1]/div/div/div/div/div/div/form/div[2]/div[1]/div/multiselect/div/button"));
	
	Select ClickOnWorkoutActivity = new Select(activity);
	
	List<WebElement> WorkoutActivitiesCount = ClickOnWorkoutActivity.getOptions();
	
	@SuppressWarnings("unused")
	int ActivitiesLength = WorkoutActivitiesCount.size();
	
	for(WebElement ele :WorkoutActivitiesCount ){
		
         String name = ele.getText();    
         System.out.println(name);
	}	
	}
	
//****************************************Training Level using constants**********************************************		
	
/*	public static void TrainingLevel(WebDriver driver,String TrainingLevel,int index) {
	
	try
	{
		WebElement  ClickOnElement= driver.findElement(By.xpath("/html/body/div/section/div/div/div[1]/div/div/div/div/div/div/form/div[2]/div[2]/div/select"));
		
		Select TypeTrainingLevel = new Select(ClickOnElement);
		
		if(TrainingLevel.equalsIgnoreCase("Beginner")){
		
			TypeTrainingLevel.selectByIndex(0);
		}
		else if(TrainingLevel.equalsIgnoreCase("Medium")){
			
			TypeTrainingLevel.selectByIndex(1);
		}
		else if(TrainingLevel.equalsIgnoreCase("Advanced")){
			
			TypeTrainingLevel.selectByIndex(2);
		}
		else if(TrainingLevel.equalsIgnoreCase("Expert")){
			
			TypeTrainingLevel.selectByIndex(3);
		}
	}
		catch(Exception e){
			e.getMessage();
	}
	}*/

//************************Random TrainingLevel selection**************************************	

public static String TrainingLevel(){
			
	String values[] = {"Beginner" ,"Medium" , "Advanced" , "Expert"};
	int length = 1;
	String TrainingLevel = "  ";
			
	Random rand = new Random();
	int size = values.length;
			
	for (int i =0 ; i<length ; i++ )
				
	TrainingLevel = values[rand.nextInt(size)];
	return TrainingLevel;			
}	

//*************************************Random String**************************************

public static String randomString(){

	String Characters = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
	int length = 2;
	String randomString = "Automation Testing Workout Session ";
	
	Random rand = new Random();
	char[] text = new char[length];
	int size = Characters.length();
	
	for(int i =0;i<length;i++){
		text[i] = Characters.charAt(rand.nextInt(size));
}
	for(int i = 0;i<text.length;i++){
		randomString += text[i];
}
	return randomString;
}

public static String activity() {
	String names[] = {"Bikram Yoga","Hatha Yoga","Yengar Yoga","Power Yoga","Vinyasa Yoga","Prana Flow","Meditation","The Bar Method","The Dailey Method","General / Mat Pilates","Power Pilates","Exercise Therapy","Corrective Exercise","Bodybuilding","Circuit Training","Core Conditioning","General Personal Training","High-Intensity Intervals","Kettlebell Training","Plyometrics","Strengthening","Stretching","Flexibility","TRX® Suspension","Sports / Performance","Boxing Cross-Training","Golf Cross-Training","Soccer Cross-Training","Speed & Agility","Spinning","Tennis Cross-Training","General Aerobics","Dance Cardio","Step Aerobics","Zumba","Martial Arts","Judo","Karate","Kickboxing","Kung Fu","Muay Thai","Tae Kwon Do","Tai Chi"};
	int length = 1;
	String WorkoutActivity = " ";
	
	Random rand = new Random();
	int size = names.length;

	for(int i =0;i<length;i++){
		WorkoutActivity = names[rand.nextInt(size)];	
	}
	return WorkoutActivity;
}

//****************************Generate Random Calender Dates **************************************

public static String generateRandomDates(String Format,String StartDate,String EndDate) throws ParseException{
	
	DateFormat formatter = new SimpleDateFormat(Format);
	Calendar cal = Calendar.getInstance();
    
	cal.setTime(formatter.parse(StartDate));
    long Value1 = cal.getTimeInMillis();
    
    cal.setTime(formatter.parse(EndDate));
    long Value2 = cal.getTimeInMillis();
    
    long Value3 = (long)(Value1+(Math.random() * (Value2 - Value1)));
    cal.setTimeInMillis(Value3);
    
    return formatter.format(cal.getTimeInMillis());
}

//****************************Generate Random Time**************************************
public static String randomTimeGenerate(String Format){
	
	Random generator = new Random();
	Long value = generator.nextLong();
	String time1 = DateTimeFormatter.ofPattern(Format).format(LocalTime.MIN.plusMinutes(value));
	return time1.toString();
}

//****************************Session Duration**************************************

public static String Duration(String SessionDuration){
	
	String values[] = {"30" ,"60", "90","120"};
	int length = 1;
	String Duration = "  ";
	
	Random rand = new Random();
	int size = values.length;
	
    for (int i =0 ; i<length ; i++ )
	Duration = values[rand.nextInt(size)];
	return Duration;
	
}
public static String GroupSession(){
	
	String values[] = {"2" ,"3", "4"};
	int length = 1;
	String GroupSession = "  ";
	
	Random rand = new Random();
	int size = values.length;
	
for (int i =0 ; i<length ; i++ )
	GroupSession = values[rand.nextInt(size)];
	return GroupSession;	
}

//****************************Add dates & Months & Years from current date**************************************

public static String CurrentDateType(String format){

	DateTimeFormatter currentDate = DateTimeFormatter.ofPattern(format);
	LocalDate localDate = LocalDate.now();
	return currentDate.format(localDate);
}

public static String AddDates(String format, String dateselection) throws ParseException{

	DateFormat Formatter = new SimpleDateFormat(format);
	Calendar cal = Calendar.getInstance();

	cal.setTime(Formatter.parse(dateselection));
	cal.add(Calendar.DAY_OF_MONTH,+1);
	return Formatter.format(cal.getTime());
}
}






















