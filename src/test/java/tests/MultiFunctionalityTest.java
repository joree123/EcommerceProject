package tests;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import pages.BasePage;
import pages.HomePage;
import pages.SearchProductPage;
import utils.CommonUtils;
@Listeners(EcommerceListeners.class)
public class MultiFunctionalityTest extends BaseTest {
	
	
@Test(groups="FunctionalityCheck")
public void checkFunction() throws InterruptedException
{
	
	CommonUtils.implicitWaitForElements(driver);
	logger.info("internal wait set");
	HomePage hp=new HomePage(driver);
	BasePage bp=new BasePage();
	Point location=bp.getLocationOfElement(hp.category);
	
	int xord=location.x;
	logger.info("xord found");
	int yord=location.y;
	logger.info("yord found");
	bp.tapPointOption(xord,yord,driver);
	logger.info(" tap on the product performed");
	Assert.assertTrue(CommonUtils.waitForElementToBeVisible(driver, hp.recent));
	hp.recent.click();
	Assert.assertTrue(CommonUtils.waitForElementToBeVisible(driver, hp.search));
	hp.search.click();
	logger.info("search button clicked");
	SearchProductPage sp=new SearchProductPage(driver);
	sp.searchTextBox.sendKeys("watch");
	logger.info("search is started");
	Assert.assertTrue(CommonUtils.waitForElementToBeVisible(driver, sp.categoryImage));
	logger.info("Found the product");
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
	
		
	bp.swipePage(980, 1100, 70, 1100, driver);
	logger.info("Left swipe performed");
	Thread.sleep(3000);
	bp.swipePage(70, 1100, 920, 1100, driver);
	logger.info("right swipe performed");
	
	//switching between apps
	bp.switchActivity("com.samsung.android.calendar","com.samsung.android.app.calendar.activity.MainActivity", driver);
	
	Thread.sleep(3000);

	bp.switchActivity("com.solodroid.solomerce",".activities.ActivitySplash",driver);
	Thread.sleep(3000);
	bp.scrollPageAndChooseProduct(driver, "Animal Jumpsuit for Newborn Baby");
	
	sp.productImage.click();
	logger.info("product image is clicked");

}

}
