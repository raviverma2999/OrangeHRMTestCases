package orangehrm.Testpages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.report.ExtentReportUtils;

import orangehrm.testclass.DriverClass;

public class HomePage {
	
	@FindBy(xpath="//img[@alt=\"profile picture\"]")
     WebElement profileButton;
	
	@FindBy(linkText="Logout")
    WebElement logoutOption;
	
	
	public HomePage(){
		
	PageFactory.initElements(DriverClass.driver, this);	
		
		
	}
	
	public void logoutFromApplication() {
		
		
		profileButton.click();
		
		Reporter.log("Profile button is clicked");
		
		logoutOption.click();
		
		Reporter.log("Logout button is clicked");
		
		
	}
	
}
