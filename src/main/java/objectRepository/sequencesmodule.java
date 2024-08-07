package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sequencesmodule {
private WebDriver driver;

public sequencesmodule(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}

public WebDriver getDriver() {
	return driver;
}

public void setDriver(WebDriver driver) {
	this.driver = driver;
}
 
//Search Module
@FindBy(xpath=("//img[@mattooltip='Sequences']"))
private WebElement clickSequencesmodule;


@FindBy(xpath=("//*[text()=' Sequence']"))
private WebElement clickplussequences;

@FindBy(xpath=("//input[@placeholder='Sequence Name']"))
private WebElement addsequencesname;

@FindBy(xpath=("(//*[text()='Save'])[5]"))
private WebElement clicksavebutton;

@FindBy(xpath=("//mat-select[@formcontrolname='preferred_timezone']"))
private WebElement clicktimezone;

@FindBy(xpath=("//*[text()=' (GMT+05:30) India Standard Time - Colombo ']"))
private WebElement selectindiantimezone;

@FindBy(xpath=("//mat-select[@formcontrolname='preferred_time']"))
private WebElement clickpreferrdtime;

@FindBy(xpath=("//*[text()='9 am-5 pm']"))
private WebElement slectpreferredtime;

@FindBy(xpath=("//*[text()='TU '] "))
private WebElement selecttuesday;

@FindBy(xpath=("//*[text()='TU '] "))
private WebElement unselecttuesday;

@FindBy(id=("mat-slide-toggle-1"))
private WebElement subscribetoggle;

@FindBy(id=("mat-slide-toggle-1"))
private WebElement unsunscribetoggle;

@FindBy(xpath=("(//input[@type='number'])[3]"))
private WebElement selectday;

@FindBy(xpath=("(//*[text()='Save'])[5]"))
private WebElement clicksavebutton1;

@FindBy(xpath=("//*[text()='Save ']"))
private WebElement clicksavebutton2;

//select automated option

@FindBy(xpath=("(//mat-select[@formcontrolname='notificationType'])[1]"))
private WebElement selectcontenttype;

@FindBy(xpath=("//*[text()=' Email']"))
private WebElement selectemail;

@FindBy(xpath=("(//mat-select[@formcontrolname='template_Id'])[1]"))
private WebElement clicktemplateid;

@FindBy(xpath=("//*[text()=' Samsung Mobile ']"))
private WebElement selectsearch;

@FindBy(xpath=("(//*[text()='Delete'])[3]"))
private WebElement clickdeletebutton;

@FindBy(xpath=("//*[text()='+ Add New Step']"))
private WebElement addnewstep;

@FindBy(xpath=("(//input[@type='number'])[3]"))
private WebElement adddaynukmber;

@FindBy(xpath=("(//*[text()='Save'])[5]"))
private WebElement clicksavebutton3;

// select automated option

@FindBy(xpath=("(//mat-select[@formcontrolname='notificationType'])[1]"))
private WebElement selectcontenttype1;

@FindBy(xpath=("//*[text()=' Email']"))
private WebElement selectemail1;

@FindBy(xpath=("(//mat-select[@formcontrolname='template_Id'])[1]"))
private WebElement clicktemplateid1;

@FindBy(xpath=("//*[text()=' Samsung Mobile ']"))
private WebElement selectsearch1;

@FindBy(xpath=("(//mat-select[@formcontrolname='template_Id'])[1]"))
private WebElement clicktemplateid2;

@FindBy(xpath=("//button[@class='newtempbtn']"))
private WebElement clicknewtemplate;

@FindBy(xpath=("//input[@placeholder='Template Name']"))
private WebElement clicktemplatename;

@FindBy(xpath=("(//*[text()='Select Content Type'])[2]"))
private WebElement clickcontenttype;

@FindBy(xpath=("//*[text()='E-Mail']"))
private WebElement selectemail2;

@FindBy(id=("owner_Id"))
private WebElement clickownerid;

@FindBy(xpath=("(//*[text()=' James Rajesh '])[1]"))
private WebElement selectusername;

@FindBy(xpath=("//*[text()='Share With Team?']"))
private WebElement clickonsharewithteam;

@FindBy(xpath=("//*[text()='My Account Only']"))
private WebElement clickmyaccountonly;

@FindBy(xpath=("//div[@data-placeholder='Subject']"))
private WebElement clicksubject;

@FindBy(xpath=("(//div[@data-placeholder='Enter the Email template'])[2]"))
private WebElement clickontemplates;

@FindBy(xpath=("(//*[text()='Save'])[5]"))
private WebElement clicksavebutton4;

@FindBy(xpath=("//*[text()='Save ']"))
private WebElement clicksavebutton5;

@FindBy(xpath=("//*[text()='+ Add New Step']"))
private WebElement clickaddnewsteps;

@FindBy(xpath=("(//input[@type='number'])[3]"))
private WebElement addnumbers;

@FindBy(xpath=("(//*[text()='Save'])[5]"))
private WebElement clicksave;

@FindBy(xpath=("(//mat-select[@formcontrolname='system'])[1]"))
private WebElement clickselectsystem;

@FindBy(xpath=("//*[text()=' Manual ']"))
private WebElement clickmanual;

@FindBy(xpath=("(//mat-select[@formcontrolname='notificationType'])[1]"))
private WebElement selectcontenttype2;

@FindBy(xpath=("//*[text()=' Task']"))
private WebElement clicktask;

@FindBy(xpath=("(//mat-select[@formcontrolname='template_Id'])[1]"))
private WebElement clicknewtemplate1;

@FindBy(xpath=("(//*[text()=' Manual Testing '])[1]"))
private WebElement selectusertemplate;

@FindBy(xpath=("(//*[text()='Save '])[1]"))
private WebElement clicksave1;

@FindBy(xpath=("(//*[text()='Save'])[4]"))
private WebElement clicksave2;

@FindBy(xpath=("(//*[text()='10'])[2]"))
private WebElement clickpagination;

@FindBy(xpath=("//*[text()=' 200 ']"))
private WebElement selectpagination;

@FindBy(xpath=("//img[@alt='logo']"))
private WebElement clickhomepage;

@FindBy(xpath=("(//input[@placeholder='Search'])[2]"))
private WebElement searchcompany;

@FindBy(xpath=("//*[text()='Testing automation 2']"))
private WebElement selectcompany;

@FindBy(xpath=("(//*[text()='add_circle_outline' ])[4]"))
private WebElement clicksequencesbutton;

@FindBy(xpath=("//*[text()='Start']"))
private WebElement clickstartbutton;

@FindBy(xpath=("//*[text()='Select Sequence']"))
private WebElement clickselectsequences;

@FindBy(xpath=("(//*[text()=' Samsung'])[1]"))
private WebElement chooseanysequences;

@FindBy(xpath=("//*[@class='ng-input']//following::ng-select[13]//div[1]"))
private WebElement clickselectcontact;

@FindBy(xpath=("(//*[text()='Automation'])[1]"))
private WebElement selectcontactname;

@FindBy(xpath=("(//*[@formcontrolname='from'])[2]"))
private WebElement clickselectsender;

@FindBy(xpath=("//mat-option[@role='option']//span[1]"))
private WebElement choosesenderemail;

@FindBy(xpath=("//*[text()='Start']"))
private WebElement clickstartbutton1;

// view sequences
@FindBy(xpath=("//*[text()='View in sequences']"))
private WebElement clickviewsequences;

@FindBy(xpath=("(//*[text()='10'])[2]"))
private WebElement clickpagination1;

@FindBy(xpath=("//*[text()=' 200 ']"))
private WebElement selectpagination2;

@FindBy(xpath=("(//a[text()=' Samsung '])//following::td[1]"))
private WebElement clickselectedsequences;

// pause and resends sequences
@FindBy(xpath=("(//tr[@class='ng-star-inserted'])//mat-checkbox//label[1]"))
private WebElement clickcheckbox;

@FindBy(xpath=("//*[text()='Pause Sequence']"))
private WebElement clickpausebutton;

@FindBy(xpath=("(//tr[@class='ng-star-inserted'])//mat-checkbox//label[1]"))
private WebElement clickcheckbox1;

@FindBy(xpath=("//*[text()='Make Active']"))
private WebElement clickactive;

@FindBy(xpath=("(//tr[@class='ng-star-inserted'])//mat-checkbox//label[1]"))
private WebElement clickcheckbox2;

@FindBy(xpath=("(//*[text()='Resend Campaign'])[1]"))
private WebElement clickresendbutton;

@FindBy(xpath=("//*[text()='Select Sender']"))
private WebElement clickselectsender1;

@FindBy(xpath=("//*[text()='james@zibtek.in ']"))
private WebElement selectemail3;

@FindBy(xpath=("(//*[text()='Resend Campaign'])[2]"))
private WebElement clickresendcampaign;


//Export individual
@FindBy(xpath=("(//a[text()=' Samsung '])//following::td[1]"))
private WebElement clickselectsequences1;

@FindBy(xpath=("(//*[text()='Export'])[1]"))
private WebElement clickexport;

@FindBy(xpath=("(//input[@type='radio'])[3]"))
private WebElement clickradiobutton;

@FindBy(xpath=("(//*[text()='Cancel'])[8]"))
private WebElement clickcanclebutton;

@FindBy(xpath=("(//*[text()='Export'])[1]"))
private WebElement clickexportbutton;

@FindBy(xpath=("(//input[@type='radio'])[3]"))
private WebElement clickradiobutton1;

@FindBy(xpath=("(//*[text()='Export'])[5]"))
private WebElement clickexportbutton1; 

@FindBy(xpath=("(//*[text()='Ok '])[2]"))
private WebElement clickokbutton;


// Export

@FindBy(id=("sequence-pos"))
private WebElement clickselectseq;

// Multiple export

@FindBy(xpath=("(//label[@class='mat-checkbox-layout'])[1]//div[1]"))
private WebElement clickmulticheckbox;

@FindBy(xpath=("//*[text()='exit_to_app']"))
private WebElement clickexitapp;

@FindBy(xpath=("(//input[@type='radio'])[5]"))
private WebElement clickradiobutton3;

@FindBy(xpath=("(//*[text()='Export'])[8]"))
private WebElement clcikexport;

@FindBy(xpath=("(//*[text()='Ok '])[3]"))
private WebElement clickok;
 

// sequences move from active to inactive

//@FindBy(xpath=("(//mat-checkbox[@type='checkbox'])//label//div[1]"))
//private WebElement clickcheckbox6;

@FindBy(xpath=("//span[@mattooltip='Deactivate']"))
private WebElement clickdeactivate;

@FindBy(xpath=("//*[text()=' Deactivate ']"))
private WebElement clcikdeactive2;


// sequences move from inactive to active

@FindBy(xpath=("(//span[text()='Active'])[1]"))
private WebElement clcikactivebutton;

@FindBy(xpath=("(//*[text()='10'])[2]"))
private WebElement clickpagination2;

@FindBy(xpath=("//*[text()=' 200 ']"))
private WebElement clcikpagination3;

@FindBy(xpath=("(//mat-checkbox[@type='checkbox'])[1]"))
private WebElement clickcheckbox7;

@FindBy(xpath=("//span[@mattooltip='Activate'][1]"))
private WebElement clickactivebutton;

@FindBy(xpath=("//*[text()=' Activate ']"))
private WebElement clickactivebutton2; 

@FindBy(xpath=("//*[text()='Deactive']"))
private WebElement clcikdeactive;


// Pagination Active sequences

@FindBy(xpath=("(//*[text()='10'])[2]"))
private WebElement clickpagination3;

@FindBy(xpath=("//*[text()=' 200 ']"))
private WebElement clickpagination4;

@FindBy(xpath=("(//td[@class='check-user'])[2]//mat-checkbox"))
private WebElement clickcheckbox8;

// Delete Sequences

@FindBy(xpath=("//*[text()='delete']"))
private WebElement clickdeletebutton1;

@FindBy(xpath=("//*[text()=' DELETE ']"))
private WebElement clickdeletebutton2;

@FindBy(xpath=("//img[@alt='logo']"))
private WebElement clickaccountpage;








public WebElement getClickSequencesmodule() {
	return clickSequencesmodule;
}

public void setClickSequencesmodule(WebElement clickSequencesmodule) {
	this.clickSequencesmodule = clickSequencesmodule;
}

public WebElement getClickplussequences() {
	return clickplussequences;
}

public void setClickplussequences(WebElement clickplussequences) {
	this.clickplussequences = clickplussequences;
}

public WebElement getAddsequencesname() {
	return addsequencesname;
}

public void setAddsequencesname(WebElement addsequencesname) {
	this.addsequencesname = addsequencesname;
}

public WebElement getClicksavebutton() {
	return clicksavebutton;
}

public void setClicksavebutton(WebElement clicksavebutton) {
	this.clicksavebutton = clicksavebutton;
}

public WebElement getClicktimezone() {
	return clicktimezone;
}

public void setClicktimezone(WebElement clicktimezone) {
	this.clicktimezone = clicktimezone;
}

public WebElement getSelectindiantimezone() {
	return selectindiantimezone;
}

public void setSelectindiantimezone(WebElement selectindiantimezone) {
	this.selectindiantimezone = selectindiantimezone;
}

public WebElement getClickpreferrdtime() {
	return clickpreferrdtime;
}

public void setClickpreferrdtime(WebElement clickpreferrdtime) {
	this.clickpreferrdtime = clickpreferrdtime;
}

public WebElement getSlectpreferredtime() {
	return slectpreferredtime;
}

public void setSlectpreferredtime(WebElement slectpreferredtime) {
	this.slectpreferredtime = slectpreferredtime;
}

public WebElement getSelecttuesday() {
	return selecttuesday;
}

public void setSelecttuesday(WebElement selecttuesday) {
	this.selecttuesday = selecttuesday;
}

public WebElement getUnselecttuesday() {
	return unselecttuesday;
}

public void setUnselecttuesday(WebElement unselecttuesday) {
	this.unselecttuesday = unselecttuesday;
}

public WebElement getSubscribetoggle() {
	return subscribetoggle;
}

public void setSubscribetoggle(WebElement subscribetoggle) {
	this.subscribetoggle = subscribetoggle;
}

public WebElement getUnsunscribetoggle() {
	return unsunscribetoggle;
}

public void setUnsunscribetoggle(WebElement unsunscribetoggle) {
	this.unsunscribetoggle = unsunscribetoggle;
}

public WebElement getSelectday() {
	return selectday;
}

public void setSelectday(WebElement selectday) {
	this.selectday = selectday;
}

public WebElement getClicksavebutton1() {
	return clicksavebutton1;
}

public void setClicksavebutton1(WebElement clicksavebutton1) {
	this.clicksavebutton1 = clicksavebutton1;
}

public WebElement getClicksavebutton2() {
	return clicksavebutton2;
}

public void setClicksavebutton2(WebElement clicksavebutton2) {
	this.clicksavebutton2 = clicksavebutton2;
}

public WebElement getSelectcontenttype() {
	return selectcontenttype;
}

public void setSelectcontenttype(WebElement selectcontenttype) {
	this.selectcontenttype = selectcontenttype;
}

public WebElement getSelectemail() {
	return selectemail;
}

public void setSelectemail(WebElement selectemail) {
	this.selectemail = selectemail;
}

public WebElement getClicktemplateid() {
	return clicktemplateid;
}

public void setClicktemplateid(WebElement clicktemplateid) {
	this.clicktemplateid = clicktemplateid;
}

public WebElement getSelectsearch() {
	return selectsearch;
}

public void setSelectsearch(WebElement selectsearch) {
	this.selectsearch = selectsearch;
}

public WebElement getClickdeletebutton() {
	return clickdeletebutton;
}

public void setClickdeletebutton(WebElement clickdeletebutton) {
	this.clickdeletebutton = clickdeletebutton;
}

public WebElement getAddnewstep() {
	return addnewstep;
}

public void setAddnewstep(WebElement addnewstep) {
	this.addnewstep = addnewstep;
}

public WebElement getAdddaynukmber() {
	return adddaynukmber;
}

public void setAdddaynukmber(WebElement adddaynukmber) {
	this.adddaynukmber = adddaynukmber;
}

public WebElement getClicksavebutton3() {
	return clicksavebutton3;
}

public void setClicksavebutton3(WebElement clicksavebutton3) {
	this.clicksavebutton3 = clicksavebutton3;
}

public WebElement getSelectcontenttype1() {
	return selectcontenttype1;
}

public void setSelectcontenttype1(WebElement selectcontenttype1) {
	this.selectcontenttype1 = selectcontenttype1;
}

public WebElement getSelectemail1() {
	return selectemail1;
}

public void setSelectemail1(WebElement selectemail1) {
	this.selectemail1 = selectemail1;
}

public WebElement getClicktemplateid1() {
	return clicktemplateid1;
}

public void setClicktemplateid1(WebElement clicktemplateid1) {
	this.clicktemplateid1 = clicktemplateid1;
}

public WebElement getSelectsearch1() {
	return selectsearch1;
}

public void setSelectsearch1(WebElement selectsearch1) {
	this.selectsearch1 = selectsearch1;
}

public WebElement getClicktemplateid2() {
	return clicktemplateid2;
}

public void setClicktemplateid2(WebElement clicktemplateid2) {
	this.clicktemplateid2 = clicktemplateid2;
}

public WebElement getClicknewtemplate() {
	return clicknewtemplate;
}

public void setClicknewtemplate(WebElement clicknewtemplate) {
	this.clicknewtemplate = clicknewtemplate;
}

public WebElement getClicktemplatename() {
	return clicktemplatename;
}

public void setClicktemplatename(WebElement clicktemplatename) {
	this.clicktemplatename = clicktemplatename;
}

public WebElement getClickcontenttype() {
	return clickcontenttype;
}

public void setClickcontenttype(WebElement clickcontenttype) {
	this.clickcontenttype = clickcontenttype;
}

public WebElement getSelectemail2() {
	return selectemail2;
}

public void setSelectemail2(WebElement selectemail2) {
	this.selectemail2 = selectemail2;
}

public WebElement getClickownerid() {
	return clickownerid;
}

public void setClickownerid(WebElement clickownerid) {
	this.clickownerid = clickownerid;
}

public WebElement getSelectusername() {
	return selectusername;
}

public void setSelectusername(WebElement selectusername) {
	this.selectusername = selectusername;
}

public WebElement getClickonsharewithteam() {
	return clickonsharewithteam;
}

public void setClickonsharewithteam(WebElement clickonsharewithteam) {
	this.clickonsharewithteam = clickonsharewithteam;
}

public WebElement getClickmyaccountonly() {
	return clickmyaccountonly;
}

public void setClickmyaccountonly(WebElement clickmyaccountonly) {
	this.clickmyaccountonly = clickmyaccountonly;
}

public WebElement getClicksubject() {
	return clicksubject;
}

public void setClicksubject(WebElement clicksubject) {
	this.clicksubject = clicksubject;
}

public WebElement getClickontemplates() {
	return clickontemplates;
}

public void setClickontemplates(WebElement clickontemplates) {
	this.clickontemplates = clickontemplates;
}

public WebElement getClicksavebutton4() {
	return clicksavebutton4;
}

public void setClicksavebutton4(WebElement clicksavebutton4) {
	this.clicksavebutton4 = clicksavebutton4;
}

public WebElement getClicksavebutton5() {
	return clicksavebutton5;
}

public void setClicksavebutton5(WebElement clicksavebutton5) {
	this.clicksavebutton5 = clicksavebutton5;
}

public WebElement getClickaddnewsteps() {
	return clickaddnewsteps;
}

public void setClickaddnewsteps(WebElement clickaddnewsteps) {
	this.clickaddnewsteps = clickaddnewsteps;
}

public WebElement getAddnumbers() {
	return addnumbers;
}

public void setAddnumbers(WebElement addnumbers) {
	this.addnumbers = addnumbers;
}

public WebElement getClicksave() {
	return clicksave;
}

public void setClicksave(WebElement clicksave) {
	this.clicksave = clicksave;
}

public WebElement getClickselectsystem() {
	return clickselectsystem;
}

public void setClickselectsystem(WebElement clickselectsystem) {
	this.clickselectsystem = clickselectsystem;
}

public WebElement getClickmanual() {
	return clickmanual;
}

public void setClickmanual(WebElement clickmanual) {
	this.clickmanual = clickmanual;
}

public WebElement getSelectcontenttype2() {
	return selectcontenttype2;
}

public void setSelectcontenttype2(WebElement selectcontenttype2) {
	this.selectcontenttype2 = selectcontenttype2;
}

public WebElement getClicktask() {
	return clicktask;
}

public void setClicktask(WebElement clicktask) {
	this.clicktask = clicktask;
}

public WebElement getClicknewtemplate1() {
	return clicknewtemplate1;
}

public void setClicknewtemplate1(WebElement clicknewtemplate1) {
	this.clicknewtemplate1 = clicknewtemplate1;
}

public WebElement getSelectusertemplate() {
	return selectusertemplate;
}

public void setSelectusertemplate(WebElement selectusertemplate) {
	this.selectusertemplate = selectusertemplate;
}

public WebElement getClicksave1() {
	return clicksave1;
}

public void setClicksave1(WebElement clicksave1) {
	this.clicksave1 = clicksave1;
}

public WebElement getClicksave2() {
	return clicksave2;
}

public void setClicksave2(WebElement clicksave2) {
	this.clicksave2 = clicksave2;
}

public WebElement getClickpagination() {
	return clickpagination;
}

public void setClickpagination(WebElement clickpagination) {
	this.clickpagination = clickpagination;
}

public WebElement getSelectpagination() {
	return selectpagination;
}

public void setSelectpagination(WebElement selectpagination) {
	this.selectpagination = selectpagination;
}

public WebElement getClickhomepage() {
	return clickhomepage;
}

public void setClickhomepage(WebElement clickhomepage) {
	this.clickhomepage = clickhomepage;
}

public WebElement getSearchcompany() {
	return searchcompany;
}

public void setSearchcompany(WebElement searchcompany) {
	this.searchcompany = searchcompany;
}

public WebElement getSelectcompany() {
	return selectcompany;
}

public void setSelectcompany(WebElement selectcompany) {
	this.selectcompany = selectcompany;
}

public WebElement getClicksequencesbutton() {
	return clicksequencesbutton;
}

public void setClicksequencesbutton(WebElement clicksequencesbutton) {
	this.clicksequencesbutton = clicksequencesbutton;
}

public WebElement getClickstartbutton() {
	return clickstartbutton;
}

public void setClickstartbutton(WebElement clickstartbutton) {
	this.clickstartbutton = clickstartbutton;
}

public WebElement getClickselectsequences() {
	return clickselectsequences;
}

public void setClickselectsequences(WebElement clickselectsequences) {
	this.clickselectsequences = clickselectsequences;
}

public WebElement getChooseanysequences() {
	return chooseanysequences;
}

public void setChooseanysequences(WebElement chooseanysequences) {
	this.chooseanysequences = chooseanysequences;
}

public WebElement getClickselectcontact() {
	return clickselectcontact;
}

public void setClickselectcontact(WebElement clickselectcontact) {
	this.clickselectcontact = clickselectcontact;
}

public WebElement getSelectcontactname() {
	return selectcontactname;
}

public void setSelectcontactname(WebElement selectcontactname) {
	this.selectcontactname = selectcontactname;
}

public WebElement getClickselectsender() {
	return clickselectsender;
}

public void setClickselectsender(WebElement clickselectsender) {
	this.clickselectsender = clickselectsender;
}

public WebElement getChoosesenderemail() {
	return choosesenderemail;
}

public void setChoosesenderemail(WebElement choosesenderemail) {
	this.choosesenderemail = choosesenderemail;
}

public WebElement getClickstartbutton1() {
	return clickstartbutton1;
}

public void setClickstartbutton1(WebElement clickstartbutton1) {
	this.clickstartbutton1 = clickstartbutton1;
}

public WebElement getClickviewsequences() {
	return clickviewsequences;
}

public void setClickviewsequences(WebElement clickviewsequences) {
	this.clickviewsequences = clickviewsequences;
}

public WebElement getClickpagination1() {
	return clickpagination1;
}

public void setClickpagination1(WebElement clickpagination1) {
	this.clickpagination1 = clickpagination1;
}

public WebElement getSelectpagination2() {
	return selectpagination2;
}

public void setSelectpagination2(WebElement selectpagination2) {
	this.selectpagination2 = selectpagination2;
}

public WebElement getClickselectedsequences() {
	return clickselectedsequences;
}

public void setClickselectedsequences(WebElement clickselectedsequences) {
	this.clickselectedsequences = clickselectedsequences;
}

public WebElement getClickcheckbox() {
	return clickcheckbox;
}

public void setClickcheckbox(WebElement clickcheckbox) {
	this.clickcheckbox = clickcheckbox;
}

public WebElement getClickpausebutton() {
	return clickpausebutton;
}

public void setClickpausebutton(WebElement clickpausebutton) {
	this.clickpausebutton = clickpausebutton;
}

public WebElement getClickcheckbox1() {
	return clickcheckbox1;
}

public void setClickcheckbox1(WebElement clickcheckbox1) {
	this.clickcheckbox1 = clickcheckbox1;
}

public WebElement getClickactive() {
	return clickactive;
}

public void setClickactive(WebElement clickactive) {
	this.clickactive = clickactive;
}

public WebElement getClickcheckbox2() {
	return clickcheckbox2;
}

public void setClickcheckbox2(WebElement clickcheckbox2) {
	this.clickcheckbox2 = clickcheckbox2;
}

public WebElement getClickresendbutton() {
	return clickresendbutton;
}

public void setClickresendbutton(WebElement clickresendbutton) {
	this.clickresendbutton = clickresendbutton;
}

public WebElement getClickselectsender1() {
	return clickselectsender1;
}

public void setClickselectsender1(WebElement clickselectsender1) {
	this.clickselectsender1 = clickselectsender1;
}

public WebElement getSelectemail3() {
	return selectemail3;
}

public void setSelectemail3(WebElement selectemail3) {
	this.selectemail3 = selectemail3;
}

public WebElement getClickresendcampaign() {
	return clickresendcampaign;
}

public void setClickresendcampaign(WebElement clickresendcampaign) {
	this.clickresendcampaign = clickresendcampaign;
}

public WebElement getClickselectsequences1() {
	return clickselectsequences1;
}

public void setClickselectsequences1(WebElement clickselectsequences1) {
	this.clickselectsequences1 = clickselectsequences1;
}

public WebElement getClickexport() {
	return clickexport;
}

public void setClickexport(WebElement clickexport) {
	this.clickexport = clickexport;
}

public WebElement getClickradiobutton() {
	return clickradiobutton;
}

public void setClickradiobutton(WebElement clickradiobutton) {
	this.clickradiobutton = clickradiobutton;
}

public WebElement getClickcanclebutton() {
	return clickcanclebutton;
}

public void setClickcanclebutton(WebElement clickcanclebutton) {
	this.clickcanclebutton = clickcanclebutton;
}

public WebElement getClickexportbutton() {
	return clickexportbutton;
}

public void setClickexportbutton(WebElement clickexportbutton) {
	this.clickexportbutton = clickexportbutton;
}

public WebElement getClickradiobutton1() {
	return clickradiobutton1;
}

public void setClickradiobutton1(WebElement clickradiobutton1) {
	this.clickradiobutton1 = clickradiobutton1;
}

public WebElement getClickexportbutton1() {
	return clickexportbutton1;
}

public void setClickexportbutton1(WebElement clickexportbutton1) {
	this.clickexportbutton1 = clickexportbutton1;
}

public WebElement getClickokbutton() {
	return clickokbutton;
}

public void setClickokbutton(WebElement clickokbutton) {
	this.clickokbutton = clickokbutton;
}


public WebElement getClickdeletebutton1() {
	return clickdeletebutton1;
}

public void setClickdeletebutton1(WebElement clickdeletebutton1) {
	this.clickdeletebutton1 = clickdeletebutton1;
}

public WebElement getClickdeletebutton2() {
	return clickdeletebutton2;
}

public void setClickdeletebutton2(WebElement clickdeletebutton2) {
	this.clickdeletebutton2 = clickdeletebutton2;
}
public WebElement getClickmulticheckbox() {
	return clickmulticheckbox;
}
public void setClickmulticheckbox(WebElement clickmulticheckbox) {
	this.clickmulticheckbox = clickmulticheckbox;
}
public WebElement getClickexitapp() {
	return clickexitapp;
}
public void setClickexitapp(WebElement clickexitapp) {
	this.clickexitapp = clickexitapp;
}
public WebElement getClickradiobutton3() {
	return clickradiobutton3;
}
public void setClickradiobutton3(WebElement clickradiobutton3) {
	this.clickradiobutton3 = clickradiobutton3;
}
public WebElement getClcikexport() {
	return clcikexport;
}
public void setClcikexport(WebElement clcikexport) {
	this.clcikexport = clcikexport;
}
public WebElement getClickok() {
	return clickok;
}
public void setClickok(WebElement clickok) {
	this.clickok = clickok;
}
//public WebElement getClickcheckbox6() {
//	return clickcheckbox6;
//}
//public void setClickcheckbox6(WebElement clickcheckbox6) {
//	this.clickcheckbox6 = clickcheckbox6;
//}
public WebElement getClickdeactivate() {
	return clickdeactivate;
}
public void setClickdeactivate(WebElement clickdeactivate) {
	this.clickdeactivate = clickdeactivate;
}
public WebElement getClcikdeactive2() {
	return clcikdeactive2;
}
public void setClcikdeactive2(WebElement clcikdeactive2) {
	this.clcikdeactive2 = clcikdeactive2;
}
public WebElement getClcikactivebutton() {
	return clcikactivebutton;
}
public void setClcikactivebutton(WebElement clcikactivebutton) {
	this.clcikactivebutton = clcikactivebutton;
}
public WebElement getClickpagination2() {
	return clickpagination2;
}
public void setClickpagination2(WebElement clickpagination2) {
	this.clickpagination2 = clickpagination2;
}
public WebElement getClcikpagination3() {
	return clcikpagination3;
}
public void setClcikpagination3(WebElement clcikpagination3) {
	this.clcikpagination3 = clcikpagination3;
}
public WebElement getClickcheckbox7() {
	return clickcheckbox7;
}
public void setClickcheckbox7(WebElement clickcheckbox7) {
	this.clickcheckbox7 = clickcheckbox7;
}
public WebElement getClickactivebutton() {
	return clickactivebutton;
}
public void setClickactivebutton(WebElement clickactivebutton) {
	this.clickactivebutton = clickactivebutton;
}
public WebElement getClickactivebutton2() {
	return clickactivebutton2;
}
public void setClickactivebutton2(WebElement clickactivebutton2) {
	this.clickactivebutton2 = clickactivebutton2;
}
public WebElement getClcikdeactive() {
	return clcikdeactive;
}
public void setClcikdeactive(WebElement clcikdeactive) {
	this.clcikdeactive = clcikdeactive;
}
public WebElement getClickpagination3() {
	return clickpagination3;
}
public void setClickpagination3(WebElement clickpagination3) {
	this.clickpagination3 = clickpagination3;
}
public WebElement getClickpagination4() {
	return clickpagination4;
}
public void setClickpagination4(WebElement clickpagination4) {
	this.clickpagination4 = clickpagination4;
}
public WebElement getClickcheckbox8() {
	return clickcheckbox8;
}
public void setClickcheckbox8(WebElement clickcheckbox8) {
	this.clickcheckbox8 = clickcheckbox8;
}

public WebElement getClickaccountpage() {
	return clickaccountpage;
}

public void setClickaccountpage(WebElement clickaccountpage) {
	this.clickaccountpage = clickaccountpage;
}

public WebElement getClickselectseq() {
	return clickselectseq;
}

public void setClickselectseq(WebElement clickselectseq) {
	this.clickselectseq = clickselectseq;
}
















}

