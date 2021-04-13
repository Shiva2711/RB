package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactory.pageRedirection_POF;

public class pageRedirection_TestCases extends login_TestCases {
	pageRedirection_POF pageRedirecgtion_TC;

	@Test
	public void f() {
		pageRedirecgtion_TC = PageFactory.initElements(driver, pageRedirection_POF.class);
		pageRedirecgtion_TC.redirectionAction();
	}
}
