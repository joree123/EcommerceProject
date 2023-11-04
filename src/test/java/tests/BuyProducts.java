package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.CartPage;
import pages.SearchProductPage;
import utils.CommonUtils;

@Listeners(EcommerceListeners.class)
public class BuyProducts extends BaseTest {
	
@Test
public void checkoutProduct()
	{
		CommonUtils.implicitWaitForElements(driver);
		logger.info("internal wait set");
		BasePage bp=new BasePage();
		bp.scrollPageAndChooseProduct(driver, "Samsung Galaxy S10 - Black");
		SearchProductPage sp=new SearchProductPage(driver);
		
		sp.addToCartButton.click();
		logger.info("add to cart button clicked");
		sp.numberOfOrderText.sendKeys("3");
		logger.info("number of quantity entered");
		sp.orderAddButton.click();
		CommonUtils.waitForElementToBeVisible(driver, sp.backToHomePageButton);
		sp.backToHomePageButton.click();
		bp.scrollPageAndChooseProduct(driver, "Apple watch series 3 GPS 42mm Black");
		CommonUtils.waitForElementToBeVisible(driver, sp.addToCartButton);
		sp.addToCartButton.click();
		
		logger.info("add to cart button clicked");
		
		sp.numberOfOrderText.sendKeys("2");
		sp.orderAddButton.click();
		
		CartPage cp=new CartPage(driver);
		cp.mycart.click();
		logger.info("checking cart");
		CommonUtils.waitForElementToBeVisible(driver, cp.prodText);
		System.out.println(cp.listOfProds.get(0).getText());
		if((cp.listOfProds.get(0).getText().equalsIgnoreCase("Samsung Galaxy S10 - Black")) && 
				(cp.listOfProds.get(1).getText().equalsIgnoreCase("Apple watch series 3 GPS 42mm Black")))
		{
			logger.info("products successfully added");
		}
		else
			Assert.assertTrue(false);
		
	}

}
