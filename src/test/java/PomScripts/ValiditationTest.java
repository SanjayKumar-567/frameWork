package PomScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseclass.BaClass;
import objectrepository.BasePage;
import objectrepository.ValiditationPage;

public class ValiditationTest extends BaClass{
	
@Test
	public void validating() {
	ValiditationPage  validitationPage = new ValiditationPage(driver);
	validitationPage.getCssValu();
	validitationPage.getTagName();
	validitationPage.getClass();
	}
	
	

}
