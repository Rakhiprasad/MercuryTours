package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() {
		  driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.get("https://demo.guru99.com/test/newtours/");
			
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();
	  }

}
