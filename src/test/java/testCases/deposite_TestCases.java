package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactory.deposit_POF;

public class deposite_TestCases extends login_TestCases {
	deposit_POF deposit_TC;
  @Test
  public void f() {
	  deposit_TC = PageFactory.initElements(driver, deposit_POF.class);
	  deposit_TC.depositAction("100");
		
  }
}
