package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.touch.offset.PointOption;

public class BasePage
{
	public static Logger logger=LogManager.getLogger();
	
	public static void swipePage(int x1,int y1,int x2,int y2,AppiumDriver driver)
	{
		TouchAction action1=new TouchAction<>(driver);
		
		action1.press(PointOption.point(x1,y1)).waitAction().moveTo(PointOption.point(x2,y2)).release().perform();
		
	}
	
	public static void switchActivity(String packageName,String activityInfo,AppiumDriver driver)
	{
		Activity ac=new Activity(packageName,activityInfo);
		((StartsActivity) driver).startActivity(ac);
	}
	
	public static void tapPointOption(int x,int y,AppiumDriver driver)
	{
		TouchAction action=new TouchAction<>(driver);
		action.tap(PointOption.point(x, y));
	}
	
	public static Point getLocationOfElement(WebElement ele)
	{
		Point location=ele.getLocation();
		return location;
	}
	
	public static void scrollPageAndChooseProduct(AppiumDriver driver,String nameOfProduct)
	{
		((AndroidDriver) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".resourceId(\"com.solodroid.solomerce:id/viewpager\"))"
				+ ".scrollForward().scrollIntoView(new UiSelector().textContains(\""+nameOfProduct+"\"))");
		logger.info("product found");
		((AndroidDriver) driver).findElementByAndroidUIAutomator("new UiSelector().textContains(\""+nameOfProduct+"\")").click();
		logger.info("product is selected");
	}
	
}
