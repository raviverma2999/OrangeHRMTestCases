package orangehrm.Testpages;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.report.ExtentReportUtils;

import orangehrm.testclass.DriverClass;

public class LoginPage {

    // Corrected Logger declaration
    private static final Logger log = LogManager.getLogger(LoginPage.class);

    @FindBy(name = "username")
    WebElement userNameTextbox;

    @FindBy(name = "password")
    WebElement passwordTextbox;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBtn;

    public LoginPage() {
        PageFactory.initElements(DriverClass.driver, this);
    }

    public void logintoOrangeHrmPage(String userName, String password) {
        // Adding implicit wait before interacting with elements
        DriverClass.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       Reporter.log("Username is entered in username text box: " + userName);
        userNameTextbox.sendKeys(userName);
        Reporter.log("User name is entered");  
      

        Reporter.log("Password is entered in password text box.");
        passwordTextbox.sendKeys(password);
        
        Reporter.log("Password is entered");  

        Reporter.log("Login button is clicked.");
        loginBtn.click();
        Reporter.log("Login button is clicked");  
    }
}
