package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValiditationPage extends BasePage {

	public ValiditationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "//h2[contains(text(),'Thank you for your order!')]")
	private WebElement attribute1;
	
	public WebElement getAttribute1() {
		return attribute1;
	}

	public WebElement getTagName() {
		return tagName;
	}

	public WebElement getCssValu() {
		return cssValu;
	}

	@FindBy(id = "//h2[contains(text(),'Thank you for your order!')]")
	private WebElement tagName;
	
	@FindBy(id = "//img[@class='pony_express']")
	private WebElement cssValu;
	
}
