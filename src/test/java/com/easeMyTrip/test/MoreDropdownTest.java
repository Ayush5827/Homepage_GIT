package com.easeMyTrip.test;

 
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.easeMyTrip.TestBase.TestBase;
import com.easeMyTrip.pages.HomePage;

public class MoreDropdownTest extends TestBase{
	
	HomePage homepage;
	HomePageAction actions_home;
public MoreDropdownTest() {
		
		super();	
	}
	
	@BeforeClass
	public void SteUp() throws InterruptedException {
		initialization();
 		homepage=new HomePage();
 		actions_home=new HomePageAction();

	}
	
	@Test
	public void pageTitle_Test() throws InterruptedException {
		actions_home.a_clickMore();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.easemytrip.com/activities/");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test(dependsOnMethods="pageTitle_Test")
	public void SearchBtnFunc_Test() throws InterruptedException {
		actions_home.a_clickSearchBtb();
		Assert.assertEquals(homepage.Get_cityText().isDisplayed(), true);
		System.out.println(homepage.Get_cityText().getText());
	}
	
	@Test(dependsOnMethods="SearchBtnFunc_Test")
	public void PriceFilter_sort_Test() throws InterruptedException {
		actions_home.a_ApplyFilter();
		
	}
	
	@Test(dependsOnMethods="PriceFilter_sort_Test")
	public void Activitylink_Test() throws InterruptedException {
		actions_home.a_Activity_link();
		Assert.assertEquals(homepage.Book_NowVisi().isDisplayed(),true);
	}
	
	@Test(dependsOnMethods="Activitylink_Test")
	
	public void Book_nowBtnTest() throws InterruptedException {
		actions_home.a_clickBookNowBtn();
		Assert.assertEquals(homepage.Selected_details().isDisplayed(),true);
		System.out.println(homepage.Selected_details().getText());
	}
	
	

}

