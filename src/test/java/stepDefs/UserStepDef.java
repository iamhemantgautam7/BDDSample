package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStepDef {
	
	WebDriver driver;
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	   
	}
	@When("User enter Credentials")
	public void user_enter_credentials() {
		driver.get("http://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();
	   
	}
	@Then("Should display Success Msg")
	public void should_display_success_msg() {
	   boolean isDisp=driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
	   Assert.assertTrue(isDisp);
	   driver.close();
	   
	}


}
