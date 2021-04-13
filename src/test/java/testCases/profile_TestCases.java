package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactory.profile_POF;

public class profile_TestCases extends login_TestCases {
	profile_POF profile_TC;
  @Test
  public void f() {
	  
	  profile_TC = PageFactory.initElements(driver, profile_POF.class);
	  profile_TC.profileAction("tester", "tester", "NA", "NA");
  }
}
