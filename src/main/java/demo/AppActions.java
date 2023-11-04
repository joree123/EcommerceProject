package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.touch.offset.PointOption;

public class AppActions {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion", "12");
		dc.setCapability("deviceName","Samsung");
		dc.setCapability("appPackage","com.solodroid.solomerce");
		//dc.setCapability("unlockType", "pattern");
		//dc.setCapability("unlockPattern", "14569");
		
		dc.setCapability("appActivity", ".activities.ActivitySplash");
		AndroidDriver driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"),dc);
	/*	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.id("com.solodroid.solomerce:id/search"));
		//performing swipe operation
		//WebDriverWait wait=new WebDriverWait(driver,6);
		//wait.until(ExpectedConditions.elementToBeSelected(ele));
		TouchAction action=new TouchAction<>(driver);
		//left swipe
		action.press(PointOption.point(980,1100)).waitAction().moveTo(PointOption.point(70,1100)).release().perform();
		Thread.sleep(3000);
		action.press(PointOption.point(70,1100)).waitAction().moveTo(PointOption.point(920,1100)).release().perform();
		//switching between apps
		Activity calender=new Activity("com.samsung.android.calendar","com.samsung.android.app.calendar.activity.MainActivity");
		driver.startActivity(calender);
		Thread.sleep(3000);
	//	driver.pressKey(new KeyEvent(AndroidKey.BAC[K));
		driver.startActivity(new Activity("com.solodroid.solomerce",".activities.ActivitySplash"));
		Thread.sleep(3000);
		//performing scrolling operation
		//finding scrollable element
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".resourceId(\"com.solodroid.solomerce:id/viewpager\"))"
				+ ".scrollForward().scrollIntoView(new UiSelector().textContains(\"Animal Jumpsuit for Newborn Baby\"))");
		driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"Animal Jumpsuit for Newborn Baby\")").click();
		driver.findElement(By.id("com.solodroid.solomerce:id/product_image")).click();
//performing pinch Zoom
		MultiTouchAction maction=new MultiTouchAction(driver);
		Thread.sleep(3000);
		
		TouchAction touch1=new TouchAction<>(driver);
		Thread.sleep(5000);
		TouchAction touch2=new TouchAction<>(driver);
		touch1.press(PointOption.point(530,900)).waitAction().moveTo(PointOption.point(530, 600)).release();
		touch2.press(PointOption.point(530,1300)).waitAction().moveTo(PointOption.point(530,1700)).release();
		maction.add(touch1).add(touch2).perform();
		*/
		
	}

		
	}


