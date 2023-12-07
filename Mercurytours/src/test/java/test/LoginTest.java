package test;

import org.testng.annotations.Test;

import page.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginTest extends BaseTest {
	
  @Test
  public void f() {
	  LoginPage lp=new LoginPage(driver);
	  lp.doLogin("tutorial", "tutorial");
  }
  

}
