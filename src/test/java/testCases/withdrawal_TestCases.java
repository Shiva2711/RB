package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactory.withdrawal_POF;

public class withdrawal_TestCases extends login_TestCases {
	withdrawal_POF withdrawal_TC;

	@Test
	public void f() {
		withdrawal_TC = PageFactory.initElements(driver, withdrawal_POF.class);
		withdrawal_TC.withdrawalAction("100");
	}
}
