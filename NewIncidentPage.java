package pagesservicenow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import baseservicenow.BaseClassSnow;

public class NewIncidentPage extends BaseClassSnow{
	
	public NewIncidentPage (ChromeDriver driver) {
		this.driver = driver;
	}
	
	public NewIncidentPage selectCaller() {
		driver.findElement(By.id("lookup.incident.caller_id")).click();
		Set <String> wh = driver.getWindowHandles();
		List <String> winhandles = new ArrayList<String>();
		winhandles.addAll(wh);
		driver.switchTo().window(winhandles.get(1));
		driver.findElement(By.className("glide_ref_item_link")).click();
		driver.switchTo().window(winhandles.get(0));
		driver.switchTo().frame("gsft_main");
		return this;
	}
	
	public NewIncidentPage enterShortDesc() {
		driver.findElement(By.id("incident.short_description")).sendKeys("New Incident");
		return this;
	}

	public NewIncidentPage verifyIncidentNum() {
		String incidentnum = driver.findElement(By.id("incident.number")).getAttribute("value");
		System.out.println("Incident Number: " +incidentnum);
		driver.findElement(By.id("sysverb_insert")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Press Enter from within')]/following-sibling::input")).sendKeys(incidentnum);
		driver.findElement(By.xpath("//span[contains(text(),'Press Enter from within')]/following-sibling::input")).sendKeys(Keys.ENTER);
		
		String text = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		System.out.println(text);
		Assert.assertEquals(incidentnum, text);
		return this;
	}
}
