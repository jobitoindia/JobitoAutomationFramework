package pages;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class HomePage extends BaseClass {


	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean validatePage() {
		return driver.getCurrentUrl().contains("home");
	}

}
