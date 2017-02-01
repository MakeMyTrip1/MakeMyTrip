package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class DomesticHotel extends MakeMyTripWrappers{

	public DomesticHotel(RemoteWebDriver driver, ExtentTest test){
		this.driver=driver;
		this.test = test;
		if(!verifyTitle("Online Hotel Booking for Cheap, Budget & Luxury Hotels in India | MakeMyTrip.com")){
			reportStep("This is not Domestic Hotel Page", "FAIL");
		}
	}
	
	//select domestic option in hotels
		public DomesticHotel selectDomesticOptionInHotel()
		{
			clickByXpath("//a[@class='row segmented_btn first  active ']");
			return this;
		}
		
		//select International option in hotels
		public InternationalHotel selectInternationalOptionInHotel()
		{
			clickByXpath("//a[@class='row segmented_btn ']");
			return new InternationalHotel( driver,  test);
		}
		
		//enter city
		public DomesticHotel enterCity(String cityName)
		{
			enterById("from_city_data_box", cityName);
			driver.findElementById("from_city_data_box").sendKeys(Keys.TAB);
			return this;
		}
		
		//enter checkin date
		public DomesticHotel enterCheckInDate()
		{
			departureDate();
			return this;
		}
		
		//enter checkout date
		public DomesticHotel enterCheckOutDate()
		{
			returnDate();
			return this;
		}
		
		//select adults in hotel
		public DomesticHotel selectNoOfAdultsInHotel(int no_Of_Adults)
		{
			for (int i = 1; i < no_Of_Adults; i++) {
				clickByXpath("(//div[@class='segmented_controls make_field form-control']/a)[2]");	
			}		
			return this;
		}
		
		//decrease no of adults in hotel
		public DomesticHotel decreaseNoOfAdultsInHotel(int no_Of_Adults)
		{
			for (int i = 1; i < no_Of_Adults; i++) {
				clickByXpath("(//div[@class='segmented_controls make_field form-control']/a)[1]");	
			}		
			return this;
		}
		
		//select no of children in hotel
		public DomesticHotel selectNoOfChildrenInHotel(int no_Of_Children)
		{
			for (int i = 1; i < no_Of_Children; i++) {
				clickByXpath("(//div[@class='segmented_controls make_field form-control']/a)[4]");	
			}		
			return this;
		}
		
		//decrease no of children
		public DomesticHotel decreaseNoOfChildrenInHotel(int no_Of_Children)
		{
			for (int i = 1; i < no_Of_Children; i++) {
				clickByXpath("(//div[@class='segmented_controls make_field form-control']/a)[3]");	
			}		
			return this;
		}
		
		//select Search hotels button
		public HotelSelect clickSearchHotel()
		{
			clickById("hotels_submit");
			return new HotelSelect( driver,  test);
		}
}
