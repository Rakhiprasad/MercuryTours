package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utility.ElementUtility;

public class LoginPage {
	WebDriver driver;
	ElementUtility elementutil;
	//@FindBy(locator="value")
	//WebElement elementname

	@FindBy(name="userName")
	WebElement userNameField;
	@FindBy(name="password")
	WebElement passwordField;
	@FindBy(name="submit")
	WebElement submitField;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		elementutil=new ElementUtility(driver);
		PageFactory.initElements(driver,this );//initiaze webelements declared using @FindBY
		//pagefactory -class...........page object model with page factory
	}


	public void doLogin(String userName,String password) {
		
		/*WebElement userNameField=driver.findElement(By.name("userName"));	
		WebElement passwordField=driver.findElement(By.name("password"));
		WebElement submitField=driver.findElement(By.name("submit"));
		
		driver.navigate().refresh();
		*/
		
		elementutil.doSendKeys(userNameField, userName);
		
		
		elementutil.doSendKeys(passwordField, password);
		
		
		elementutil.doSubmitKeys(submitField);
	}
	}


