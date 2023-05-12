package com.easeMyTrip.test;

 
import org.openqa.selenium.WebElement;
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

public class TrainBookingTest extends TestBase {
	static ExtentTest test;
	static ExtentReports report;
	
	HomePage homepage;
	HomePageAction actions_home;
public TrainBookingTest() {
		
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
		
	  report = new ExtentReports( "C:\\Users\\araj\\.jenkins\\workspace\\EMT1.html",true);
	}
	
	@AfterSuite
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}
	
	
	
	@Test
	public void pageTitle_Test() {
		  test = report.startTest("Verify page title");

		actions_home.a_ValidateTrainsTitle();
 		if(driver.getCurrentUrl().equals("https://www.easemytrip.com/railways/")) {
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
	}
	
	@Test(dependsOnMethods="pageTitle_Test")
	public void SearchBtn_func_Test() throws InterruptedException {
		  test = report.startTest("Verify functionality of search button");

		actions_home.a_validateSearchBtn();
 		if(homepage.Validation_msge().isDisplayed()) {
			test.log(LogStatus.PASS, "Validation message is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
	}
	
	@Test(dependsOnMethods="SearchBtn_func_Test")
	public void SearchResult_Test() throws InterruptedException {
		  test = report.startTest("Verify the text");

		actions_home.a_ValidatesearchResult();
		if(homepage.Validate_text().isDisplayed()) {
			test.log(LogStatus.PASS, "Train Location is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(homepage.Validate_text().isDisplayed(), true);

	}
	
	@Test(dependsOnMethods="SearchResult_Test")
	public void ModifyBtn_Test() throws InterruptedException {
		  test = report.startTest("Verify functionality of Modify button");

		actions_home.a_ModifyBtn();
		if(homepage.Validate_text().isDisplayed()) {
			test.log(LogStatus.PASS, "Modified Location is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
	}
		Assert.assertEquals(homepage.Validate_text().isDisplayed(),true);
	}
	
//	@Test(dependsOnMethods="ModifyBtn_Test")
//	public void ViewRoute_Test() throws InterruptedException {
//		  test = report.startTest("Verify functionality of View-Route link");
//
//		actions_home.a_ClickViewroute();
//		//Assert.assertEquals(homepage.Route_Text().isDisplayed(), true);
//		if(homepage.Route_Text().isDisplayed()) {
//			test.log(LogStatus.PASS, " Train Route is displayed");
//		}
//		else {
//			test.log(LogStatus.FAIL, "Test Failed");
//		}
		//Assert.assertEquals(homepage.Route_Text().isDisplayed(), true);

	//}
	@Test(dependsOnMethods="ModifyBtn_Test")
	public void BookBTn_Test() throws InterruptedException {
		  test = report.startTest("Verify functionality of Book now button");

		actions_home.a_BookBTnTest();
		if(homepage.cntnu_Btn().isDisplayed()) {
			test.log(LogStatus.PASS, " Continue Button is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(homepage.cntnu_Btn().isDisplayed(),true);
	}
	
	
	@Test(dependsOnMethods="BookBTn_Test")
	public void cntnueBtn_Test() throws InterruptedException {
		  test = report.startTest("Verify functionality of continue button");

		actions_home.a_Contnu_Btn();
		
		if( driver.getTitle().equals("Train Traveller")) {
			test.log(LogStatus.PASS, " Traveller details is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
 	}
//	
	
	@Test(dependsOnMethods="cntnueBtn_Test")
	public void TotalPrice_Test() {
		  test = report.startTest("Verify total price of ticket");

		WebElement price_Total=homepage.Validate_priceText();
		if( homepage.Validate_priceText().isDisplayed()) {
			test.log(LogStatus.PASS, "Train details is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		System.out.println(price_Total.getText());
 		Assert.assertEquals(homepage.Validate_priceText().isDisplayed(),true);
	}
	@Test(dependsOnMethods="cntnueBtn_Test")
	public void SaveBtn_Test() {
		  test = report.startTest("Verify functionality of save button");

		actions_home.a_ClickSaveBTn();
		if( homepage.Get_text().isDisplayed()) {
			test.log(LogStatus.PASS, "Validation message is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(homepage.Get_text().isDisplayed(), true);
		System.out.println(homepage.Get_text().getText());
	}
	
	@Test(dependsOnMethods="TotalPrice_Test")
	public void Travellerdetails_Test() throws InterruptedException {
		  test = report.startTest("Verify functionality of continue booking button");

		actions_home.a_Validate_TrvlrDetails();
		if( homepage.Validate_trvlrDetails().isDisplayed()) {
			test.log(LogStatus.PASS, "Booking details is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(homepage.Validate_trvlrDetails().isDisplayed(), true);
		
		
	}
//	
	@Test(dependsOnMethods="Travellerdetails_Test")
	public void PaymentMethod_Test() throws InterruptedException {
		  test = report.startTest("Verify functionality of Make Payment button");
 		actions_home.a_WalletMethod();
		if( homepage.Validate_payment().isDisplayed()) {
			test.log(LogStatus.PASS, "Phonepay scanner is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(homepage.Validate_payment().isDisplayed(),true);
		}
	
	
	
	
	
	
	
	
	@AfterClass
	public void  TearDown() {
	driver.quit();
	}

}

