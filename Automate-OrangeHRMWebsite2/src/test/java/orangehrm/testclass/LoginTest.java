package orangehrm.testclass;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.utility.ExcelUtilityTestDataFile;
import com.utility.NotepadUtilityFileTestData; 

import orangehrm.Testpages.LoginPage;

public class LoginTest extends DriverClass{

	@Test 
public void loginWithValidIdAndPassword() throws InvalidFormatException, IOException {
		
		
		LoginPage loginpage=new LoginPage();
		//loginpage.logintoOrangeHrmPage("Admin", "admin123");
		
		loginpage.logintoOrangeHrmPage(ExcelUtilityTestDataFile.getTestData(1,0),ExcelUtilityTestDataFile.getTestData(1,1));
	
		//loginpage.logintoOrangeHrmPage(NotepadUtilityFileTestData.getData("Username"),NotepadUtilityFileTestData.getData("Password"));
		
	}

}
