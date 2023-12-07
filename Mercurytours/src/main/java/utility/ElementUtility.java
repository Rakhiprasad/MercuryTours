package utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtility
{
	WebDriver driver;
	public ElementUtility(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void doSendKeys(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	public void doSubmitKeys(WebElement element)
	{
		element.click();
	}
	public void doDropDown(WebElement element,String value)
	{
		Select elementdrop=new Select(element);
		elementdrop.selectByVisibleText(value);
	}
	public void doRadioButton(List<WebElement> element,int value)
	{
		element.get(value).click();
	}


}
