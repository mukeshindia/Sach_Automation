package com.org.base;


import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.org.utils.Propertyconfiguration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static ExtentHtmlReporter extentReporter;
	public static ExtentReports extentReports;
	public static ExtentTest testCase;
	public static Logger logger;
	
	
	
	@BeforeSuite
	public static void setUpReport() {
		extentReporter=new ExtentHtmlReporter("C:\\Users\\kumar.mukesh\\eclipse-workspace\\Such\\Report//Such.html");
		extentReports=new ExtentReports();
		extentReports.attachReporter(extentReporter);
	}
	@AfterSuite
    public static void saveReport() {
		extentReports.flush();
	}
	   
	   
	   @BeforeClass
       public void launchBrowser()  {
		   
		
		String browserName=Propertyconfiguration.props.getProperty("browser");
		
		if(browserName.equals("chrome")) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	
       }
		else if(browserName.equals("FF")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			
			logger=LogManager.getLogger("Such");
		}else {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Propertyconfiguration.Page_Load_TimeOut,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Propertyconfiguration.Implicit_Wait, TimeUnit.SECONDS);
		
		driver.get(Propertyconfiguration.props.getProperty("baseUrl"));
		
		
		logger=LogManager.getLogger("Such");
		
		
	   }
		
	
	/*@BeforeClass
	@Parameters("browser")
	public void launchBrowser(String browser) throws InterruptedException {
		
		switch(browser.toLowerCase()) {
		
		case "chrome":
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sachorgin-714333557.ap-south-1.elb.amazonaws.com/");
		Thread.sleep(2000);
		break;
		
		case "msedge":
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://sachorgin-714333557.ap-south-1.elb.amazonaws.com/");
		Thread.sleep(2000);
		break;
		
		default:
			driver=null;
			break;
			
	}
		  
	}*/
	

	
	
	
	public void  closeBrowser() {
		 driver.quit();
		 
		 //loging
	}
	

}
