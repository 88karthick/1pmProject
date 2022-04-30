package org.finalrun;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {

	public PojoClass() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtEmail;

	@FindBy(id = "pass")
	private WebElement txtPass;

	// @FindBy(name="login")
	// private WebElement btnLogin;
	@CacheLookup
	@FindAll({ @FindBy(xpath = "//button[@value='1']"), @FindBy(name = "login") })

	private List<WebElement> btnLogin;


	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public List<WebElement> getBtnLogin() {
		return btnLogin;
	}

	
}
