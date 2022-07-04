 package com.InstaBase_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instabase_class {
	
	public static WebDriver driver;
	
	public static WebDriver getbrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

			driver=new ChromeDriver();
			
		}

		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");

			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;	
		
	}
	
	
	
	public static void Geturl(String url) {
		driver.get(url);

	}
	
	public static void Clickonelement(WebElement element) {
		
		element.click();
	}
	
	 public static  void Sendkeys(WebElement elements, String value) {
		
		 elements.sendKeys(value);
	}
	
	

}
