package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pageobjectmodel.Moveto_Element;
import com.pageobjectmodel.Page_Object_Model;
import com.pageobjectmodel.Signinpage;

public class Page_object_manager {
	public static WebDriver driver;

	private Signinpage se;

	private Page_Object_Model ci;

	private Moveto_Element am;

	public Page_object_manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Signinpage getinstancese() {

		if (se == null) {

			se = new Signinpage(driver);

		}
		return se;

	}

	public Moveto_Element getmovetoelement() {

		if (am == null) {

			am = new Moveto_Element(driver);

		}

		return am;

	}

	public Page_Object_Model getclickonelement() {

		if (ci == null) {

			ci = new Page_Object_Model(driver);

		}

		return ci;
	}

}
