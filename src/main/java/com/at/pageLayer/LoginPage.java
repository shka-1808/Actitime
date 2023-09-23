package com.at.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.at.testBase.TestBase;

public class LoginPage extends TestBase {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[contains(@name,'username')]")
	private WebElement username_txtbox;
	
	@FindBy(xpath="//input[contains(@name,'pwd')]")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//a[contains(@id,'loginButton')]")
	private WebElement login_btn;
	
	public void enter_Username(String username) {
		username_txtbox.sendKeys(username);
	}
	
	public void enter_password(String password) {
		password_txtbox.sendKeys(password);
	}
	
	public void click_loginbtn() {
		login_btn.click();
		
	}
	
	

}
