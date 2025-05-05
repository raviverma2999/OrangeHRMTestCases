package orangehrm.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestLoginFunctionality {

	@Test
	public void login() {

		// Open google Chrome brower

		System.setProperty("webdriver.gecko.driver", "F:\\FireFoxBrowserExe\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		// maximize the broswer
		driver.manage().window().maximize();

		// Open application

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.name("username")).sendKeys("Admin");
		
		Reporter.log("Username is entered");

		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Reporter.log("Password is entered");

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Reporter.log("Login button is clicked");
	}

}
