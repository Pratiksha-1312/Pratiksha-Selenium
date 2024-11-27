package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;

	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;

	@FindBy(id = "FirstName")
	private WebElement firstNameTextBox;

	@FindBy(id = "LastName")
	private WebElement lastNameTextBox;

	@FindBy(id = "Email")
	private WebElement emailTextBox;

	@FindBy(id = "Password")
	private WebElement passwordTextBox;

	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextBox;

	@FindBy(id = "register-button")
	private WebElement registerButton;

	public WebElement getMaleTextBox() {
		return maleRadioButton;
	}

	public WebElement getFemaleTextBox() {
		return femaleRadioButton;
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getConfirmPasswordTextBox() {
		return confirmPasswordTextBox;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	// =========Business Scenarios==================

	public void register(String gender, String firstName, String lastName, String email, String password, String confirmPassword) {
		getRegisterLink().click();
		if (gender.equalsIgnoreCase("male")) {
			maleRadioButton.click();
		} else {
			femaleRadioButton.click();
		}
		firstNameTextBox.clear();
		firstNameTextBox.sendKeys(firstName);
		lastNameTextBox.clear();
		lastNameTextBox.sendKeys(lastName);
		emailTextBox.clear();
		emailTextBox.sendKeys(email);
		passwordTextBox.clear();
		passwordTextBox.sendKeys(password);
		confirmPasswordTextBox.clear();
		confirmPasswordTextBox.sendKeys(password);
		registerButton.click();
	}
}
