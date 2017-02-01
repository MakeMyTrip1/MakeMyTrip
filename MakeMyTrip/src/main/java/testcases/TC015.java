package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.FlightSelect;
import wrappers.MakeMyTripWrappers;

public class TC015 extends MakeMyTripWrappers{

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Selecting No of stops option";
		testDescription = "Book a ticket by selecting No of stops option";
		category = "smoke";
		authors = "Rajesh";
		url="https://flights.makemytrip.com/makemytrip/search/O/O/E/1/0/0/S/V0/MAA_DEL_23-02-2017?intid=DF_LP_Widget_Search_Chennai_New-Delhi";
		dataSheetName = "TC015";
	}

	@Test
	public void selectingNoOFOption(){

		new FlightSelect(driver, test)
		.selectBookButton()
		.enterContactInfo("r@gmail.com")
		.clickContinueAsGuest()
		.enterFirstName("Kumar")
		.enterLastName("Jk")
		.enterPhoneNumber("8695896589")
		.selectContinueToPaymaent();
	}

}
