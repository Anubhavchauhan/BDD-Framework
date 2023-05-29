package pagefactory;

import org.junit.Assert;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import junit.framework.Assert;

//import dev.failsafe.internal.util.Assert;

public class LoginPage_PF {
	
	@FindBy(xpath = "//*[@id='root']/div/div/div[3]/div/div[2]/div[1]")
	WebElement login_button;
	
	@FindBy(xpath = "/html/body/div[7]/div/div/div/div/div/div/div[2]/div[2]/button")
	WebElement continue_with_password;
	
	@FindBy(xpath = "/html/body/div[7]/div/div/div/div/div/div/div/div/div/form/div[1]/div/input")
	WebElement enter_username;
	
	@FindBy(xpath = "/html/body/div[7]/div/div/div/div/div/div/div/div/div/form/div[2]/div/input")
	WebElement enter_password;
	
	@FindBy(xpath = "/html/body/div[7]/div/div/div/div/div/div/div/div/div/form/div[4]")
	WebElement login;
	
	//@FindBy(xpath = "//*[@id=\'root\']/div/div/div[2]/div/div[1]/div/div[1]/div[1]/h2")
	@FindBy(xpath = "//*[@id='feed-scroll-to-top-on-click']/div[1]/div[1]")
	WebElement feed_button;
	
	
	
	
	@FindBy(xpath = "//*[@id=\'root\']/div/div/div[2]/div/div[2]/div/div[4]/a")
	WebElement send_me_home;
	
	//@FindBy(id = "onesignal-slidedown-cancel-button")
	//WebElement cancel_popup;
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void gotoLogin() throws InterruptedException{
		
		Thread.sleep(300);
		login_button.click();
		Thread.sleep(20);
		
		continue_with_password.click();
		Thread.sleep(30);
		}
	
	public void enterUsername(String username) {
		
		enter_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		enter_password.sendKeys(password);
	}
	
	public void loginFinal() throws InterruptedException {
		Thread.sleep(5000);
		login.click();
		
		}
	
	public void verify() throws InterruptedException {
		
		
		//Alert alert=driver.switchTo().alert();
		//System.out.println("===Alert message===" + alert.getText());
		//alert.accept();
		//alert.accept();
		
		send_me_home.click();
		Thread.sleep(4000);
		//feed_button.isDisplayed();
		//Assert.assertEquals(true, feed_button.isDisplayed());
		   //System.out.println("\\u001B[32mAssert passed");
		
		//Boolean check=feed_button.isDisplayed();
		//String buttontext = feed_button.getText();
		//System.out.println(buttontext);
		
		//System.out.println(feed_button.isDisplayed());
		//Assert.assertTrue(feed_button.isDisplayed());
		Assert.assertTrue((feed_button.isDisplayed() && feed_button.isEnabled()));
		
	}

}
