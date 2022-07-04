package com.adactintestng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.adactinproperties.Filereader_Manager;
import com.adctinbase.Adactin_baseclass;
import com.pomanger.Pageobject_manger;

public class Adactin_testNG extends Adactin_baseclass {

	public static WebDriver driver = getbrowser("Chrome");

	public static Pageobject_manger pom = new Pageobject_manger(driver);

	@Test(priority =  0)

	private void Browserlaunch() {

		geturl("https://adactinhotelapp.com");

	}

	@Test(priority =  1)

	private void Username() {
		sendkeys(pom.getinstancese().getUsername(), "syedzahir");

		sendkeys(pom.getinstancese().getPass(), "Abc@123");

		Clickonelement(pom.getclickonelement().getLogin());

	}

	@Test(priority =  2)

	private void Next_page01() throws InterruptedException {
		Thread.sleep(2000);

		Movetoelement(pom.getmovetoelement().getSelect(), "Sydney");

		Movetoelement(pom.getmovetoelement().getHotel(), "Hotel Sunshine");

		Movetoelement(pom.getmovetoelement().getRoomtypes(), "Double");

		Movetoelement(pom.getmovetoelement().getRoomnos(), "3");

		Movetoelement(pom.getmovetoelement().getDatein(), "16/12/2021");

		Movetoelement(pom.getmovetoelement().getDateout(), "17/12/2021");

		Movetoelement(pom.getmovetoelement().getAroom(), "2");

		Clickonelement(pom.getclickonelement().getSubmit());

	}
	
	@Test (priority =  3)
	
	private void Select_hotel() {
		Clickonelement(pom.getclickonelement().getRadiobtn());

		Clickonelement(pom.getclickonelement().getConti());

	}
	
	@Test (priority =  4)
	
	private void Book_A_Hotel() {
		
		
		Movetoelement(pom.getmovetoelement().getFirstname(), "syed");

		Movetoelement(pom.getmovetoelement().getLastname(), "sye");

		Movetoelement(pom.getmovetoelement().getAddress(), "NO;2 vedal street");

		Movetoelement(pom.getmovetoelement().getCcnum(), "5435345454678765");

		Movetoelement(pom.getmovetoelement().getCctype(), "VISA");

		Movetoelement(pom.getmovetoelement().getCcexpmonth(), "May");

		Movetoelement(pom.getmovetoelement().getCcexpyear(), "2012");

		Movetoelement(pom.getmovetoelement().getCvv(), "223");

		Clickonelement(pom.getclickonelement().getBook());
		

	}

}
