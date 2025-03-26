package com.testpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (className ="oxd-userdropdown-name") WebElement profileIcon;
	@FindBy (linkText = "Logout") WebElement logOut;
	
	
	public HomePage(){
		
		PageFactory.initElements(DriverFirefox.driver,this);		
		
	}
	
	public void clickToProfileIcon() {
		
		profileIcon.click();	
		
	}
	
	public void clickLogout() {
		
		logOut.click();
		
	}

}
