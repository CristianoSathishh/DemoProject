package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public static WebDriver driver;
	@FindBy(id = "radiobutton_0")
	private WebElement radio;
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getCon() {
		return con;
	}
	@FindBy(id = "continue")
	private WebElement con;
}
