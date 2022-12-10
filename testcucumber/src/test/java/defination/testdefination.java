package defination;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testdefination {
	
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
		
	@Given("to go to login page")
	public void to_go_to_login_page() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@When("enter username {string}")
	public void enter_username(String string) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(string);
		
	}
	@When("Enter password {string}")
	public void enter_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
		
		
}
	@When("Click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
}
	@Then("Ishould see the username as {string}")
	public void ishould_see_the_username_as(String string) {
		String t=driver.getTitle();
		Assert.assertEquals(string, t);
	    	}







}