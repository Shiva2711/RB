package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactory.panCard_POF;

public class panCard_TestCases extends login_TestCases {
	panCard_POF panCard_TC;
  @Test
  public void f() {
	  panCard_TC = PageFactory.initElements(driver, panCard_POF.class);
	  panCard_TC.panAction("511498108178", "C:\\Users\\rshiv\\Pictures\\Screenshots\\Image 3", "C:\\Users\\rshiv\\Pictures\\Screenshots\\Image 3");
  }
}
