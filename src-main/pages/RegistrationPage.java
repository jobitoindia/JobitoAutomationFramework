package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class RegistrationPage extends BaseClass {

	@FindBy(xpath="//input[@name='emailOrPhone']")
	private WebElement name;//=driver.findElement(By.xpath(""));

	@FindBy(xpath="//input[@name='fullName']")
	private WebElement fullName;

	@FindBy(name="username")
	private WebElement userName;

	@FindBy(name="password")
	private WebElement pass;

	@FindBy(xpath="//button[@class='_acan _acap _acas _aj1-'][@type='submit']")
	private WebElement signup;
	
	@FindBy(xpath ="//*[text()='Log in with Facebook']")
	private WebElement loginWithFb;
//	 WebElement name=driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-'][@type='submit']"));
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this); // it initiaze the current page elements
	}

	public boolean validatePage() {
		return driver.getCurrentUrl().contains("accounts");
	}

	public void filltheDeails(String firstName,String LastName) {		
		name.sendKeys(firstName);
		fullName.sendKeys(LastName);
	}
	
	public void filltheDeails(String firstName,String LastName,String un) {		
		name.sendKeys(firstName);
		fullName.sendKeys(LastName);
		userName.sendKeys(un);
	}
	
	
	public void filltheDeails(String firstName,String LastName,String un,String ps) {		
		name.sendKeys(firstName);
		fullName.sendKeys(LastName);
		userName.sendKeys(un);
		pass.sendKeys(ps);
	}
	
	public boolean loginWithVisibale() 
	{
		return loginWithFb.isDisplayed();
	}


	}


