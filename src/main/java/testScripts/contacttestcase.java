package testScripts;


	import org.openqa.selenium.By;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.Test;

import genericMethods.baseclass;
import objectRepository.contactmodule;


	public class contacttestcase extends baseclass {
	@Test
	public void test1() throws InterruptedException {
		
		
		contactmodule page2 = new contactmodule(driver);
		
		
		
		// search company
		
		Thread.sleep(3000);
		page2.getAddcompany().sendKeys("Testing automation 2");

		Thread.sleep(3000);
		page2.getSearchcompany().click();

		
		//Add address
		
		Thread.sleep(3000);
		page2.getClickaddress().click();

		Thread.sleep(3000);
		page2.getSaveaddress3().click();
		
		Thread.sleep(3000);
		page2.getAddaddress().sendKeys("# 11 33,varanasi road ");

		Thread.sleep(3000);
		page2.getAddaddress2().sendKeys("bangalore Ramurthy nager");

		Thread.sleep(3000);
		page2.getClickcountry().click();

		Thread.sleep(3000);
		page2.getCountryname().sendKeys("united state");

		Thread.sleep(3000);
		page2.getClickstate().click();

		Thread.sleep(3000);
		page2.getStatename().sendKeys("florida");

		Thread.sleep(3000);
		page2.getCityname().sendKeys("Kingdom");

		Thread.sleep(3000);
		page2.getAddzipcode().sendKeys("602113");
			 
		Thread.sleep(3000);
		page2.getSaveaddress().click();


		// editing address
		Thread.sleep(3000);
		page2.getEditaddress().click();

		Thread.sleep(3000);
		page2.getEditcountry().click();

		Thread.sleep(3000);
		page2.getEditcountryname().sendKeys("united kingdom");

		Thread.sleep(3000);
		page2.getEditstate().click();

		Thread.sleep(3000);
		page2.getEditstatename().sendKeys("London");

		
		Thread.sleep(3000);
		page2.getSaveeditadress().click();

		Thread.sleep(3000);
		page2.getClickdeleteaddress().click();

		Thread.sleep(3000);
		page2.getCancledeleteaddress().click();

		Thread.sleep(3000);
		page2.getClickdeleteaddress1().click();

		Thread.sleep(3000);
		page2.getDeleteaddress().click();


		// Contact lead page2s
		Thread.sleep(3000);
		page2.getAddcontact().click();

		Thread.sleep(3000);
		page2.getContactcancle().click();

		Thread.sleep(3000);
		page2.getAddcontact1().click();

		Thread.sleep(3000);
		page2.getContactname().sendKeys("Automation");

		Thread.sleep(3000);
		page2.getTitlename().sendKeys("QA TESTER");

		Thread.sleep(3000);
		page2.getSelectflag().click();

		Thread.sleep(3000);
		page2.getFlagname().click();

		Thread.sleep(3000);
		page2.getAddnumber().sendKeys("6360244152");



		Thread.sleep(3000);
		page2.getSelectflag1().click();

		Thread.sleep(3000);
		page2.getFlagname1().click();

		Thread.sleep(3000);
		page2.getClickemail().click();

		Thread.sleep(3000);
		page2.getAddemailID().sendKeys("james@zibtek.in");

		Thread.sleep(3000);
		page2.getSavecontact().click();

		Thread.sleep(3000);
		page2.getClickhoriz().click();

		Thread.sleep(3000);
		page2.getEditcontact().click();


		Thread.sleep(4000);
		JavascriptExecutor script2=(JavascriptExecutor)driver;
		script2.executeScript("window.scrollBy(0,350)", "");

		Thread.sleep(3000);
		page2.getContacturl().click();

		Thread.sleep(3000);
		page2.getURLlink().sendKeys("www.oncourse.com");

		Thread.sleep(3000);
		page2.getSaveeditcontact().click();

		Thread.sleep(3000);
		page2.getClickhoriz1().click();

		Thread.sleep(3000);
		page2.getClickedit().click();

		

				
		Thread.sleep(3000);
		page2.getEditcancle().click();

		Thread.sleep(3000);
		page2.getClicknewcontact().click();
		
		Thread.sleep(3000);
		page2.getCanclenewcontact().click();

		driver.navigate().refresh(); 

		// CONTACT TASK

		Thread.sleep(3000);
		JavascriptExecutor script3=(JavascriptExecutor)driver;
		script3.executeScript("window.scrollBy(0,-650)", "");

		Thread.sleep(2000);
		page2.getAddtask().click();

		Thread.sleep(2000);
		page2.getCreatetask().click();

		Thread.sleep(2000);
		page2.getCleartaskdescription().clear();

		Thread.sleep(2000);
		page2.getAddtaskdescription().sendKeys("Need to follow up today");

		Thread.sleep(2000);
		page2.getClicktasktype().click();

		Thread.sleep(2000);
		page2.getAddtasktype().click();

		Thread.sleep(2000);
		page2.getCreatetask1().click();

		Thread.sleep(3000);
		WebElement action=driver.findElement(By.xpath("(//*[text()='Prospecting'])[1]"));
		Actions act = new Actions (driver);
		act.moveToElement(action).build().perform();
		driver.findElement(By.xpath("//*[text()='Prospecting']//following::div/div/i[2]")).click();

		Thread.sleep(2000);
		page2.getClickaddpriority().click();

		Thread.sleep(2000);
		page2.getAddhighPriority().click();

		Thread.sleep(2000); 
		page2.getClicksave().click();

		Thread.sleep(3000);
		WebElement action1=driver.findElement(By.xpath("(//*[text()='Prospecting'])[1]"));
		Actions act1 = new Actions (driver);
		act1.moveToElement(action1).build().perform();
		driver.findElement(By.xpath("//*[text()='Prospecting']//following::div/div/i[2]")).click();

		Thread.sleep(3000);
		page2.getClickcheck().click();

 

		Thread.sleep(3000);
		WebElement action11=driver.findElement(By.xpath("//*[text()='Need to follow up today']"));
		Actions act11 = new Actions (driver);
		act11.moveToElement(action11).build().perform();
		driver.findElement(By.xpath("//*[text()='undo']")).click();

		driver.navigate().refresh();

		Thread.sleep(4000);
		WebElement action21=driver.findElement(By.xpath("(//*[text()='Prospecting'])[1]"));
		Actions act21 = new Actions (driver);
		act21.moveToElement(action21).build().perform();
		driver.findElement(By.xpath("//*[text()='Prospecting']//following::div/div/i[3]")).click();	



		Thread.sleep(2000);
		page2.getClicktaskcancle().click();

		Thread.sleep(3000);
		WebElement action2111=driver.findElement(By.xpath("(//*[text()='Prospecting'])[1]"));
		Actions act2111 = new Actions (driver);
		act2111.moveToElement(action2111).build().perform();
		driver.findElement(By.xpath("//*[text()='Prospecting']//following::div/div/i[3]")).click();

		Thread.sleep(2000);
		page2.getClicktaskdelete().click();



		// CREATE DEALS
		Thread.sleep(3000);
		page2.getAddDeal().click();
	
		Thread.sleep(3000);
		page2.getClicksavedeal().click();

		Thread.sleep(3000);
		page2.getDealname().sendKeys("Cricket");

		Thread.sleep(3000);
		page2.getDealcontactPerson().click();

		Thread.sleep(3000);
		page2.getDealcontactname().click(); 

		Thread.sleep(3000);
		page2.getDealpipeline().click();

		Thread.sleep(3000);
		page2.getPipelinename().click();

		Thread.sleep(3000);
		page2.getDealstage().click();

		Thread.sleep(3000);
		page2.getStagename().click();

		Thread.sleep(3000);
		page2.getDealvalues().sendKeys("300");

		Thread.sleep(3000);
		page2.getDealOwner().click();

		Thread.sleep(3000);
		page2.getDealNotes().sendKeys("Testing Automation");

		Thread.sleep(3000);
		page2.getDealSave().click();

		Thread.sleep(3000);
		JavascriptExecutor script211=(JavascriptExecutor)driver;
		script211.executeScript("window.scrollBy(0,-550)", "");	

		Thread.sleep(3000);
		page2.getClickDealName().click();

		Thread.sleep(3000);
		page2.getClickMoreVert().click();

		Thread.sleep(3000);
		page2.getDealEdit().click();

		Thread.sleep(3000);
		page2.getClearDealName().clear();

		Thread.sleep(3000);
		page2.getDealEditName().sendKeys("Martin");

		Thread.sleep(3000);
		JavascriptExecutor script41=(JavascriptExecutor)driver;
		script41.executeScript("window.scrollBy(0,750)", "");

		Thread.sleep(3000);
		page2.getDealEditSave().click();

		Thread.sleep(3000);
		JavascriptExecutor script4=(JavascriptExecutor)driver;
		script4.executeScript("window.scrollBy(0,-450)", "");


		// WON DEALS
		 
		Thread.sleep(3000);
		page2.getClickDealName1().click();

		Thread.sleep(3000);
		page2.getDealWon().click();

		Thread.sleep(3000);
		JavascriptExecutor script5=(JavascriptExecutor)driver;
		script5.executeScript("window.scrollBy(0,-750)", "");

		Thread.sleep(3000);
		page2.getClickDealName2().click();


		Thread.sleep(3000);
		page2.getDealReopen().click();

		Thread.sleep(2000);
		driver.navigate().refresh();

		// LOST DEALS

		Thread.sleep(3000);
		page2.getClickDealName4().click();

		Thread.sleep(3000);
		page2.getClickDealLost().click();

		Thread.sleep(3000);
		page2.getDealLostReason().click();

		Thread.sleep(3000);
		page2.getDealsReasonNotes().click();

		Thread.sleep(3000);
		page2.getDealLostNotes().click();

		Thread.sleep(3000);
		page2.getDealLostNotesText().sendKeys("Testing Automation");

		Thread.sleep(3000);
		page2.getDealLostCancle().click();

		Thread.sleep(3000);
		page2.getClickDealLost1().click();

		Thread.sleep(3000);
		page2.getDealLostReason1().click();

		Thread.sleep(3000);
		page2.getDealsReasonNotes1().click();

		Thread.sleep(3000);
		page2.getDealLostNotes1().click();

		Thread.sleep(3000);
		page2.getDealLostNotesText1().sendKeys("Testing Automation");

		Thread.sleep(3000);
		page2.getDealsLostButton().click();

		Thread.sleep(3000);
		page2.getClickDealName5().click();

		Thread.sleep(3000);
		page2.getDealsLostReopen().click();

		Thread.sleep(3000);
		page2.getClickDealName7().click();

		Thread.sleep(3000);
		page2.getClickMoreVert1().click();

		Thread.sleep(3000);
		page2.getClickdelete1().click();

		Thread.sleep(3000);
		page2.getClickcanclebutton().click();

		Thread.sleep(3000);
		page2.getClickMoreVert2().click();

		Thread.sleep(3000);
		page2.getClickdelete2().click();

		Thread.sleep(3000);
		page2.getDeletedeals().click();  

 
		// Create Sequences

		Thread.sleep(3000);
		JavascriptExecutor script51=(JavascriptExecutor)driver;
		script51.executeScript("window.scrollBy(0,-550)", "");

		Thread.sleep(2000);
		page2.getAddcontactSequences().click();

		Thread.sleep(2000);
		page2.getClickStart().click();

		Thread.sleep(2000);
		page2.getSelectSequences().click();
 
		Thread.sleep(2000);
		page2.getAddSequencesName().click();

		Thread.sleep(2000);
		page2.getClickSequencescontact().click();

		Thread.sleep(2000);
		page2.getAddSequencescontact().click();

		Thread.sleep(2000);
		page2.getClicksequencesfrom().click();

		Thread.sleep(2000);
		page2.getAddsequencesemailID().click();

		Thread.sleep(2000);
		page2.getSequencesClickStart().click();

		// CONTACT SEQUENCES EDIT

		Thread.sleep(2000);
		WebElement action3=driver.findElement(By.xpath("//p[text()='Step 0/3']"));
		Actions act3 = new Actions (driver);
		act3.moveToElement(action3).build().perform();
		driver.findElement(By.xpath("//i[text()='more_vert']")).click();

		Thread.sleep(2000);
		page2.getClickViewEditSquences().click();

		Thread.sleep(2000);
		page2.getPauseSequences().click();

		Thread.sleep(2000);
		page2.getCancelEditSequences().click();

		Thread.sleep(2000);
		WebElement action4=driver.findElement(By.xpath("//p[text()='Step 0/3']"));
		Actions act4 = new Actions (driver);
		act4.moveToElement(action4).build().perform();
		driver.findElement(By.xpath("//i[text()='more_vert']")).click();

		Thread.sleep(2000);
		page2.getClickeditsequences1().click();

		Thread.sleep(2000);
		page2.getClickResume().click();

		Thread.sleep(2000);
		page2.getPauseSequences1().click();

		Thread.sleep(2000);
		page2.getDeleteReminder().click();

		Thread.sleep(2000);
		page2.getCancleeditsequence1().click();

		Thread.sleep(2000);
		page2.getCancleSequences().click();

		// SEQUENCE ADD ANOTHER CONTACT

		Thread.sleep(2000);
		WebElement action111=driver.findElement(By.xpath("(//*[text()='Step 0/3'])[1]"));
		Actions act111 = new Actions (driver);
		act111.moveToElement(action111).build().perform();
		driver.findElement(By.xpath("(//*[text()='more_vert'])[1]")).click();

		Thread.sleep(2000);
		page2.getAddAnotherContact().click();

		Thread.sleep(2000);
		page2.getAddSelectSequences().click();

		Thread.sleep(2000);
		page2.getAddJames1().click();

		Thread.sleep(2000);
		page2.getClickstart().click();

		Thread.sleep(2000);
		page2.getClickContactSequences().click();

		Thread.sleep(2000);
		page2.getAddcontactsequences().click();

		Thread.sleep(2000);
		page2.getAddcontactemailid().click();

		Thread.sleep(2000);
		page2.getAddemailid().click();

		Thread.sleep(2000);
		page2.getClickaddsequences().click();

		// CONTACT VIEW SEQUENCES

		Thread.sleep(3000);
		JavascriptExecutor script311111=(JavascriptExecutor)driver;
		script311111.executeScript("window.scrollBy(0,-450)", "");
			 
		Thread.sleep(3000);
		WebElement action1111=driver.findElement(By.xpath("(//*[text()='Step 0/3'])[1]"));
		Actions act1111 = new Actions (driver);
		act1111.moveToElement(action1111).build().perform();
		driver.findElement(By.xpath("(//*[text()='more_vert'])[1]")).click();

		Thread.sleep(2000);
		page2.getClickviewsequences().click();

		Thread.sleep(3000);
		JavascriptExecutor je = (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//a[text()=' manual auto seq ']"));
		je.executeScript("arguments[0].scrollIntoView();", scroll);

		Thread.sleep(2000);
		page2.getClickaccountmodule().click();

		Thread.sleep(2000);
		page2.getSearchcompany1().sendKeys("Testing automation 2");

		Thread.sleep(2000);
		page2.getAddcompany1().click();


		// CONTACT DELETE SEQUENCES


		Thread.sleep(2000);
		WebElement action5=driver.findElement(By.xpath("(//*[text()='Step 0/3'])[1]"));
		Actions act5 = new Actions (driver);
		act5.moveToElement(action5).build().perform();
		driver.findElement(By.xpath("(//*[text()='more_vert'])[1]")).click();


		Thread.sleep(2000);
		page2.getEditsequences().click();

		Thread.sleep(2000);
		page2.getPauseSequences2().click();

		Thread.sleep(2000);
		page2.getDeletereminder().click();

		Thread.sleep(2000);
		page2.getDeletesequence().click();

		Thread.sleep(2000);
		WebElement action6=driver.findElement(By.xpath("(//*[text()='Step 0/3'])[1]"));
		Actions act6 = new Actions (driver);
		act6.moveToElement(action6).build().perform();
		driver.findElement(By.xpath("(//*[text()='more_vert'])[1]")).click();

		Thread.sleep(2000);
		page2.getDeletesequence1().click();

		Thread.sleep(2000);
		page2.getDeletesequence2().click();

		// CONTACT HOME PAGE 
		// HOME PAGE EMAIL
		
		Thread.sleep(3000);
		JavascriptExecutor script1=(JavascriptExecutor)driver;
		script1.executeScript("window.scrollBy(0,-850)", "");
		WebElement ele1 =driver.findElement(By.xpath("(//*[text()='Email'])[3]")); 
		ele1.click();
		
		Thread.sleep(2000);
		page2.getDeleteemail().click();
	
		//CONTACT HOME PAGE CALL
		Thread.sleep(4000);
		JavascriptExecutor script22=(JavascriptExecutor)driver;
		script22.executeScript("window.scrollBy(0,-250)", "");
		WebElement ele22=driver.findElement(By.xpath("//a[@title=' Calls']")); 
		ele22.click();
		
		Thread.sleep(2000);
		page2.getCanclecall().click();
		
		//HOME PAGE SMS
		Thread.sleep(2000);
		page2.getClicksms().click();
		
		Thread.sleep(2000);
		page2.getDeletesms().click();
		
		
		//HOME PAGE NOTES
		Thread.sleep(2000);
		page2.getClicknotes().click();
		
		Thread.sleep(2000);
		page2.getCanclenotes().click();
		
		//HOME PAGE FILES
		Thread.sleep(2000);
		page2.getClickfiles().click();
		
		//HOME PAGE STATUS FIELD
		Thread.sleep(2000);
		page2.getStatuslist().click();
		
		Thread.sleep(2000);
		page2.getSelectstatusfield().click();
		
		//HOMEPAGE INDIVIDUALS HISTORY LIST
		Thread.sleep(2000);
		page2.getHistorylist().click();
		
		Thread.sleep(2000);
		page2.getSelectemail().click();
		
		Thread.sleep(2000);
		page2.getSelectaccount().click();
}}
