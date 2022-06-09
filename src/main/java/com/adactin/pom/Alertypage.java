package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alertypage {
	public static WebDriver driver;
	public Alertypage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(className = "btn btn-danger")
	private WebElement button;

	public WebElement getButton() {
		return button;
	}

}
