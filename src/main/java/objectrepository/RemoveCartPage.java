package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveCartPage  extends BasePage {
	public RemoveCartPage(WebDriver driver) {
		super(driver);
		
	}

	public WebElement getRemoveProduct() {
		return removeProduct;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	@FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/button")
	private WebElement removeProduct;
	 
	@FindBy(id = "checkout")
	private WebElement checkOut;

}
