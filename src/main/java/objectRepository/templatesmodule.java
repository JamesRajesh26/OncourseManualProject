package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class templatesmodule {
private WebDriver driver;
	
 public templatesmodule(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	
		
} 





//CREATE TEMPLATES MODULES	



@FindBy(xpath=("//img[@mattooltip='Templates']"))
private WebElement Clicktemplatemodule;

@FindBy(xpath=("//*[text()=' Template']"))
private WebElement clcikplustemplates;

@FindBy(xpath=("(//*[text()='Save'])[4]"))
private WebElement clicksavebutton;

@FindBy(id=("name"))
private WebElement createtemplatename;

@FindBy(xpath=("//*[text()='Select Content Type']"))
private WebElement clickcontenttype;

@FindBy(xpath=("//*[text()='E-Mail']"))
private WebElement selectemail;

@FindBy(xpath=("//*[text()='Share With Team?']"))
private WebElement clickshareplaceholder;

@FindBy(xpath=("//*[text()='My Account Only']"))
private WebElement selectaccountonly;

@FindBy(id=("owner_Id"))
private WebElement clickuserfield;

@FindBy(xpath=("//*[text()=' James Rajesh ']"))
private WebElement selectusername;

@FindBy(id=("archived"))
private WebElement clickarchived;

@FindBy(id=("archived"))
private WebElement clickarchived1;

@FindBy(xpath=("//div[@data-placeholder='Subject']"))
private WebElement clickaddsubject;

@FindBy(xpath=("//div[@data-placeholder='Enter the E-Mail template']"))
private WebElement clickandwriteemail;

@FindBy(xpath=("(//*[text()='Save'])[4]"))
private WebElement clicksavebutton1;


// pagination
@FindBy(xpath=("(//*[text()='10'])[2]"))
private WebElement clickvalue10;

@FindBy(xpath=("//*[text()=' 200 ']"))
private WebElement clcikvalue200;

@FindBy(xpath=("//input[@placeholder='Search Template']"))
private WebElement searchcreatedtemplates;

@FindBy(xpath=("//*[text()='Bottels']"))
private WebElement selecttemplates;

@FindBy(xpath=("(//*[text()=' Cancel '])[4]"))
private WebElement selectcanclebutton;

// create duplicate templates
@FindBy(xpath=("//*[text()='Duplicate']"))
private WebElement selectduplicate;

@FindBy(xpath=("(//*[text()=' Duplicate '])[1]"))
private WebElement confirmtheduplicate;

@FindBy(xpath=("(//*[text()='Save'])[4]"))
private WebElement savetheduplicate;

// delete duplicate template
@FindBy(xpath=("(//*[text()='Delete'])[3]"))
private WebElement clickdelete;

@FindBy(xpath=("//*[text()=' Delete ']"))
private WebElement clickdelete1;


// single select individual deactivate
@FindBy(xpath=("//p[text()='Deactivate']"))
private WebElement clickdeactivate;

//click active button to see all deactivate templates

@FindBy(xpath=("//span[text()='Active']"))
private WebElement clickactive2;

@FindBy(xpath=("//p[text()='Activate']"))
private WebElement clickactive;

@FindBy(xpath=("//*[text()='InActive']"))
private WebElement clickinactive;

// Edit Templates and save
@FindBy(xpath=("//p[text()='Edit']"))
private WebElement clickedit;

@FindBy(xpath=("(//*[text()=' Save '])[4]"))
private WebElement clicksave;

// Active Bulk Selection
@FindBy(xpath=("//label[@class='mat-checkbox-layout'][1]//div[1]"))
private WebElement clickcheckbox;

@FindBy(xpath=("//span[@data-target='#DeactivateTemplates']"))
private WebElement clickdeactive;

@FindBy(xpath=("(//*[text()=' CANCEL '])[2]"))
private WebElement clickcancle;

@FindBy(xpath=("//label[@class='mat-checkbox-layout'][1]//div[1]"))
private WebElement clickcheckbox1;

@FindBy(xpath=("//span[@data-target='#DeactivateTemplates']"))
private WebElement clickdeactive1;

@FindBy(xpath=("(//*[text()=' Deactivate '])"))
private WebElement clickdeactive2;

@FindBy(xpath=("//span[text()='Active']"))
private WebElement clickactive1;

// Deactivate bulk selection
@FindBy(xpath=("(//label[@class='mat-checkbox-layout'])[1]//div[1]"))
private WebElement clickcheckbox2;

@FindBy(xpath=("//span[@data-target='#ActivateTemplates']"))
private WebElement clickactivetemplates;

@FindBy(xpath=("(//*[text()=' CANCEL '])[3]"))
private WebElement clickcancle1;

@FindBy(xpath=("(//label[@class='mat-checkbox-layout'])[1]//div[1]"))
private WebElement clickcheckbox3;

@FindBy(xpath=("//span[@data-target='#ActivateTemplates']"))
private WebElement selectactivetemplates;

@FindBy(xpath=("//*[text()=' Activate ']"))
private WebElement selectactivate;

@FindBy(xpath=("//*[text()='InActive']"))
private WebElement selectinactive;

// bulk export
@FindBy(xpath=("//label[@class='mat-checkbox-layout'][1]//div[1]"))
private WebElement clickcheckbox4;

@FindBy(xpath=("//*[text()='exit_to_app']"))
private WebElement clickexitapp;

@FindBy(xpath=("(//input[@type='radio'])[1]"))
private WebElement clickradiobutton;

@FindBy(xpath=("(//*[text()=' Cancel '])[5]"))
private WebElement clickcanclebutton;

@FindBy(xpath=("//*[text()='exit_to_app']"))
private WebElement clickexitapp1;

@FindBy(xpath=("(//input[@type='radio'])[1]"))
private WebElement clickradio1;

@FindBy(xpath=("(//*[text()=' Send '])[1]"))
private WebElement clicksend;

@FindBy(xpath=("(//*[text()=' Ok '])[2]"))
private WebElement clickok;

// bulk delete

@FindBy(xpath=("//label[@class='mat-checkbox-layout'][1]//div[1]"))
private WebElement clickcheckbox5;

@FindBy(xpath=("(//*[text()='delete'])[1]"))
private WebElement clickdeletebutton;

@FindBy(xpath=("(//*[text()=' CANCEL '])[1]"))
private WebElement clickcancle2;

// Delete selected templates
@FindBy(xpath=("(//*[text()='Delete'])[3]"))
private WebElement clickdeletebutton1;

@FindBy(xpath=("//*[text()=' Delete ']"))
private WebElement clickdeletebutton2;

@FindBy(xpath=("//img[@alt='logo']"))
private WebElement clickaccounticon;




































public WebDriver getDriver() {
	return driver;
}

public void setDriver(WebDriver driver) {
	this.driver = driver;
}

public WebElement getClicktemplatemodule() {
	return Clicktemplatemodule;
}

public void setClicktemplatemodule(WebElement clicktemplatemodule) {
	Clicktemplatemodule = clicktemplatemodule;
}

public WebElement getClcikplustemplates() {
	return clcikplustemplates;
}

public void setClcikplustemplates(WebElement clcikplustemplates) {
	this.clcikplustemplates = clcikplustemplates;
}

public WebElement getClicksavebutton() {
	return clicksavebutton;
}

public void setClicksavebutton(WebElement clicksavebutton) {
	this.clicksavebutton = clicksavebutton;
}

public WebElement getCreatetemplatename() {
	return createtemplatename;
}

public void setCreatetemplatename(WebElement createtemplatename) {
	this.createtemplatename = createtemplatename;
}

public WebElement getClickcontenttype() {
	return clickcontenttype;
}

public void setClickcontenttype(WebElement clickcontenttype) {
	this.clickcontenttype = clickcontenttype;
}

public WebElement getSelectemail() {
	return selectemail;
}

public void setSelectemail(WebElement selectemail) {
	this.selectemail = selectemail;
}

public WebElement getClickshareplaceholder() {
	return clickshareplaceholder;
}

public void setClickshareplaceholder(WebElement clickshareplaceholder) {
	this.clickshareplaceholder = clickshareplaceholder;
}

public WebElement getSelectaccountonly() {
	return selectaccountonly;
}

public void setSelectaccountonly(WebElement selectaccountonly) {
	this.selectaccountonly = selectaccountonly;
}

public WebElement getClickuserfield() {
	return clickuserfield;
}

public void setClickuserfield(WebElement clickuserfield) {
	this.clickuserfield = clickuserfield;
}

public WebElement getSelectusername() {
	return selectusername;
}

public void setSelectusername(WebElement selectusername) {
	this.selectusername = selectusername;
}

public WebElement getClickarchived() {
	return clickarchived;
}

public void setClickarchived(WebElement clickarchived) {
	this.clickarchived = clickarchived;
}

public WebElement getClickarchived1() {
	return clickarchived1;
}

public void setClickarchived1(WebElement clickarchived1) {
	this.clickarchived1 = clickarchived1;
}

public WebElement getClickaddsubject() {
	return clickaddsubject;
}

public void setClickaddsubject(WebElement clickaddsubject) {
	this.clickaddsubject = clickaddsubject;
}

public WebElement getClickandwriteemail() {
	return clickandwriteemail;
}

public void setClickandwriteemail(WebElement clickandwriteemail) {
	this.clickandwriteemail = clickandwriteemail;
}

public WebElement getClicksavebutton1() {
	return clicksavebutton1;
}

public void setClicksavebutton1(WebElement clicksavebutton1) {
	this.clicksavebutton1 = clicksavebutton1;
}

public WebElement getClickvalue10() {
	return clickvalue10;
}

public void setClickvalue10(WebElement clickvalue10) {
	this.clickvalue10 = clickvalue10;
}

public WebElement getClcikvalue200() {
	return clcikvalue200;
}

public void setClcikvalue200(WebElement clcikvalue200) {
	this.clcikvalue200 = clcikvalue200;
}

public WebElement getSearchcreatedtemplates() {
	return searchcreatedtemplates;
}

public void setSearchcreatedtemplates(WebElement searchcreatedtemplates) {
	this.searchcreatedtemplates = searchcreatedtemplates;
}

public WebElement getSelecttemplates() {
	return selecttemplates;
}

public void setSelecttemplates(WebElement selecttemplates) {
	this.selecttemplates = selecttemplates;
}

public WebElement getSelectcanclebutton() {
	return selectcanclebutton;
}

public void setSelectcanclebutton(WebElement selectcanclebutton) {
	this.selectcanclebutton = selectcanclebutton;
}

public WebElement getSelectduplicate() {
	return selectduplicate;
}

public void setSelectduplicate(WebElement selectduplicate) {
	this.selectduplicate = selectduplicate;
}

public WebElement getConfirmtheduplicate() {
	return confirmtheduplicate;
}

public void setConfirmtheduplicate(WebElement confirmtheduplicate) {
	this.confirmtheduplicate = confirmtheduplicate;
}

public WebElement getSavetheduplicate() {
	return savetheduplicate;
}

public void setSavetheduplicate(WebElement savetheduplicate) {
	this.savetheduplicate = savetheduplicate;
}

public WebElement getClickdelete() {
	return clickdelete;
}

public void setClickdelete(WebElement clickdelete) {
	this.clickdelete = clickdelete;
}

public WebElement getClickdelete1() {
	return clickdelete1;
}

public void setClickdelete1(WebElement clickdelete1) {
	this.clickdelete1 = clickdelete1;
}



public WebElement getClickactive2() {
	return clickactive2;
}

public void setClickactive2(WebElement clickactive2) {
	this.clickactive2 = clickactive2;
}

public WebElement getClickdeactivate() {
	return clickdeactivate;
}

public void setClickdeactivate(WebElement clickdeactivate) {
	this.clickdeactivate = clickdeactivate;
}

public WebElement getClickactive() {
	return clickactive;
}

public void setClickactive(WebElement clickactive) {
	this.clickactive = clickactive;
}

public WebElement getClickinactive() {
	return clickinactive;
}

public void setClickinactive(WebElement clickinactive) {
	this.clickinactive = clickinactive;
}

public WebElement getClickedit() {
	return clickedit;
}

public void setClickedit(WebElement clickedit) {
	this.clickedit = clickedit;
}

public WebElement getClicksave() {
	return clicksave;
}

public void setClicksave(WebElement clicksave) {
	this.clicksave = clicksave;
}

public WebElement getClickcheckbox() {
	return clickcheckbox;
}

public void setClickcheckbox(WebElement clickcheckbox) {
	this.clickcheckbox = clickcheckbox;
}

public WebElement getClickdeactive() {
	return clickdeactive;
}

public void setClickdeactive(WebElement clickdeactive) {
	this.clickdeactive = clickdeactive;
}

public WebElement getClickcancle() {
	return clickcancle;
}

public void setClickcancle(WebElement clickcancle) {
	this.clickcancle = clickcancle;
}

public WebElement getClickcheckbox1() {
	return clickcheckbox1;
}

public void setClickcheckbox1(WebElement clickcheckbox1) {
	this.clickcheckbox1 = clickcheckbox1;
}

public WebElement getClickdeactive1() {
	return clickdeactive1;
}

public void setClickdeactive1(WebElement clickdeactive1) {
	this.clickdeactive1 = clickdeactive1;
}

public WebElement getClickdeactive2() {
	return clickdeactive2;
}

public void setClickdeactive2(WebElement clickdeactive2) {
	this.clickdeactive2 = clickdeactive2;
}

public WebElement getClickactive1() {
	return clickactive1;
}

public void setClickactive1(WebElement clickactive1) {
	this.clickactive1 = clickactive1;
}

public WebElement getClickcheckbox2() {
	return clickcheckbox2;
}

public void setClickcheckbox2(WebElement clickcheckbox2) {
	this.clickcheckbox2 = clickcheckbox2;
}

public WebElement getClickactivetemplates() {
	return clickactivetemplates;
}

public void setClickactivetemplates(WebElement clickactivetemplates) {
	this.clickactivetemplates = clickactivetemplates;
}

public WebElement getClickcancle1() {
	return clickcancle1;
}

public void setClickcancle1(WebElement clickcancle1) {
	this.clickcancle1 = clickcancle1;
}

public WebElement getClickcheckbox3() {
	return clickcheckbox3;
}

public void setClickcheckbox3(WebElement clickcheckbox3) {
	this.clickcheckbox3 = clickcheckbox3;
}

public WebElement getSelectactivetemplates() {
	return selectactivetemplates;
}

public void setSelectactivetemplates(WebElement selectactivetemplates) {
	this.selectactivetemplates = selectactivetemplates;
}

public WebElement getSelectactivate() {
	return selectactivate;
}

public void setSelectactivate(WebElement selectactivate) {
	this.selectactivate = selectactivate;
}

public WebElement getSelectinactive() {
	return selectinactive;
}

public void setSelectinactive(WebElement selectinactive) {
	this.selectinactive = selectinactive;
}

public WebElement getClickcheckbox4() {
	return clickcheckbox4;
}

public void setClickcheckbox4(WebElement clickcheckbox4) {
	this.clickcheckbox4 = clickcheckbox4;
}

public WebElement getClickexitapp() {
	return clickexitapp;
}

public void setClickexitapp(WebElement clickexitapp) {
	this.clickexitapp = clickexitapp;
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

public WebElement getClickexitapp1() {
	return clickexitapp1;
}

public void setClickexitapp1(WebElement clickexitapp1) {
	this.clickexitapp1 = clickexitapp1;
}

public WebElement getClickradio1() {
	return clickradio1;
}

public void setClickradio1(WebElement clickradio1) {
	this.clickradio1 = clickradio1;
}

public WebElement getClicksend() {
	return clicksend;
}

public void setClicksend(WebElement clicksend) {
	this.clicksend = clicksend;
}

public WebElement getClickok() {
	return clickok;
}

public void setClickok(WebElement clickok) {
	this.clickok = clickok;
}

public WebElement getClickcheckbox5() {
	return clickcheckbox5;
}

public void setClickcheckbox5(WebElement clickcheckbox5) {
	this.clickcheckbox5 = clickcheckbox5;
}

public WebElement getClickdeletebutton() {
	return clickdeletebutton;
}

public void setClickdeletebutton(WebElement clickdeletebutton) {
	this.clickdeletebutton = clickdeletebutton;
}

public WebElement getClickcancle2() {
	return clickcancle2;
}

public void setClickcancle2(WebElement clickcancle2) {
	this.clickcancle2 = clickcancle2;
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

public WebElement getClickaccounticon() {
	return clickaccounticon;
}

public void setClickaccounticon(WebElement clickaccounticon) {
	this.clickaccounticon = clickaccounticon;
}



































































}
