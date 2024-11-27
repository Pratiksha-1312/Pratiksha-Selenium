package org.automation.generic_utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility {

	JavascriptExecutor jse;
	public JavaScriptUtility(WebDriver  driver) {
		jse=(JavascriptExecutor)driver;
	}
	
	public void jsClick(WebElement element) {
		jse.executeScript("arguments[0].click()", element);
	}
	
	public void jsSendkeys(WebElement element, String data) {
		jse.executeScript("arguments[0].value='"+data+"'", element);
	}
	public void jsScrollBy(int xOffset,int yOffset) {
		jse.executeScript("window.scrollBy("+xOffset+","+yOffset+")");
	}
	
	public void jsScrollTo(int xCoordinate,int yCoordinate) {
		jse.executeScript("window.scrollTo("+xCoordinate+","+yCoordinate+")");
	}
	
	public void jsScrollIntoView(boolean topView, WebElement element) {
		jse.executeScript("arguments[0],scrollIntoView("+topView+")",element);
	}
}
