package org.testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Siddharth_Test {
	@Test(groups={"Bolywood","PanIndia"})
	public void launchSiddharth() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Sidharth_Malhotra");
		Reporter.log("Siddharth Malhotra",true);
		driver.quit();
	}
	

}
