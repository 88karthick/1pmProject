package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.finalrun.BaseClass;
import org.finalrun.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	PojoClass p;

	@Given("User have to enter facebook login through chrome browser")
	public void user_have_to_enter_facebook_login_through_chrome_browser() {
		launchUrl("https://www.facebook.com");

	}

	@When("User have to enter valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password() {

		// System.out.println("enter valid email and invalid password");

		p = new PojoClass();
		fillTextBox(p.getTxtEmail(), "greens@123.com");
		fillTextBox(p.getTxtPass(), "123456");

	}

	@When("User have to enter Valid email and invalid password")
	public void user_have_to_enter_Valid_email_and_invalid_password(io.cucumber.datatable.DataTable d) {
		p = new PojoClass();
		
		Map<String, String> map = d.asMap(String.class, String.class);
		String emailId = map.get("username");
		String passwd = map.get("password");
		//List<String> li = d.asList();
		//String emailId = li.get(0);
		//String passwd = li.get(3);
		fillTextBox(p.getTxtEmail(), emailId);
		fillTextBox(p.getTxtPass(), passwd);

	}

	@When("User have to enter invalid email and invalid password")
	public void user_have_to_enter_invalid_email_and_invalid_password() {
		p = new PojoClass();
		fillTextBox(p.getTxtEmail(), "sri@123");
		fillTextBox(p.getTxtPass(), "greens");

	}
	
	
	@When("User have to enter INVALID email and invalid password")
	public void user_have_to_enter_INVALID_email_and_invalid_password(io.cucumber.datatable.DataTable d1) {
		p = new PojoClass();
		//List<List<String>> li1 = d1.asLists();
		//String email = li1.get(1).get(2);
		//String pass = li1.get(2).get(3);
		
		List<Map<String, String>> asMaps = d1.asMaps();
		String email = asMaps.get(0).get("mail");
		String pass = asMaps.get(1).get("course");
		fillTextBox(p.getTxtEmail(), email);
		fillTextBox(p.getTxtPass(), pass);
		
	}



	@When("User have to enter {string} and {string}")
	public void user_have_to_enter_and(String email, String passwd) {
		p = new PojoClass();
		fillTextBox(p.getTxtEmail(), email);
		fillTextBox(p.getTxtPass(), passwd);

	}

	@When("user have to click login button")
	public void user_have_to_click_login_button() throws InterruptedException {

		// System.out.println("click login button");
		clickButton(p.getBtnLogin().get(0));
		Thread.sleep(2000);
	}

	@Then("user have to show credentials page")
	public void user_have_to_show_credentials_page() {

		// System.out.println("open new credentials page");

		String currentUrl = driver.getCurrentUrl();

		if (currentUrl.contains("privacy_mutation_token")) {

			System.out.println("User has to show credentials page");

		} else {

			System.out.println("User doesn't show credentials page");
		}
	}

}
