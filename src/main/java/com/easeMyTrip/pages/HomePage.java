package com.easeMyTrip.pages;

 
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.easeMyTrip.TestBase.TestBase;

 
 
public class HomePage extends TestBase{
	
	@FindBy(xpath="//a[@class='close_o_pp']")
	WebElement Close_Adds;
	@FindBy(xpath="//i[@class='newHeaderLogo'][1]")
	WebElement Headerlogo;
	@FindBy(xpath="//div[@class='emt_nav']/ul/li[1]/a")
	WebElement Fights_link;
    @FindBy(xpath ="//div[@class='emt_nav']//ul/li/a")
	List<WebElement> header_tabs;
 	@FindBy(xpath="//input[@id='FromSector_show']")
	WebElement source_location;
 	@FindBy(xpath="//span[@id='spnNew Delhi']")
	WebElement select_loc;
	@FindBy(xpath="//p[@id='FromSectorSpan']")
	WebElement Verify_Text;
	@FindBy(xpath="//input[@id='Editbox13_show']")
	WebElement Final_loc;
	@FindBy(xpath="//span[@id='spnBangalore']")
	WebElement select_FinalLoc;
	@FindBy(xpath="//p[@id='Editbox13Span']")
	WebElement Verify_FinalLocText;
	@FindBy(xpath="//input[@id='ddate']")
	WebElement Clk_Startdt;
	@FindBy(xpath="//li[@id='fiv_2_30/05/2023']")
	WebElement Select_dt;
	@FindBy(xpath="//p[@id='dday']")
	WebElement Verify_dateText;
	@FindBy(xpath="//input[@id='rdate']")
	WebElement Clk_Enddt;
	@FindBy(xpath="//p[@id='ptravlrNo']")
	WebElement Select_Traveller;
	@FindBy(xpath="//div[@id='field1']//button[@id='add']")
	WebElement Add_Traveller;
	@FindBy(xpath="//button[@class='srchBtnSe']")
	WebElement Click_searchBtn;
	@FindBy(xpath="(//label[@class='check-box ng-binding'])[3]")
	WebElement Select_nonstop;
	@FindBy(xpath="//div[@id='slider-range']/span[2]")
	WebElement Move_slider;
	@FindBy(xpath="//input[@id='Vistara']")
	WebElement Select_Vistara;
	@FindBy(xpath="//div[@class='top_bar_flgt_1']//div[@class='row no-margn fltResult ng-scope AC']")
	List<WebElement> filter_result;
	@FindBy(xpath="//li[@id='rtrip']")
	WebElement Select_roundTrip;
	@FindBy(xpath="(//span[@class='ckmark-rdo'])[1]")
	WebElement Select_Oneway;
	@FindBy(xpath="//input[@id='FromSector_show']")
	WebElement From_cty;
	@FindBy(xpath="//div[@id='ui-id-91']")
	WebElement Select_Frm;
	@FindBy(xpath="//input[@id='Editbox13_show']")
	WebElement To_cty;
	@FindBy(xpath="//div[@id='ui-id-496']")
	WebElement Select_Tocty;
	@FindBy(xpath="//input[@id='ddate']")
	WebElement Click_StrtDate;
	@FindBy(xpath="//li[@id='fst_3_03/05/2023']")
	WebElement Select_strtDate;
	@FindBy(xpath="//input[@id='rdate']")
	WebElement Click_Enddate;
	@FindBy(xpath="//li[@id='trd_3_12/07/2023']")
	WebElement Select_EndDate;
	@FindBy(xpath="//div[@class='flTrv inp-b5']")
	WebElement Click_travller;
	@FindBy(id="optadult")
	WebElement Select_Trvlr;
	
	
	@FindBy(xpath="//div[@class='emt_nav']//ul//li//a")
	List<WebElement> Header_links;
	@FindBy(xpath="//div[@class='footer_newnov ']//ul//li//a")
	List<WebElement> Footer_links;
	@FindBy(xpath="//div[@class='emt_nav']//ul//li//a[@href='https://www.easemytrip.com/flights.html']")
	WebElement  Flight_tab;
	@FindBy(xpath="//div[@class='emt_nav']/ul/li/a[@href='https://www.easemytrip.com/hotels/'][1]")
	WebElement Hotels_tab;
	@FindBy(xpath="//div[@class='emt_nav']/ul/li/a[@href='https://fph.easemytrip.com/']")
	WebElement Fight_HotelsTab;
	@FindBy(xpath="(//a[@href='https://www.easemytrip.com/railways/'])[1]")
	WebElement Trains_Tab;
	@FindBy(xpath="//div[@class='emt_nav']//ul//li//a[@href='https://www.easemytrip.com/bus/']")
	WebElement Bus_Tab;
	@FindBy(xpath="//img[@src='https://www.easemytrip.com/emt-pro/img/emtpro-header-icon.svg']")
	WebElement Join_Icon;
    @FindBy(xpath="(//div[@class='dropdown-menu'])[1]")
	WebElement Sel_drpdwn;
    @FindBy(xpath="(//a[@href='https://www.easemytrip.com/web-checkin.html'])[1]")
    WebElement Click_WebCheckin;
    @FindBy(xpath="//ul[@id='ui-id-1']/li/div/span[text()='Patna(PAT)']")
    WebElement clickpat;
    @FindBy(xpath="//img[@class='eb_widget_icon']")
    WebElement Click_chat;
    @FindBy(xpath="//div[@class='eb_widget_input_chat_message']")
    WebElement Send_chat;
    @FindBy(xpath="(//div[@class='eb-bubble eb-you'])[1]")
    WebElement Text_Inchat;
  //xpath for hotel page//
    
    @FindBy(xpath="//input[@id='btnSearch']")
    WebElement Search_BtnVisibility;
    @FindBy(xpath="//input[@id='txtCity']")
    WebElement City_Text;
    @FindBy(xpath="(//div[@class='auto_sugg_tttl'][contains(text(),'Delhi')])[1]")
    WebElement Select_city;
    @FindBy(xpath="//input[@id='txtCheckInDate']")
    WebElement Click_InDate;
    @FindBy(xpath="(//a[@class='ui-state-default'])[1]")
    WebElement Select_InDate;
    @FindBy(xpath="(//a[@class='ui-state-default'])[2]")
    WebElement Select_outDate;
    @FindBy(xpath="//div[@id='divPaxPanel']")
	WebElement Click_drpdwn;
    @FindBy(xpath="//a[@id='Children_room_1_1_plus']")
    WebElement Click_plusBtn;
    @FindBy(xpath="//a[@id='Adults_room_1_1_plus']")
    WebElement Click_AdultPlus;
    @FindBy(xpath="//a[@id='exithotelroom']")
    WebElement Click_Done;
    @FindBy(xpath="//button[@class='btnsrch']")
    WebElement searchBtn;
    @FindBy(xpath="//div[@class='htl_ttl ng-binding']")
    List<WebElement> Hotels_Listing;
    @FindBy(xpath="//a[@class='list-property-n2']")
    WebElement HotelListLink;
    @FindBy(xpath="(//a[@class='vwallofer'])[1]")
    WebElement Click_BestOffers;
    @FindBy(xpath="(//div[@class='viewBtn'])[1]")
    WebElement Click_viewRoom;
    @FindBy(xpath="(//a[@class='fill-btn'])[1]")
    WebElement View_BookNow;
   @FindBy(xpath="//div[@class='pr-l1']")
   WebElement totalprice_View;
    @FindBy(xpath="(//div[@id='errFname1'])[1]")
    WebElement Error_msge;
    @FindBy(xpath="(//div[@class='coonpayment'])")
    WebElement Click_paymentbtn;
    @FindBy(xpath="//input[@id='txtEmailId']")
    WebElement Enter_email;
    @FindBy(xpath="//input[@id='txtCPhone']")
    WebElement Enter_MobNo;
    @FindBy(xpath="//input[@id='txtFirstName1']")
    WebElement Enter_FirstName;
    @FindBy(xpath="//input[@id='txtLastName1']")
    WebElement Enter_lastName;
    @FindBy(xpath="//input[@id='txtFirstNameChild1']")
    WebElement Child_firstName;
    @FindBy(xpath="//input[@id='txtLastNameChild1']")
    WebElement Child_lastName;
    @FindBy(xpath="(//div[@class='mk-pym'])[4]")
    WebElement Make_paymentbtn;
    
    //Hotel+flight module
    
    @FindBy(xpath="//div[@class='hp_inputBox searchButon ']")
    WebElement SearchBtn_visibiltyTest;
    @FindBy(xpath="(//div[@class='bookhBtnx'and text()='View Detail'])[1]")
    WebElement View_detailsBtn;
    
    @FindBy(xpath="//span[@class='checkmark_ckbx']")
    WebElement Check_Box;
    
    @FindBy(xpath="//input[@id='HotelSector_show']")
    WebElement View_diffCities;
    
    @FindBy(xpath="//input[@id='FromSector_show']")
    WebElement Enter_srcLoc;
    
    @FindBy(xpath="//div[@class='ui-menu-item-wrapper']//span[2][text()='Bangalore(BLR)']")
    WebElement select_Loc2;
    
    @FindBy(xpath="//li[@id='snd_6_10/06/2023']")
    WebElement SelectDate1;
    
    @FindBy(xpath="//a[@class='dropbtn_nx']")
    WebElement Click_trvlr;
    
    @FindBy(xpath="(//input[@class='plus_box1'])[1]")
    WebElement Add_adlt;
    
    @FindBy(xpath="(//input[@class='plus_boxChd'])[1]")
    WebElement Add_child;
    
    @FindBy(xpath="//a[@id='traveLer']")
    WebElement click_done;
    
    @FindBy(xpath="//a[@id='droproom']")
    WebElement click_Rooms;
    
    @FindBy(xpath="//input[@id='roomsplus']")
    WebElement Add_room;
    
    @FindBy(xpath="//a[@id='tripType']")
    WebElement Click_RoomsDone;
    
    @FindBy(xpath="//a[@id='drpnight']")
    WebElement Click_nights;
    
    @FindBy(xpath="//input[@id='nightplus']")
    WebElement Add_nights;
    
    @FindBy(xpath="//a[@id='Nights']")
    WebElement Click_nightDone;
    
    @FindBy(xpath="//div[@class='flxsec lt']")
    WebElement Search_Data;
    
    @FindBy(xpath="(//div[@class='bookhBtnx'])[1]")
    WebElement Click_ViewDatails;
    
    @FindBy(xpath="//div[@id='description0']")
    WebElement View_Details;
    
    @FindBy(xpath="//div[@class='flxsec rt']")
    WebElement Edit_detailsBtn;
    
    @FindBy(xpath="(//span[@class='headtitl'])[3]")
    WebElement Modify_Text;
    
    @FindBy(xpath="//img[@src='https://fph.easemytrip.com/Content/img/close-circle.svg']")
    WebElement Cancel_Modify;
    
    @FindBy(xpath="(//a[@class='fill-btn bdrds20'])[1]")
    WebElement Click_BookNow;
    
    @FindBy(xpath="//span[@id='btnSideBarPayment']")
    WebElement visibility_CntnueBkng;
    
    @FindBy(xpath="//span[@id='lblGrandTotal']")
    WebElement TotalPrice_text;
    
    @FindBy(xpath="//input[@id='txtFirstNameAdult1']")
    WebElement First_Name1;
    
    @FindBy(xpath="//input[@id='txtLastNameAdult1']")
    WebElement Last_Name1;
    
    @FindBy(xpath="//input[@id='txtFirstNameAdult2']")
    WebElement First_Name2;
    
    @FindBy(xpath="//input[@id='txtLastNameAdult2']")
    WebElement Last_Name2;
    
    @FindBy(xpath="//input[@id='txtFirstNameChild1']")
    WebElement Ch_firstName;
    
    @FindBy(xpath="//input[@id='txtLastNameChild1']")
    WebElement Ch_lastName;
    
    @FindBy(xpath="//input[@id='txtEmailId']")
    WebElement Email;
    
    @FindBy(xpath="//input[@id='txtCPhone']")
    WebElement Mob_no;
    
    @FindBy(xpath="//span[@id='btnSideBarPayment']")
    WebElement click_cntnueBtn;
    
    @FindBy(xpath="( //div[@class='mk-pym'])[2]")
    WebElement make_payment;
    
    //Trains-Module
    @FindBy(xpath="(//a[@href='https://www.easemytrip.com/railways/'])[1]")
    WebElement click_TrainsTab;
    
    @FindBy(xpath="//input[@class='bsrc-btn']")
    WebElement Search_btn;
    
    @FindBy(xpath="//div[@id='SourceID']")
    WebElement validation_msge;
    
    @FindBy(xpath="//input[@id='txtfromcity']")
    WebElement Enter_frmCity;
    
    @FindBy(xpath="//input[@id='txtdesticity']")
    WebElement Enter_toCity;
    
    @FindBy(xpath="//*[@class='_16Y_']//div//div[@class='_3sXO']")
    WebElement Select_city1;
    
    @FindBy(xpath="(//*[@class='_16Y_']//div//div[@class='_3sXO'])[11]")
    WebElement Select_city2;
    
    @FindBy(xpath="//span[@id='NextSecondDayName']")
    WebElement Click_date;
    
    @FindBy(xpath="//div[@id='divJurney']")
    WebElement Train_text;
    ////div[@id='divJurney']
    @FindBy(xpath="(//div[@class='_3sXO'])[1]")
    WebElement Dest_modify;
    
    @FindBy(xpath="//input[@id='txtdesticity']")
    WebElement Click_Dest;
    
    @FindBy(xpath="//a[@class='mdf_btn']")
    WebElement Modify_btn;
    
    @FindBy(xpath="(//div[@class='tr-view label'])[1]")
    WebElement View_routeLink;
    
    @FindBy(xpath="(//div[@class='modal_cont_tr'])[1]")
    WebElement Route_Text;
    
    @FindBy(xpath="//span[@class='close_statn']")
    WebElement cut_Route;
    
    @FindBy(xpath="(//div[@id='TrainBookId'])[1]")
    WebElement Click_bookBtn;
    
    @FindBy(xpath="//button[@class='btn_ct']")
    WebElement cntnue_Btn;
    
    
    @FindBy(xpath= "(//div[@class='w1h']//button[@class='b1 bk_nw'])[2]")
    WebElement  Book_now;
    
    @FindBy(xpath="(//div[@class='bor'])[9]")
    WebElement Price_Text;
    
    
    @FindBy(xpath="//div[@class='greybg']")
    WebElement Trvlr_detials;
    
    @FindBy(xpath="//input[@class='inpcx']")
    WebElement Enter_irctc;
    
    @FindBy(xpath="//input[@id='txtEmailID']")
    WebElement Enter_rlyemail;
    
    @FindBy(xpath="//input[@id='txtMobileNo']")
    WebElement Enter_mob;
    
    @FindBy(xpath="//select[@id='ddlPassengerAge0']")
    WebElement _Clickdrpdwn;
    
    @FindBy(xpath="(//option[@ng-option='ng-option'])[1]")
    WebElement _Selectgender;
    
    @FindBy(xpath="//input[@id='txtAdultFirstName0']")
    WebElement Enter_Frname; 
    
    @FindBy(xpath="//input[@id='txtAge0']")
    WebElement enter_Age;
    
    @FindBy(xpath="//select[@id='ddlAdultBirthPre0']")
    WebElement select_Birth;
    
    @FindBy(xpath="(//span[@class='cmark_cbox'])[1]")
    WebElement Select_trvlr;
    
    @FindBy(xpath="//span[@class='co1']")
    WebElement Click_cntnueBtn;
    
    @FindBy(xpath="(//a[@href='JavaScript:void(0);'])[3]")
    WebElement Wallet_link;
    
    
    @FindBy(xpath="(//span[@class='b_logo_sml'])[2]")
    WebElement click_phonePay;
    
    @FindBy(xpath="(//div[@class='mk-pym4'])[1]")
    WebElement Make_payment;
    
    @FindBy(xpath="//input[@id='mobileNumber']")
    WebElement Enter_Mob;
    
    @FindBy(xpath="//img[@class='pplImage__1-iPX']")
    WebElement Payment_otp;
    
    @FindBy(xpath="//div[@id='vrfyDiv']")
    WebElement Save_Btn;
    
    
    @FindBy(xpath="//div[@id='errUsername']")
    WebElement Verified_Text;
    
    
    //more dropdown//
    
    @FindBy(xpath="(//i[@class='down_arw'])[1]")
    WebElement More_Link;
    
    @FindBy(xpath="(//a[@href='https://www.easemytrip.com/activities/'])[2]")
    WebElement Activities_;
    
    @FindBy(xpath="//input[@id='txtcityname']")
    WebElement Enter_city;
    
    @FindBy(xpath="//button[@class='subm']")
    WebElement clcik_srch;
    
    @FindBy(xpath="//h1[@class='ng-binding']")
    WebElement Getcity_Text;
    
    @FindBy(xpath="(//span[@class='ng-binding'])[1]")
    WebElement Select_cty;
    
    @FindBy(xpath="//*[@id='slider-range']/span[2]")
    WebElement _Moveslider;
    
    @FindBy(xpath="//a[@id='sortOpen']")
    WebElement _clickSort;
    
    @FindBy(xpath="(//span[@class='checkmark_f'])[14]")
    WebElement _SelectOption;
    
    
    @FindBy(xpath="(//div[@class='hot-page2-hli-1 ng-scope'])[1]")
    WebElement _clickAct1; 
    
    @FindBy(xpath="//a[@ng-click='SelectedPackage()']")
    WebElement _BookNow_visi;
    
    @FindBy(xpath="//input[@id='TxtDate']")
    WebElement Enter_date;
    
    
    @FindBy(xpath="(//td[@class=' undefined']/a)[16]")
    WebElement Select_date;
    
    @FindBy(xpath="//select[@id='ddltimeslote']")
    WebElement click_Time;
    
    @FindBy(xpath="//select[@id='ddltimeslote']/option[7]")
    WebElement Select_Time;
    
    @FindBy(xpath="//div[@class='hotelrvw-info']")
    WebElement Select_details;
    
    
    //Gift Card//
    @FindBy(xpath="(//div[@class='dropdown-menu']/a)[3]")
    WebElement Gift_Card;
    
    @FindBy(xpath="//img[@alt='E-Gift Card']")
    List<WebElement>Coutn_card;
    
    @FindBy(xpath="(//a[@class='button  mg_30'])[1]")
    WebElement Click_GiftNow;
    
    @FindBy(xpath="//h3[@class='txt_form']")
    WebElement GiftPage_Text;
    
    @FindBy(xpath="(//input[@type='text'])[6]")
    WebElement _EnterDeno;
    
    @FindBy(xpath="//select[@selected='selected']")
    WebElement Select_Qaunt;
    
    @FindBy(xpath="(//span[@class='checkmark'])[1]")
    WebElement select_delDate;
    
    @FindBy(xpath="(//input[@type='text'])[8]")
    WebElement Enter_sender;
    
    @FindBy(xpath="(//input[@type='text'])[9]")
    WebElement Enter_sendEmail;
    
    @FindBy(xpath="(//input[@type='text'])[10]")
    WebElement Enter_sendMob;
    
    @FindBy(xpath="(//input[@type='text'])[11]")
    WebElement Enter_Recip_Name;
    
    @FindBy(xpath="(//input[@type='text'])[12]")
    WebElement Enter_Recip_Email;
    
    @FindBy(xpath="(//input[@type='text'])[13]")
    WebElement ReEnter_Recip_Email;
    
    @FindBy(xpath="(//input[@type='text'])[14]")
    WebElement EnterRec_Mob;

    @FindBy(xpath="(//input[@type='checkbox'])[2]")
    WebElement Accept_term;
    
    @FindBy(xpath="//div[@id='pny']")
    WebElement Click_paynow;
    
    @FindBy(xpath="(//p[@class='err_msg ng-binding'])[4]")
    WebElement Validate_text;



	 public HomePage()
	 {
		PageFactory.initElements(driver, this);
		
	 }
	
	public String validateHomePageTitle() {
		return driver.getTitle();
		
	}
	
	public WebElement Ignore_Adds() {
		return Close_Adds;
	}
	public WebElement ValidateHeaderlogo() {
		return Headerlogo;
	}
	
	public String ValidateURl() {
		return driver.getCurrentUrl();
	}
//	
	public WebElement link_is_Clickable() {
		return Fights_link;
	}
	public List<WebElement> ValidateHeader_Tabs() {
		return header_tabs;
	}
	public WebElement Click_SrcLoc() {
		return source_location;
	}
	public WebElement Validate_loc() {
		return select_loc;
	}
	public WebElement Validate_LocText() {
		return Verify_Text;
	}
	
		public WebElement Validate_FinalLoc() {
			return Final_loc;
		}
		public WebElement Select_FinalLoc() {
			return select_FinalLoc;
		}
		public WebElement Validate_FinalLocText() {
			return Verify_FinalLocText;
		}
		public WebElement Validate_Clickdt() {
			return Clk_Startdt;
		}
		public WebElement ValidateSlelectdt() {
			return Select_dt;
		}
		public WebElement Validate_dateText() {
			return Verify_dateText;
		}
		public WebElement Validate_ClickEndDt() {
			return Clk_Enddt;
		}
		public WebElement Validate_SelectTraveller() {
			return Select_Traveller;
		}
		public WebElement Validate_AddTraveller() {
			return Add_Traveller;
		}
		public WebElement Validate_Searchbutton() {
			return Click_searchBtn;
		}
		public WebElement Choose_Filter1() {
			return Select_nonstop;
		}
		public WebElement Validate_Move_Slider() {
			return Move_slider;
		}
		public List<WebElement> Validate_filter_result() {
			return filter_result;
		}
		public WebElement Choose_Filter2() {
			return Select_Vistara;
		}
		
	public WebElement Select_radiobtn() {
		return Select_roundTrip;
	}
	public WebElement Select_Oneway() {
		return Select_Oneway;
	}
	public WebElement Click_FromCity() {
		return From_cty;
	}
	public WebElement select_FromCity() {
		return clickpat;
	}
	public WebElement Click_ToCity() {
		return To_cty;
	}
	public WebElement Select_ToCity() {
		return Select_Tocty;
	}
	public WebElement Click_strtDate() {
		return Click_StrtDate;
	}
	public WebElement Select_startDate() {
		return Select_strtDate;
	}
	public WebElement click_EndDate() {
		return Click_Enddate;
	}
	public WebElement Select_EndDate() {
		return Select_EndDate;
	}
	public List<WebElement> ValidateHeaderlinks() {
		return Header_links;
	}
	
	public List<WebElement> ValidateFooterlinks() {
		return Footer_links;
	}
	
	public  WebElement  ValidateFlight_tab() {
		return Flight_tab;
 	}
//	 
	public WebElement Validate_HotelTab() {
		return Hotels_tab;
	}
	public WebElement ValidateFlight_HotelsTab() {
		return Fight_HotelsTab;
	}
	public WebElement Validate_TrainsTab() {
		return Trains_Tab;
	}
	public WebElement Validate_BusTab() {
		return Bus_Tab;
	}
	
	public WebElement Validate_joinIcon() {
		return Join_Icon;
	
 	}
	 public WebElement Validate_More_drpdwn() {
		 return Sel_drpdwn;
	 }
	 public WebElement Validate_Web_checkIn() {
		 return Click_WebCheckin;
		 
	 }
	 public WebElement Validate_clickChat() {
		 return Click_chat;
	 }
	 public WebElement Validate_SendCaht() {
		 return Send_chat;
	 }
	 public WebElement Validate_Text_Inchat() {
		 return Text_Inchat;
	 }
	 
	 //Hotels Page--
	 public WebElement ValidateVisibilty_srchBtn() {
		 return Search_BtnVisibility;
	 }
	 public WebElement Click_TextCity() {
		 return City_Text;
	 }
	 public WebElement Select_City1() {
		 return Select_city;
	 }
	 public WebElement Click_date() {
		 return Click_InDate;
		 
	 }
	 public WebElement Select_In_date() {
		 return Select_InDate;
	 }
	 public WebElement Selct_out_Date() {
		 return Select_outDate;
	 }
	 public WebElement Click_Dropdwon() {
		 return Click_drpdwn;
	 }
	 public WebElement ClickplusBtn() {
		 return Click_plusBtn;
	 }
	 public WebElement click_AdultPlus() {
		 return Click_AdultPlus;
	 }
	 public WebElement Click_Done() {
		 return Click_Done;
	 }
	 public WebElement Click_searchBtn() {
		 return searchBtn;
	 }
	 public List<WebElement> Validate_HotelListing() {
		 return Hotels_Listing;
	 }
	 public WebElement Validate_ListHotelLink() {
		 return HotelListLink;
	 }
	 public WebElement Click_BestOffers() {
		 return Click_BestOffers;
	 }
	 public WebElement click_viewRoom() {
		 return Click_viewRoom;
	 }
	 public WebElement BookNow_visibility() {
		 return View_BookNow;
	 }
	 public WebElement TotalPrice_() {
		 return totalprice_View;
	 }
	 public WebElement Validate_errorMsge() {
		 return Error_msge;
	 }
	 public WebElement Click_payment() {
		 return Click_paymentbtn;
	 }
	 public WebElement Enter_email() {
		 return Enter_email;
	 }
	 public WebElement Enter_MOB() {
		 return Enter_MobNo;
	 }
	 public WebElement Enter_firstname() {
		 return Enter_FirstName;
	 }
	 public WebElement Enter_Lastname() {
		 return Enter_lastName;
	 }
	 public WebElement Enter_Childfirstname() {
		 return Child_firstName;
	 }
	 public WebElement Enter_Childlastname() {
		 return Child_lastName;
	 }
	 public WebElement Vlaidate_datails() {
		 return Make_paymentbtn;
	 }
	 
	 //Hotel+flight module
	 
	 public WebElement Validate_visibilityBtn() {
		 return SearchBtn_visibiltyTest;
	 }
	 public WebElement Validate_ViewDetailsBtn() {
		 return View_detailsBtn;
	 }
	 public WebElement Validate_checkBox() {
		 return Check_Box;
	 }
	 public WebElement Validate_diffCiti() {
		 return View_diffCities;
	 }
	 public WebElement Click_srcLoc() {
		 return Enter_srcLoc;
	 }
	 public WebElement Select_FinalLoc2() {
		 return select_Loc2;
	 }
	 public WebElement select_Date() {
		 return SelectDate1;
	 }
	 public WebElement click_Trvlr() {
		 return Click_trvlr;
	 }
	 
	 public WebElement Add_adult() {
		 return Add_adlt;
	 }
	 public WebElement Add_child() {
		 return Add_child;
	 }
	 public WebElement click_Done() {
		 return click_done;
	 }
	 
	 public WebElement Click_Rooms() {
		 return click_Rooms;
		 
	 }
	 public WebElement Add_Room() {
		 return Add_room;
	 }
	 public WebElement Click_roomsDone() {
		 return Click_RoomsDone;
	 }
	 public WebElement Click_Nights() {
		 return Click_nights;
	 }
	 public WebElement Add_nights() {
		 return Add_nights;
	 }
	 
	 public WebElement click_DoneNights() {
		 return Click_nightDone;
	 }
	 
	  
	 public WebElement SearchResult_Data() {
		 return Search_Data;
	 }
	 
	 public WebElement Click_viewDeatail() {
		 return Click_ViewDatails;
	 }
	 
	 public WebElement ViewDatails_Btn() {
		 return View_Details;
	 }
	 public WebElement validate_EditDetails_Btn() {
		 return Edit_detailsBtn;
		
	 }
	 public WebElement Validate_ModifySearch_text() {
		 return Modify_Text;
	 }
	 public WebElement Cancel_modify() {
		 return Cancel_Modify;
	 }
	 public WebElement Click_BookNow() {
		 return Click_BookNow;
	 }
	public WebElement Continue_Booking() {
		return visibility_CntnueBkng;
	}
	public WebElement Validate_totalPrice() {
		return TotalPrice_text;
	}
	public WebElement FirstName_1() {
		return First_Name1;
	}
	public WebElement LastName_1() {
		return Last_Name1;
	}
	public WebElement FirstName_2() {
		return First_Name2;
	}
	public WebElement lastName_2() {
		return Last_Name2;
	}
	public WebElement  Ch_Firstname() {
		return Ch_firstName;
	}
	public WebElement ch_LastName() {
		return Ch_lastName;
	}
	public WebElement Email_() {
		return Email;
	}
	public WebElement MobNo_() {
		return Mob_no;
	}
	public WebElement click_cntnBtn() {
		return click_cntnueBtn;
	}
	public WebElement MakePayment_visibility() {
		return make_payment;
	}
	
	//Trains Module
	
	public WebElement click_TrainsTab() {
		return click_TrainsTab;
	}
	public WebElement Click_searchBtnTest() {
		return Search_btn;
	}
	public WebElement Validation_msge() {
		return validation_msge;
	}
	public WebElement Enter_frmCity_() {
		return Enter_frmCity;
	}
	public WebElement Select_city1() {
		return Select_city1;
	}
	public WebElement Enter_tocity() {
		return Enter_toCity;
	}
	public WebElement Selectcity_2() {
		return Select_city2;
	}
	public WebElement click_date() {
		return Click_date;
	}
	public WebElement Validate_text() {
		return Train_text;
	}
	public WebElement Modify_dest() {
		return Dest_modify;
	}
	public WebElement Click_dest() {
		return Click_Dest;
	}
	public WebElement click_ModifyBtn() {
		return Modify_btn;
	}
	public WebElement Click_viewRoute() {
		return View_routeLink;
	}
	
	public WebElement Cut_Route() {
		return cut_Route;
	}
	
	public WebElement Route_Text() {
		return Route_Text;
	}
	public WebElement click_BookBtn() {
		return Click_bookBtn;
	}
	public WebElement cntnu_Btn() {
		return cntnue_Btn;
	}
	public WebElement Book_nowBtn() {
		return Book_now;
	}
	public WebElement Validate_priceText() {
		return Price_Text;
	}
	public WebElement Validate_trvlrDetails() {
		return Trvlr_detials;
	}
	public WebElement Enter_irctc() {
		return Enter_irctc;
	}
	public WebElement Enter_Rlemail() {
		return Enter_rlyemail;
	}
	public WebElement Enter_Mob() {
		return Enter_mob;
		
	}
	public WebElement Click_drpdwn() {
		return _Clickdrpdwn;
	}
	public WebElement Select_option() {
		return _Selectgender;
	}
	public WebElement Enter_firName() {
		return Enter_Frname;
	}
	public WebElement Enter_age() {
		return enter_Age;
	}
	public WebElement Select_birth() {
		return select_Birth;
	}
	public WebElement Select_Trvlr() {
		return Select_trvlr;
	}
	public WebElement Click_cntnueBtn() {
		return Click_cntnueBtn;
		
	}
	public WebElement Click_Wallet() {
		return Wallet_link;
	}
	public WebElement click_phonePay() {
		return click_phonePay;
	}
	public WebElement Make_payment() {
		return Make_payment;
	}
	public WebElement Enter_mob() {
		return Enter_Mob;
	}
	public WebElement Validate_payment() {
		return Payment_otp;
	}
	public WebElement Validate_saveBtn() {
		return Save_Btn;
	}
	public WebElement Get_text() {
		return Verified_Text;
	}
	
	//More dropdown//
	
	public WebElement Click_more() {
		return More_Link;
	}
	public WebElement Click_Activitie() {
		return Activities_;
	}
	public WebElement _Entercity() {
		return Enter_city;
	}
	public WebElement _SelctCity() {
		return Select_cty;
	}
	public WebElement Click_srch() {
		return clcik_srch;
	}
	public WebElement Get_cityText() {
		return Getcity_Text;
	}
	public WebElement Move_slider() {
		return _Moveslider;
	}
	public WebElement Click_sort() {
		return _clickSort;
	}
	public WebElement Selectoption_() {
		return _SelectOption;
	}
	public WebElement Click_Act1() {
		return _clickAct1;
	}
	public WebElement Book_NowVisi() {
		return _BookNow_visi;
	}
	public WebElement clickdate_() {
		return Enter_date;
	}
	public WebElement Select_date() {
		return Select_date;
	}
	public WebElement click_time() {
		return click_Time;
	
	}
	public WebElement Select_time() {
		return Select_Time;
	}
	public WebElement Selected_details() {
		return Select_details;
	}
	
	
	//Gift Card//
	
	public WebElement Click_GiftCard() {
		return Gift_Card;
	}
	public List<WebElement> Count_Cards() {
		return Coutn_card;
 	}
	
	public WebElement Click_GiftNowBtn() {
		return Click_GiftNow;
	}
	public WebElement GiftPage_Text() {
		return GiftPage_Text;
	}
	public WebElement Enter_deno() {
		return _EnterDeno;
	}
	public WebElement Select_qaunt() {
		return Select_Qaunt;
	}
	
	public WebElement Selec_deleivery() {
		return select_delDate;
	}
	public WebElement EnterSend_Name() {
		return Enter_sender;
	}
	public WebElement EnterSend_Email() {
		return Enter_sendEmail;
	}
	public WebElement Enter_sendMOB() {
		return Enter_sendMob;
	}
	public WebElement EnterRec_Name() {
		return Enter_Recip_Name;
	}
	public WebElement EnterRec_Email() {
		return Enter_Recip_Email;
	}
	public WebElement ReEnterRec_Email() {
		return ReEnter_Recip_Email;
	}
	public WebElement Enter_RecMob() {
		return EnterRec_Mob;
	}
	
	public WebElement check_Box() {
		return Accept_term;
	}
	public WebElement Click_Paynow() {
		return Click_paynow;
	}
	 
	public WebElement Validate_Text() {
		return Validate_text;
	 
	}
}

