package com.sendkeys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instasendkeys {

	public WebDriver driver;

	public Instasendkeys(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver2,  this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPsd() {
		return psd;
	}

	public WebElement getMonth() {
		return Month;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getYear() {
		return Year;
	}
	
	@FindBy(name = "fullName")

	private WebElement name;

	public WebElement getName() {
		return name;
	}

	@FindBy(xpath = "//input[@aria-label='Mobile Number or Email']")
	private WebElement email;

	@FindBy(name = "username")

	private WebElement username;

	@FindBy(name = "password")

	private WebElement psd;

	@FindBy(xpath = "//select[@title='Month:']")

	private WebElement Month;

	@FindBy(xpath = "//select[@title='Day:']")

	private WebElement day;

	@FindBy(xpath = "//select[@title='Year:']")

	private WebElement Year;

}
