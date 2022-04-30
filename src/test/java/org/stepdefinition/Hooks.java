package org.stepdefinition;

import org.finalrun.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before("@value1")
	public void bfrscn() {

		System.out.println("before scene>>>>>>");
	}

	@Before
	public void bfr() {

		System.out.println("before scenario");
		chromeBrowser();
		maxWindow();
		applyImplicitlyWait();

	}

	@After
	public void aftr(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot tk =(TakesScreenshot) driver;
			byte[] scs = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(scs, "image/png");
			
			
		}
		
		
		System.out.println("after scenario");
		closeBrowser();
	}

	@After("@value1")
	public void aftrscn() {

		System.out.println("after scene>>>>>>>>");
	}

}