package com.IntelBanking.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver PageDriver) {
		driver=PageDriver;
		PageFactory.initElements(PageDriver, this);
	}
	
	@FindBy(how = How.NAME, using = "uid")
	WebElement username;

	@FindBy(how = How.NAME, using = "password")
	WebElement password;
	
	@FindBy(how = How.NAME, using = "btnLogin")
	WebElement btnlogin;

	@FindBy(how = How.NAME, using = "btnReset")
	WebElement btnreset;
	
	public void setUsername(String uname) {
		username.sendKeys(uname);
	}

	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clicklogin() {
		btnlogin.click();
	}

	public void clickreset() {
		btnreset.click();
	}
}
