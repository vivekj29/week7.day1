package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLead extends BaseClass{
	
	@Test
	public void runCreateLead() {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFALink()
		.ClickLeadsLink()
		.clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickCreateLead()
		.verifyFirstName();
	}

}

