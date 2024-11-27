package org.testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenParameter_Test {
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String URL = System.getProperty("url");
		driver.get(URL);
		String data = System.getProperty("data");
		driver.findElement(By.name("q")).sendKeys(data, Keys.ENTER);
	}
}
