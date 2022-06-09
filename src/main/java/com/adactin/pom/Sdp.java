package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Sdp {
	public static WebDriver driver;


	public Sdp(WebDriver driver2) {
		PageFactory.initElements(driver2, this);
		this.driver=driver2;
	}
	
	public LoginPage getLogin() {
		LoginPage lp = new LoginPage(driver);
return lp;
	}

	public SearchHotel searchHotel() {
		SearchHotel sh = new SearchHotel(driver);
		return sh;

	}
	public WelcomePage welcomepage() {
		WelcomePage wp = new WelcomePage(driver);
		return wp;

	}
	public BookHotel Bookahotel() {
		BookHotel bh=new BookHotel(driver);
		return bh;
	}
	public BookingConfirmation bookingConfirmation() {
		BookingConfirmation bc=new BookingConfirmation(driver);
		return bc;
	}
	public BookedItinerary BookedItinerary() {
		BookedItinerary bi=new BookedItinerary(driver);
		return bi;
	}
	public  Frames Frames() {
		Frames fr=new Frames(driver);
		return fr;
	}
	
}

