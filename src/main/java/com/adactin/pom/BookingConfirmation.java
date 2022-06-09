package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {
	public static WebDriver driver;
	public BookingConfirmation(WebDriver driver2) {
		PageFactory.initElements(driver2,this);
		this.driver=driver2;
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getIten() {
		return iten;
	}
	@FindBy(id = "my_itinerary")
	 private WebElement iten;
	}
