package tests;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import constants.FileConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
	public static Logger logger=LogManager.getLogger();
	static ExtentReports extent=new ExtentReports();
	static ExtentSparkReporter reporter;
	public static ExtentTest test=null;
	
	public static AppiumDriver driver;
	
	
	
	@BeforeMethod(alwaysRun =true)
	public static void setupTest(Method method)
	{
		
	reporter=new ExtentSparkReporter(FileConstants.REPORT_PATH);
	extent.attachReporter(reporter);
	driver=getDriver();
	logger.info("driver created");
	test=extent.createTest(method.getName());
	
	
	}
	@AfterMethod
	public static void closeDriver()
	{
		extent.flush();
		if(driver!= null)
		{
		driver.quit();
		}
	}
	
		
	public static DesiredCapabilities setCapabilities() 
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion", "12");
		dc.setCapability("deviceName","Samsung");
		dc.setCapability("appPackage","com.solodroid.solomerce");
		//dc.setCapability("unlockType", "pattern");
		//dc.setCapability("unlockPattern", "14569");
		
		dc.setCapability("appActivity", ".activities.ActivitySplash");
		
		
		return dc;
	}
		public static AppiumDriver getDriver()
		{
			
		 DesiredCapabilities dc1=setCapabilities();
		try
		{
			driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc1);	
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.info("Application did not launch");
			Assert.fail("Appium session not created");
		}
		return driver;
	}
		
	}

