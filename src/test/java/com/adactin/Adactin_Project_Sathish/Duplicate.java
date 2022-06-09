package com.adactin.Adactin_Project_Sathish;

//import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.adactin.pom.Frames;
//import com.adactin.pom.STP;
import com.adactin.pom.Sdp;
import com.maven.baseclass.Base_Class;

public class Duplicate extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		driver = browserLaunch("chrome");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		launchUrl("https://adactinhotelapp.com/");
		Sdp s = new Sdp(driver);
		sleepy(2000);
		String st = null;
		userinput(s.getLogin().getUsername(),st);
		//userinput(s.getLogin().getPassword()., st)
		//List<WebElement> a = driver.findElements(By.tagName("iframe"));
		//int b = a.size();
		//System.out.println(b);
     //    framei(a,0,"index");
		//driver.switchTo().frame("singleframe");
		//WebElement fe = driver.findElement(By.xpath("//input[@type='text']"));
        // WebElement fe = s.Frames().getElement();
		//userinput(fe, "sathish");
//		driver.switchTo().defaultContent();
	//	framey(fe,  null);
//		Thread.sleep(3000);
//		driver.findElement(By.partialLinkText("Iframe with in an Iframe")).click();
//		WebElement a1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
//		driver.switchTo().frame(a1);
//		WebElement a2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
//		driver.switchTo().frame(a2);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sathish sk");
//		driver.switchTo().defaultContent();

//		//WebElement findElement = driver.findElement(By.className("btn btn-danger"));
//		//clicky(findElement);
//		WebElement se = driver.findElement(By.xpath("//a[@class='dropdown-toggle'][1]"));
//		clicky(se);
//		WebElement sa = driver.findElement(By.xpath("//a[contains(text(),'Alert with OK')] [1]"));
//		clicky(sa);
//		sleepy(2000);
//		WebElement sc = driver.findElement(By.xpath("//button[contains(text(),'click the button ')] [1]"));
//		clicky(sc);
//		alerty("ok");
////		Alert a=driver.switchTo().alert();
////		Thread.sleep(4000);
////		a.accept();
////		Thread.sleep(4000);
//		WebElement sd = driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')] "));
//		clicky(sd);
//		sleepy(2000);
////		Thread.sleep(3000);
//		WebElement sf = driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]"));
//		clicky(sf);
//		sleepy(4000);
////		Thread.sleep(4000);
////		Alert b =driver.switchTo().alert();
////		b.dismiss();
//		alerty("cancel");
////		Thread.sleep(3000);
//		WebElement sg = driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')] "));
//		clicky(sg);
//		WebElement sh = driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]"));
//		clicky(sh);
////		Alert c=driver.switchTo().alert();
////		Thread.sleep(2000);
//		sleepy(2000);
//		alertsenkeys(sh,"glad to see you al");
////		c.sendKeys("glad to see you all");
//		alerty("prompt");
////		String d=c.getText();
////		System.out.println(d);
//		alerty("ok");
////		c.accept();
//		
//		//alerty("ok");
////WebElement aaa = driver.findElement(By.xpath("//a[@class='analystic']"));
////clicky(aaa);
//		
////		gettittle();
////		STP s = new STP(driver);
////
////		userinput(s.getLogin().getUsername(), "sathish510");
////		userinput(s.getLogin().getPassword(), "sathish@123");
////		clicky(s.getLogin().getLogin());
////		sleepy(2000);
////		navigateyto("http://demo.automationtesting.in/Register.html");
////		navigateyback("https://adactinhotelapp.com/");
////		navigateyforward("http://demo.automationtesting.in/Register.html");
////		// WebElement aaa = driver.findElement(By.xpath("//input[@placeholder='First
////		// Name']"));
////
////		// String text = aaa.getText();
////		// System.out.println(text);
////		Actions a = new Actions(driver);
////		WebElement a1 = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
////		a.moveToElement(a1);
////		clicky(a1);
////		Robot r = new Robot();
////		sleepy(2000);
////		r.keyPress(KeyEvent.VK_DOWN);
////		r.keyRelease(KeyEvent.VK_DOWN);
////		r.keyPress(KeyEvent.VK_ENTER);
////		r.keyRelease(KeyEvent.VK_ENTER);
////		WebElement bt = driver.findElement(By.xpath("(//div[@role='button'])"));
////		clicky(bt);
	}
}