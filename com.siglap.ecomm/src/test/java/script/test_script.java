package script;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.guru_loginpage;
import pages.page;
import testbase.base;

public class test_script extends base{
	page log;
	guru_loginpage logggg;

	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		open();
		log=new page();
		logggg= new guru_loginpage();

	}
	
	@Test(priority=2)
	public void validatepass()
	{
		log.verifypass("8925473737");
	
	}
	
	@Test(priority=1)

	public void validatealerts()
	{
		log.alert();
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
