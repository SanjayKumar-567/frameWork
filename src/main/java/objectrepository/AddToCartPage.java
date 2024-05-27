package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class AddToCartPage extends BasePage {
	
	public AddToCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	

	public WebElement getProduct1() {
		return product1;
	}

	public WebElement getProduct2() {
		return product2;
	}

	public WebElement getCartSymbole() {
		return cartSymbole;
	}

	
	
	@FindBy(xpath  = "//button[@name='add-to-cart-sauce-labs-bike-light']")
	private WebElement product1;
	
	@FindBy(xpath  = "//span[@class='shopping_cart_badge']")
	private WebElement product2;
	
	@FindBy(xpath =  "//span[@class='shopping_cart_badge']")
	private WebElement cartSymbole;

}
