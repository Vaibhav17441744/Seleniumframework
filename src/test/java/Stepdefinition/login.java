package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {


	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();  
		
	}
	
	@And("^user enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_valid_and(String email,String pass) {
		
		driver.findElement(By.id("email")).sendKeys(email);
	     driver.findElement(By.name("pass")).sendKeys(pass);
	}
	
	@When("click on login Button")
	public void click_on_login_Button() {
		driver.findElement(By.className("_42ft")).click();
		
	}
	@Then("user navigated to homepage")
	public void user_navigated_to_homepage() {
		 System.out.println("homepage");
		 Assert.assertFalse(true);
		
	}
}
