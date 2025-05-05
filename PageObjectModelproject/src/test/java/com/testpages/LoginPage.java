package com.testpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
@FindBy (name="username") WebElement userNameTextBox;

@FindBy (xpath="//input[@placeholder=\"Password\"]") WebElement passwordTextBox;

@FindBy (xpath="//button[@type=\"submit\"]") WebElement loginButton;


public LoginPage() {
	
	PageFactory.initElements(DriverFirefox.driver, this);
	
}

public void loginToApplication(String userName, String passWord) {
	
	userNameTextBox.sendKeys(userName);
	passwordTextBox.sendKeys(passWord);
	loginButton.click();
	
}
	
	
}
