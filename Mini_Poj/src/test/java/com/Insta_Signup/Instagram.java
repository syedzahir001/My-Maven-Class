package com.Insta_Signup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.InstaBase_Class.Instabase_class;
import com.sendkeys.Instasendkeys;
import com.signup.Signuppage;

public class Instagram extends Instabase_class {

	public static WebDriver driver = getbrowser("chrome");

	

	public static void main(String[] args) {
		
		Instasendkeys sk = new Instasendkeys(driver);

		Signuppage sp = new Signuppage(driver);

		driver.get("https://www.instagram.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Clickonelement(sp.getSignup());

		Sendkeys(sk.getEmail(), "jaxesa8531@veb65.com");

		Sendkeys(sk.getName(), "jaxesa");

		Sendkeys(sk.getUsername(), "jaxesa8531");

		Sendkeys(sk.getPsd(), "JAxesa@8531");

		Clickonelement(sp.getSignup1());

		Sendkeys(sk.getMonth(), "4");

		Sendkeys(sk.getDay(), "10");

		Sendkeys(sk.getYear(), "1992");

		Clickonelement(sp.getNext());

		// driver.manage().window().maximize();

		// Next.click();

//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();

//		Select s2 = new Select(Year);
//
//		s2.selectByValue("1992");

//		Select s1 = new Select(Day);
//
//		s1.selectByValue("10");

//		Select s = new Select(month);
//
//		s.selectByValue("4");

		// Signup1.click();

		// pswd.sendKeys("Johninsta");
		// username.sendKeys("fisajat374");

		// email.sendKeys("fisajat374@pyrelle.com");

		// name.sendKeys("john");

		// Signup.click();

		// WebElement Next = driver.findElement(By.xpath("//button[text()='Next']"));

		// WebElement Signup = driver.findElement(By.xpath("//span[text()='Sign up']"));

		// WebElement Signup1 = driver.findElement(By.xpath("//button[text()='Sign
		// up']"));

	}

}
