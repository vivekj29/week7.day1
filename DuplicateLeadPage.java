package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;

public class DuplicateLeadPage extends BaseClass{


	public DuplicateLeadPage (ChromeDriver driver) {
		this.driver = driver;
	}
	
	public ViewLeadPage clickUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}
