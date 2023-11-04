package utils;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.FileConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CommonUtils {

	
	public static void implicitWaitForElements1(AppiumDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public static boolean waitForElementToBeVisible(AppiumDriver driver,WebElement recent)
	{
		boolean isVisible=false;
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
		
		wait.until(ExpectedConditions.visibilityOf(recent));
		isVisible=true;
		}
		catch(Exception e)
		{
			
		e.printStackTrace();
			
		}
		return isVisible;
	}
	
	public static String getDateAndTimeStamp()
	{
		SimpleDateFormat sd=new SimpleDateFormat("yyyyMMddHHmmSS");
		String date=sd.format(new Date());
		return date;
	}
	
	public static String getScreenshot(AppiumDriver driver) throws IOException
	{
		String filePath=FileConstants.SCREENSHOT_PATH;
		TakesScreenshot shot=(TakesScreenshot)driver;
		File src=shot.getScreenshotAs(OutputType.FILE);
		File dest=new File(filePath);
		FileUtils.copyFile(src,dest);
		return filePath;
	}

	public static void implicitWaitForElements(AppiumDriver driver) {
		// TODO Auto-generated method stub
		
	}
}
