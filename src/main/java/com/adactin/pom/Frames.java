package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frames {
	public static WebDriver driver;
	public Frames (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
@FindBy(xpath = "//input[@type='text']")
private WebElement text;
public WebElement getText() {
	return text;
}
public WebElement getElement() {
	return element;
}
public WebElement getElement2() {
	return element2;
}
public WebElement getElement3() {
	return element3;
}
public WebElement getElement4() {
	return element4;
}
public WebElement getElement5() {
	return element5;
}
@FindBy(xpath = "//input[@type='text']")
private WebElement element;
@FindBy(partialLinkText = "Iframe with in an Iframe")
private WebElement element2;
@FindBy(xpath = "//iframe[@src='MultipleFrames.html']")
private WebElement element3;
@FindBy(xpath = "//iframe[@src='SingleFrame.html']")
private WebElement element4;
@FindBy(xpath = "//input[@type='text']")
private WebElement element5;


}

