package testScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericMethods.baseclass;
import genericMethods.screenshot;
import objectRepository.loginmodule;
@Listeners(screenshot.class)
public class logintestcase extends baseclass {

	
		private WebDriver driver;
		@BeforeMethod
		public void browsersetup() throws InterruptedException {
			loadPropertiesFile();
			driver=initializeAndOpenBrowser(prop.getProperty("browser"));
		}
		@AfterMethod
		public void quitt() throws InterruptedException {
			Thread.sleep(2000);
		}
		public WebDriver getDriver() {
			return driver;  
		}
		public void setDriver(WebDriver driver) {
			this.driver = driver;
		}

		
		
		
		
		

			
	@Test
	public void testcase () throws InterruptedException  {
	loginmodule page = new loginmodule(driver);

	try {
		//Create a Robot instance to simulate keyboard inputs.
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);

		//Simulate pressing the "Minus" key twice.
			 robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_MINUS);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_MINUS);

		//Simulate releasing the "Ctrl" key.
		robot.keyRelease(KeyEvent.VK_CONTROL);
		} catch (AWTException e) {
		e.printStackTrace();
		}

	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.manage().window().maximize();
	driver.get("https://app.tryoncourse.com/sign-in");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		Actions actions = new Actions(driver); 
	
	
	
	// LOGIN PAGE
/*
	//Thread.sleep(2000);
	page.getLoginID().sendKeys("james@zibtek.in");

	//Thread.sleep(3000);
	page.getLoginPassword().sendKeys("123456");

	//Thread.sleep(3000);
	page.getSignin().click();

	//Thread.sleep(2000);
	page.getClearPassword().clear();

	//Thread.sleep(2000);
	page.getClearEmail().clear();

	//wrong email
	//Thread.sleep(4000);
	page.getAddEmail().sendKeys("james@zibtek.co");

	//Thread.sleep(2000);
	page.getAddPassword().sendKeys("zibtek2023");

	//Thread.sleep(2000);
	page.getSignin1().click();

	//Thread.sleep(2000);
	page.getClearEmail1().clear();

	//wrong password
	//Thread.sleep(2000);
	page.getAddEmail1().sendKeys("james@zibetk.in");

	//Thread.sleep(2000);
	page.getClearPassword1().clear();

	//Thread.sleep(4000);
	page.getAddPassword1().sendKeys("123456");

	//Thread.sleep(4000);
	page.getSignin2().click();

	// forgot password and reset password
	//Thread.sleep(2000);
	page.getClickForgotPassword().click();

	//Thread.sleep(4000);
	page.getAddEmail2().sendKeys("james@zibtek.co");

	//Thread.sleep(4000);
	page.getResetPassword().click();

	//Thread.sleep(2000);
	page.getClearEmail2().clear();

	//Thread.sleep(3000);
	page.getAddEmail3().sendKeys("james@zibtek.in");

	//Thread.sleep(4000);
	page.getResetPassword1().click();

	//Thread.sleep(3000);
	page.getBackToSignin().click(); 

*/	
	// valid email and password
	//Thread.sleep(3000);
	page.getAddEmail4().sendKeys("james@zibtek.in");

	//Thread.sleep(3000);
	page.getAddPassword2().sendKeys("zibtek2024");

//	Thread.sleep(2000);
	page.getVisibilityoff().click();

//	Thread.sleep(2000);
	page.getVisilibityOn().click();

//	Thread.sleep(3000);
	page.getSignin3().click();

	 





	}
	}
		

