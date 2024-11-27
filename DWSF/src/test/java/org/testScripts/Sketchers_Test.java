package org.testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sketchers_Test {
	@Test
	public void launchSketchers() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skechers.in/");
		Reporter.log("Sketchers is launched",true);
		driver.quit();
	}

}
