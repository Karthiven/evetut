package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.Cmsbase;

public class landingpage extends Cmsbase {
	
	
	public landingpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText="Log in")    
	private WebElement login;
	
	public WebElement getlogin()
	{
		return login;
	}
	
	

}
