package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.CartPage;
import pages.SearchProductPage;
import utils.CommonUtils;
@Listeners(EcommerceListeners.class)
public class BuyProduct extends BaseTest{

@Test
public void checkoutProduct()
{
	CommonUtils.implicitWaitForElements1(driver);
	logger.info("internal wait set");
	BasePage bp=new BasePage();
	bp.scrollPageAndChooseProduct(driver, "Samsung Galaxy S10 - Black");
	SearchProductPage sp=new SearchProductPage(driver);
	Double productPrice=Double.parseDouble(sp.individualProductPrice.getText().split(" ")[0]);
	logger.info("product price checked");
	sp.addToCartButton.click();
	logger.info("add to cart button clicked");
	int quan=5;
	sp.numberOfOrderText.sendKeys(Integer.toString(quan));
	logger.info("number of quantity entered");
	System.out.println(Integer.toString(quan));
	
	sp.orderAddButton.click();
	CartPage cp=new CartPage(driver);
	cp.mycart.click();
	logger.info("checking cart");
	
	 String stotalPrice=cp.prodPrice.getText();
	 System.out.println(stotalPrice);
	double totalPrice=Double.parseDouble(stotalPrice.split(" ")[0].replace(".",""));
	System.out.println(totalPrice);
	System.out.println(productPrice*quan);
	if((productPrice*quan)==totalPrice)
	{
	logger.info("total price checked");	
	BaseTest.test.info("total price calculated");
	}
	Assert.assertFalse(((productPrice*quan) != totalPrice),"price mismatch");
	
}
	
}
