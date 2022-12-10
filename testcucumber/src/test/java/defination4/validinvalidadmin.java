package defination4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class validinvalidadmin extends test_utils{
	String url="https://demoapp.skillrary.com/login.php?type=login";
	WebDriver driver;
	
	@Given("I should go to login page")
	public void i_should_go_to_the_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(5000);
	}
	
	@When("enter username {string}")
	public void enter_username(String string) throws InterruptedException {
		Thread.sleep(3000);
		WebElement we=driver.findElement(By.name("email"));
		test_utils.passingValuesUsingJS(we, string, driver);
		
	}
	@When("Enter password {string}")
	public void enter_password(String string) {
		
		WebElement rt=driver.findElement(By.name("password"));
		test_utils.passingValuesUsingJS(rt, string, driver);
		
	    
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
	
	WebElement ft =	driver.findElement(By.id("last"));
	test_utils.clickElementByJS(ft, driver);
	   
	}
	@Then("Ishould see the username as {string}")
	public void ishould_see_the_username_as(String string) throws InterruptedException {
		Thread.sleep(5000);
		WebElement web=driver.findElement(By.xpath("//*[@class='hidden-xs']"));
		String tp=web.getText();
		Assert.assertEquals(string, tp);
	    System.out.println(tp);
	}

}
