package org.test.flipkart.main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class ProductSearch extends BaseClass {
	
	public ProductSearch() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement txtsearch;
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnclick;
	
	
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement txtlogin;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement btnlgnclick;
	
	
	public WebElement getBtnlgnclick() {
		return btnlgnclick;
	}


	public WebElement getTxtlogin() {
		return txtlogin;
	}


	public WebElement getTxtpassword() {
		return txtpassword;
	}




	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement txtpassword;
	
	
	
	
	


	public WebElement getTxtsearch() {
		return txtsearch;
	}


	public WebElement getBtnclick() {
		return btnclick;
	}

}
//button[@type='submit']