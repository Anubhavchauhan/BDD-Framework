package StepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pagefactory.LoginPage_PF;
//
//
//public class LoginSteps_PF {
//	
//	WebDriver driver = null;
//	LoginPage_PF login;
//	
//	@Given("user is on basic_auth login page")
//	public void user_is_on_login_page() {
//	   System.out.println("Inside step- user is on login page");
//	   String ProjectPath= System.getProperty("user.dir");
//	   System.setProperty("webdriver.chrome.driver", ProjectPath + "\\src\\test\\resources\\Features\\chromedriver.exe");
//	   driver = new ChromeDriver();
//	   driver.navigate().to("https://torum:sVFrvBeJTvDeo1mQxpl6@torum.team/basic_auth");
//	  
//	}
//
//	@When("user enters username and password")
//	public void user_enters_username_and_password() {
//	
//		driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div[2]/div/div[2]/div/div[4]/a")).click();
//	}
//
//	@And("clicks on login button")
//	public void clicks_on_login_button() throws InterruptedException {
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id='cny-2023_53-Rectangle_124218']")).isDisplayed(); 
//		//if (logo == true) {
//		//System.out.println("Logo is Present");
//	Thread.sleep(2000);
//		
//		}
//	
//
//	@Then("user is navigated to the home")
//	public void user_is_navigated_to_the_home() throws InterruptedException {
//		Thread.sleep(5000);
//		driver.close();
//	}
//	
//
//	
//	@When("user enters resting and {int}@#Ab")
//	public void user_enters_resting_and_ab(Integer int1) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("verify user is on homapage")
//	public void verify_user_is_on_homapage() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//}

public class LoginSteps_PF {
	
	WebDriver driver;
	LoginPage_PF login;	
	@Before
	public void before() {
		String ProjectPath= System.getProperty("user.dir");
		   System.setProperty("webdriver.chrome.driver", ProjectPath + "\\src\\test\\resources\\Features\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.navigate().to("https://torum:sVFrvBeJTvDeo1mQxpl6@torum.team/basic_auth");
		
	}
	
	
//	@After
//	public void after() throws InterruptedException {
//		
//		Thread.sleep(5000);
//		driver.close();
//	}
	
//@Given("user is on basic_auth login page")
//public void user_is_on_basic_auth_login_page() throws InterruptedException {
//	
//	
//  Thread.sleep(300);
//}

@Given("user is on login page")
public void user_is_on_login_page() throws InterruptedException {
	login = new LoginPage_PF(driver);
    login.gotoLogin();
}

@When("user enters (.*) and (.*)$")
public void user_enters_resting_and_ab(String username, String password) {
    login.enterUsername(username);
    login.enterPassword(password);
}

@When("clicks on login button")
public void clicks_on_login_button() throws InterruptedException {
	
    login.loginFinal();
}

@When("verify user is on homapage")
public void verify_user_is_on_homapage() throws InterruptedException {
	Thread.sleep(5000);
    login.verify();
}

@Then("user is navigated to the home")
public void user_is_navigated_to_the_home() throws InterruptedException {
    Thread.sleep(300);
    //driver.close();
}
}