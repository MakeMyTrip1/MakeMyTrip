package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC008 extends MakeMyTripWrappers{

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Error Message when entered incorrect passwords";
		testDescription = "To verify error message is displayed if there is mismatches in choose a password and retype the password fields";
		category = "Smoke";
		authors = "Pakeer";
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC001";
	}
	
	@Test
	public void TC008() throws InterruptedException
	{
		new Dashboard(driver, test)
		.clickLoginMenu()
		.clickForgotPassword()
		.enterEmailInForgotPassword("aaavig@yopmail.com")
		.clickSubmitButton()
		.LoadYopMail()
		.Entermailid("aaavig@yopmail.com")
		.CheckInboxbutton()
		.CheckForMailButton()
		.Clicklink()
		.EnterNewPassword("aaavig1")
		.RetypePassword("aaavig2")
		.ClickSubmitButton();
		
	}
}