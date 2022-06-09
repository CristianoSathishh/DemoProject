package com.adactin.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary {
	public static WebDriver driver;
@FindBy(xpath = "(//input[@type='checkbox'])[2]")
 private WebElement checkbox;
public BookedItinerary(WebDriver driver2) {
	PageFactory.initElements(driver2, this);
	this.driver=driver2;
}
public static WebDriver getDriver() {
	return driver;
}
public WebElement getCheckbox() {
	return checkbox;
}
public WebElement getCancel() {
	return cancel;
}
public WebElement getLogout() {
	return logout;
}
@FindBy(xpath = "//input[@value='Cancel Selected']")
private WebElement cancel;
@FindBy(id = "logout")
private WebElement logout;

}



