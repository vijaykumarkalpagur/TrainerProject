package com.trainer.qa.testcases;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

import jxl.write.DateTime;

public class SampleClass {

public static String generaterandomtime(){
		
	    SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");
	    Calendar cal1 = Calendar.getInstance();
		long timeInMillis = System.currentTimeMillis();
	    cal1.setTimeInMillis(timeInMillis);
	    return dateFormat.format(cal1.getTime());
}	    
	    
public static String generateRandomString(int length){
	    return RandomStringUtils.randomAlphabetic(length);
	 }
	    	 
public static String generateRandomNumber(int length){
	    return RandomStringUtils.randomNumeric(length);
	 }
	    	 
public static String generateRandomAlphaNumeric(int length){
	   return RandomStringUtils.randomAlphanumeric(length);
	 }	

public static String generateStringWithAllobedSplChars(int length,String allowdSplChrs){
	   String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
	     "1234567890" +   //numbers
	     allowdSplChrs;
	    return RandomStringUtils.random(length, allowedChars);
 }
	    	 
 public static String generateEmail(int length) {
	    String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
	       "1234567890" +   //numbers
	       "_-.";   //special characters
	    String email="";
	    String temp=RandomStringUtils.random(length,allowedChars);
	  email=temp.substring(0,temp.length()-9)+"@test.org";
	  return email;
	    	 }
	    	 
 public static String generateUrl(int length) {
	    String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
	     "1234567890" +   //numbers
	       "_-.";   //special characters
	   String url="";
	   String temp=RandomStringUtils.random(length,allowedChars);
	      url=temp.substring(0,3)+"."+temp.substring(4,temp.length()-4)+"."+temp.substring(temp.length()-3);
	    return url;
	    	 }

 public static String randomTimeGenerate(){
		
		Random generator = new Random();
		Long value = generator.nextLong();
		String time1 = DateTimeFormatter.ofPattern("hh:mm a").format(LocalTime.MIN.plusMinutes(value));
		return time1.toString();
		
		/*// hh:mm will print hours in 12hrs clock and mins (e.g. 02:30)
		System.out.println(DateTimeFormatter.ofPattern("hh:mm").format(LocalTime.now()));

		// HH:mm will print hours in 24hrs clock and mins (e.g. 14:30)
		System.out.println(DateTimeFormatter.ofPattern("HH:mm").format(LocalTime.now())); 

		// hh:mm a will print hours in 12hrs clock, mins and AM/PM (e.g. 02:30 PM)
		System.out.println(DateTimeFormatter.ofPattern("hh:mm a").format(LocalTime.now()));*/
 }
 
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
  
// public static WebDriver driver;
//	
//	@Test
//	public static void Chrome() {
//	
//	System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");	
//	driver = new ChromeDriver();	
//	driver.get("http://ec2-54-191-190-7.us-west-2.compute.amazonaws.com/");
//	driver.findElement(By.xpath("//li[@class='trainer']/a")).click();
//	Set<String> WindowCount = driver.getWindowHandles(); 	
//	Iterator<String> iter = WindowCount.iterator();
//	@SuppressWarnings("unused")
//	String parentwindowid = iter.next();
//	String Childwindowid = iter.next();
//	driver.switchTo().window(Childwindowid);
//	driver.findElement(By.xpath("//*[@id='signuplogin']/a")).click();
//	
//	driver.findElement(By.xpath("//*[//*[@id='username']")).click();
//	driver.findElement(By.xpath("//*[@id='loginpassword']")).click();
//	driver.findElement(By.xpath("//button[@id='login-form' and @type='submit']")).click();
//
//	driver.findElement(By.xpath("//*[@id='navbar']/ul/li[3]/a")).click();
//	driver.findElement(By.xpath("/html/body/div/section/div/div/div[1]/div/div/div/div/div/div/form/div[1]/div[2]/div/select")).click();
//	
//	driver.findElement(By.xpath("/html/body/div/section/div/div/div[1]/div/div/div/div/div/div/form/div[1]/div[3]/div/select")).click();
//	}
	
// public static String TypeofWorkout(){
//		
//		String values[] = {"1-To-1 Session" ,"Group Session"};
//		int length = 1;
//		String TypeofWorkout = "  ";
//			
//		Random rand = new Random();
//		int size = values.length;
//			
//		for (int i =0 ; i<length ; i++ )
//			TypeofWorkout = values[rand.nextInt(size)];			
//		return TypeofWorkout;
//	}	
//}
 
 public static String AddDate(String format, String selectdate) throws ParseException{

 DateFormat Formatter = new SimpleDateFormat(format);
 Calendar cal = Calendar.getInstance();

     cal.setTime(Formatter.parse(selectdate));
     cal.add(Calendar.DATE,+0);
     return Formatter.format(cal.getTime());
 }	 
  
//public static String randomTimeGenerate(String format){
//	
//Random generator = new Random();
//Long value = generator.nextLong();
//String time1 = DateTimeFormatter.ofPattern(format).format(LocalTime.MIN.plusMinutes(value));
//return time1.toString();
//}
 
 
public static void main(String[] args) throws ParseException{	
//	    System.out.println(SampleClass.generaterandomtime());
//		System.out.println(SampleClass.generateRandomString(4));
//		System.out.println(SampleClass.generateRandomNumber(5));
//		System.out.println(SampleClass.generateRandomAlphaNumeric(6));
//		System.out.println(SampleClass.generateStringWithAllobedSplChars(5, "ale"));
//		System.out.println(SampleClass.generateEmail(20));
//		System.out.println(SampleClass.generateUrl(15));
		System.out.println(SampleClass.AddDate("mm/dd/yyyy", "05/24/2018"));
//		System.out.println(SampleClass.randomTimeGenerate("hh:mm,a"));
	}
}
