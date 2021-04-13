package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class profile_POF {
	
	public profile_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(how = How.LINK_TEXT, using = "Profile") 
	 private WebElement Profile;
	 
	 @FindBy(how = How.NAME, using = "fullname") 
	 private WebElement fullname;
	 
	 @FindBy(how = How.NAME, using = "lastname") 
	 private WebElement lastname;
	 
	 @FindBy(how = How.NAME, using = "gender") 
	 private WebElement gender;
	 
	 @FindBy(how = How.NAME, using = "address1") 
	 private WebElement address1;
	 
	 @FindBy(how = How.NAME, using = "address2") 
	 private WebElement address2;
	 
	 @FindBy(how = How.NAME, using = "pincode") 
	 private WebElement pincode;
	 
	 @FindBy(how = How.NAME, using = "state") 
	 private WebElement state;
	 
	 @FindBy(how = How.NAME, using = "city") 
	 private WebElement city;
	 
	 @FindBy(how = How.ID, using = "userProfileSubmit") 
	 private WebElement userProfileSubmit;
	 
	 
	 public void profileAction (String fullname, String lastname, String address1, String address2) {
		 Profile.click();
		 this.fullname.sendKeys(fullname);
		 this.lastname.sendKeys(lastname);
		 gender.click();
		 this.address1.sendKeys(address1);
		 this.address2.sendKeys(address2);
		 pincode.sendKeys("123456");
		 state.sendKeys("Tamil Nadu");
		 city.sendKeys("Chennai");
		 userProfileSubmit.click();
		 
	 }

}
