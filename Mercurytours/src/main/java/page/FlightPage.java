package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.ElementUtility;

public class FlightPage {
	WebDriver driver;
	ElementUtility elementutil;
	
	public FlightPage(WebDriver driver) {
		this.driver=driver;
		elementutil=new ElementUtility(driver);
	}

	public void doFlight(int type,String passcount,String departingfrom,String frommon,String fromda,String arrive,String returnmon,String toda,int sercla,String airlin) {
		
		WebElement flightfield=driver.findElement(By.linkText("Flights"));
		elementutil.doSubmitKeys(flightfield);
		
		List<WebElement> typeRadioButton=driver.findElements(By.name("tripType"));
		elementutil.doRadioButton(typeRadioButton, type);
		
		WebElement passengers=driver.findElement(By.name("passCount"));
		elementutil.doDropDown(passengers, passcount);
				
		WebElement departingFrom=driver.findElement(By.name("fromPort"));
		elementutil.doDropDown(departingFrom, departingfrom);
		
		WebElement month=driver.findElement(By.name("fromMonth"));
		elementutil.doDropDown(month, frommon);
		
		WebElement day=driver.findElement(By.name("fromDay"));
		elementutil.doDropDown(day, fromda);
		
		WebElement arriving=driver.findElement(By.name("toPort"));
		elementutil.doDropDown(arriving, arrive);
		
		WebElement returnmonth=driver.findElement(By.name("toMonth"));
		elementutil.doDropDown(returnmonth, returnmon);
				
		WebElement returnday=driver.findElement(By.name("toDay"));
		elementutil.doDropDown(returnday, toda);
		
		List<WebElement> classRadioButton=driver.findElements(By.name("servClass"));
		elementutil.doRadioButton(classRadioButton, sercla);
		
		WebElement airline=driver.findElement(By.name("airline"));
		elementutil.doDropDown(airline, airlin);
		
		WebElement continueButton=driver.findElement(By.name("findFlights"));
		continueButton.click();
	}
	

}
