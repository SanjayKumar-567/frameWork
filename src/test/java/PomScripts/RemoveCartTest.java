package PomScripts;

import baseclass.BaClass;
import objectrepository.RemoveCartPage;

public class RemoveCartTest extends BaClass {
	
	public void removingProduct() {
		RemoveCartPage removeCartPage = new RemoveCartPage(driver);
		removeCartPage.getRemoveProduct().click();
		removeCartPage.getCheckOut().click();
		
	}

}
