package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
			@FindBy(id = "username")
			private WebElement username;
			public LoginPage(WebDriver driver) {
				PageFactory.initElements(driver,this);
				this.driver=driver;
			}
			public WebElement getUsername() {
				return username;
			}
			public WebElement getPassword() {
				return password;
			}
			public WebElement getLogin() {
				return login;
			}
			@FindBy(id ="password")
			private WebElement password;
			@FindBy(id ="login")
			private WebElement login;

		}


