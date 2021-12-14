package pagesservicenow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import baseservicenow.BaseClassSnow;

public class SearchIncidentPage extends BaseClassSnow {

	public SearchIncidentPage (ChromeDriver driver) {
		this.driver = driver;
	}
	
	public SearchIncidentPage searchIncident()  {
		driver.findElement(By.id("filter")).sendKeys("incident");
		driver.findElement(By.id("filter")).sendKeys(Keys.ENTER);
		return this;
	}
	
	public NewIncidentPage createNew()  {
		driver.findElement(By.xpath("//div[text()='Create New']")).click();
		driver.switchTo().frame("gsft_main");
		return new NewIncidentPage(driver);
	}
	
	public UpdateIncidentPage existingIncident()  {
		driver.findElement(By.xpath("(//div[text()='Incidents'])[2]")).click();
		driver.switchTo().frame("gsft_main");
		return new UpdateIncidentPage(driver);
	}
	
	public DeleteIncidentPage findIncident()  {
		driver.findElement(By.xpath("(//div[text()='Incidents'])[2]")).click();
		driver.switchTo().frame("gsft_main");
		return new DeleteIncidentPage(driver);
	}
}
