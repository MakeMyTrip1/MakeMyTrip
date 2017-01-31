package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class FlightSelectForInternational extends MakeMyTripWrappers{

	public FlightSelectForInternational(RemoteWebDriver driver, ExtentTest test){

		this.driver = driver;
		this.test = test;
		System.out.println(driver.getTitle());
		if(!verifyTitle("International Flights Air Tickets, Cheap International Air fares at MakeMyTrip")){
			reportStep("This is not International flight select page", "FAIL");
		}
	}

	public FlightSelectForInternational clickNoOFStopsInternational(){

		clickByXpath("(//span[@class='stop_text make_blockElm'])[1]");
		return this;
	}

	public FlightSelectForInternational clickDepatureTimeInternational(){

		clickByXpath("//span[@class='make_blockElm morning_icon']");
		return this;
	}

	public FlightSelectForInternational selectAirlinesInternational(){

		clickByXpath("//span[@class= 'pull-left airline_info ng-binding']");
		return this;
	}


}
