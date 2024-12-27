package pages;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class AddToCartPage extends BaseClass{

	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validatePage() {
		return driver.getCurrentUrl().contains("cart");
	}

}
