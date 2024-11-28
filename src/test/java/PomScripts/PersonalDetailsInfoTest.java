package PomScripts;

import baseclass.BaClass;
import objectrepository.PersonalDetailsInfoPage;

public class PersonalDetailsInfoTest extends BaClass {

	public void PersonalDetails() {
PersonalDetailsInfoPage personalDetailsInfoPage = new PersonalDetailsInfoPage(driver);

		personalDetailsInfoPage.getFirstName().sendKeys("sanjay");
		personalDetailsInfoPage.getLastNamr().sendKeys("kumar");
		personalDetailsInfoPage.getZipCode().sendKeys("600091");
		personalDetailsInfoPage.getContinueButton().click();
		personalDetailsInfoPage.getFinishButton().click();
		
	}
}
