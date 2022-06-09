package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	public static WebDriver driver;
	public BookHotel(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(name = "first_name")
	 private WebElement first_name;
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirst_name() {
		return first_name;
	}
	public WebElement getLast_name() {
		return last_name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getNum() {
		return num;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}
	@FindBy(xpath ="//input[@id='last_name']")
	private WebElement last_name;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "cc_num")
	private WebElement num;
	@FindBy(id = "cc_type")
	private WebElement type;
	@FindBy(id = "cc_exp_month")
	private WebElement month;
	@FindBy(id = "cc_exp_year")
	private WebElement year;
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	@FindBy(id = "book_now")
	private WebElement book;

}
