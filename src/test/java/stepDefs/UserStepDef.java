package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
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
	//First Example
	/*
	 * @When("User enter Credentials") public void user_enter_credentials(String
	 * strUser, String strPwd ) {
	 * driver.get("http://the-internet.herokuapp.com/login");
	 * driver.findElement(By.id("username")).sendKeys(strUser);
	 * driver.findElement(By.name("password")).sendKeys(strPwd);
	 * driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();
	 * 
	 * }
	 */
	
	//second Example
	/*
	 * @When("User enters {string} And {string}") public void
	 * user_enters_and_password(String strUser, String strPwd) {
	 * driver.get("http://the-internet.herokuapp.com/login");
	 * driver.findElement(By.id("username")).sendKeys(strUser);
	 * driver.findElement(By.name("password")).sendKeys(strPwd);
	 * driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();
	 * 
	 * }
	 */
	
	  //third example
		/*
		 * @When("User enters credentials") public void
		 * user_enters_credentials(DataTable dataTable) { List<List<String>> users=
		 * dataTable.asLists(); driver.get("http://the-internet.herokuapp.com/login");
		 * String strUser=users.get(0).get(0); String strPwd=users.get(0).get(1);
		 * driver.findElement(By.id("username")).sendKeys(strUser);
		 * driver.findElement(By.name("password")).sendKeys(strPwd);
		 * driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();
		 * 
		 * }
		 */
	  
	//Fourth example-using datatable as Maps
	  @When("User enters credentials")
	  public void user_enters_credentials(DataTable dataTable) {
		  List<Map<String, String>>users=dataTable.asMaps();
		  driver.get("http://the-internet.herokuapp.com/login");
		  
		  String strUser=users.get(0).get("username");
		  String strPwd=users.get(0).get("password");
		  driver.findElement(By.id("username")).sendKeys(strUser);
		  driver.findElement(By.name("password")).sendKeys(strPwd);
		  driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();
	      
	  }
	 
	
		
	@Then("Should display Success Msg")
	public void should_display_success_msg() {
	   boolean isDisp=driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
	   Assert.assertTrue(isDisp);
	  
	  
	   
	}


}
