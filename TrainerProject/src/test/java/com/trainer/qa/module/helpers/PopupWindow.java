package com.trainer.qa.module.helpers;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import com.trainer.qa.utility.Log;
  
public class PopupWindow {
	
	 static WebDriver driver;
	 
public static void PopupWindows(WebDriver driver) throws Exception {	
				
	Set<String> windowscount = driver.getWindowHandles();
	Iterator<String> iter = windowscount.iterator();
	
	@SuppressWarnings("unused")
	String parentwindow		 = iter.next();
	Log.info("Focuse moved on Parent window");
	
	@SuppressWarnings("unused")
	String Childwindow 		 = iter.next();
	Log.info("Focuse moved on Child window");
	
	String SubChildwindow	 = iter.next();
	Log.info("Focuse moved on SubChild window");
	
	driver.switchTo().window(SubChildwindow);
	Log.info("focus moved to subchild window");	 
}	
}
