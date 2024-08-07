package testScripts;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genericMethods.baseclass;
import objectRepository.contactmodule;
import objectRepository.templatesmodule;


public class templatestestcase extends baseclass {
@Test
public void test5() throws InterruptedException {  
	
	
templatesmodule page5 = new templatesmodule(driver);

//CREATE TEMPLATES MODULES
Thread.sleep(3000);
page5.getClicktemplatemodule().click();

Thread.sleep(3000);
page5.getClcikplustemplates().click();

Thread.sleep(3000); 
page5.getClicksavebutton().click();

Thread.sleep(3000);
page5.getCreatetemplatename().sendKeys("Bottels");

Thread.sleep(3000);
page5.getClickcontenttype().click();

Thread.sleep(3000);
page5.getSelectemail().click();

Thread.sleep(3000);
page5.getClickshareplaceholder().click();

Thread.sleep(3000);
page5.getSelectaccountonly().click();

Thread.sleep(3000);
page5.getClickuserfield().click();

Thread.sleep(3000);
page5.getSelectusername().click();

Thread.sleep(3000);
page5.getClickarchived().click();

Thread.sleep(3000);
page5.getClickarchived1().click();

Thread.sleep(3000);
page5.getClickaddsubject().sendKeys("testing email");

Thread.sleep(3000);
page5.getClickandwriteemail().sendKeys("need juice on break time");

Thread.sleep(3000);
page5.getClicksavebutton1().click();

// Pagination

Thread.sleep(3000);
page5.getClickvalue10().click();

Thread.sleep(3000);
page5.getClcikvalue200().click();

Thread.sleep(3000);
page5.getSearchcreatedtemplates().sendKeys("Bottels");

Thread.sleep(3000);
page5.getSelecttemplates().click();

Thread.sleep(3000);
page5.getSelectcanclebutton().click();


//create duplicate
Thread.sleep(3000);
WebElement action43=driver.findElement(By.xpath("(//*[text()='Bottels'])[1]"));
Actions act43 = new Actions (driver);
act43.moveToElement(action43).build().perform();
driver.findElement(By.xpath("//*[text()='Bottels']//following::td//span//i[1]")).click();

Thread.sleep(3000);
JavascriptExecutor james = (JavascriptExecutor)driver;
WebElement scroll21 = driver.findElement(By.xpath("(//*[text()='Delete'])[3]"));
james.executeScript("arguments[0].scrollIntoView();", scroll21);

Thread.sleep(3000);
page5.getSelectduplicate().click();

Thread.sleep(3000);
page5.getConfirmtheduplicate().click();

Thread.sleep(3000);
page5.getSavetheduplicate().click();

//delete duplicate
Thread.sleep(3000);
JavascriptExecutor raje = (JavascriptExecutor)driver;
raje.executeScript("document.querySelector('.tableWrap').scrollTop=6000");

Thread.sleep(3000);
WebElement action32=driver.findElement(By.xpath("//*[text()='Bottels(Duplicate)']"));
Actions act32 = new Actions (driver);
act32.moveToElement(action32).build().perform();
driver.findElement(By.xpath("//*[text()='Bottels(Duplicate)']//following::td//span//i[1]")).click();

Thread.sleep(3000);
JavascriptExecutor james1 = (JavascriptExecutor)driver;
WebElement scroll23 = driver.findElement(By.xpath("(//*[text()='Delete'])[3]"));
james1.executeScript("arguments[0].scrollIntoView();", scroll23);

Thread.sleep(3000);
page5.getClickdelete().click();

Thread.sleep(3000);
page5.getClickdelete1().click();

//individual deactivate
Thread.sleep(3000);
JavascriptExecutor raje3 = (JavascriptExecutor)driver;
raje3.executeScript("document.querySelector('.tableWrap').scrollTop=6000");

Thread.sleep(3000);
WebElement action44=driver.findElement(By.xpath("(//*[text()='Bottels'])[1]"));
Actions act44 = new Actions (driver);
act44.moveToElement(action44).build().perform();
driver.findElement(By.xpath("//*[text()='Bottels']//following::td//span//i[1]")).click();

Thread.sleep(3000);
JavascriptExecutor james2 = (JavascriptExecutor)driver;
WebElement scroll24 = driver.findElement(By.xpath("(//*[text()='Delete'])[3]"));
james2.executeScript("arguments[0].scrollIntoView();", scroll24);

Thread.sleep(3000);
page5.getClickdeactivate().click();


//click active button to see all deactivate templates

Thread.sleep(3000);
page5.getClickactive2().click();

Thread.sleep(3000);
JavascriptExecutor raje4 = (JavascriptExecutor)driver;
raje4.executeScript("document.querySelector('.tableWrap').scrollTop=6000");

Thread.sleep(3000);
WebElement action33=driver.findElement(By.xpath("//*[text()='Bottels']"));
Actions act33 = new Actions (driver);
act33.moveToElement(action33).build().perform();
driver.findElement(By.xpath("//*[text()='Bottels']//following::td//span//i[1]")).click();

Thread.sleep(3000);
JavascriptExecutor james4 = (JavascriptExecutor)driver;
WebElement scroll26 = driver.findElement(By.xpath("//p[text()='Delete']"));
james4.executeScript("arguments[0].scrollIntoView();", scroll26);

Thread.sleep(3000);
page5.getClickactive().click();

Thread.sleep(3000);
page5.getClickinactive().click();


//edit templates and save 
Thread.sleep(3000);
JavascriptExecutor james5 = (JavascriptExecutor)driver;
WebElement scroll27 = driver.findElement(By.xpath("//*[text()='Bottels']"));
james5.executeScript("arguments[0].scrollIntoView();", scroll27);

Thread.sleep(3000);
WebElement action45=driver.findElement(By.xpath("//*[text()='Bottels']"));
Actions act45 = new Actions (driver);
act45.moveToElement(action45).build().perform();
driver.findElement(By.xpath("//*[text()='Bottels']//following::td//span//i[1]")).click();

Thread.sleep(3000);
JavascriptExecutor james6 = (JavascriptExecutor)driver;
WebElement scroll28 = driver.findElement(By.xpath("(//*[text()='Delete'])[3]"));
james6.executeScript("arguments[0].scrollIntoView();", scroll28);

Thread.sleep(3000);
page5.getClickedit().click();

Thread.sleep(3000);
page5.getClicksave().click();

Thread.sleep(4000);
JavascriptExecutor james7 = (JavascriptExecutor)driver;
WebElement scroll29 = driver.findElement(By.xpath("//*[text()='Bottels']"));
james7.executeScript("arguments[0].scrollIntoView();", scroll29);


//Active Bulk Selection

Thread.sleep(3000);
page5.getClickcheckbox().click();

Thread.sleep(3000);
page5.getClickdeactive().click();

Thread.sleep(3000);
page5.getClickcancle().click();

Thread.sleep(3000);
page5.getClickcheckbox1().click();

Thread.sleep(3000);
page5.getClickdeactive1().click();

Thread.sleep(3000);
page5.getClickdeactive2().click();

Thread.sleep(3000);
page5.getClickactive1().click();

//Deactivate bulk selection
Thread.sleep(3000);
page5.getClickcheckbox2().click();

Thread.sleep(3000);
page5.getClickactivetemplates().click();

Thread.sleep(3000);
page5.getClickcancle1().click();

Thread.sleep(3000);
page5.getClickcheckbox3().click();

Thread.sleep(3000);
page5.getSelectactivetemplates().click();

Thread.sleep(3000);
page5.getSelectactivate().click();

Thread.sleep(3000);
page5.getSelectinactive().click();

//bulk export
Thread.sleep(3000);
page5.getClickcheckbox4().click();

Thread.sleep(3000);
page5.getClickexitapp().click();

Thread.sleep(3000);
page5.getClickradiobutton().click();

Thread.sleep(3000);
page5.getClickcanclebutton().click();

Thread.sleep(3000);
page5.getClickexitapp1().click();

Thread.sleep(3000);
page5.getClickradio1().click();

Thread.sleep(3000);
page5.getClicksend().click();

Thread.sleep(3000);
page5.getClickok().click();

//bulk delete
Thread.sleep(3000);
page5.getClickcheckbox5().click();

Thread.sleep(3000);
page5.getClickdeletebutton().click();

Thread.sleep(3000);
page5.getClickcancle2().click();

//delete selected templates
Thread.sleep(3000);
WebElement action46=driver.findElement(By.xpath("//*[text()='Bottels']"));
Actions act46 = new Actions (driver);
act46.moveToElement(action46).build().perform();
driver.findElement(By.xpath("//*[text()='Bottels']//following::td//span//i[1]")).click();

Thread.sleep(3000);
JavascriptExecutor james8 = (JavascriptExecutor)driver;
WebElement scroll30 = driver.findElement(By.xpath("(//*[text()='Delete'])[3]"));
james8.executeScript("arguments[0].scrollIntoView();", scroll30);

Thread.sleep(3000);
page5.getClickdeletebutton1().click();

Thread.sleep(3000);
page5.getClickdeletebutton2().click();

Thread.sleep(3000);
page5.getClickaccounticon().click();















































































}}
