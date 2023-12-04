package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.android.AndroidDriver;

import utils.CommonUtils;

public class EcommerceListeners extends BaseTest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		BaseTest.test.pass(MarkupHelper.createLabel(result.getMethod().getMethodName()+" passed",ExtentColor.GREEN));
	}
	

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
			
		BaseTest.test.fail(MarkupHelper.createLabel(result.getMethod().getMethodName()+ " Failed",ExtentColor.RED));	
		try {
			BaseTest.test.addScreenCaptureFromPath(CommonUtils.getScreenshot(driver));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}

}
	
}
