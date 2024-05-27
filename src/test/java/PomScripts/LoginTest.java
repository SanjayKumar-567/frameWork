package PomScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.BaClass;
import genaricutility.WebDriverUtility;
import objectrepository.LoginPage;

public class LoginTest extends BaClass {
	@Test                 
	public void LoginTest() {
		Reporter.log(" sucessfully navigated to url and eneterd into login page ", true);
		/*
		 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 * driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 * driver.findElement(By.xpath("//input[@id='login-button']")).click();
		 * Thread.sleep(3000);
		 */
		
			WebDriverUtility utility=new WebDriverUtility();
			LoginPage loginPage = new  LoginPage(driver);
			
			utility.captureScreenshot(driver, "BeforeLogin");
			loginPage.getEmailTextField().sendKeys("standard_user");			
			loginPage.getPasswordTextField().sendKeys("secret_sauce");
			loginPage.getLoginButton().click();
			utility.captureScreenshot(driver, "AfterLogin");
		
	}
	

}
