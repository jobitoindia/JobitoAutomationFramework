package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import pages.HomePage;
import pages.RegistrationPage;

public class HomeTest extends BaseClass {
	
	HomePage hm;
	
	public HomeTest() 
	{
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		hm=new HomePage();
	}
	
	@Test
	public void tc1hm() {
		
	}
	
	@Test
	public void tc2hm() {
		
	}
	
	@Test
	public void tc3hm() {
		
	}
	
	@Test
	public void tc4hm() {
		
	}

}
