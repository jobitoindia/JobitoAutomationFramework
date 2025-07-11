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
	
	@Test(priority = 1)
	public void tc1Login() {
		System.out.println("1");
	}
	
	@Test(priority = 10)
	public void tc2Login() {
		System.out.println("10");

	}
	
	@Test
	public void tc3Login() {
		System.out.println("5");

	}
	
	@Test
	public void abc() {
		System.out.println("4");

	}

}
