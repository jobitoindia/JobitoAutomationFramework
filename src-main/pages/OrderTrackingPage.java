package pages;

import java.util.Base64;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class OrderTrackingPage extends BaseClass {
	
	public OrderTrackingPage() {
		PageFactory.initElements(driver, this);
	}

}
