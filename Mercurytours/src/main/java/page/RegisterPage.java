package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.ElementUtility;
import utility.WaitUtility;

public class RegisterPage {
	WebDriver driver;
	ElementUtility elementutil;
	WaitUtility waitutil;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		elementutil=new ElementUtility(driver);
		waitutil=new WaitUtility(driver);
	}

	public void doRegister(String firstName,String lastName,String phone,String userName,String address,String city,String state,String postalcode,String country,String email,String password,String confimpassword){
		WebElement registerfield=driver.findElement(By.linkText("REGISTER"));
		elementutil.doSubmitKeys(registerfield);
		
		WebElement firstNamefield=driver.findElement(By.name("firstName"));
		waitutil.waitForVisibility(firstNamefield);
		elementutil.doSendKeys(firstNamefield, firstName);
		
		WebElement lastNamefield=driver.findElement(By.name("lastName"));
		elementutil.doSendKeys(lastNamefield, lastName);
		
		WebElement phonefield=driver.findElement(By.name("phone"));
		elementutil.doSendKeys(phonefield, phone);
		
		WebElement emailfield=driver.findElement(By.name("userName"));
		elementutil.doSendKeys(emailfield, userName);
		
		WebElement addressfield=driver.findElement(By.name("address1"));
		elementutil.doSendKeys(addressfield, address);
		
		WebElement cityfield=driver.findElement(By.name("city"));
		elementutil.doSendKeys(cityfield, city);
		
		WebElement statefield=driver.findElement(By.name("state"));
		elementutil.doSendKeys(statefield, state);
		
		WebElement postalfield=driver.findElement(By.name("postalCode"));
		elementutil.doSendKeys(postalfield, postalcode);
		
		WebElement countryField=driver.findElement(By.name("country"));
		elementutil.doDropDown(countryField, country);
				
		WebElement usernamefield=driver.findElement(By.name("email"));
		elementutil.doSendKeys(usernamefield, email);
		
		WebElement passwordfield=driver.findElement(By.name("password"));
		elementutil.doSendKeys(passwordfield, password);
		
		WebElement confirmpasswordfield=driver.findElement(By.name("confirmPassword"));
		elementutil.doSendKeys(confirmpasswordfield, confimpassword);
		
		WebElement buttonfield=driver.findElement(By.name("submit"));
		waitutil.waitForClick(buttonfield);
		elementutil.doSubmitKeys(buttonfield);
		
	}

}
