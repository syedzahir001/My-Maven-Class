package com.Adactin_Runner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;
import com.properties.Filereader_Manager;
import com.sdp.Page_object_manager;

public class Adactin_Runner extends Base_Class {

	public static WebDriver driver = getbrowser("Chrome");

	public static Page_object_manager pom = new Page_object_manager(driver);

	public static Logger log = Logger.getLogger(Adactin_Runner.class);

	public static void main(String[] args) throws Throwable {

		PropertyConfigurator.configure("log4j.properties");

		String url = Filereader_Manager.getinstaceFRM().getinstanceCR().geturl();

		log.info("Browser Lanch");

		geturl(url);

		String username = Filereader_Manager.getinstaceFRM().getinstanceCR().getusername();

		sendkeys(pom.getinstancese().getUsername(), username);

		String password = Filereader_Manager.getinstaceFRM().getinstanceCR().getpassword();

		sendkeys(pom.getinstancese().getPass(), password);

		Clickonelement(pom.getclickonelement().getLogin());

		log.info("Login success");

		String place = excel_data(
				"C:\\Users\\Mohamed Musthak Y\\eclipse-workspace\\Mini_Project\\Adactin Test case.xlsx", 4, 5);

		Movetoelement(pom.getmovetoelement().getSelect(), place);

		Movetoelement(pom.getmovetoelement().getHotel(), "Hotel Sunshine");

		Movetoelement(pom.getmovetoelement().getRoomtypes(), "Double");

		Movetoelement(pom.getmovetoelement().getRoomnos(), "3");

		Movetoelement(pom.getmovetoelement().getDatein(), "16/12/2021");

		Movetoelement(pom.getmovetoelement().getDateout(), "17/12/2021");

		Movetoelement(pom.getmovetoelement().getAroom(), "2");

		Clickonelement(pom.getclickonelement().getSubmit());

		Clickonelement(pom.getclickonelement().getRadiobtn());

		Clickonelement(pom.getclickonelement().getConti());

		log.info("Details Given");

		Movetoelement(pom.getmovetoelement().getFirstname(), "syed");

		Movetoelement(pom.getmovetoelement().getLastname(), "sye");

		Movetoelement(pom.getmovetoelement().getAddress(), "NO;2 vedal street");

		Movetoelement(pom.getmovetoelement().getCcnum(), "5435345454678765");

		Movetoelement(pom.getmovetoelement().getCctype(), "VISA");

		Movetoelement(pom.getmovetoelement().getCcexpmonth(), "May");

		Movetoelement(pom.getmovetoelement().getCcexpyear(), "2012");

		Movetoelement(pom.getmovetoelement().getCvv(), "223");

		Clickonelement(pom.getclickonelement().getBook());

		log.info("Hotel Booked");
	}

}
