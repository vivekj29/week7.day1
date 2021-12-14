package pagesservicenow;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseservicenow.BaseClassSnow;

public class LoginPageSnow extends BaseClassSnow {

	public LoginPageSnow (ChromeDriver driver) {
		this.driver = driver;
	}
	
	public LoginPageSnow enterUserName() {
		driver.findElement(By.id("user_name")).sendKeys("admin");
		return this;
		
	}
	
	public LoginPageSnow enterPassword() {
		driver.findElement(By.id("user_password")).sendKeys("Snow@2021");
		return this;
	}
	
	public SearchIncidentPage clickLogIn() {
		driver.findElement(By.id("sysverb_login")).click();
		return new SearchIncidentPage(driver);
	}
}
