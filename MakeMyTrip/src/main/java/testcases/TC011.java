package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC011 extends MakeMyTripWrappers{
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Search Domestic Flights";
		testDescription = "Search Domestic Flights for OneWay";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC011";
	}
	
	@Test
	public void searchDomesticFlightsTC011(){
		
		new Dashboard(driver, test)
		.clickFlightTab()
		.clickOneWayTrip()
		.enterDepartureCity("Chennai")
		.enterDestinationCity("Kolkata")
		.selectDepartureDate()
		.clickSearchFlight();
			
	}
}
