package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.base;

public class page extends base{
	
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement pass;
	
	@FindBy(xpath="//button[@onclick='myConfirmFunction()']")
	WebElement alert;
	


public page()
{
	super();
	PageFactory.initElements(driver, this);
	
	}
	
public void verifypass(String passs)
{
	pass.sendKeys(passs);
	}
	
public void alert()
{
	alert.click();
	Alert aler=driver.switchTo().alert();
	//String message=driver.switchTo().alert().getText();
	//System.out.println(message);
	aler.accept();
	}

public void VerifyTest(String username,String password) throws InterruptedException
{
	pass.clear();
	pass.sendKeys(username);
	Thread.sleep(2000);
	pass.clear();
	pass.sendKeys(password);
}
}
