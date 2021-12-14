package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class EditLead extends BaseClass{
	
	@Test
	public void runEditLead() throws InterruptedException {
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
		.clickEditLead()
		.updateCompanyName()
		.clickUpdateButton()
		.verifyCompanyName();
	}

}

