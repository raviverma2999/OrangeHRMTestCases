package orangehrm.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueDemo {
	
	FirefoxDriver driver;
	@Test
	public void assertEqualsDemo() {
		
		driver=new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", "F:\\FireFoxBrowserExe\\geckodriver.exe");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String urlafterLogin=driver.getCurrentUrl();
		
		String actualUrl= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		Assert.assertEquals(urlafterLogin, actualUrl);
		
		
	}

}
