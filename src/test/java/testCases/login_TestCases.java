package testCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;

import pageFactory.login_POF;
import resources.base;

public class login_TestCases extends base {
	public login_POF Login_TC;
	public WebDriver driver;
	
	
	@BeforeTest
	public void Login() throws IOException {
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Site URL Launced");
		
		Login_TC = new login_POF(driver);
		
		Login_TC.loginbutton();
		log.info("Clicked On Login button");
		
		Login_TC.loginAction(prop.getProperty("NewUser"), prop.getProperty("NewPassword"));
		log.info("Logged in to the site successfully");
	}



}
