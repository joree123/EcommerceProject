package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITBy;

public class CartPage extends BasePage {
	
	public CartPage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITBy()
	@AndroidFindBy(id= "com.solodroid.solomerce:id/cart")
	public WebElement mycart;
	
	@iOSXCUITBy()
	@AndroidFindBy(id= "com.solodroid.solomerce:id/product_quantity")
	public WebElement prodQuantity ;
	
	@iOSXCUITBy()
	@AndroidFindBy(id= "com.solodroid.solomerce:id/product_price")
	public WebElement prodPrice;
	
	@iOSXCUITBy()
	@AndroidFindBy(id= "com.solodroid.solomerce:id/product_name")
	public WebElement prodText ;
	
	@iOSXCUITBy()
	@AndroidFindBy(id= "com.solodroid.solomerce:id/product_name")
	public List<WebElement> listOfProds ;
	
}
