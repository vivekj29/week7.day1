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

public class DeleteIncidentPage extends BaseClassSnow{
	
	public DeleteIncidentPage (ChromeDriver driver) {
		this.driver = driver;
	}
	
	public DeleteIncidentPage searchIncident() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("INC0010012");
		Actions builder2 = new Actions(driver);
		builder2.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		return this;
	}
	
	public DeleteIncidentPage deleteIncident() {
		driver.findElement(By.id("sysverb_delete")).click();
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();
		return this;
	}
}
