package com.maven.baseclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver = null;
	// WebElement d = null;

	public static WebDriver browserLaunch(String options) {
		if (options.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
			// return driver;
		} else if (options.equalsIgnoreCase("edge")) {
			System.out.println("edge driver");

		} else {
			System.out.println("browser error");
		}
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;

	}

	public static void launchUrl(String url) {
		driver.get(url);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("the current url is :" + currentUrl);

	}

	public static void gettittle() {
		String s = driver.getTitle();
		System.out.println(s);
	}

	public static void userinput(WebElement e, String value) {
		e.sendKeys(value);

	}

	public static void clicky(WebElement e) {
		e.click();

	}

	public static void boolen(WebElement b) {
		boolean displayed = b.isDisplayed();
		System.out.println(displayed);

	}

	public static void enable(WebElement e) {
		boolean enabled = e.isEnabled();
		System.out.println(enabled);

	}

	public static void title(WebDriver t) {
		String title = t.getTitle();
		System.out.println(title);

	}

	public static void textName(WebElement t) {
		String text = t.getText();
		System.out.println(text);

	}

	public static void getAttribute(WebElement g) {
		String attribute = g.getAttribute("placeholder");
		System.out.println(attribute);

	}

	public static void selectOptions(WebElement element, String options, String value) {
		Select s = new Select(element);
		if (options.equalsIgnoreCase("Text")) {
			s.selectByVisibleText(value);
			// List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			// System.out.println(allSelectedOptions);
		} else if (options.equalsIgnoreCase("selectByValue")) {
			s.selectByValue("options");
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption);
		} else if (options.equalsIgnoreCase("index")) {
			int ref = Integer.parseInt(value);
			s.selectByIndex(ref);

		} else if (options.equalsIgnoreCase("getfirstselect")) {
			WebElement fs = s.getFirstSelectedOption();
			
		} else if (options.equalsIgnoreCase("getallselected")) {
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement zz : allSelectedOptions) {
				System.out.println(zz.getText());
				
			}
			
		}
			
		else {
			System.out.println("wrong selection");
		}
	}

	public static void deselectOptions(WebElement element, String options, String value) {
		Select s = new Select(element);
		if (options.equalsIgnoreCase("Text")) {
			s.deselectByVisibleText(value);

		} else if (options.equalsIgnoreCase("selectByValue")) {
			s.deselectByValue(value);
		} else if (options.equalsIgnoreCase("index")) {
			int ref = Integer.parseInt(value);
			s.deselectByIndex(ref);

		} else {
			System.out.println("wrong selection");
		}

	}

	public static void closey(WebDriver driver) {
		driver.close();

	}

	public static void quity(WebDriver dr) {
		driver.quit();

	}

	public static void isdisplayed(WebElement element, String value) {
		boolean displayed = element.isDisplayed();
		System.out.println("is enabled" + displayed);

	}

	public static void Enabled(WebElement element, String value) {
		boolean enabled = element.isEnabled();
		System.out.println("is enabled" + enabled);

	}

	public static void sleepy(int num) throws Throwable {
		Thread.sleep(num);
	}

	public static void cleary(WebElement Element) {
		Element.clear();
	}

	public static void navigateyto(String url) {
		driver.navigate().to(url);
	}

	public static void navigateyback(String value) {
		driver.navigate().back();
	}

	public static void navigateyforward(String value) {
		driver.navigate().forward();

	}

	public static void navigateyrefresh() {
		driver.navigate().refresh();
	}

	public static void alerty(String options) {
		Alert al = driver.switchTo().alert();

		if (options.equalsIgnoreCase("ok")) {
			driver.switchTo().alert();
			al.accept();
		} else if (options.equalsIgnoreCase("cancel")) {

			al.dismiss();

		} else if (options.equalsIgnoreCase("prompt")) {
			String text = al.getText();
			System.out.println(text);

		}

	}

	public static void alertsenkeys(WebElement element, String value) {
		element.sendKeys(value);

	}
	public static void framey(WebElement ele,String value) {
	
		if (value.equalsIgnoreCase("frame")) {
		driver.switchTo().frame(value);
			
		}else if (value.equalsIgnoreCase("daefaultcontent")) {
			driver.switchTo().defaultContent();
			
		}
		else if (value.equalsIgnoreCase("parentframe")) {
			driver.switchTo().parentFrame();
			
		}

	}
	public static void framei(List<WebElement> a,Integer index, String value) {
		driver.switchTo().frame(index);
		
	}
	public static void iwait(int i) {
Timeouts wait = driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);

	}

}

