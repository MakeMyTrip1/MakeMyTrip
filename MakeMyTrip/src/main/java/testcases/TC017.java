package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.FlightSelect;
import wrappers.MakeMyTripWrappers;

public class TC017 extends MakeMyTripWrappers{
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Selecting Airlines";
		testDescription = "To verify user to able to book a ticket by selecting Airlines option";
		category = "smoke";
		authors = "Rajesh";
		url="https://flights.makemytrip.com/makemytrip/search/O/O/E/1/0/0/S/V0/MAA_CCU_21-03-2017?intid=DF_LP_Widget_Search_Chennai_Kolkata";
		dataSheetName = "TC017";
	}
	
	@Test
	public void selectingNoOFOption(){
		
		new FlightSelect(driver, test)
		.selectAirlines();
		
		
	}

}
