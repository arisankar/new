package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.base;

public class guru_loginpage extends base{
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement login;
	

	@FindBy(xpath="//input[@name='password']")
	WebElement pass;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	public guru_loginpage()
	{
		super();
		PageFactory.initElements(driver, this);

	}
	

	public void verifylogin(String id)
	{
		login.sendKeys(id);
	}
	
	public void verifypass(String pa)
	{
		login.sendKeys(pa);
	}	
	
	public void verifysubmit()
	{
		submit.click();
	}	
	
	
}

