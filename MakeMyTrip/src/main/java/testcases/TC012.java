package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.DomesticFlight;
import wrappers.MakeMyTripWrappers;

public class TC012 extends MakeMyTripWrappers{

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Search Domestic Flights";
		testDescription = "Search Domestic Flights for Return Trip";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights";
		dataSheetName = "TC012";
	}
	
	@Test
	public void searchDomesticFlightsForRTTC012(){
		
		new DomesticFlight(driver, test)
		.clickRoundTrip()
		.enterDepartureCity("Chennai (MAA)")
		.enterDestinationCity("New Delhi (DEL)")
		.selectDepartureDate()
		.selectReturnDate()
		.clickSearchForRT();
			
	}
	
}
