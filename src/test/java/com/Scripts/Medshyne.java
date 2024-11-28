package com.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Medshyne {
	@Test
	public void name() {
		WebDriver driver   = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.test.medshynepharmacy.com/login");
		driver.get("https://www.test.medshynepharmacy.com/login");
		driver.findElement(By.xpath("//input[@type='text']")).click();
		
		
		
	}

}
