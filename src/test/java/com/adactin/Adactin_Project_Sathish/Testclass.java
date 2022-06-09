package com.adactin.Adactin_Project_Sathish;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookHotel;
import com.adactin.pom.Sdp;
import com.adactin.properties.ConfigurationHelper;
import com.datadriven.XLSXreader;
import com.maven.baseclass.Base_Class;

public class Testclass extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		String browser = ConfigurationHelper.getinstance().getinstanceCR().getbrowser();
		driver = browserLaunch(browser);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = ConfigurationHelper.getinstance().getinstanceCR().getUrl();
		launchUrl(url);
		gettittle();
		Sdp s = new Sdp(driver);
		// String xl = XLSXreader.xlsxReader(0, 0, 0);

		// userinput(s.getLogin().getUsername(), xl);//1 way
		// userinput(s.getLogin().getPassword(),XLSXreader.xlsxReader(0, 1, 1));//2 way
		iwait(10);
		userinput(s.getLogin().getUsername(), "sathish510");
		userinput(s.getLogin().getPassword(), "sathish@123");
		clicky(s.getLogin().getLogin());
		selectOptions(s.searchHotel().getLocation(), "text", "London");
		selectOptions(s.searchHotel().getHotels(), "text", "Hotel Hervey");
		selectOptions(s.searchHotel().getRoom_type(), "index", "2");
		selectOptions(s.searchHotel().getRoom(), "text", "4 - Four");
		sleepy(5000);
		clicky(s.searchHotel().getStart_date());
		cleary(s.searchHotel().getStart_date());
		userinput(s.searchHotel().getStart_date(), "22/04/2022");
		s.Bookahotel().getMonth();
		sleepy(2000);
		clicky(s.searchHotel().getEnd_date());
		cleary(s.searchHotel().getEnd_date());
		userinput(s.searchHotel().getEnd_date(), "24/04/2022");
		selectOptions(s.searchHotel().getAdult_room(), "text", "3 - Three");
		selectOptions(s.searchHotel().getChild_room(), "text", "2 - Two");

		sleepy(2000);
		clicky(s.searchHotel().getSubmit());
		clicky(s.welcomepage().getRadio());

		clicky(s.welcomepage().getCon());

		userinput(s.Bookahotel().getFirst_name(), "sathish");
		userinput(s.Bookahotel().getLast_name(), "kumar");
		userinput(s.Bookahotel().getAddress(), "19,Indira Street,Anna Nagar,ganapathy,coimbatore");
		userinput(s.Bookahotel().getNum(), "1234567891234567");
		selectOptions(s.Bookahotel().getType(), "index", "2");
		selectOptions(s.Bookahotel().getMonth(), "text", "March");
		selectOptions(s.Bookahotel().getYear(), "text", "2022");
		userinput(s.Bookahotel().getCvv(), "223");
		clicky(s.Bookahotel().getBook());

		clicky(s.bookingConfirmation().getIten());
//		clicky(s.BookedItinerary().getCheckbox());
//		clicky(s.BookedItinerary().getCancel());
//		driver.switchTo().alert().accept();
//		sleepy(3000);
//		clicky(s.BookedItinerary().getLogout());
//		navigateyto("http://demo.automationtesting.in/Register.html");
//		navigateyback("https://adactinhotelapp.com/");
//		navigateyforward("http://demo.automationtesting.in/Register.html");
	}
}
