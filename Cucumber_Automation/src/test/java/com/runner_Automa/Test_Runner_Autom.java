package com.runner_Automa;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseautomation.Automation_Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/feature/Automation.feature",

		glue = "com.sd",

		monochrome = true, dryRun = false, publish = true,

		plugin = {

				"html:Report/Html_Report.html", "pretty", "json:Reports/jsonReport.json",

		}

)

public class Test_Runner_Autom {

	public static WebDriver driver;

	@BeforeClass
	public static void set_up() {

		driver = Automation_Base.getbrowser("chrome");

	}

	@AfterClass
	public static void tear_Down() {
		driver.close();
	}

}
