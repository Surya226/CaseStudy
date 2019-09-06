package CaseStudy4.case1;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class case4 {
WebDriver driver;
	@Given("user in login page")
	public void user_in_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\driver\\chromedriver.exe");
	    driver=(WebDriver) new ChromeDriver();
	    driver.get("http://google.com");
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@When("user search prod {string}")
	public void user_search_prod(String string) {
		  driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys(string);
	}

	@Then("user click search button")
	public void user_click_search_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("click add to cart")
	public void click_add_to_cart() {
		driver.findElement(By.linkText("Add to cart")).click();
	}

	@Then("login page should display")
	public void login_page_should_display() {
	    Assert.assertEquals(driver.getTitle(), "Login");
	}

}
