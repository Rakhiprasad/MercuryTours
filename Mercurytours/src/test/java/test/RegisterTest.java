package test;

import org.testng.annotations.Test;

import page.RegisterPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class RegisterTest extends BaseTest {
	
  @Test
  public void f() {
	  RegisterPage rp=new RegisterPage(driver);
	  rp.doRegister( "rak", "sib", "0000000000", "ras@sib", "address", "city", "state", "1234", "ANTARCTICA", "ras", "ras1234", "ras1234");
  }
  

}
