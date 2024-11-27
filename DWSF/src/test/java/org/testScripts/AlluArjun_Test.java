package org.testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlluArjun_Test {
	@Test(groups={"Tolywood","PanIndia"})
	public void arjun() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Allu_Arjun");
		Reporter.log("ALLU ARJUN",true);
		driver.quit();
	}
	

}
