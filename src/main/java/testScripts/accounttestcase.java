package testScripts;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericMethods.baseclass;
import genericMethods.screenshot;
import objectRepository.accountmodule;

@Listeners(screenshot.class)

	public class accounttestcase extends baseclass {
	@Test
	public void test1() throws InterruptedException {

		accountmodule page1 = new accountmodule(driver);
		



	 //create company

	Thread.sleep(3000);
	page1.getClickcompany().click(); 

	//Thread.sleep(3000);
	page1.getClickplaceholder().sendKeys("testing automation 3");

	Thread.sleep(2000);
	page1.getCreate().click();

	Thread.sleep(3000);
	page1.getClickaccounticon().click();

	Thread.sleep(3000);
	page1.getClickcompany1().click();

	Thread.sleep(3000);
	page1.getClickplaceholder1().sendKeys("testing automation 3");

	Thread.sleep(2000);
	page1.getCanclecompany().click();  

	Thread.sleep(3000);
	page1.getClickaccounticon1().click();

	Thread.sleep(2000);
	page1.getSearchcompany().sendKeys("Testing automation 3");

	Thread.sleep(3000);
	page1.getClickcompany2().click();

	Thread.sleep(2000);
	page1.getDeleteleadpage().click();

	Thread.sleep(2000);
	page1.getDeletecompany().click();

	}	
}
