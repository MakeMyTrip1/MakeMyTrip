package pages;


import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class FlightSelect extends MakeMyTripWrappers {

	public FlightSelect(RemoteWebDriver driver, ExtentTest test){

		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Flight Search")){

			reportStep("This is not Flight Search page", "FAIL");
		}

	}

	public FlightSelect selectDeparture(){
		clickByLink("DEPARTURE");
		return this;

	}

	public FlightSelect selectNoOfStops(){

		clickByClassName("stop_text_stops");
		return this;

	}
	
	public FlightSelect selectTiming(){
		
		clickById("buckets_noon_dep");
		return this;
	}
	
	public FlightSelect selectAirlines(){
		
		clickById("aln_6E_dep");
		return this;
	}
	
	public FlightSelect selectModifySearch(){
		
		clickByXpath("//div[@class= 'col-md-2 col-sm-2 modify']/a");		
		return this;
	}
	
	public FlightSelect modifyToCity(String toCity){
		
		enterByXpath("//div[@class='multicity_wrapper clearfix']/div[3]//input[2]", toCity);
		return this;
	}
	
	public FlightSelect submitModifiedCity(){
		
		clickByLink("Search");
		return this;
	}
	
	public FlightsReview selectBookButton(){
		
		clickByLink("Book");
		return new FlightsReview(driver, test);
	}
			

}
