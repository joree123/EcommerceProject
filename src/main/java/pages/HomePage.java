package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITBy;

public class HomePage extends BasePage {

	
	public HomePage(AppiumDriver driver)
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@iOSXCUITBy(id ="")
	@AndroidFindBy(id = "com.solodroid.solomerce:id/nav_category")
	public WebElement category;
	
	@iOSXCUITBy(id ="")
	@AndroidFindBy(id= "com.solodroid.solomerce:id/nav_recent")
	public WebElement recent;
	
	@iOSXCUITBy()
	@AndroidFindBy(id = "com.solodroid.solomerce:id/search")
	public WebElement search;
	
	@iOSXCUITBy()
	@AndroidFindBy(id = "com.solodroid.solomerce:id/profile")
	public WebElement profile;
	
}
