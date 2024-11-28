package PomScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclass.BaClass;
import fileutility.ReadExcel;
import genaricutility.WebDriverUtility;
import objectrepository.LoginPage;

public class LoginTest extends BaClass {

	@Test
	public void loginTest(String userName, String password) {
		Reporter.log(" sucessfully navigated to url and eneterd into login page ", true);

		WebDriverUtility utility = new WebDriverUtility();
		LoginPage loginPage = new LoginPage(driver);

		utility.captureScreenshot(driver, "BeforeLogin");

		loginPage.getEmailTextField().sendKeys(userName);
		loginPage.getPasswordTextField().sendKeys(password);

		loginPage.getLoginButton().click();
		utility.captureScreenshot(driver, "AfterLogin");

	}

}
