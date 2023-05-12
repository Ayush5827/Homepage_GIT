package com.easeMyTrip.test;

 
import org.openqa.selenium.JavascriptExecutor;
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

public class FlightHotelTest extends TestBase{
	HomePage homepage;
	HomePageAction actions_home;
	static ExtentTest test;
	static ExtentReports report;
public FlightHotelTest() {
		
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
	public void pageTitleTest() {
		  test = report.startTest("Verify page Url");

		actions_home.a_FlightHotelTitle();
		if(driver.getCurrentUrl().equals("https://fph.easemytrip.com/")) {
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(driver.getCurrentUrl(), "https://fph.easemytrip.com/");
	}
	
	@Test(dependsOnMethods="pageTitleTest")
	public void SrachBtnVisibiltyTest() {
		Assert.assertEquals(homepage.Validate_visibilityBtn().isDisplayed(), true);
		
	}
	
	
	@Test(dependsOnMethods="SrachBtnVisibiltyTest")
	public void CheckBox_FuncTest() {
		actions_home.a_CheckBox_Func();
		Assert.assertEquals(homepage.Validate_diffCiti().isDisplayed(), true);
	}
	
	
	@Test(dependsOnMethods="CheckBox_FuncTest")
	public void SearchBtnFuncTest() throws InterruptedException {
		actions_home.a_SearchBtnVisibility();
		Assert.assertEquals(homepage.Validate_ViewDetailsBtn().isDisplayed(),true);
		//driver.navigate().back();
		
	}
	
	
	
	@Test(dependsOnMethods="SrachBtnVisibiltyTest")
	public void SearchResultTest() throws InterruptedException {
		actions_home.a_SearchResults();
		Assert.assertEquals(homepage.SearchResult_Data().isDisplayed(),true);
	}
	
	
	@Test(dependsOnMethods="SearchResultTest")
	public void View_DetailsBtnFuncTest() {
		actions_home.a_View_details();
		Assert.assertEquals(homepage. ViewDatails_Btn().isDisplayed(),true);
		WebElement element=homepage.Validate_ModifySearch_text();
 		//WebElement element = driver.findElement(By.id("element_id"));
	}
	
	@Test(dependsOnMethods="View_DetailsBtnFuncTest")
	public void Edit_detais_btnTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().back();
		WebElement click_EditBtn=homepage.validate_EditDetails_Btn();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", click_EditBtn);
		click_EditBtn.click();
		Thread.sleep(2000);
		
		Assert.assertEquals(homepage.Validate_ModifySearch_text().isDisplayed(),true);
		Thread.sleep(2000);
		WebElement Cancel_Modify=homepage.Cancel_modify();
		Cancel_Modify.click();
	}
	
	@Test(dependsOnMethods="View_DetailsBtnFuncTest")
	public void BookNow_BtnTest() throws InterruptedException {
		actions_home.a_BookNow();
		Assert.assertEquals(homepage.Continue_Booking().isDisplayed(), true);
		driver.navigate().back();
		Thread.sleep(2000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
	}
	
	@Test(dependsOnMethods="BookNow_BtnTest")
	public void Total_priceTest() throws InterruptedException {
		Assert.assertEquals(homepage.Validate_totalPrice().isDisplayed(), true);
		Thread.sleep(4000);
    	System.out.println(homepage.Validate_totalPrice().getText());
 	}
	
	@Test(dependsOnMethods="BookNow_BtnTest")
	public void Payement_cntnueTest() throws InterruptedException {
		actions_home.a_ValidateCntnueBtn();

		Assert.assertEquals(homepage.MakePayment_visibility().isDisplayed(), true);
	}
	
	
	
//	@AfterClass
//	public void  TearDown() {
//	driver.quit();
//	}

}
