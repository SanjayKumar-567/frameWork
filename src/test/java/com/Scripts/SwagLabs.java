package com.Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SwagLabs {

	public WebDriver driver;
	public static WebDriver sdriver;
@Test
	public void regression() throws InterruptedException {
		driver = new ChromeDriver();
		sdriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		String str = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
		System.out.println(str);
		Thread.sleep(3000);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    Reporter.log("loginpage completed sucessfully");
	    
	    
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-bike-light']")).click();
		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
		Reporter.log(" sucessfully loged in sucessfully and entered into address_page_info()", true);

		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']/following::button[1]")).click();
		driver.findElement(By.id("checkout")).click();

		driver.findElement(By.id("first-name")).sendKeys("sanjay");
		// Assert.fail();
		Thread.sleep(3000);
		driver.findElement(By.id("last-name")).sendKeys("kumar");
		driver.findElement(By.id("postal-code")).sendKeys("600091");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		Reporter.log(" sucessfully completed address_page_info()and entered into validation_thank_you_page() ", true);

		String PageTitle = driver.getTitle();// to print on consul screen output Swag Labs
		System.out.println(PageTitle);

		String CurrentPageUrl = driver.getCurrentUrl();
		System.out.println(CurrentPageUrl);// https://www.saucedemo.com/checkout-complete.html

		String attribute = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order!')]"))
				.getAttribute("class");
		System.out.println(attribute); // complete-header

		String tgname = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order!')]")).getTagName();
		System.out.println(tgname);// h2
		Thread.sleep(3000);

		String CssValu = driver.findElement(By.xpath("//img[@class='pony_express']")).getCssValue("font-size");
		System.out.println(CssValu);// 14px
		Reporter.log(" sucessfully completed validation_thank_you_page() ", true);

		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();

		Reporter.log("  loged out sucessfully and enterd into close_browser()page", true);
		driver.close();
		driver.quit();

	}

}
