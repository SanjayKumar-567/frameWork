package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public BasePage(WebDriver driver){//created  a constructed and passed driver asa argument
		PageFactory.initElements(driver, this);//this line helps to pass pomo
	}

}
