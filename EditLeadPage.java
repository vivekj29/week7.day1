package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;

public class EditLeadPage extends BaseClass{


	public EditLeadPage (ChromeDriver driver) {
		this.driver = driver;
	}
	
	public EditLeadPage updateCompanyName() {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("CTS");
		return this;
	}
	
	public ViewLeadPage clickUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}
