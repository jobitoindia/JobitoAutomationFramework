package Base;

import org.testng.annotations.Test;

public class CheckFunctionlity 
{
	@Test(dependsOnMethods = {"LoginPage"},priority = -1)
	public void homePage() {
		System.out.println("i am from  homepage");
	}

	@Test(priority = 10,invocationCount = 10)
	public void RegPage() {
		System.out.println("i am from  Registration");
	}
	
	@Test(dependsOnMethods = {"RegPage"},priority = 2)
	public void LoginPage() {
		System.out.println("i am from  LoginPage");
	}
	
	@Test(dependsOnMethods = {"homePage"},priority = 5)
	public void AddCardPage() {
		System.out.println("i am from  addTocard");
	}
	

}
