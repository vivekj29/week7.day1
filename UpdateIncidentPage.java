package pagesservicenow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import baseservicenow.BaseClassSnow;

public class UpdateIncidentPage extends BaseClassSnow{
	
	public UpdateIncidentPage (ChromeDriver driver) {
		this.driver = driver;
	}
	
	public UpdateIncidentPage searchIncident() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("INC0010010");
		Actions builder2 = new Actions(driver);
		builder2.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		return this;
	}
	
	public UpdateIncidentPage updateState() {
		WebElement dd2 = driver.findElement(By.id("incident.state"));
		Select state = new Select(dd2);
		state.selectByValue("2");
		return this;
	}
	
	public UpdateIncidentPage updateUrgency() {
		WebElement dd = driver.findElement(By.id("incident.urgency"));
		Select urgency = new Select(dd);
		urgency.selectByValue("1");
		return this;
	}

	public UpdateIncidentPage verifyUpdate() throws InterruptedException {
		driver.findElement(By.id("sysverb_update")).click();
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("INC0010010");
		Actions builder3 = new Actions(driver);
		builder3.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		
		String incstate = driver.findElement(By.xpath("//span[text()='Incident state']/following-sibling::span/span")).getText();
		System.out.println("Updated incident state: " + incstate);
		return this;
	}
}
