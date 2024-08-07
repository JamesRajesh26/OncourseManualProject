package testScripts;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genericMethods.baseclass;
import objectRepository.sequencesmodule;

	import org.openqa.selenium.JavascriptExecutor;



	
	public class sequencestestcase extends baseclass {

		@Test 
public void test2() throws InterruptedException{

	 sequencesmodule page4 = new sequencesmodule(driver);


 
// Search Module

Thread.sleep(5000);
page4.getClickSequencesmodule().click();

Thread.sleep(3000);
page4.getClickplussequences().click();

Thread.sleep(3000);
page4.getAddsequencesname().sendKeys("Samsung");

Thread.sleep(3000);
page4.getClicksavebutton().click();

Thread.sleep(3000);
page4.getClicktimezone().click();

Thread.sleep(3000);
page4.getSelectindiantimezone().click();

Thread.sleep(3000);
page4.getClickpreferrdtime().click();

Thread.sleep(3000);
page4.getSlectpreferredtime().click();

Thread.sleep(3000);
page4.getSelecttuesday().click();

Thread.sleep(3000);
page4.getUnselecttuesday().click();

Thread.sleep(3000);
page4.getSubscribetoggle().click();

Thread.sleep(3000);
page4.getUnsunscribetoggle().click();

Thread.sleep(3000);
page4.getSelectday().sendKeys("1");

Thread.sleep(3000);
page4.getClicksavebutton1().click();

Thread.sleep(3000);
page4.getClicksavebutton2().click();

//select automated option 

driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.xpath(" //mat-select[@formcontrolname='system']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Automated ']")).click();

Thread.sleep(3000);
page4.getSelectcontenttype().click();

Thread.sleep(3000);
page4.getSelectemail().click();

Thread.sleep(3000);
page4.getClicktemplateid().click();

Thread.sleep(3000);
page4.getSelectsearch().click();

Thread.sleep(3000);
page4.getClickdeletebutton().click();

Thread.sleep(3000);
page4.getAddnewstep().click();

Thread.sleep(3000);
page4.getAdddaynukmber().sendKeys("1");

Thread.sleep(3000);
page4.getClicksavebutton3().click();

//select automated option


driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.xpath(" //mat-select[@formcontrolname='system']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Automated ']")).click();

Thread.sleep(3000);
page4.getSelectcontenttype1().click();

Thread.sleep(3000);
page4.getSelectemail1().click();

Thread.sleep(3000);
page4.getClicktemplateid1().click();

Thread.sleep(3000);
page4.getSelectsearch1().click();

Thread.sleep(3000);
page4.getClicktemplateid2().click();

Thread.sleep(3000);
page4.getClicknewtemplate().click();

Thread.sleep(3000);
page4.getClicktemplatename().sendKeys("Samsung Mobile");

Thread.sleep(3000);
page4.getClickcontenttype().click();

Thread.sleep(3000);
page4.getSelectemail2().click();

Thread.sleep(3000);
page4.getClickownerid().click();

Thread.sleep(3000);
page4.getSelectusername().click();

Thread.sleep(3000);
page4.getClickonsharewithteam().click();

Thread.sleep(3000);
page4.getClickmyaccountonly().click();

Thread.sleep(3000);
page4.getClicksubject().sendKeys("email testing");

Thread.sleep(3000);
page4.getClickontemplates().sendKeys("Email testing for automation");

Thread.sleep(3000);
page4.getClicksavebutton4().click();

Thread.sleep(3000);
page4.getClicksavebutton5().click();

Thread.sleep(3000);
page4.getClickaddnewsteps().click();

Thread.sleep(3000);
page4.getAddnumbers().sendKeys("2");

Thread.sleep(3000);
page4.getClicksave().click();

Thread.sleep(3000);
page4.getClickselectsystem().click();

Thread.sleep(3000);
page4.getClickmanual().click();

Thread.sleep(3000);
page4.getSelectcontenttype2().click();

Thread.sleep(3000);
page4.getClicktask().click();

Thread.sleep(3000);
page4.getClicknewtemplate1().click();

Thread.sleep(3000);
page4.getSelectusertemplate().click();

Thread.sleep(3000);
page4.getClicksave1().click();

Thread.sleep(3000);
page4.getClicksave2().click();

Thread.sleep(3000);
page4.getClickpagination().click();

Thread.sleep(3000);
page4.getSelectpagination().click();

Thread.sleep(3000);
JavascriptExecutor raj = (JavascriptExecutor)driver;
WebElement scroll40 = driver.findElement(By.xpath("//*[text()=' Samsung ']"));
raj.executeScript("arguments[0].scrollIntoView();", scroll40); 

Thread.sleep(3000);
page4.getClickhomepage().click();

Thread.sleep(3000);
page4.getSearchcompany().sendKeys("Testing automation 2");

Thread.sleep(3000);
page4.getSelectcompany().click();

Thread.sleep(3000);
page4.getClicksequencesbutton().click();

Thread.sleep(3000);
page4.getClickstartbutton().click();

Thread.sleep(3000);
page4.getClickselectsequences().click();

Thread.sleep(3000);
page4.getChooseanysequences().click();

Thread.sleep(3000);
page4.getClickselectcontact().click();

Thread.sleep(3000);
page4.getSelectcontactname().click();

Thread.sleep(3000);
page4.getClickselectsender().click();

Thread.sleep(3000);
page4.getChoosesenderemail().click();

Thread.sleep(3000);
page4.getClickstartbutton1().click();

Thread.sleep(3000);
JavascriptExecutor script40=(JavascriptExecutor)driver;
script40.executeScript("window.scrollBy(0,250)", "");
					 					 
Thread.sleep(3000);
WebElement action40=driver.findElement(By.xpath("(//*[text()='Step 0/2'])[1]"));
Actions act40 = new Actions (driver);
act40.moveToElement(action40).build().perform();
driver.findElement(By.xpath("(//*[text()='more_vert'])[1]")).click();

Thread.sleep(3000);
page4.getClickviewsequences().click();

Thread.sleep(3000);
page4.getClickpagination1().click();

Thread.sleep(3000);
page4.getSelectpagination2().click();


Thread.sleep(3000);
JavascriptExecutor ja = (JavascriptExecutor)driver;
WebElement scroll1 = driver.findElement(By.xpath("//*[text()=' Samsung ']"));
ja.executeScript("arguments[0].scrollIntoView();", scroll1);

Thread.sleep(3000);
page4.getClickselectedsequences().click();

Thread.sleep(2000);
JavascriptExecutor je5 = (JavascriptExecutor)driver;
je5.executeScript("document.querySelector(\".table-wrap\").scrollTop=8000");

Thread.sleep(3000);
page4.getClickcheckbox().click();

Thread.sleep(3000);
page4.getClickpausebutton().click();

Thread.sleep(3000);
page4.getClickcheckbox1().click();

Thread.sleep(3000);
page4.getClickactive().click();

Thread.sleep(3000);
page4.getClickcheckbox2().click();

Thread.sleep(3000);
page4.getClickresendbutton().click();

Thread.sleep(3000);
page4.getClickselectsender1().click();

Thread.sleep(3000);
page4.getSelectemail3().click();

Thread.sleep(3000);
page4.getClickresendcampaign().click();


Thread.sleep(3000);
JavascriptExecutor jame = (JavascriptExecutor)driver;
WebElement scroll3 = driver.findElement(By.xpath("//*[text()=' Samsung ']"));
jame.executeScript("arguments[0].scrollIntoView();", scroll3);

Thread.sleep(3000);
page4.getClickselectsequences1().click();

Thread.sleep(4000);
JavascriptExecutor je6 = (JavascriptExecutor)driver;
je6.executeScript("document.querySelector(\".table-wrap\").scrollTop=8000");


Thread.sleep(3000);
WebElement action42=driver.findElement(By.xpath("//*[text()=' Samsung ']"));
Actions act42 = new Actions (driver);
act42.moveToElement(action42).build().perform();
driver.findElement(By.xpath("(//*[text()='more_vert'])[2]")).click();

Thread.sleep(3000);
page4.getClickexport().click();

Thread.sleep(3000);
page4.getClickradiobutton().click();

Thread.sleep(3000);
page4.getClickcanclebutton().click();


Thread.sleep(3000);
WebElement action30=driver.findElement(By.xpath("//*[text()=' Samsung ']"));
Actions act30 = new Actions (driver);
act30.moveToElement(action30).build().perform();
driver.findElement(By.xpath("//td[@class='ng-star-inserted']//mat-icon[1]")).click();

Thread.sleep(3000);
page4.getClickexportbutton().click();

Thread.sleep(3000);
page4.getClickradiobutton1().click();

Thread.sleep(3000);
page4.getClickexportbutton1().click();

Thread.sleep(3000);
page4.getClickokbutton().click();

Thread.sleep(4000);
JavascriptExecutor je7 = (JavascriptExecutor)driver;
je7.executeScript("document.querySelector(\".table-wrap\").scrollTop=8000");


Thread.sleep(3000);
page4.getClickselectseq().click();

// Multiple Export

Thread.sleep(3000);
page4.getClickmulticheckbox();

Thread.sleep(3000);
page4.getClickexitapp();

Thread.sleep(3000);
page4.getClickradiobutton3();

Thread.sleep(3000);
page4.getClcikexport();

Thread.sleep(3000);
page4.getClickok();

// Sequences move from active to inactive
//Thread.sleep(3000);
//page4.getClickcheckbox6();

Thread.sleep(3000);
page4.getClickdeactivate();

Thread.sleep(3000);
page4.getClcikdeactive2();

//sequences move from inactive to active
Thread.sleep(3000);
page4.getClickactivebutton();

Thread.sleep(3000);
page4.getClickpagination2();

Thread.sleep(3000);
page4.getClcikpagination3();

Thread.sleep(3000);
page4.getClickcheckbox7();

Thread.sleep(3000);
page4.getClickactivebutton();

Thread.sleep(3000);
page4.getClickactivebutton2();

Thread.sleep(3000);
page4.getClcikdeactive();

//pagination active sequences
Thread.sleep(3000);
page4.getClickpagination3();

Thread.sleep(3000);
page4.getClickpagination4(); 
 
Thread.sleep(3000);
page4.getClickcheckbox8();

//delete sequences
Thread.sleep(3000);
page4.getClickdeletebutton1().click();

Thread.sleep(3000);
page4.getClickdeletebutton2().click();

Thread.sleep(3000);
page4.getClickaccountpage().click();


 






 





















































}

}
