package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.FlightSelect;
import wrappers.MakeMyTripWrappers;

public class TC016 extends MakeMyTripWrappers{
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Selecting Departure Dime From Option";
		testDescription = "Book a ticket by selecting Departure Dime From Option";
		category = "smoke";
		authors = "Rajesh";
		url="https://flights.makemytrip.com/makemytrip/search/O/O/E/1/0/0/S/V0/MAA_CCU_21-03-2017?intid=DF_LP_Widget_Search_Chennai_Kolkata";
		dataSheetName = "TC016";
	}
	
	@Test
	public void selectingNoOFOption(){
		
		new FlightSelect(driver, test)
		.selectTiming();
		
	}
}
