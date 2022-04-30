package org.finalrun;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass2 extends BaseClass{

	public PojoClass2() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement btnFrgtPass;
	
	public WebElement getBtnFrgtPass() {
		return btnFrgtPass;
	}

	public WebElement getTxtBox() {
		return txtBox;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	@FindBy(xpath="//input[@type='text']")
	private WebElement txtBox;
	
	@FindBy(xpath="//button[@value='1']")
	private WebElement btnSearch;
	
	
	
}
