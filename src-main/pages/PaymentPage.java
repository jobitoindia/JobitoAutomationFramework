package pages;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class PaymentPage extends BaseClass {
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validatePage() {
		return driver.getCurrentUrl().contains("payment");
	}

}
