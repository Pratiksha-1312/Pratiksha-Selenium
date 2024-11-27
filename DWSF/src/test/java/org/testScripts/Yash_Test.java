package org.testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yash_Test {
	@Test(groups={"Sandalwood","PanIndia"})
	public void launchYash() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Yash_(actor)");
		Reporter.log("Yash",true);
		driver.quit();
	}
	
}
