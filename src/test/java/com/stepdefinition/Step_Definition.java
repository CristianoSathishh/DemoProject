package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Sdp;
import com.adactin.properties.ConfigurationHelper;
import com.maven.baseclass.Base_Class;
import com.testrunner.Test_Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class {
	public static WebDriver driver = Test_Runner.driver;
	public static Sdp s = new Sdp(driver);

	@Given("user Launch The Application Url")
	public void user_launch_the_application_url() throws IOException {
		String url = ConfigurationHelper.getinstance().getinstanceCR().getUrl();
		launchUrl(url);
}
	@When("user Enter The Username In {string} Field")
	public void user_enter_the_username_in_field(String string) {
		userinput(s.getLogin().getUsername(), string);
	}
	@When("user Enter The Password In  {string} Field")
	public void user_enter_the_password_in_field(String string) {
		userinput(s.getLogin().getPassword(), string);
	}

//	@When("user Enter The Username In Username Field")
//	public void user_enter_the_username_in_username_field() {
//		userinput(s.getLogin().getUsername(), "");
//
//	}
//
//	@When("user Enter The Password In  Password Field")
//	public void user_enter_the_password_in_password_field() {
//		userinput(s.getLogin().getPassword(), "");
//
//	}

	@Then("user Click The Login Button And It Navigates To Search Hotel Page")
	public void user_click_the_login_button_and_it_navigates_to_search_hotel_page() {

		clicky(s.getLogin().getLogin());

	}

	@When("user Select The Location In Location Field")
	public void user_select_the_location_in_location_field() {
		selectOptions(s.searchHotel().getLocation(), "text", "London");
	}

	@When("user Select The Hotels In Hotels Field")
	public void user_select_the_hotels_in_hotels_field() {
		selectOptions(s.searchHotel().getHotels(), "text", "Hotel Hervey");
	}

	@When("user Select The Room Type In Room Type Field")
	public void user_select_the_room_type_in_room_type_field() {
		selectOptions(s.searchHotel().getRoom_type(), "index", "2");
	}

	@When("user Select The Number of Rooms In Number of Rooms Field")
	public void user_select_the_number_of_rooms_in_number_of_rooms_field() {
		selectOptions(s.searchHotel().getRoom(), "text", "4 - Four");
	}

	@When("user Enter The Check In Date In Check In Date Field")
	public void user_enter_the_check_in_date_in_check_in_date_field() {
		clicky(s.searchHotel().getStart_date());
		cleary(s.searchHotel().getStart_date());
		userinput(s.searchHotel().getStart_date(), "22/04/2022");
	}

	@When("user Enter The Check Out Date In Check Out Date Field")
	public void user_enter_the_check_out_date_in_check_out_date_field() {
		clicky(s.searchHotel().getEnd_date());
		cleary(s.searchHotel().getEnd_date());
		userinput(s.searchHotel().getEnd_date(), "24/04/2022");
	}

	@When("user Select The Adults per Room In Adults per Room Field")
	public void user_select_the_adults_per_room_in_adults_per_room_field() {
		selectOptions(s.searchHotel().getAdult_room(), "text", "3 - Three");
	}

	@When("user Select The Children per Room In Children per Room Field")
	public void user_select_the_children_per_room_in_children_per_room_field() {
		selectOptions(s.searchHotel().getChild_room(), "text", "2 - Two");
	}

	@Then("user Click the Search Button And It Navigates To Select Hotel")
	public void user_click_the_search_button_and_it_navigates_to_select_hotel() {
		clicky(s.searchHotel().getSubmit());
	}

	@When("user Click the Radio Button In Select Field")
	public void user_click_the_radio_button_in_select_field() {
		clicky(s.welcomepage().getRadio());
	}

	@Then("user Click the Continue Button And It Navigates To Book A Hotel")
	public void user_click_the_continue_button_and_it_navigates_to_book_a_hotel() {
		clicky(s.welcomepage().getCon());
	}

	@When("user Enter The Firstname In Firstname Field")
	public void user_enter_the_firstname_in_firstname_field() {
		userinput(s.Bookahotel().getFirst_name(), "sathish");
	}

	@When("user Enter The Last Name In Last Name Field")
	public void user_enter_the_last_name_in_last_name_field() {
		userinput(s.Bookahotel().getLast_name(), "sk");
	}

	@When("user Enter The Billing Address In Billing Address Field")
	public void user_enter_the_billing_address_in_billing_address_field() {
		userinput(s.Bookahotel().getAddress(), " 19,Indira Street,Anna Nagar,ganapathy,coimbatore");
	}

	@When("user Enter The Credit Card No In Credit Card No Field")
	public void user_enter_the_credit_card_no_in_credit_card_no_field() {
		userinput(s.Bookahotel().getNum(), "1234567891234567");
	}

	@When("user Select The Credit Card Type In Credit Card Type Field")
	public void user_select_the_credit_card_type_in_credit_card_type_field() {
		selectOptions(s.Bookahotel().getType(), "index", "2");

	}

	@When("user Select The Month In Expiry Date Field")
	public void user_select_the_month_in_expiry_date_field() {
		selectOptions(s.Bookahotel().getMonth(), "text", "March");
	}

	@When("user Select The year In Expiry Date Field")
	public void user_select_the_year_in_expiry_date_field() {
		selectOptions(s.Bookahotel().getYear(), "text", "2022");

	}

	@When("user Enter CVV Number In CVV Number Field")
	public void user_enter_cvv_number_in_cvv_number_field() {
		userinput(s.Bookahotel().getCvv(), "123");

	}

	@Then("user Click The Submit Button And It Navigates To Booking Confirmation Page")
	public void user_click_the_submit_button_and_it_navigates_to_booking_confirmation_page() {
		clicky(s.Bookahotel().getBook());
	}

	@Then("user Click The My Itinerary Button And It Navigates To Booked Itinerary Page")
	public void user_click_the_my_itinerary_button_and_it_navigates_to_booked_itinerary_page() throws Throwable {
		sleepy(5000);
		clicky(s.bookingConfirmation().getIten());
	}

}
