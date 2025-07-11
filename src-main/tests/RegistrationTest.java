package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import pages.LoginPage;
import pages.RegistrationPage;

public class RegistrationTest extends BaseClass  {

	RegistrationPage lg;
	
	public RegistrationTest()
	{
		super();   // here we are calling parent class constructor
		// in which we initialized common data memebers: properties file
	}
	
	@BeforeMethod
	public void setup() {
		initialization();   // here we are launching brower and respective web site
		lg=new RegistrationPage();  // we are activating respecrive page's locators
	}
	
	@Test
	public void validateThePage() {
		lg.filltheDeails("lahu", "pande");
		boolean flag=lg.validatePage();
		Assert.assertEquals(flag, true);	
	}
	
	


}
