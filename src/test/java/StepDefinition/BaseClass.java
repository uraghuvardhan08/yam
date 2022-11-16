package StepDefinition;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObject.AddNewCustomerPage;
import PageObject.LoginPage;
import PageObject.SearchCustomerPage;
import Utiltities.ReadConfig;

import  org.apache.logging.log4j.*;

public class BaseClass {

public WebDriver driver;
	
	public LoginPage loginPage;
	
	public AddNewCustomerPage addNewCustPg;
	 public SearchCustomerPage SearchCustPg;
	 
	 public static Logger Log;
	public ReadConfig readConfig;
	 public String generateEmailId()
	 {
		return RandomStringUtils.randomAlphabetic(5);
	 }
}
