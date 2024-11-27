package org.automation.generic_utilities;

import java.time.LocalDateTime;
import java.util.Random;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class JavaUtility {
 public static int giveRandomNumber(int boundary) {
	
	 Random random=new Random();
	 return random.nextInt(boundary);
	 }
 public static String timeStamp(WebDriver driver) {
	 LocalDateTime systemDate = LocalDateTime.now();
		String timeStamp = systemDate.toString().replaceAll(":", "-");
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
	 return timeStamp ;
	 
 }
}
