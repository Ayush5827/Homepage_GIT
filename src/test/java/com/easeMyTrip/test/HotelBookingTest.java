package com.easeMyTrip.test;

 
import java.time.Duration;
 import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
 import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
 import org.testng.annotations.BeforeClass;
 import org.testng.annotations.Test;

import com.easeMyTrip.TestBase.TestBase;
import com.easeMyTrip.pages.HomePage;

public class HotelBookingTest extends TestBase {
	HomePage homepage;
	HomePageAction actions_home;
public HotelBookingTest() {
		
		super();	
	}
	
	@BeforeClass
	public void SteUp() throws InterruptedException {
		initialization();
 		homepage=new HomePage();
 		actions_home=new HomePageAction();

	}
	
	
	@Test
	public void PageTitleTest() throws InterruptedException {
 		Thread.sleep(3000);
 	   actions_home.a_ClickHotels_Tab();
  	   Assert.assertEquals(driver.getTitle(), "Hotel Booking Online | Budget , Luxury & Cheap Hotel - EaseMyTrip");
	}
	
	
	
	 @Test(dependsOnMethods="PageTitleTest")
	 public void search_ButtonVisibiltyTest() throws InterruptedException {
		 Thread.sleep(3000);
			Assert.assertEquals(homepage.ValidateVisibilty_srchBtn().isDisplayed(),true);
	 }
	 
	 
	 
	 
	 
	 @Test(dependsOnMethods="search_ButtonVisibiltyTest")
	 public void Click_searchBtnTest() throws InterruptedException {
		 actions_home.a_ClickSearch_Btn();
		 Assert.assertEquals(driver.getTitle(),"Hotel Booking Online | Budget , Luxury & Cheap Hotel - EaseMyTrip.com");
		 
	 }
	 
	 
	 
	 
	 @Test(dependsOnMethods="Click_searchBtnTest")
	 public void City_TextFieldTest() throws InterruptedException {
		 actions_home.a_ClickTCityText();
		     
		 Assert.assertEquals(driver.getTitle() ,"Hotel Booking Online | Budget , Luxury & Cheap Hotel - EaseMyTrip.com");



}
	 @Test(enabled=false)
	 public void Hotel_Listing_LinkTest() {
		 actions_home.a_HotelLinkTest();
		 Assert.assertEquals(driver.getCurrentUrl(),"");

	 }
	 
	 
	 
	 @Test
	 public void Best_OffersTest() throws InterruptedException {
	 		WebElement w3=homepage.Click_BestOffers();

			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4));

			wait.until(ExpectedConditions.elementToBeClickable(homepage.Click_BestOffers())).click();
		 String currentWindowHandle = driver.getWindowHandle();
		    Set<String> windowHandles = driver.getWindowHandles();
		    for (String windowHandle : windowHandles) {
		      if (!windowHandle.equals(currentWindowHandle)) {
		        driver.switchTo().window(windowHandle);	

		        break;
		      }
		    }		 Assert.assertEquals(driver.getCurrentUrl(),"https://www.easemytrip.com/deals.html");
 	        driver.switchTo().window(currentWindowHandle);


	 }
	 
	 
	 
	 @Test(dependsOnMethods="City_TextFieldTest")
	 public void View_RoomBtnTest() throws InterruptedException {
		 actions_home.a_clickViewRoom();
 		 Assert.assertEquals(homepage.BookNow_visibility().isDisplayed(),true);
	 }
	 
	 
	 
	 @Test(dependsOnMethods="View_RoomBtnTest")
	 public void Click_BookNowBtnTest() {
		 actions_home.a_clickviewRoomBtn();
	    	WebElement View_Totalprice=homepage.TotalPrice_();
	    	String Total_price= (View_Totalprice.getText());
	    	System.out.println(Total_price);
	    	Assert.assertEquals(Total_price,"Grand Total" );

	 }
	 
	 
	 @Test(dependsOnMethods="Click_BookNowBtnTest")
	 public void ErrorMsgeTest() throws InterruptedException {
		 WebElement click_paymentBtn=homepage.Click_payment();
		 click_paymentBtn.click();
		 Thread.sleep(2000);
 		 Assert.assertEquals(homepage.Validate_errorMsge().isDisplayed(), true);
	 }
	 
	 
	 
	 
	 
	 @Test(dependsOnMethods="Click_BookNowBtnTest")
	 public void PaymentBtnTest() throws InterruptedException {
		 actions_home.a_CheckPaymentFunc();
 		 Assert.assertEquals(homepage.Vlaidate_datails().isDisplayed(),true);

	 }
	
	
	@AfterClass
    public void Teardown() {
	driver.quit();
}

	 }

