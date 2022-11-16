package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver Idriver;
	public LoginPage(WebDriver rDriver)
	{
		Idriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(id="Email")
	 WebElement email;
	
	@FindBy(id="Password")
	 WebElement pwd;
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	 WebElement Loginbtn;
	
	@FindBy(linkText = "Logout")
	WebElement Logout;
	
	
	
	public void entreEmail(String emailAdd)
	{
		email.clear();
		email.sendKeys(emailAdd);
		
	}
	
	public void enterPassword(String password)
	{
		pwd.clear();
		pwd.sendKeys(password);
		
		
	}
	
	public void clickLoginButton()
	{
		Loginbtn.click();
	}
	public void clickLogout()
	{
		Logout.click();
	}
	
	
}
