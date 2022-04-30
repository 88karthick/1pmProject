package org.stepdefinition;

import org.finalrun.BaseClass;
import org.finalrun.PojoClass2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 extends BaseClass {

	PojoClass2 p;

	@Given("User have to enter facebook through chrome browser")
	public void user_have_to_enter_facebook_through_chrome_browser() {
		launchUrl("https://www.facebook.com");
	}

	@When("User have to click forgot password")
	public void user_have_to_click_forgot_password() {
		p = new PojoClass2();
		clickButton(p.getBtnFrgtPass());
	}

	@When("User have to enter phone number")
	public void user_have_to_enter_phone_number() {

		fillTextBox(p.getTxtBox(), "9999955555");
	}

	@Then("User have to click search button")
	public void user_have_to_click_search_button() {
		clickButton(p.getBtnSearch());
	}

}
