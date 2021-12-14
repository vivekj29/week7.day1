package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {

	public CreateLeadPage (ChromeDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ Corp.");
		return this;
	}
	
	public CreateLeadPage enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vivek");
		return this;
	}

	public CreateLeadPage enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		return this;
	}
	
	public ViewLeadPage clickCreateLead() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewLeadPage(driver);
	}
}
