package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class DeleteLead extends BaseClass{
	
	@Test
	public void runDeleteLead() throws InterruptedException {
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
		.clickDeleteLead();
	}

}

