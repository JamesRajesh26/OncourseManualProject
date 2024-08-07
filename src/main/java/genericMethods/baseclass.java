package genericMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.accountmodule;
import objectRepository.contactmodule;
import objectRepository.dealsmodule;
import objectRepository.loginmodule;
import objectRepository.sequencesmodule;
import objectRepository.templatesmodule;

public class baseclass {    
	
	 public    static WebDriver driver;
	    public Properties prop;
	    public Properties dataProp;
	    public String path="C:\\oncourse\\Oncourse.properties";
	    public void loadPropertiesFile() {
	    	 screenshot screen=new screenshot();
	    	loginmodule page =new loginmodule(driver);
	   accountmodule page1 = new accountmodule(driver);
	   contactmodule page2 = new contactmodule(driver);
       dealsmodule page3 = new dealsmodule(driver);	 
       sequencesmodule page4 = new sequencesmodule(driver);
       templatesmodule page5 = new templatesmodule(driver);
        
	 prop=new Properties();  
	        File propFile = new File(path);
	                                  
	        dataProp= new Properties();
	        File dataPropFile = new File(path); 
	        
	       try {
	            FileInputStream    fis = new FileInputStream(dataPropFile);
	            dataProp.load(fis);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }	          
	        try {
	            FileInputStream    fis1 = new FileInputStream(propFile); 
	            prop.load(fis1);
	        } catch (IOException e) {  
	            e.printStackTrace();
	        }  
	    } 
	    public WebDriver initializeAndOpenBrowser(String browserName) throws InterruptedException {
	    	WebDriverManager.chromedriver().setup();
	    	
	    	ChromeOptions options= new ChromeOptions();
	        options.addArguments("--disable-gpu");
	        options.addArguments("--remote-allow-origins=*");
	        FirefoxOptions options1 = new FirefoxOptions();
	        InternetExplorerOptions options2 = new InternetExplorerOptions();
	        if (browserName.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver(options);
	     //   }else if(browserName.equalsIgnoreCase("firefox")) {
	       //     driver = new FirefoxDriver(options1);
     //   }else if (browserName.equalsIgnoreCase("IE")) {
	      //      driver = new InternetExplorerDriver(options2);    
	        }
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	        driver.get(prop.getProperty("url"));
	        
	        loginmodule page = PageFactory.initElements(driver, loginmodule.class);
	       accountmodule page1 =PageFactory.initElements(driver, accountmodule.class);
	        contactmodule page2 =PageFactory.initElements(driver, contactmodule.class);
	        dealsmodule page3 = PageFactory.initElements(driver, dealsmodule.class); 
	        sequencesmodule page4 = PageFactory.initElements(driver, sequencesmodule.class);
	        templatesmodule page5 = PageFactory.initElements(driver, templatesmodule.class);
	         
	        
	        return driver;
	    } 
	
	
}

	

 