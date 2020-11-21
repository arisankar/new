package testbase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.utility;

public class base {
	File f;
	FileInputStream fis;
	Properties pro;
	public static WebDriver driver;
	public base()
	{
		try
		{
		f=new File("C:\\Users\\Ari sankar\\eclipse-workspace\\com.siglap.ecomm\\src\\main\\java\\configuration\\config");
		fis= new FileInputStream (f);
		pro=new Properties();
		pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void open()
	{
		String browser = pro.getProperty("browsername");
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",pro.getProperty("chromepath"));
			driver=new ChromeDriver();
		}
		
     driver.get(pro.getProperty("url"));
		utility.waits();
		
	}
}
