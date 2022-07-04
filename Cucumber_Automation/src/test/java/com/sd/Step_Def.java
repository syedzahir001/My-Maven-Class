package com.sd;

import org.openqa.selenium.WebDriver;

import com.baseautomation.Automation_Base;
import com.pomanager.Page_Objectmanager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Def extends Automation_Base{
	
	public static WebDriver driver = getbrowser("chrome");
	
	public static Page_Objectmanager pom = new Page_Objectmanager(driver);
	
	@Given("^User Launch The Webpage$")
	public void user_Launch_The_Webpage() throws Throwable {
		geturl("http://automationpractice.com/index.php?id_category=5&controller=category");
	    
	}

	@When("^User Click The Addtocart Button Proceed To Check Popup$")
	public void user_Click_The_Addtocart_Button_Proceed_To_Check_Popup() throws Throwable {
		Thread.sleep(2000);

		Clickelement(pom.getinstanceHp().getAdd());
		
	}

	@When("^User Click The Proceed To Checkout Button User Navigate$")
	public void user_Click_The_Proceed_To_Checkout_Button_User_Navigate() throws Throwable {
		Thread.sleep(2000);

		Clickelement(pom.getinstanceHp().getProceed());
		
		
	}

	@When("^User Click The Procced to Chechout And Navigate to Next Page$")
	public void user_Click_The_Procced_to_Chechout_And_Navigate_to_Next_Page() throws Throwable {
	    
		Thread.sleep(2000);

		Clickelement(pom.getinstanceHp().getBtn());
		
	}

	@When("^User Enter The Email Address$")
	public void user_Enter_The_Email_Address() throws Throwable {
		
		Thread.sleep(2000);

		sendkeys(pom.getinstancesignin().getEmail(), "nileg46187@latovic.com");
	    
	}

	@Then("^User Enter The Password$")
	public void user_Enter_The_Password() throws Throwable {
		
		sendkeys(pom.getinstancesignin().getPsd(), "nileg46187");
	    
	}

	@Then("^User Click Sign in Button And Navigate$")
	public void user_Click_Sign_in_Button_And_Navigate() throws Throwable {
		
		Clickelement(pom.getinstanceHp().getBtn1());
	}

	@Given("^User Click Proceed To Checkout Button And Navigate$")
	public void user_Click_Proceed_To_Checkout_Button_And_Navigate() throws Throwable {
		Clickelement(pom.getinstanceHp().getBtn2());
		
		
	}

	@When("^User Click I Agree Button$")
	public void user_Click_I_Agree_Button() throws Throwable {
		
		Clickelement(pom.getinstanceHp().getCheckb());
	    
	}

	@Then("^User Click The Proceed To Check Out Button$")
	public void user_Click_The_Proceed_To_Check_Out_Button() throws Throwable {
		
		Clickelement(pom.getinstanceHp().getBtn3());
	   
	}


}
