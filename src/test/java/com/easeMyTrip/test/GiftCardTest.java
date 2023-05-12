package com.easeMyTrip.test;
  import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.easeMyTrip.TestBase.TestBase;
import com.easeMyTrip.pages.HomePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GiftCardTest extends TestBase {
	
	HomePage homepage;
	HomePageAction actions_home;
	static ExtentTest test;
	static ExtentReports report;
public GiftCardTest() {
		
		super();	
	}
	
	@BeforeClass
	public void SteUp() throws InterruptedException {
		initialization();
 		homepage=new HomePage();
 		actions_home=new HomePageAction();

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
	
	
	@Test
	public void pageTitleTest() throws InterruptedException {
		  test = report.startTest("Verify PageTitle");
		  actions_home.a_GiftCard();
		  if(driver.getTitle().equals("https://www.easemytrip.com/railways/")) {
				test.log(LogStatus.PASS, "Navigated to the specified URL");
			}
			else {
				test.log(LogStatus.FAIL, "Test Failed");
			}
		  System.out.println(driver.getTitle());

		
	}
	@Test(dependsOnMethods="pageTitleTest")
	public void GiftCard_Test() {
		  test = report.startTest("Verify GiftsPageTitle");
  		   int expectedCount = 5;
 	    	List<WebElement> count_Cards=homepage.Count_Cards();
 	    	int actualcount=count_Cards.size();
 	    			if (actualcount == expectedCount) {
 	   				test.log(LogStatus.PASS, "Navigated to the specified URL");
 		  } else {
				test.log(LogStatus.FAIL, "Test Failed");	     
  		}
 	   
	}
 	
	
	
	
	@Test(dependsOnMethods="pageTitleTest")
		public void GiftCardslinkFunc_Test() throws InterruptedException {
		test = report.startTest("Verify Giftlink Functionality");
		actions_home.a_GiftNowBtn();
 		if(homepage.GiftPage_Text().getText().equals("Select Gift Card Category")) {
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
 	 
}
	
	

		@Test(dependsOnMethods="GiftCardslinkFunc_Test")
		public void GiftSent_Test() {
 			test = report.startTest("Verify Giftlink Functionality");
             actions_home.a_EnterDeno();
              if(homepage.Validate_Text().isDisplayed()) {
     			test.log(LogStatus.PASS, "Navigated to the specified URL");
     		}
     		else {
     			test.log(LogStatus.FAIL, "Test Failed");
     		}
             
			
		}
 
	}



