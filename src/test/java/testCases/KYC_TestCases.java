package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactory.KYC_POF;

public class KYC_TestCases extends login_TestCases  {
	KYC_POF KYC_TC;
  @Test
  public void f() {
	  KYC_TC = PageFactory.initElements(driver, KYC_POF.class);
	  KYC_TC.kycAction("511498108178", "C:\\Users\\rshiv\\Pictures\\Screenshots\\Image 3", "C:\\Users\\rshiv\\Pictures\\Screenshots\\Image 3");
  }
}
