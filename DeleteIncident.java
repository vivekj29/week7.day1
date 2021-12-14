package testcasesservicenow;

import org.testng.annotations.Test;

import baseservicenow.BaseClassSnow;
import pagesservicenow.LoginPageSnow;

public class DeleteIncident extends BaseClassSnow{
	
	@Test
	public void newIncident() throws InterruptedException {
		
		LoginPageSnow lp = new LoginPageSnow(driver);
		
		lp.enterUserName()
		.enterPassword()
		.clickLogIn()
		.searchIncident()
		.findIncident()
		.searchIncident()
		.deleteIncident();
		
	}

}
