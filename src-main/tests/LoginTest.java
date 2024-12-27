package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import pages.LoginPage;
import pages.RegistrationPage;

public class LoginTest extends BaseClass{
	
	LoginPage lg;
	
	public LoginTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		lg=new LoginPage();
	}
	
	@Test
	public void tc1Login() {
		
	}
	
	@Test
	public void tc2Login() {
		
	}
	
	@Test
	public void tc3Login() {
		
	}
	
	@Test
	public void tc4Login() {
		
	}

}
