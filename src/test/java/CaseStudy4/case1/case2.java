package CaseStudy4.case1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class case2 {
	WebDriver driver;
	@Given("User clicks the SignIn button")
	public void user_clicks_the_SignIn_button() {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("User enters the {string}")
	public void user_enters_the(String string) {
		driver.findElement(By.id("userName")).sendKeys(string);
	}

	@Then("User entered the {string}")
	public void user_entered_the(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
		driver.findElement(By.name("Login")).click();
	}
}
