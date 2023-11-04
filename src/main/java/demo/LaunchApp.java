package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import pages.HomePage;

public class LaunchApp {

	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
//com.solodroid.solomerce
//.activities.ActivitySplash or .activities.MainActivity		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion", "12");
		dc.setCapability("deviceName","Samsung");
		dc.setCapability("appPackage","com.solodroid.solomerce");
		//dc.setCapability("unlockType", "pattern");
		//dc.setCapability("unlockPattern", "14569");
		
		dc.setCapability("appActivity", ".activities.ActivitySplash");
		AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		/*driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("com.solodroid.solomerce:id/nav_profile")).click();
	    WebElement category=driver.findElement(By.id("com.solodroid.solomerce:id/nav_category"));
		//HomePage hp=new HomePage(driver);
		Point catLocation=category.getLocation();
		int xord=catLocation.x;
		int yord=catLocation.y;
		System.out.println(xord);
		TouchAction action=new TouchAction<>(driver);
		action.tap(PointOption.point(xord, yord)).perform();
		Thread.sleep(3000);
		driver.findElement(By.id("com.solodroid.solomerce:id/nav_recent")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.solodroid.solomerce:id/search")).click();
		
		driver.findElement(By.id("com.solodroid.solomerce:id/search_src_text")).sendKeys("Watch");
		driver.hideKeyboard();
		Thread.sleep(3000);
		//driver.lockDevice();
		//driver.unlockDevice();
		if(driver.getOrientation().equals(ScreenOrientation.PORTRAIT))
		{
			driver.rotate(ScreenOrientation.LANDSCAPE);
		}
		driver.runAppInBackground(Duration.ofSeconds(10));
		driver.rotate(ScreenOrientation.PORTRAIT);
		*/
}
}
