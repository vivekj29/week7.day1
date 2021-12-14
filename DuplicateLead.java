package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class DuplicateLead extends BaseClass{
	
	@Test
	public void runDuplicateLead() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFALink()
		.ClickLeadsLink()
		.clickFindLeads()
		.clickPhone()
		.enterPhoneNum()
		.clickFindLeadsButton()
		.clickFirstLead()
		.clickDuplicateLead()
		.clickUpdateButton()
		.verifyFirstName();
	}

}

