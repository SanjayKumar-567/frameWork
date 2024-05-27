package genaricutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

	public void clickOnElement(WebElement element) {
		element.click();
	}

	public void sendText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public String fetchTitile(WebDriver driver) {
		return driver.getTitle();
	}

	public String fetchUrl(WebDriver driver) {//note why we are using return here
		return driver.getCurrentUrl();
	}

	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();

	}

	public void dismisstAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	public void fetchAlertText(WebDriver driver,String text) {
		String alertText =driver.switchTo().alert().getText();
		

	}

	/*
	 * public void fetchAlertText(WebDriver driver,String text) { String alertText
	 * =driver.switchTo().alert().getText();
	 * 
	 * 
	 * }
	 */
	public void selectOPtionByIndex(WebElement element,int index) {
        Select slt = new Select(element);	
        slt.selectByIndex(index);
	}

	public void selectOPtionByValueAttribute(WebElement element,String value) {
        Select slt = new Select(element);	
        slt.selectByValue(value);
	}
	public void selectOPtionByVisiableText(WebElement element,String visiableText) {
        Select slt = new Select(element);	
        slt.selectByVisibleText(visiableText);
	}
	
	public void captureScreenshot(WebDriver driver, String name) {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File path=new File("./Screenshots/"+name+".png");
		try {
			FileHandler.copy(ss, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
