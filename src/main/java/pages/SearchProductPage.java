package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITBy;

public class SearchProductPage extends BasePage {


	
	public SearchProductPage(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITBy()
	@AndroidFindBy(id = "com.solodroid.solomerce:id/search_src_text")
	public WebElement searchTextBox;
	
	@iOSXCUITBy()
	@AndroidFindBy(id = "com.solodroid.solomerce:id/category_image")
	public WebElement categoryImage;
	
	@iOSXCUITBy()
	@AndroidFindBy(id = "com.solodroid.solomerce:id/product_image")
	public WebElement productImage;
	
	@iOSXCUITBy()
	@AndroidFindBy(id= "com.solodroid.solomerce:id/btn_add_cart")
	public WebElement addToCartButton;
	
	@iOSXCUITBy()
	@AndroidFindBy(id= "com.solodroid.solomerce:id/userInputDialog")
	public WebElement numberOfOrderText;
	
	@iOSXCUITBy()
	@AndroidFindBy(id= "android:id/button1")
	public WebElement orderAddButton;
	
	@iOSXCUITBy()
	@AndroidFindBy(id = "com.solodroid.solomerce:id/product_price")
	public WebElement individualProductPrice;
	
	@iOSXCUITBy()
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	public WebElement backToHomePageButton;
	
	
	
}
