package orangehrm.testclass;

import org.testng.annotations.Test;

import orangehrm.Testpages.HomePage;
import orangehrm.Testpages.LoginPage;

public class HomepageLogout extends DriverClass{
	
@Test
	public void logoutfromOrangehrmHomepage() {
		
		
		HomePage homepage=new HomePage();
		
		homepage.logoutFromApplication();
		
		
	}


}
