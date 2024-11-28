package PomScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseclass.BaClass;
import objectrepository.AddToCartPage;
import objectrepository.LoginPage;
import objectrepository.PersonalDetailsInfoPage;
import objectrepository.RemoveCartPage;

public class AddToCartTest extends BaClass {

	@Test
	public void addingProduct() {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.getEmailTextField().sendKeys("standard_user");
		loginPage.getPasswordTextField().sendKeys("secret_sauce");
		loginPage.getLoginButton().click();
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.getProduct1().click();
		addToCartPage.getProduct2().click();
		addToCartPage.getCartSymbole().click();
		RemoveCartPage removeCartPage = new RemoveCartPage(driver);
		removeCartPage.getRemoveProduct().click();
		removeCartPage.getCheckOut().click();
		// *[@id="cart_contents_container"]/div/div[1]/div[4]/div[2]/div[2]/button
		PersonalDetailsInfoPage personalDetailsInfoPage = new PersonalDetailsInfoPage(driver);
		personalDetailsInfoPage.getFirstName().sendKeys("sanjay");
		personalDetailsInfoPage.getLastNamr().sendKeys("kumar");
		personalDetailsInfoPage.getZipCode().sendKeys("600091");
		personalDetailsInfoPage.getContinueButton().click();
		personalDetailsInfoPage.getFinishButton().click();

	}

}
