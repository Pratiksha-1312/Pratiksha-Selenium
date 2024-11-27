package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	@FindBy(partialLinkText = "Log in")
	private WebElement loginLink;

	@FindBy(partialLinkText = "Register")
	private WebElement registerLink;

	@FindBy(partialLinkText = "Shopping cart")
	private WebElement shoppingcartLink;

	@FindBy(partialLinkText = "Wishlist")
	private WebElement wishlistLink;

	@FindBy(className = "img[alt='Tricentis Demo Web Shop']")
	private WebElement logo;

	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink;

	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computersLink;

	@FindBy(partialLinkText="ELECTRONICS") 
	private WebElement electronicsModule;
	
	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement apparelandshoesLink;

	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement digitaldownloadsLink;

	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelryLink;

	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftcardsLink;

//=========GETTERS===============
	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getShoppingcartLink() {
		return shoppingcartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsModule() {
		return electronicsModule;
	}

	public WebElement getApparelandshoesLink() {
		return apparelandshoesLink;
	}

	public WebElement getDigitaldownloadsLink() {
		return digitaldownloadsLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftcardsLink() {
		return giftcardsLink;
	}

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
