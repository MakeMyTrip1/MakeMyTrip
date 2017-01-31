package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC007 extends MakeMyTripWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Invalid Email Address Error Message in Forgot Password Field";
		testDescription = "To verify error message is displayed after entering invalid email id in forgot password field";
		category = "Smoke";
		authors = "Pakeer";
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC001";
	}
	
	@Test
	public void TC007()
	{
		new Dashboard(driver, test)
		.clickLoginMenu()
		.clickForgotPassword()
		.enterEmailInForgotPassword("aaavig1234@yopmail.com")
		.clickSubmitButton()
		.verifyErrorMessageInForgotPassword("EmailID provided is not registered with MakeMyTrip.");
	}
}