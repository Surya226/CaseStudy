package CaseStudy4.case1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class case3 {

	WebDriver driver;
	
@Given("user open testmeapp")
public void user_open_testmeapp() {
	 System.setProperty("webdriver.chrome.driver","C:\\eclipse\\driver\\chromedriver.exe");
	    driver=(WebDriver) new ChromeDriver();
	    driver.get("http://google.com");
	    driver.get("http://10.232.237.143:443/TestMeApp/");
}

@When("user click signIn button")
public void user_click_signIn_button() {
	 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
}

@When("user Enter {string} in the user id field")
public void user_Enter_in_the_user_id_field(String string) {
	 driver.findElement(By.id("userName")).sendKeys(string);
}

@When("enter {string} in the password field")
public void enter_in_the_password_field(String string) {
	 driver.findElement(By.id("password")).sendKeys(string);
}

@When("click on login")
public void click_on_login() {
	driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
}

@Then("Homepage is displayed")
public void homepage_is_displayed() {
  System.out.println("Homepage is displayed");
}

@When("user search {string} in search field")
public void user_search_in_search_field(String string) {
	 driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);
}

@When("click search button")
public void click_search_button() {
	 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
}

}
