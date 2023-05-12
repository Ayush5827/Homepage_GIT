package com.easeMyTrip.test;

 import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.easeMyTrip.TestBase.TestBase;
import com.easeMyTrip.pages.HomePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HomePageTest extends TestBase
{
	HomePage homepage;
	HomePageAction actions_home;
	static ExtentTest test;
	static ExtentReports report;
	public HomePageTest() {
		
		super();	
	}
	
	@BeforeClass
	public void SteUp() throws InterruptedException {
		initialization();
		homepage=new HomePage();
		actions_home=new HomePageAction();

//		WebElement Ignore_add=homepage.Ignore_Adds();
//		Ignore_add.click();
	}
	
   @BeforeSuite
 	public static void startTest()
	{
	  report = new ExtentReports( "E:\\Extent Report\\EMT",true);
	}
   @AfterSuite
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}
	

	@Test(priority=1)
	public void HomePageTitleTest() throws InterruptedException {
		  test = report.startTest("Verify Homepage title");
		Thread.sleep(2000);
		String title = homepage.validateHomePageTitle();
		if(driver.getTitle().equals("Book Flights, Hotels, Bus Tickets & Holidays - EaseMyTrip.com")) {
			test.log(LogStatus.PASS, "Navigated to the specified page");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		System.out.println(title);
		Assert.assertEquals(title,"Book Flights, Hotels, Bus Tickets & Holidays - EaseMyTrip.com");
	}
	
	@Test(priority=2)
	
	public void HeaderlogoVisibilityTest() {
		  test = report.startTest("Verify Logo visibilty");
		WebElement HeaderLogo =homepage.ValidateHeaderlogo();
		if( homepage.ValidateHeaderlogo().isDisplayed()) {
			test.log(LogStatus.PASS, "Logo is visible to the user");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(HeaderLogo.isDisplayed(),true);
	}
	@Test(priority=3)
	public void  currentUrlTest() {
		  test = report.startTest("Verify page URL");
		  if( driver.getCurrentUrl().equals("https://www.easemytrip.com/")) {
				test.log(LogStatus.PASS, "Logo is visible to the user");
			}
			else {
				test.log(LogStatus.FAIL, "Test Failed");
			}
 		//Assert.assertEquals(url,"https://www.easemytrip.com/");
	}
	
	
	@Test(priority=4)
	public void FlightTabTest() {
		  test = report.startTest("Verify flight page Title");
  		WebElement tab1 =  homepage.ValidateFlight_tab();
		tab1.click();
        //String tabText = tab1.getText();
       if( driver.getCurrentUrl().equals("https://www.easemytrip.com/flights.html")) {
			test.log(LogStatus.PASS, "User navigates to the Flight page");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
       //Assert.assertEquals(tabText, "FLIGHTS");
         Assert.assertEquals(driver.getCurrentUrl(),"https://www.easemytrip.com/flights.html");
		driver.navigate().back();

	 
	}
	@Test(priority=5)
	public void Hotels_tab() throws InterruptedException {
		  test = report.startTest("Verify functionality of Hotel Tab");

		Thread.sleep(3000);
		WebElement tab2=homepage.Validate_HotelTab();
		tab2.click();
		if( driver.getCurrentUrl().equals("https://www.easemytrip.com/hotels/")) {
			test.log(LogStatus.PASS, "User navigates to the Hotels page");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
           Assert.assertEquals(driver.getCurrentUrl(), "https://www.easemytrip.com/hotels/");
		driver.navigate().back();

	}
	
	
	 @Test(priority=6)
	 public void ValidateFlight_HotelsTab() {
		  test = report.startTest("Verify functionality of Flight+Hotel Tab");
 			WebElement tab1 =  homepage.ValidateFlight_HotelsTab();
			tab1.click();
			if( driver.getCurrentUrl().equals("https://fph.easemytrip.com/")) {
				test.log(LogStatus.PASS, "User navigates to the Flight+Hotels page");
			}
			else {
				test.log(LogStatus.FAIL, "Test Failed");
			}
			
 	        Assert.assertEquals(driver.getCurrentUrl(), "https://fph.easemytrip.com/");
			driver.navigate().back();

	 }
	 
	 @Test(priority=7)
	 public void Train_TabTest() {
		  test = report.startTest("Verify functionality of Trains Tab");
 			WebElement tab1 =  homepage.Validate_TrainsTab();
			tab1.click();
			if( driver.getCurrentUrl().equals("https://www.easemytrip.com/railways/")) {
				test.log(LogStatus.PASS, "User navigates to the Train Booking page");
			}
			else {
				test.log(LogStatus.FAIL, "Test Failed");
			}
	        Assert.assertEquals(driver.getCurrentUrl(), "https://www.easemytrip.com/railways/");
			driver.navigate().back();

	 }
	 @Test(priority=8)
	 public void Bus_TabTest() {
		  test = report.startTest("Verify functionality of Bus Tab");
 			WebElement tab1 =  homepage.Validate_BusTab();
			tab1.click();
			if( driver.getCurrentUrl().equals("https://www.easemytrip.com/bus/")) {
				test.log(LogStatus.PASS, "User navigates to the Bus Booking page");
			}
			else {
				test.log(LogStatus.FAIL, "Test Failed");
			}
	        Assert.assertEquals(driver.getCurrentUrl(), "https://www.easemytrip.com/bus/");
			driver.navigate().back();

	 }
	@Test(priority=9)
	public void HeaderlinkCount_Test() {
		  test = report.startTest("Verify the count of HeaderLinks");
 		List<WebElement> links=homepage.ValidateHeaderlinks();
 		int count=links.size();
 		String str = String.valueOf(count);
  		if(str.equals("27")) {
			test.log(LogStatus.PASS, "User navigates to the Bus Booking page");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
  		Assert.assertEquals(links.size() , 27);
	}
	
	@Test(priority=10)
	public void FooterlinkCount_Test() {
		  test = report.startTest("Verify the count of FooterLinks");
  		List<WebElement> links=homepage.ValidateFooterlinks();
  		int count=links.size();
 		String str = String.valueOf(count);
  		if(str.equals("152")) {
			test.log(LogStatus.PASS, "User gets actual number of Footerlinks");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(links.size(), 152);
	}

	

//	@Test(priority=11)
//	public void JoinIcon_Test() throws InterruptedException {
//		  test = report.startTest("Verify the functionality of JoinEMTpro icon");
// 		WebElement w3=homepage.Validate_joinIcon();
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4));
//		wait.until(ExpectedConditions.elementToBeClickable(homepage.Validate_joinIcon())).click();
//		 String currentWindowHandle = driver.getWindowHandle();
//		    Set<String> windowHandles = driver.getWindowHandles();
//		    for (String windowHandle : windowHandles) {
//		      if (!windowHandle.equals(currentWindowHandle)) {
//		        driver.switchTo().window(windowHandle);	
//
//		        break;
//		      }
//		    }
//		    if(driver.getCurrentUrl().equals("https://www.easemytrip.com/JoinEMTPro")) {
//				test.log(LogStatus.PASS, "User navigate to JoinEmt page");
//			}
//			else {
//				test.log(LogStatus.FAIL, "Test Failed");
//			}
//  			Assert.assertEquals(driver.getCurrentUrl(), "https://www.easemytrip.com/JoinEMTPro");
//	        driver.switchTo().window(currentWindowHandle);
//	        Thread.sleep(3000);
//
//
//		   	}
		 

      @Test(priority=12)
      public void Source_LocTest() throws InterruptedException {
		  test = report.startTest("Verify the functionality of Input field");

   	   actions_home.a_Enter_SrcFlights();
     	   Thread.sleep(3000);
     	 if(driver.getTitle().equals("EaseMyTrip.com Lowest Airfare, Flight Tickets, Cheap Air Tickets – EaseMyTrip.com")) {
				test.log(LogStatus.PASS, "User navigate to the Flight Listing page");
			}
			else {
				test.log(LogStatus.FAIL, "Test Failed");
			}
           Assert.assertEquals(driver.getTitle(), "EaseMyTrip.com Lowest Airfare, Flight Tickets, Cheap Air Tickets – EaseMyTrip.com");
           driver.navigate().back();

      }
      @Test(priority=13)
      public void SearchBtn_FuncTest() {
 		  test = report.startTest("Verify the functionality of search button");
    	   actions_home.a_SearchBtn();
    	  if(driver.getTitle().equals("EaseMyTrip.com Lowest Airfare, Flight Tickets, Cheap Air Tickets – EaseMyTrip.com")) {
				test.log(LogStatus.PASS, "User navigate to the Flight Listing page");
			}
			else {
				test.log(LogStatus.FAIL, "Test Failed");
			}
          Assert.assertEquals(driver.getTitle(), "EaseMyTrip.com Lowest Airfare, Flight Tickets, Cheap Air Tickets – EaseMyTrip.com");
          driver.navigate().back();


      }
      
//      @Test(priority=14)
//   	    public void FilterSearch_resultTest() throws InterruptedException {
//   		  test = report.startTest("Verify the functionality of Filters and sort option");
//    	   Thread.sleep(3000);
//    	   actions_home.a_FilterSearch_Result();
//    	   List<WebElement> Filter_searchResult=homepage.Validate_filter_result();
//          Thread.sleep(4000);
//     	  if(homepage.Validate_filter_result()) {
//				test.log(LogStatus.PASS, "User navigate to the Flight Listing page");
//			}
//			else {
//				test.log(LogStatus.FAIL, "Test Failed");
//			}
//    	   Assert.assertTrue(true, "Result should be displayed");
//          driver.navigate().back();
//
//   	   
//      }
//      @Test(priority=15)
//      public void FlightBookingTest() throws InterruptedException {
//
//   	   actions_home.a_Flightbooking();
      //}
      
//      @Test(priority=16)
//////      public void WebcheckInBtn_Test() throws InterruptedException {
//////   	   Thread.sleep(2000);
//////  		  test = report.startTest("Verify the functionality of Filters and sort option");
//////    	   actions_home.a_WebCheck_In();
//////    	  if(driver.getCurrentUrl().equals("https://www.easemytrip.com/web-checkin.html")) {
//////				test.log(LogStatus.PASS, "User navigate to the Web-Checking  page");
//////			}
//////			else {
//////				test.log(LogStatus.FAIL, "Test Failed");
//////			}
//////   	   Assert.assertEquals(driver.getCurrentUrl(), "https://www.easemytrip.com/web-checkin.html");
//////          //driver.navigate().back();
//////      }
//       
//      @Test(priority=17)
//      public void ChatTest() {
//   	   Assert.assertEquals(homepage.Validate_Text_Inchat().isDisplayed(),true);
//      }
      
      
      
  
//      @AfterClass
//	    public void Teardown() {
//		driver.quit();
//	}

}

