package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.DomesticFlight;
import wrappers.MakeMyTripWrappers;

public class CompleteInternationalOneWayFlightBooking_TC020 extends MakeMyTripWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Complete International OnewayTrip";
		testDescription = "Complete International Oneway Flight Booking With Mandatory details";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights";
		dataSheetName = "TC020";
	}
	
	@Test
	public void searchDomesticFlightsTC011() throws Throwable{

		new DomesticFlight(driver, test)
		.clickRoundTrip()
		.enterDepartureCity("Chennai (MAA)")
		.enterDestinationCity("Dubai (DXB)")
		.selectDepartureDate()
		.clickSearchForInternational()
		.clickBookNowButtonInternational()
		.enterMailIdInternational("Rh@gmail.com")
		.clickContinueAsGuestInInternational();
		
	}

}
