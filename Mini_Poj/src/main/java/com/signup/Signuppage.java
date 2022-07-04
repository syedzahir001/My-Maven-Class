package com.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppage {
	
	public WebDriver driver;
	
	
	
	@FindBy (xpath = "//span[text()='Sign up']")
	
	private WebElement Signup;
	
	
	
	public Signuppage(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver2, this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignup() {
		return Signup;
	}

	public WebElement getSignup1() {
		return Signup1;
	}

	public WebElement getNext() {
		return Next;
	}

	@FindBy ( xpath =  "//button[text()='Sign up']")
	
	private WebElement Signup1;
	
	@FindBy (xpath =  "//button[text()='Next']" )
	
	private WebElement Next;
	
	

}
