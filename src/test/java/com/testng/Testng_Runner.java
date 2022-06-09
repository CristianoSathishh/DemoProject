package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng_Runner { 
	@Test
	private void browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\Adactin_Project_Sathish\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
