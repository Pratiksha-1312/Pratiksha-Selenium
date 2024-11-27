package org.automation.generic_utilities;

import java.time.Duration;

import org.automation.element_repository.BasePage;
import org.automation.element_repository.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	public BasePage basepage;
	public LoginPage loginpage;
	public ReadTestData readtestdata;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@Parameters("bname")
	@BeforeClass
	public void launchAndMaximizeBrowser(@Optional("chrome") String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@BeforeMethod
	public void logInToApplication() {
		basepage=new BasePage(driver);
		readtestdata = new ReadTestData();
		String url=ReadTestData.readDataFromProperties("url");
		String email=ReadTestData.readDataFromProperties("email");
		String password=ReadTestData.readDataFromProperties("password");
		driver.get(url);
		loginpage=new LoginPage(driver);
		loginpage.login(email, password);
	}
	
	@AfterMethod
	public void logOutFromApplication() {
		loginpage.logout();
	}

	@AfterClass
	public void tearDownBrowser() {
		driver.close();
		driver.quit();
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
}