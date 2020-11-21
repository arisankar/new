package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

import testbase.base;

public class utility extends base{
	
	public static void waits()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	


}
