package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class withdrawal_POF {
	public withdrawal_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Withdrawal")
	private WebElement Withdrawal;

	@FindBy(how = How.ID, using = "withdrawAmount")
	private WebElement withdrawAmount;

	public void withdrawalAction(String withdrawAmount) {
		Withdrawal.click();
		this.withdrawAmount.sendKeys(withdrawAmount);
	}

}
