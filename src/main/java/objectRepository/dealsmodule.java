package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dealsmodule {
private WebDriver driver;

public dealsmodule(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
} 
	
	 
	
	@FindBy(xpath=("//img[@mattooltip='Deals']"))
	private WebElement clickdealsicon;
	
	@FindBy(xpath=("//*[text()=' Deal']"))
	private WebElement clickdealmodule;
	
	@FindBy(xpath=("(//*[text()='CREATE'])[2]"))
	private WebElement createdeal;
	
	@FindBy(xpath=("(//input[@type='text'])[9]"))
	private WebElement searchdealcompany;
	
	@FindBy(xpath=("(//input[@type='text'])[9]"))
	private WebElement adddealcompany;

	@FindBy(xpath=("//*[text()='Testing automation 2']"))
	private WebElement clickdealcompany;

	@FindBy(id=("dealName"))
	private WebElement dealname;
	
	@FindBy(id=("pipeValue"))
	private WebElement dealpipeline;
	
	@FindBy(xpath=("//*[text()=' Onboarding ']"))
	private WebElement addpipelinename;

	@FindBy(id=("stageValue"))
	private WebElement stagename;
	
	@FindBy(xpath=("//*[text()='Shedule Stard Date ']"))	
	private WebElement addstagename;
	
//	@FindBy(xpath=("(//input[@type='text'])[12]"))
//	private WebElement dealowner;
//	
//	@FindBy(xpath=("(//*[text()=' James Rajesh '])"))
//	private WebElement dealownername;
	
	@FindBy(id=("oppvalue"))
	private WebElement addoppvalue;
	
	@FindBy(xpath=("(//textarea[@placeholder='Notes'])[1]"))
	private WebElement adddealnotes;
	
	@FindBy(xpath=("(//*[text()='CREATE'])[2]"))
	private WebElement clickdealcreate;
	
	
// STAGE CREATE DEAL
	
	@FindBy(xpath=("(//*[text()=' add '])[1]"))
	private WebElement addpipedeal;
	
	@FindBy(xpath=("(//button[@class='save-btn'])[6]"))
	private WebElement clickpipelinecreate; 
	
	@FindBy(xpath=("(//button[@class='default-btn'])[11]"))
	private WebElement clickcancle;
	
	// VIEW PIPELINES
	
	@FindBy(xpath=("//*[text()='Pipeline:']//following::div[2]"))
	private WebElement clickpipeline;
	
	@FindBy(xpath=("//*[text()=' Onboarding ']"))
	private WebElement clickonboarding;
	
	// ADD TASK
	
	@FindBy(xpath=("//span[text()='Ice Cream']//following::div[1]"))
	private WebElement clickdealname;
	
	@FindBy(xpath=("//*[text()= 'add_circle_outline']"))
	private WebElement adddealtask;
	
	@FindBy(xpath=("//input[@value='Create']"))
	private WebElement clickcreatetask;
	
	@FindBy(xpath=("//*[text()='Select task type']"))
	private WebElement tasktype;
	
	@FindBy(xpath=("(//mat-option[@role='option'])[4]//span"))
	private WebElement addinbound;
	
	@FindBy(xpath=("(//ng-select[@name='assignedUser'])[2]"))
	private WebElement assigneduser;
	
	@FindBy(xpath=("(//*[text()=' James Rajesh'])[2]"))
	private WebElement addassigneduser;
	
	@FindBy(xpath=("(//textarea[@name='description'])[3]"))
	private WebElement  cleardescription; 
	
	@FindBy(xpath=("(//textarea[@name='description'])[3]"))
	private WebElement clickdescription;
	
	@FindBy(id=("Button"))
	private WebElement clickcreate;
	
	// Notes
	@FindBy(xpath=("//textarea[@placeholder='You can write notes here.']"))
	private WebElement clearnotes;
	
	@FindBy(xpath=("//textarea[@placeholder='You can write notes here.']"))
	private WebElement clicknotes;
	
	// select Pipeline
	@FindBy(id=("pipeSelect"))
	private WebElement clickpipeline1;
	
	@FindBy(xpath=("//*[text()=' Onboarding ']"))
	private WebElement clickonboarding1;
	
	// select stage line 
	@FindBy(id=("stageSelect"))
	private WebElement clickstagepipeline;
	
	@FindBy(xpath=("//span[text()='PRD ']"))
	private WebElement clickprd;
	
	
	// won deal
	@FindBy(xpath=("//button[@class='btn btn-won']"))
	private WebElement clickwon;
	
	@FindBy(xpath=("//*[text()='Reopen']"))
	private WebElement clickreopen;
	
	@FindBy(xpath=("//*[text()='Won']"))
	private WebElement clickwon1;
	
	@FindBy(xpath=("(//*[text()='Testing automation 2'])[1]"))
	private WebElement clickcompanyname;
	
	@FindBy(xpath=("//a[@data-parent='#accordion']"))
	private WebElement clickdealname1;
	
	@FindBy(xpath=("//*[text()='Reopen']"))
	private WebElement dealreopen;
	
	@FindBy(xpath=("//img[@mattooltip='Deals']"))
	private WebElement clickdealsicon1;
	
	@FindBy(xpath=("//*[text()='Pipeline:']//following::div[2]"))
	private WebElement clickpipeline2;
	
	@FindBy(xpath=("//*[text()=' Onboarding ']"))
	private WebElement clickonboarding2;
	
	// Lost Deal
	
	@FindBy(xpath=("//span[text()='Ice Cream']//following::div[1]"))
	private WebElement clickdealname4;
	
	@FindBy(xpath=("//*[text()='Lost']"))
	private WebElement clicklost;
	
	@FindBy(id=("opp-reason"))
	private WebElement selectreason;
	
	@FindBy(xpath=("//*[text()='Stopped Responding ']"))
	private WebElement stopresponding;
	
	@FindBy(xpath=("//textarea[@name='lostreasonNote']"))
	private WebElement lostreasonnote;
	
	@FindBy(xpath=("//*[text()=' Mark as Lost ']"))
	private WebElement clickmarklost;
	
	@FindBy(xpath=("//*[text()='Reopen']"))
	private WebElement clicklostreopen;
	
	@FindBy(xpath=("//*[text()='Lost']"))
	private WebElement clicklost2;
	
	@FindBy(id=("opp-reason"))
	private WebElement selectreason1;
	
	@FindBy(xpath=("//*[text()='Stopped Responding ']"))
	private WebElement stopresponding1;
	
	@FindBy(xpath=("//textarea[@name='lostreasonNote']"))
	private WebElement lostreasonnote1;
	
	@FindBy(xpath=("//*[text()=' Mark as Lost ']"))
	private WebElement clickmarklost1;
	
	@FindBy(xpath=("(//*[text()='Testing automation 2'])[1]"))
	private WebElement clickcompanyname1;
	
	@FindBy(xpath=("//*[text()=' Ice Cream ']"))
	private WebElement clickdealname3;
	
	@FindBy(xpath=("//*[text()='Reopen']"))
	private WebElement dealreopen1;
	
	@FindBy(xpath=("//img[@mattooltip='Deals']"))
	private WebElement clickdealicon;
	
	@FindBy(xpath=("//span[text()='Ice Cream']//following::div[1]"))
	private WebElement clickdealname5;
	
	// Comments
	@FindBy(xpath=("//div[@class='row message-row ng-star-inserted']"))
	private WebElement clickcomment;
	
	@FindBy(xpath=("//textarea[@placeholder='Type here to Comment']"))
	private WebElement clicktextarea;
	
	@FindBy(xpath=("//input[@value='Comment']"))
	private WebElement clickcommentbutton;
	
	@FindBy(xpath=("//*[text()='Reply']"))
	private WebElement clickreply;
	
	@FindBy(xpath=("//textarea[@placeholder='Type here to Comment']"))
	private WebElement clickcomment1;
	
	@FindBy(xpath=("//textarea[@placeholder='Type here to Comment']"))
	private WebElement addtextcomment;
	
	@FindBy(id=("ReplyButtonOne"))
	private WebElement clickcommentbutton1;
	
	@FindBy(xpath=("//*[text()='collapse']"))
	private WebElement clickcollapse;
	
	// view more activity
	@FindBy(xpath=("//*[text()=' View more activity ']"))
	private WebElement clickviewmoreactivity;
	
	//Deal edit option
	@FindBy(xpath=("//button[@class='option-btn']//span[1]"))
	private WebElement clickmorevert;
	
	@FindBy(xpath=("//p[text()='Edit']"))
	private WebElement clickedit;
	
	@FindBy(xpath=("(//div[@class='ng-input'])[9]//input"))
	private WebElement clickprojecttype;
	
	@FindBy(xpath=("//*[text()='Staff Aug']"))
	private WebElement clickstaffaug;
	
	@FindBy(xpath=("(//div[@class='ng-input'])[10]//input"))
	private WebElement clickdevteam;
	
	@FindBy(xpath=("//*[text()='Zibtek - Bangalore']"))
	private WebElement clickzibtek;
	
	@FindBy(xpath=("(//*[text()='Save'])[4]"))
	private WebElement clicksavebutton;

	// Click view
	@FindBy(xpath=("(//*[text()='Ice Cream'])[1]//following::div[1]"))
	private WebElement clickdealname2;
	
	@FindBy(xpath=("//*[text()='more_vert']"))
	private WebElement clcikmorevert;
	
	@FindBy(xpath=("(//*[text()='Delete'])[3]"))
	private WebElement clickdelete;
	
	@FindBy(xpath=("(//*[text()=' Cancel '])[4]"))
	private WebElement clickcancle1;
	
	@FindBy(xpath=("//*[text()='more_vert']"))
	private WebElement clickmorevert1;
	
	@FindBy(xpath=("(//*[text()='Delete'])[3]"))
	private WebElement clickdelete1;
	
	@FindBy(xpath=("(//*[text()=' Delete '])[1]"))
	private WebElement clickdelete2;
	
	@FindBy(xpath=("//img[@alt='logo']"))
	private WebElement clickaccount;
	
	@FindBy(xpath=("(//input[@placeholder='Search'])[2]"))
	private WebElement searchcompany;
	
	@FindBy(xpath=("//*[text()='Testing automation 2']"))
	private WebElement clcikcompany;
	
	
	
	
	
	
	
	
	
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getClickdealsicon() {
		return clickdealsicon;
	}

	public void setClickdealsicon(WebElement clickdealsicon) {
		this.clickdealsicon = clickdealsicon;
	}

	public WebElement getClickdealmodule() {
		return clickdealmodule;
	}

	public void setClickdealmodule(WebElement clickdealmodule) {
		this.clickdealmodule = clickdealmodule;
	}

	public WebElement getCreatedeal() {
		return createdeal;
	}

	public void setCreatedeal(WebElement createdeal) {
		this.createdeal = createdeal;
	}

	
	
	
	public WebElement getSearchdealcompany() {
		return searchdealcompany;
	}

	public void setSearchdealcompany(WebElement searchdealcompany) {
		this.searchdealcompany = searchdealcompany;
	}

	public WebElement getAdddealcompany() {
		return adddealcompany;
	}

	public void setAdddealcompany(WebElement adddealcompany) {
		this.adddealcompany = adddealcompany;
	}

	public WebElement getClickdealcompany() {
		return clickdealcompany;
	}

	public void setClickdealcompany(WebElement clickdealcompany) {
		this.clickdealcompany = clickdealcompany;
	}

	public WebElement getDealname() {
		return dealname;
	}

	public void setDealname(WebElement dealname) {
		this.dealname = dealname;
	}

	public WebElement getDealpipeline() {
		return dealpipeline;
	}

	public void setDealpipeline(WebElement dealpipeline) {
		this.dealpipeline = dealpipeline;
	}

	public WebElement getAddpipelinename() {
		return addpipelinename;
	}

	public void setAddpipelinename(WebElement addpipelinename) {
		this.addpipelinename = addpipelinename;
	}

	public WebElement getStagename() {
		return stagename;
	}

	public void setStagename(WebElement stagename) {
		this.stagename = stagename;
	}

	public WebElement getAddstagename() {
		return addstagename;
	}

	public void setAddstagename(WebElement addstagename) {
		this.addstagename = addstagename;
	}

//	public WebElement getDealowner() {
//		return dealowner;
//	}
//
//	public void setDealowner(WebElement dealowner) {
//		this.dealowner = dealowner;
//	}
//
//	public WebElement getDealownername() {
//		return dealownername;
//	}
//
//	public void setDealownername(WebElement dealownername) {
//		this.dealownername = dealownername;
//	}

	public WebElement getAddoppvalue() {
		return addoppvalue;
	}

	public void setAddoppvalue(WebElement addoppvalue) {
		this.addoppvalue = addoppvalue;
	}

	public WebElement getAdddealnotes() {
		return adddealnotes;
	}

	public void setAdddealnotes(WebElement adddealnotes) {
		this.adddealnotes = adddealnotes;
	}

	public WebElement getClickdealcreate() {
		return clickdealcreate;
	}

	public void setClickdealcreate(WebElement clickdealcreate) {
		this.clickdealcreate = clickdealcreate;
	}

	public WebElement getAddpipedeal() {
		return addpipedeal;
	}

	public void setAddpipedeal(WebElement addpipedeal) {
		this.addpipedeal = addpipedeal;
	}

	public WebElement getClickpipelinecreate() {
		return clickpipelinecreate;
	}

	public void setClickpipelinecreate(WebElement clickpipelinecreate) {
		this.clickpipelinecreate = clickpipelinecreate;
	}

	public WebElement getClickcancle() {
		return clickcancle;
	}

	public void setClickcancle(WebElement clickcancle) {
		this.clickcancle = clickcancle;
	}

	public WebElement getClickpipeline() {
		return clickpipeline;
	}

	public void setClickpipeline(WebElement clickpipeline) {
		this.clickpipeline = clickpipeline;
	}

	public WebElement getClickonboarding() {
		return clickonboarding;
	}

	public void setClickonboarding(WebElement clickonboarding) {
		this.clickonboarding = clickonboarding;
	}

	public WebElement getClickdealname() {
		return clickdealname;
	}

	public void setClickdealname(WebElement clickdealname) {
		this.clickdealname = clickdealname;
	}

	public WebElement getAdddealtask() {
		return adddealtask;
	}

	public void setAdddealtask(WebElement adddealtask) {
		this.adddealtask = adddealtask;
	}

	public WebElement getClickcreatetask() {
		return clickcreatetask;
	}

	public void setClickcreatetask(WebElement clickcreatetask) {
		this.clickcreatetask = clickcreatetask;
	}

	public WebElement getTasktype() {
		return tasktype;
	}

	public void setTasktype(WebElement tasktype) {
		this.tasktype = tasktype;
	}

	public WebElement getAddinbound() {
		return addinbound;
	}

	public void setAddinbound(WebElement addinbound) {
		this.addinbound = addinbound;
	}

	public WebElement getAssigneduser() {
		return assigneduser;
	}

	public void setAssigneduser(WebElement assigneduser) {
		this.assigneduser = assigneduser;
	}

	public WebElement getAddassigneduser() {
		return addassigneduser;
	}

	public void setAddassigneduser(WebElement addassigneduser) {
		this.addassigneduser = addassigneduser;
	}

	public WebElement getCleardescription() {
		return cleardescription;
	}

	public void setCleardescription(WebElement cleardescription) {
		this.cleardescription = cleardescription;
	}

	public WebElement getClickdescription() {
		return clickdescription;
	}

	public void setClickdescription(WebElement clickdescription) {
		this.clickdescription = clickdescription;
	}

	public WebElement getClickcreate() {
		return clickcreate;
	}

	public void setClickcreate(WebElement clickcreate) {
		this.clickcreate = clickcreate;
	}

	public WebElement getClearnotes() {
		return clearnotes;
	}

	public void setClearnotes(WebElement clearnotes) {
		this.clearnotes = clearnotes;
	}

	public WebElement getClicknotes() {
		return clicknotes;
	}

	public void setClicknotes(WebElement clicknotes) {
		this.clicknotes = clicknotes;
	}

	public WebElement getClickpipeline1() {
		return clickpipeline1;
	}

	public void setClickpipeline1(WebElement clickpipeline1) {
		this.clickpipeline1 = clickpipeline1;
	}

	public WebElement getClickonboarding1() {
		return clickonboarding1;
	}

	public void setClickonboarding1(WebElement clickonboarding1) {
		this.clickonboarding1 = clickonboarding1;
	}

	public WebElement getClickstagepipeline() {
		return clickstagepipeline;
	}

	public void setClickstagepipeline(WebElement clickstagepipeline) {
		this.clickstagepipeline = clickstagepipeline;
	}

	public WebElement getClickprd() {
		return clickprd;
	}

	public void setClickprd(WebElement clickprd) {
		this.clickprd = clickprd;
	}

	public WebElement getClickwon() {
		return clickwon;
	}

	public void setClickwon(WebElement clickwon) {
		this.clickwon = clickwon;
	}

	public WebElement getClickreopen() {
		return clickreopen;
	}

	public void setClickreopen(WebElement clickreopen) {
		this.clickreopen = clickreopen;
	}

	public WebElement getClickwon1() {
		return clickwon1;
	}

	public void setClickwon1(WebElement clickwon1) {
		this.clickwon1 = clickwon1;
	}

	public WebElement getClickdealname1() {
		return clickdealname1;
	}

	public void setClickdealname1(WebElement clickdealname1) {
		this.clickdealname1 = clickdealname1;
	}

	public WebElement getDealreopen() {
		return dealreopen;
	}

	public void setDealreopen(WebElement dealreopen) {
		this.dealreopen = dealreopen;
	}

	public WebElement getClickdealsicon1() {
		return clickdealsicon1;
	}

	public void setClickdealsicon1(WebElement clickdealsicon1) {
		this.clickdealsicon1 = clickdealsicon1;
	}

	public WebElement getClickpipeline2() {
		return clickpipeline2;
	}

	public void setClickpipeline2(WebElement clickpipeline2) {
		this.clickpipeline2 = clickpipeline2;
	}

	public WebElement getClickonboarding2() {
		return clickonboarding2;
	}

	public void setClickonboarding2(WebElement clickonboarding2) {
		this.clickonboarding2 = clickonboarding2;
	}

	public WebElement getClickdealname4() {
		return clickdealname4;
	}

	public void setClickdealname4(WebElement clickdealname4) {
		this.clickdealname4 = clickdealname4;
	}

	public WebElement getClicklost() {
		return clicklost;
	}

	public void setClicklost(WebElement clicklost) {
		this.clicklost = clicklost;
	}

	public WebElement getSelectreason() {
		return selectreason;
	}

	public void setSelectreason(WebElement selectreason) {
		this.selectreason = selectreason;
	}

	public WebElement getStopresponding() {
		return stopresponding;
	}

	public void setStopresponding(WebElement stopresponding) {
		this.stopresponding = stopresponding;
	}

	public WebElement getLostreasonnote() {
		return lostreasonnote;
	}

	public void setLostreasonnote(WebElement lostreasonnote) {
		this.lostreasonnote = lostreasonnote;
	}

	public WebElement getClickmarklost() {
		return clickmarklost;
	}

	public void setClickmarklost(WebElement clickmarklost) {
		this.clickmarklost = clickmarklost;
	}

	public WebElement getClicklostreopen() {
		return clicklostreopen;
	}

	public void setClicklostreopen(WebElement clicklostreopen) {
		this.clicklostreopen = clicklostreopen;
	}

	public WebElement getClicklost2() {
		return clicklost2;
	}

	public void setClicklost2(WebElement clicklost2) {
		this.clicklost2 = clicklost2;
	}

	public WebElement getSelectreason1() {
		return selectreason1;
	}

	public void setSelectreason1(WebElement selectreason1) {
		this.selectreason1 = selectreason1;
	}

	public WebElement getStopresponding1() {
		return stopresponding1;
	}

	public void setStopresponding1(WebElement stopresponding1) {
		this.stopresponding1 = stopresponding1;
	}

	public WebElement getLostreasonnote1() {
		return lostreasonnote1;
	}

	public void setLostreasonnote1(WebElement lostreasonnote1) {
		this.lostreasonnote1 = lostreasonnote1;
	}

	public WebElement getClickmarklost1() {
		return clickmarklost1;
	}

	public void setClickmarklost1(WebElement clickmarklost1) {
		this.clickmarklost1 = clickmarklost1;
	}

	public WebElement getClickdealname3() {
		return clickdealname3;
	}

	public void setClickdealname3(WebElement clickdealname3) {
		this.clickdealname3 = clickdealname3;
	}

	public WebElement getDealreopen1() {
		return dealreopen1;
	}

	public void setDealreopen1(WebElement dealreopen1) {
		this.dealreopen1 = dealreopen1;
	}

	public WebElement getClickdealicon() {
		return clickdealicon;
	}

	public void setClickdealicon(WebElement clickdealicon) {
		this.clickdealicon = clickdealicon;
	}

	public WebElement getClickdealname5() {
		return clickdealname5;
	}

	public void setClickdealname5(WebElement clickdealname5) {
		this.clickdealname5 = clickdealname5;
	}

	public WebElement getClickcomment() {
		return clickcomment;
	}

	public WebElement getClickcompanyname() {
		return clickcompanyname;
	}

	public void setClickcompanyname(WebElement clickcompanyname) {
		this.clickcompanyname = clickcompanyname;
	}

	public WebElement getClickcompanyname1() {
		return clickcompanyname1;
	}

	public void setClickcompanyname1(WebElement clickcompanyname1) {
		this.clickcompanyname1 = clickcompanyname1;
	}

	public WebElement getClickreply() {
		return clickreply;
	}

	public void setClickreply(WebElement clickreply) {
		this.clickreply = clickreply;
	}

	public WebElement getClickcomment1() {
		return clickcomment1;
	}

	public void setClickcomment1(WebElement clickcomment1) {
		this.clickcomment1 = clickcomment1;
	}

	public WebElement getAddtextcomment() {
		return addtextcomment;
	}

	public void setAddtextcomment(WebElement addtextcomment) {
		this.addtextcomment = addtextcomment;
	}

	public WebElement getClickcommentbutton1() {
		return clickcommentbutton1;
	}

	public void setClickcommentbutton1(WebElement clickcommentbutton1) {
		this.clickcommentbutton1 = clickcommentbutton1;
	}

	public WebElement getClickcollapse() {
		return clickcollapse;
	}

	public void setClickcollapse(WebElement clickcollapse) {
		this.clickcollapse = clickcollapse;
	}

	public void setClickcomment(WebElement clickcomment) {
		this.clickcomment = clickcomment;
	}

	public WebElement getClicktextarea() {
		return clicktextarea;
	}

	public void setClicktextarea(WebElement clicktextarea) {
		this.clicktextarea = clicktextarea;
	}

	public WebElement getClickcommentbutton() {
		return clickcommentbutton;
	}

	public void setClickcommentbutton(WebElement clickcommentbutton) {
		this.clickcommentbutton = clickcommentbutton;
	}

	public WebElement getClickviewmoreactivity() {
		return clickviewmoreactivity;
	}

	public void setClickviewmoreactivity(WebElement clickviewmoreactivity) {
		this.clickviewmoreactivity = clickviewmoreactivity;
	}

	public WebElement getClickmorevert() {
		return clickmorevert;
	}

	public void setClickmorevert(WebElement clickmorevert) {
		this.clickmorevert = clickmorevert;
	}

	public WebElement getClickedit() {
		return clickedit;
	}

	public void setClickedit(WebElement clickedit) {
		this.clickedit = clickedit;
	}

	public WebElement getClickprojecttype() {
		return clickprojecttype;
	}

	public void setClickprojecttype(WebElement clickprojecttype) {
		this.clickprojecttype = clickprojecttype;
	}

	public WebElement getClickstaffaug() {
		return clickstaffaug;
	}

	public void setClickstaffaug(WebElement clickstaffaug) {
		this.clickstaffaug = clickstaffaug;
	}

	public WebElement getClickdevteam() {
		return clickdevteam;
	}

	public void setClickdevteam(WebElement clickdevteam) {
		this.clickdevteam = clickdevteam;
	}

	public WebElement getClickzibtek() {
		return clickzibtek;
	}

	public void setClickzibtek(WebElement clickzibtek) {
		this.clickzibtek = clickzibtek;
	}

	public WebElement getClicksavebutton() {
		return clicksavebutton;
	}

	public void setClicksavebutton(WebElement clicksavebutton) {
		this.clicksavebutton = clicksavebutton;
	}

	public WebElement getClickdealname2() {
		return clickdealname2;
	}

	public void setClickdealname2(WebElement clickdealname2) {
		this.clickdealname2 = clickdealname2;
	}

	public WebElement getClcikmorevert() {
		return clcikmorevert;
	}

	public void setClcikmorevert(WebElement clcikmorevert) {
		this.clcikmorevert = clcikmorevert;
	}

	public WebElement getClickdelete() {
		return clickdelete;
	}

	public void setClickdelete(WebElement clickdelete) {
		this.clickdelete = clickdelete;
	}

	public WebElement getClickcancle1() {
		return clickcancle1;
	}

	public void setClickcancle1(WebElement clickcancle1) {
		this.clickcancle1 = clickcancle1;
	}

	public WebElement getClickmorevert1() {
		return clickmorevert1;
	}

	public void setClickmorevert1(WebElement clickmorevert1) {
		this.clickmorevert1 = clickmorevert1;
	}

	public WebElement getClickdelete1() {
		return clickdelete1;
	}

	public void setClickdelete1(WebElement clickdelete1) {
		this.clickdelete1 = clickdelete1;
	}

	public WebElement getClickdelete2() {
		return clickdelete2;
	}

	public void setClickdelete2(WebElement clickdelete2) {
		this.clickdelete2 = clickdelete2;
	}

	public WebElement getClickaccount() {
		return clickaccount;
	}

	public void setClickaccount(WebElement clickaccount) {
		this.clickaccount = clickaccount;
	}

	public WebElement getSearchcompany() {
		return searchcompany;
	}

	public void setSearchcompany(WebElement searchcompany) {
		this.searchcompany = searchcompany;
	}

	public WebElement getClcikcompany() {
		return clcikcompany;
	}

	public void setClcikcompany(WebElement clcikcompany) {
		this.clcikcompany = clcikcompany;
	}
	
	
	
	
	
	
	
	
	
	
	
}
