package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.DomesticFlight;
import wrappers.MakeMyTripWrappers;

public class SearchInternationalFlightsForOneWay_TC013 extends MakeMyTripWrappers{

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Search International Flights";
		testDescription = "Search International Flights for OneWay";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights";
		dataSheetName = "TC013";
	}

	@Test
	public void searchInternationalFlights() throws Throwable{

		new DomesticFlight(driver, test)
		.clickOneWayTrip()
		.enterDepartureCity("Chennai (MAA)")
		.enterDestinationCity("Bangkok, Thailand (BKK)")
		.selectDepartureDate()
		.clickSearchForInternational();
	}

}
