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
		testDescription = "Search Domestic Flights for OneWay";
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
		.enterDestinationCity("kolkata")
		.selectDepartureDate()
		.selectReturnDate()
		.selectNoOfAdults(2)
		.clickSearchForRT();
			
	}
	
}
