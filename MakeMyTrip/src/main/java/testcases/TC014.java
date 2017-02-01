package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC014 extends MakeMyTripWrappers{
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Search International Flights";
		testDescription = "Search International Flights for RoundTrip";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights-hotels";
		dataSheetName = "TC014";
	}
	
	@Test
	public void searchInternationalFlightsForRT(){
		
		new Dashboard(driver, test)
		.clickFlightTab()
		.clickInternationalOptionInFlight()
		.clickRoundTrip()
		.enterDepartureCity("Chennai, India (MAA)")
		.enterDestinationCity("Kuala Lumpur, Malaysia (KUL)")
		.selectDepartureDate()
		.selectReturnDate()
		.clickSearchFlight();
		
	}

}
