package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(id="ap_email")
	private WebElement username;

	@FindBy(id="ap_password")
	private WebElement pass;
	
	@FindBy(id="signInSubmit")
	private WebElement signInBtn;

	@FindBy(id="//div[@class='a-box-inner a-alert-container']//div[contains(text(),'  Enter your password')]")
	private WebElement validatePasswordField;
	
	@FindBy(id="//div[contains(text(),'  Enter your email or mobile phone number')]")
	private WebElement validateUserField;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateLoginPage() {
		return driver.getCurrentUrl().contains("login");
	}
	
	public void fillLoginDetails(String uname,String password) {
		username.sendKeys(uname);
		pass.sendKeys(password);
		signInBtn.click();
	}




}
