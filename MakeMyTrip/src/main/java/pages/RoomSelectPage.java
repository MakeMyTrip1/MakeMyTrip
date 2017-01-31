package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class RoomSelectPage extends MakeMyTripWrappers{

	public RoomSelectPage(RemoteWebDriver driver, ExtentTest test) throws InterruptedException{
		this.driver = driver;
		this.test = test;
		Thread.sleep(5000);
		if(!verifyURL("hotelz.makemytrip.com")){
			reportStep("This is not the URL ", "FAIL");	
		}	
}
	
	//Select a room which is displayed
		public RoomSelectPage ClickRoom(){
			clickByLink("Select Room");
			return this;
		}
	
	
//	//Scroll down the page to click on "Book now" button
//	    public RoomSelectPage ClickHotel(){
//		WebElement bookNow =   driver.findElementByXPath("//a[@class='vertcl_htl_name detailSimilarHotel ng-binding']");
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",bookNow);
//		return this;
		
//	}
	 
		//Click on 'Book now" button
			public HotelReviewPage BookRoom(){
				clickByLinkNoSnap("Book Now");
				return new HotelReviewPage(driver,test);			
}
}
