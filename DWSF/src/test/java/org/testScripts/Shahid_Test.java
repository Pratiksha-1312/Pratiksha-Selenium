package org.testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Shahid_Test {
	@Test(groups="Bolywood")
	public void launchShahid() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Shahid_Kapoor");
		Reporter.log("Shahid Kapoor",true);
		driver.quit();
	}
}
