package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactory.rewards_POF;

public class rewards_TestCases extends login_TestCases {
	rewards_POF rewards_TC;
  @Test
  public void f() {
	  rewards_TC = PageFactory.initElements(driver, rewards_POF.class);
	  rewards_TC.rewardsAction();
  }
}
