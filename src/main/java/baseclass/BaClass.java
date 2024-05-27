package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import listnerimplimentation.ListenerClass;

public class BaClass extends  ListenerClass  {
	 public WebDriver driver;
	 public static WebDriver sdriver;

	@BeforeClass
	public void launch_browser()

	{Reporter.log("oprnrd");
		driver = new ChromeDriver();
		sdriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		String str = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
		System.out.println(str);
	}

	/*
	 * @BeforeMethod public void login_page()
	 * 
	 * { driver.findElement(By.id("user-name")).sendKeys("standard_user");
	 * driver.findElement(By.id("password")).sendKeys("secret_sauce");
	 * driver.findElement(By.xpath("//input[@id='login-button']")).click(); }
	 */
	/*
	 * @AfterMethod public void logout() {
	 * 
	 * driver.findElement(By.id("react-burger-menu-btn")).click();
	 * driver.findElement(By.id("logout_sidebar_link")).click(); }
	 */

	@AfterClass
	public void close_browser() {
		driver.close();
		driver.quit();
	}
	
	

}
