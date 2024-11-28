package com.Scripts;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClockIn {
	@Test
	public void ppulse() throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://ppulse.co/account/dashboard");
	driver.findElement(By.name("email")).sendKeys("sanjaykumarp@prometheansoftwares.com");
	driver.findElement(By.name("password")).sendKeys("9500112497");
	driver.findElement(By.id("submit-login")).click();
	
	 WebElement firstwindow=driver.findElement(By.id("clock-in"));
	 firstwindow.click();
	 
	 Set<String> handles = driver.getWindowHandles();
	  System.out.println(handles);
	  
	  for (String newWindow : handles) {
	  
	  driver.switchTo().window(newWindow);
	  
	  }
	   Thread.sleep (3000);
	  String url = driver.getCurrentUrl();
	  System.out.println(url);
	   Thread.sleep (5000);
	//driver.findElement(By.xpath("//*[@id=\"task_div\"]/div/div[1]/div/div/button]")).click();
	
	
	driver.findElement(By.id("save-clock-in")).click();


}
	}
