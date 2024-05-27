package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalDetailsInfoPage extends BasePage {

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastNamr() {
		return lastNamr;
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getFinishButton() {
		return finishButton;
	}

	public PersonalDetailsInfoPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "first-name")
	private WebElement firstName ;
	
	
	@FindBy(id = "last-name")
	private WebElement lastNamr;
	
	
	@FindBy(id = "postal-code")
	private WebElement zipCode;
	
	@FindBy(id = "continue")
	private WebElement continueButton ;

	@FindBy(id = "finish")
	private WebElement finishButton;


	

}
