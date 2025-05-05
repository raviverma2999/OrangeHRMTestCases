package com.testcases;

import org.testng.annotations.Test;

import com.testpages.DriverFirefox;
import com.testpages.HomePage;

public class LogoutTest extends DriverFirefox{

	@Test (priority=3)
public void logout() {
	
	HomePage homepage=new HomePage();
	homepage.clickToProfileIcon();
	homepage.clickLogout();
	
	
}	
	
	
}
