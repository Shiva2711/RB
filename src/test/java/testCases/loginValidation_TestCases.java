package testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageFactory.loginValidation_POF;
import resources.base;

public class loginValidation_TestCases extends base {
	loginValidation_POF LoginValidation_TC;
	public WebDriver driver;


	@Test()
	public void LoginValidation() throws IOException {

		driver = intializeDriver();

		driver.get(prop.getProperty("url"));
		Reporter.log("RummyBaazi Site Opens");

		LoginValidation_TC = new loginValidation_POF(driver);

		LoginValidation_TC.loginbutton();
		LoginValidation_TC.emptyfieldclick();

		Assert.assertEquals(LoginValidation_TC.getUsernameErrorText().getText(), "Enter Username");
		log.info("Enner Username Alert Display");
		Assert.assertEquals(LoginValidation_TC.getPasswordErrorText().getText(), "Enter Password");
		log.info("Enner Password Alert Display");
		
		LoginValidation_TC.clearAll();
		LoginValidation_TC.getUsernameandPassword("Test", "Demo");
		Assert.assertEquals(LoginValidation_TC.getInvalidLoginErrorText().getText(), "Invalid Username and Password");
		log.info("Invalid Username and Password Error Text Display");
		
		LoginValidation_TC.clearAll();
		LoginValidation_TC.getUsernameandPassword(prop.getProperty("NewUser"), prop.getProperty("NewPassword"));
		log.info("Valid User Login Successful");
	}

	@AfterTest
	public void after() {
		driver.quit();
	}

}
