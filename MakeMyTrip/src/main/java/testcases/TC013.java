package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC013 extends MakeMyTripWrappers{
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Search Domestic Flights";
		testDescription = "Search Domestic Flights for OneWay";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC013";
	}
	
	@Test
	public void searchInternationalFlights() throws Throwable{
		
		driver.manage().deleteAllCookies();
		new Dashboard(driver, test)
		.clickFlightTab()
		.clickInternationalOptionInFlight()
		.clickOneWayTrip()
		.enterDepartureCity("Chennai, India (MAA)")
		.enterDestinationCity("Dubai, UAE (DXB)")
		.selectDepartureDate()
		.clickSearchFlight();	
		driver.manage().deleteAllCookies();
	}

}
