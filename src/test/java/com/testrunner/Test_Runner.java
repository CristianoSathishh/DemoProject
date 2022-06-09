package com.testrunner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.properties.ConfigurationHelper;
import com.maven.baseclass.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature", glue = "com.stepdefinition",monochrome = true,
tags="@smoke",
plugin=
{"pretty","json:Report/JsonReport.json","html:Report/HtmlReport.html","junit:Report/JunitReport.xml"}
)
public class Test_Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() throws IOException {
		String browser = ConfigurationHelper.getinstance().getinstanceCR().getbrowser();
		driver = Base_Class.browserLaunch(browser);
	}

	@AfterClass
	public static void tear_down() {
		 driver.close();

	}
}
