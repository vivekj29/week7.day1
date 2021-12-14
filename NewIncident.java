package testcasesservicenow;

import org.testng.annotations.Test;

import baseservicenow.BaseClassSnow;
import pagesservicenow.LoginPageSnow;

public class NewIncident extends BaseClassSnow{
	
	@Test
	public void newIncident() {
		
		LoginPageSnow lp = new LoginPageSnow(driver);
		
		lp.enterUserName()
		.enterPassword()
		.clickLogIn()
		.searchIncident()
		.createNew()
		.selectCaller()
		.enterShortDesc()
		.verifyIncidentNum();
	
		
	}

}
