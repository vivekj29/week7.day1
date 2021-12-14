package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class MergeLead extends BaseClass{
	
	@Test
	public void runMergeLead() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFALink()
		.ClickLeadsLink()
		.clickMergeLeads()
		.fromLead()
		.toLead()
		.clickMergeButton()
		.verifyFirstName();
	}

}

