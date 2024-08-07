package testScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import genericMethods.baseclass;

import objectRepository.dealsmodule;

public class dealstestcase extends baseclass {
	@Test
	public void test1() throws InterruptedException {

dealsmodule page3 = new dealsmodule(driver);

	  
// CREATE DEALS
Thread.sleep(3000);
page3.getClickdealsicon().click(); 

Thread.sleep(3000); 
page3.getClickdealmodule().click(); 

Thread.sleep(3000);
page3.getCreatedeal().click();		

Thread.sleep(3000); 
page3.getSearchdealcompany().click();

Thread.sleep(3000);
page3.getAdddealcompany().sendKeys("Testing Automation 2");

Thread.sleep(3000);
page3.getClickdealcompany().click();		

Thread.sleep(3000);
page3.getDealname().sendKeys("Ice Cream");

Thread.sleep(3000);
page3.getDealpipeline().click();

Thread.sleep(3000);
page3.getAddpipelinename().click();

Thread.sleep(3000);
page3.getStagename().click();

Thread.sleep(3000);
page3.getAddstagename().click(); 

//Thread.sleep(3000);
//page3.getDealowner().click(); 
//
//Thread.sleep(3000);
//page3.getDealownername().click();

Thread.sleep(3000);
page3.getAddoppvalue().sendKeys("100");

Thread.sleep(3000);
page3.getAdddealnotes().sendKeys("Its break time");		

Thread.sleep(3000);
page3.getClickdealcreate().click();		

// STAGE CREATE DEAL
Thread.sleep(2000);  
page3.getAddpipedeal().click();

Thread.sleep(2000);  
page3.getClickpipelinecreate().click();

Thread.sleep(2000); 
page3.getClickcancle().click();		

//VIEW PIPELINES  
page3.getClickpipeline().click();

Thread.sleep(3000);
page3.getClickonboarding().click();

// REFRESH PAGE  
Thread.sleep(3000);
driver.navigate().refresh();
		
// ADD TASK
Thread.sleep(3000);
page3.getClickdealname().click();

Thread.sleep(3000);
page3.getAdddealtask().click();		

Thread.sleep(3000);
page3.getClickcreatetask().click();		

Thread.sleep(3000);
page3.getTasktype().click();		

Thread.sleep(3000);
page3.getAddinbound().click();		

Thread.sleep(3000);
page3.getAssigneduser().click();		

Thread.sleep(3000);
page3.getAddassigneduser().click();		

Thread.sleep(3000);
page3.getCleardescription().clear();		

Thread.sleep(3000);
page3.getClickdescription().sendKeys("testing devices");		

Thread.sleep(3000);
page3.getClickcreate().click();		

// NOTES 
Thread.sleep(3000);
page3.getClearnotes().clear();

Thread.sleep(3000);
page3.getClicknotes().sendKeys("testing automation");	

// SELECT PIPE LINE
Thread.sleep(3000);
page3.getClickpipeline1().click();

Thread.sleep(3000);
page3.getClickonboarding1().click();
		
// SELECT STAGE LINE		
Thread.sleep(3000);
page3.getClickstagepipeline().click();		

Thread.sleep(3000);
page3.getClickprd().click();


// WON DEAL  
Thread.sleep(5000);
page3.getClickwon().click();

Thread.sleep(5000);
page3.getClickreopen().click();

Thread.sleep(5000);
page3.getClickwon1().click(); 

Thread.sleep(3000);
page3.getClickcompanyname().click();

Thread.sleep(3000);
page3.getClickdealname1().click();
 
Thread.sleep(3000); 
page3.getDealreopen().click();

Thread.sleep(3000);
page3.getClickdealsicon1().click();

Thread.sleep(3000);
page3.getClickpipeline2().click();

Thread.sleep(3000);
page3.getClickonboarding2().click();		
		
// LOST DEALS
Thread.sleep(3000);
page3.getClickdealname4().click();

Thread.sleep(3000);
page3.getClicklost().click();

Thread.sleep(3000);
page3.getSelectreason().click();

Thread.sleep(3000);
page3.getStopresponding().click();

Thread.sleep(3000);
page3.getLostreasonnote().sendKeys("not intrested");

Thread.sleep(3000);
page3.getClickmarklost().click();

Thread.sleep(3000);
page3.getClicklostreopen().click();

Thread.sleep(3000);
page3.getClicklost2().click();

Thread.sleep(3000);
page3.getSelectreason1().click();

Thread.sleep(3000);
page3.getStopresponding1().click();

Thread.sleep(3000);
page3.getLostreasonnote1().sendKeys("not intrested");		

Thread.sleep(3000);
page3.getClickmarklost1().click();

Thread.sleep(3000);
page3.getClickcompanyname1().click();

Thread.sleep(3000);
page3.getClickdealname3().click();		

Thread.sleep(3000);
page3.getDealreopen1().click();

Thread.sleep(3000);
page3.getClickdealicon().click();

Thread.sleep(3000);
page3.getClickdealname5().click();

// COMMENTS
Thread.sleep(3000);
page3.getClickcomment().click();

Thread.sleep(3000);
page3.getClicktextarea().sendKeys("Testing Deal 2.0");

Thread.sleep(3000);
page3.getClickcommentbutton().click();

Thread.sleep(3000);
page3.getClickreply().click();

Thread.sleep(3000);
page3.getClickcomment1().click();

Thread.sleep(3000);
page3.getAddtextcomment().sendKeys("testing  2.0");

Thread.sleep(3000);
page3.getClickcommentbutton1().click();

Thread.sleep(3000);
page3.getClickcollapse().click();



// VIEW MORE ACTIVITIES
Thread.sleep(3000);
page3.getClickviewmoreactivity().click();

// DEAL EDIT OPTION
Thread.sleep(3000);
page3.getClickmorevert().click();

Thread.sleep(3000);
page3.getClickedit().click();

JavascriptExecutor je1 = (JavascriptExecutor)driver;
Thread.sleep(4000);
je1.executeScript("document.querySelector('#addDealColor').scrollTop=400");

Thread.sleep(3000);
page3.getClickprojecttype().click();

Thread.sleep(3000);
page3.getClickstaffaug().click();

Thread.sleep(3000);
page3.getClickdevteam().click();

Thread.sleep(3000);
page3.getClickzibtek().click();

Thread.sleep(3000);
page3.getClicksavebutton().click();

// click view

Thread.sleep(3000);
page3.getClickdealname2().click();

Thread.sleep(3000);
page3.getClcikmorevert().click();

Thread.sleep(3000); 
page3.getClickdelete().click();

Thread.sleep(3000);
page3.getClickcancle1().click();

Thread.sleep(3000);
page3.getClickmorevert1().click();

Thread.sleep(3000);
page3.getClickdelete1().click();

Thread.sleep(3000);
page3.getClickdelete2().click();

Thread.sleep(3000);
page3.getSearchcompany().sendKeys("Testing automation 2");

Thread.sleep(3000);
page3.getClcikcompany().click();


















		
		
		
	}}
