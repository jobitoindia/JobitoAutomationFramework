package pages;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class SearchPage extends BaseClass {


	public SearchPage() 
	{
		PageFactory.initElements(driver, this);
	}
}
