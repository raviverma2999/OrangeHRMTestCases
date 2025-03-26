package com.testcases;

import org.testng.annotations.Test;

import com.testpages.DriverFirefox;
import com.testpages.LoginPage;

public class LoginTest extends DriverFirefox {
	
	
	@Test (priority=2)
	public void loginWithValidusernameAndpassword() {
		
		LoginPage loginPage=new LoginPage();
		
		loginPage.loginToApplication("Admin", "admin123");
		
	}
	
	@Test (priority=1)
	public void loginWithinvalidusernameAndpassword() {
		
		LoginPage loginPage=new LoginPage();
		
		loginPage.loginToApplication("Adminnnn", "Admin123");
		
	}


}
