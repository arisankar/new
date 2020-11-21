package script;

import org.junit.Test;
import org.testng.annotations.BeforeTest;

import pages.guru_loginpage;
import testbase.base;

public class scrip extends base{ 
	
	guru_loginpage logggg;
	
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		open();
		logggg= new guru_loginpage();
	}

	
	@Test
	public void validateloginid()
	{
	
		logggg.verifylogin("mngr294915");
	}
	
	@Test
	public void validatepassword()
	{
	
		logggg.verifylogin("EqEmurA");
	}
	
	@Test
	public void validatesubmit()
	{
	
		logggg.verifysubmit();
	}	
	
	
}
