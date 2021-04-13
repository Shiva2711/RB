package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class deposit_POF {
	public deposit_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Deposit")
	private WebElement Deposit;

	@FindBy(how = How.NAME, using = "userAmount")
	private WebElement userAmount;

	@FindBy(how = How.ID, using = "payment_type")
	private WebElement paymentType;

	@FindBy(how = How.ID, using = "agree")
	private WebElement agree;

	@FindBy(how = How.NAME, using = "paymentsubmit")
	private WebElement addCash;

	public void depositAction(String userAmount) {
		Deposit.click();
		this.userAmount.sendKeys(userAmount);
		paymentType.click();
		agree.click();
		addCash.click();
	}

}
