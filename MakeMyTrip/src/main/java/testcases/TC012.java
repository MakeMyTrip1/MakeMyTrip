package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC012 extends MakeMyTripWrappers{

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Search Domestic Flights";
		testDescription = "Search Domestic Flights for Return Trip";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC012";
	}
	
	@Test
	public void searchDomesticFlightsForRTTC012(){
		
		driver.manage().deleteAllCookies();
		new Dashboard(driver, test)
		.clickFlightTab()
		.clickRoundTrip()
		.enterDepartureCity("chennai")
		.enterDestinationCity("Kolkata, India (CCU)")
		.selectDepartureDate()
		.selectReturnDate()
		.selectNoOfAdults(2)
		.clickSearchForRT();
			
	}
	
}
