package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;

public class ViewLeadPage extends BaseClass{
	
	public ViewLeadPage (ChromeDriver driver) {
		this.driver = driver;
	}
	
	public ViewLeadPage verifyFirstName() {
		boolean displayed = driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}
	
	public EditLeadPage clickEditLead() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
	
	public DuplicateLeadPage clickDuplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);
	}
	
	public MyLeadsPage clickDeleteLead() {
		driver.findElement(By.linkText("Delete")).click();
		return new MyLeadsPage(driver);
	}
	
	public ViewLeadPage verifyCompanyName() {
		boolean displayed = driver.findElement(By.id("viewLead_companyName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}

}
