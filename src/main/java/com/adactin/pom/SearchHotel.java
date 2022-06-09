package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	 public static WebDriver driver;
	@FindBy(xpath ="//select[@id='location']")
	private WebElement location;
	public SearchHotel(WebDriver driver2) {
		PageFactory.initElements(driver2,this);
		this.driver=driver2;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoom_type() {
		return room_type;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getStart_date() {
		return start_date;
	}
	public WebElement getEnd_date() {
		return end_date;
	}
	public WebElement getAdult_room() {
		return adult_room;
	}
	public WebElement getChild_room() {
		return child_room;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	@FindBy(xpath ="//select[@id='hotels']")
	private WebElement hotels;
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement room_type;
	@FindBy(id ="room_nos")
	private WebElement room;
	@FindBy(xpath ="(//input[@type='text'])[2]")
	private WebElement start_date;
	@FindBy(name="datepick_out")
	private WebElement end_date;
	@FindBy(id ="adult_room")
	private WebElement adult_room;
	@FindBy(xpath ="//select[@id='child_room']")
	private WebElement child_room;
	@FindBy(id ="Submit")
	private WebElement Submit;
	public void clear() {
		
	}

}
