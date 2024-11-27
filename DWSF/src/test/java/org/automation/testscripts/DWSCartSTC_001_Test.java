package org.automation.testscripts;

import org.automation.element_repository.BasePage;
import org.automation.element_repository.ElectronicsPage;
import org.automation.generic_utilities.BaseClass;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.automation.generic_utilities.MyListeners.class)
public class DWSCartSTC_001_Test extends BaseClass {

	@Test
	public void verify_user_is_able_to_add_product_to_cart() {
		
		//step1: click on electronics link
		BasePage.getElectronicsModule().click();
		Reporter.log(null);
		
		//step1: click on cell phones 
		ElectronicsPage electronicspage=new ElectronicsPage(driver);
		electronicspage.getCellPhonesLink().click();
		
		//step3: click on smart phone
		
	}
	
	
}
