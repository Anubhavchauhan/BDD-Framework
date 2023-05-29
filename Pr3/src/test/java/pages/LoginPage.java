package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;

	By txt_username= By.id("name");
	
	By txt_password = By.id("password");
	
	By txt_login = By.id("login");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterusername(String username) {
		driver.findElement(txt_username).sendKeys(username);
		}
	
	public void enterpassword(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
		
	}
	
	public void clicklogin() {
		
		driver.findElement(txt_login).click();
	}
	
}
