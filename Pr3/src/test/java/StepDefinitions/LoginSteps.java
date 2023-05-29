//package StepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//
//public class LoginSteps {
//	
//	WebDriver driver = null;
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
//}
