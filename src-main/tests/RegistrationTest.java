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
		super();	
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		lg=new RegistrationPage();
	}
	
	@Test
	public void validateThePage() {
		boolean flag=lg.validatePage();
		Assert.assertEquals(flag, true);	
	}


}
