package org.testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Puma_Test {
	@Test
	public void launchPuma() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/");
		Reporter.log("Puma is launched",true);
		driver.quit();
	

}

}


