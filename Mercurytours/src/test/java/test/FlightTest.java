package test;

import org.testng.annotations.Test;

import page.FlightPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FlightTest extends BaseTest {
	
  @Test
  public void f() {
	  FlightPage fp=new FlightPage(driver);
	  fp.doFlight(1, "3", "Paris", "March", "23", "New York", "May", "14", 0, "Unified Airlines");
  }
  
}
