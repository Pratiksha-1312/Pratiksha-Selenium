package org.automation.generic_utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * @author li
 * 
 */
public class ActionUtility {

Actions actions;

/**
 * This constructor is used to create object for Actions class,it accepts driver ref
 * @param driver
 */
public ActionUtility(WebDriver driver) {
	this.actions=new Actions(driver);
}
/**
 * 
 * @param element
 */
public void clickOnElement(WebElement element) {
	actions.click(element).perform();
}
/**
 * 
 * @param element
 * @param data
 */
public void passDataToElement(WebElement element, String data) {
	actions.sendKeys(element, data).perform();
}
/**
 * This method is used to perform double click on a given element
 * @param element[WebElement]
 */
public void doubleClickOnElement(WebElement element) {
	actions.doubleClick(element).perform();
}
/**
 * This method is used to perform right click on a given element
 * @param element[WebElement]
 */
public void rightClickOnElement(WebElement element) {
	actions.contextClick(element).perform();
}
/**
 * This method is used to perform mouse hover on a given element
 * @param element[WebElement]
 * @return void
 */
public void mouseHoverOnElement(WebElement element) {
	actions.moveToElement(element).perform();
}
/**
 * This method is used to perform drag and drop actions on given element 
 * Here we have to pass the element which has to be drag and dropped and destination element
 * @param element[WebElement]
 * @param dest[WebElement]
 */
public void dragAndDropAnElement(WebElement element , WebElement dest) {
	actions.dragAndDrop(element,dest).perform();
}
/**
 * This method is used to perform drag and drop actions on given element 
 * Here we have to pass the element which has to be drag and dropped and x and y offset values for destination
 * @param element[WebElement]
 * @param xOffset[int]
 * @param yOffset[int]
 * @return void
 */
public void dragAndDropAnElementBasedOnOffset(WebElement element , int xOffset, int yOffset) {
	actions.dragAndDropBy(element,xOffset,yOffset).perform();
}
/**
 * 
 * @param xOffset
 * @param yOffset
 */
public void scrollBasedOnAmount( int xOffset, int yOffset) {
	actions.scrollByAmount(xOffset,yOffset).perform();
}
/**
 * 
 * @param element
 */

public void scrollUntilElementIsVisible(WebElement element) {
	actions.scrollToElement(element).perform();
}
/**
 * 
 * @param seconds
 */
public void pauseAction(int seconds) {
	actions.pause(Duration.ofSeconds(seconds)).perform();
}

}
