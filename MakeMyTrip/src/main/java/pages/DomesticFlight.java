package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class DomesticFlight extends MakeMyTripWrappers {
	
	public DomesticFlight(RemoteWebDriver driver, ExtentTest test){
		this.driver=driver;
		this.test = test;
		if(!verifyTitle("Cheap Flight Ticket Booking Online, Lowest Domestic Air Fares @ 800/- off")){
			reportStep("This is not Domestic Flight Page", "FAIL");
		}
	}
	
	//click domestic option
	public DomesticFlight clickDomesticOptionInFlight()
	{
		clickByXpath("//a[@class='row segmented_btn first  active  ']");
		return this;		
	}
	
	//click International option
		public InternationalFlight clickInternationalOptionInFlight()
		{
			clickByLink("International");
			return new InternationalFlight( driver,  test);
		}
	
	//click one_way trip
		public DomesticFlight clickOneWayTrip()
		{
			
			clickById("one_way_button1");
			return this;
		}
		
		//click round trip
		public DomesticFlight clickRoundTrip()
		{
			clickById("round_trip_button1");
			return this;
		}
		
		//enter departure city
		public DomesticFlight enterDepartureCity(String departure_city)
		{
			enterByXpath("//input[@id='from_typeahead1']", departure_city);
			driver.findElementByXPath("//input[@id='from_typeahead1']").sendKeys(Keys.TAB);
			return this;
		}
		
		//enter Destination city
		public DomesticFlight enterDestinationCity(String destination_city)
		{
			enterByXpath("//input[@id='to_typeahead1']", destination_city);
			driver.findElementByXPath("//input[@id='to_typeahead1']").sendKeys(Keys.TAB);
			return this; 
		}
		
		//select departure date
		public DomesticFlight selectDepartureDate()
		{
			departureDate();
			return this;
		}
		
		//select return date
		public DomesticFlight selectReturnDate()
		{
			returnDate();
			return this;
		}
		
		//Selecting no.of adults
		public DomesticFlight selectNoOfAdults(int no_Of_Adults)
		{
			for(int i=1;i<=no_Of_Adults;i++)
			{
				driver.findElementByXPath("//div[@id='adult_count']/a[2]").click();	
			}		
			return this;
		}
		
		//decrease no.of adults
		public DomesticFlight decreaseNoOfAdults(int no_Of_Adults)
		{
			for(int i=1;i<=no_Of_Adults;i++)
			{
				driver.findElementByXPath("//div[@id='adult_count']/a[1]").click();	
			}
			return this;
		}
		
		//Selecting no.of children
		public DomesticFlight selectNoOfChildren(int no_Of_Children)
		{
			for(int i=1;i<=no_Of_Children;i++)
			{
				driver.findElementByXPath("//div[@id='child_count']/a[2]").click();	
			}		
			return this;
		}
		
		//decrease no.of children
		public DomesticFlight decreaseNoOfChildren(int no_Of_Children)
		{
			for(int i=1;i<=no_Of_Children;i++)
			{
				driver.findElementByXPath("//div[@id='child_count']/a[1]").click();	
			}		
			return this;
		}
		
		//Selecting no.of Infant
		public DomesticFlight selectNoOfInfant(int no_Of_Infant)
		{
			for(int i=1;i<=no_Of_Infant;i++)
			{
				driver.findElementByXPath("//div[@id='infant_count']/a[2]").click();	
			}		
			return this;
		}
		
		//decrease no of infant
		public DomesticFlight decreaseNoOfInfant(int no_Of_Infant)
		{
			for(int i=1;i<=no_Of_Infant;i++)
			{
				driver.findElementByXPath("//div[@id='infant_count']/a[1]").click();	
			}		
			return this;
		}
		
		//select search flight button
		public FlightSelect clickSearchFlight()
		{
			clickById("flights_submit");
			return new FlightSelect( driver,  test);
		}
		
		//select search for flight round trip
		public FlightSelectForRoundtrip clickSearchForRT(){
			
			clickById("flights_submit");
			return new FlightSelectForRoundtrip(driver, test);
		}

		
}
