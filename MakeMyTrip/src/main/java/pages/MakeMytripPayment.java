package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class MakeMytripPayment extends MakeMyTripWrappers{

	public MakeMytripPayment(RemoteWebDriver driver, ExtentTest test){

		this.driver = driver;
		this.test =test;
		if(!verifyTitle("MakeMytrip Payment : Safe and Secure")){
			reportStep("This is not payment page", "FAIL");
			
		}
	}


}
