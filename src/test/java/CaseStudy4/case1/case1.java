package CaseStudy4.case1;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	
public class case1
  {
	WebDriver driver;

	@Given("user opens the TestMeApp home page")
	public void user_opens_the_TestMeApp_home_page()
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		

	}

	@Given("user clicks the SignUp Button")
	public void user_clicks_the_SignUp_Button() {
	   driver.findElement(By.linkText("SignUp")).click();
	}

	@When("user enters the username {string}")
	public void user_enters_the_username(String string) {
		driver.findElement(By.id("userName")).sendKeys(string);}

	@When("user enters the Firstname {string}")
	public void user_enters_the_Firstname(String string) {
		driver.findElement(By.id("firstName")).sendKeys(string);
	}

	@When("user enters the LAstname {string}")
	public void user_enters_the_LAstname(String string) {
		driver.findElement(By.id("lastName")).sendKeys(string);
	}

	@When("user enters the password {string}")
	public void user_enters_the_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("user enters the confirm password {string}")
	public void user_enters_the_confirm_password(String string) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(string);
	}

	@When("user enters the Gender as male")
	public void user_enters_the_Gender_as_male() {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
	}

	@When("user enters the E-mail {string}")
	public void user_enters_the_E_mail(String string) {
		driver.findElement(By.id("emailAddress")).sendKeys(string);
	}

	@When("user enters the mobile no. {string}")
	public void user_enters_the_mobile_no(String string) {
		driver.findElement(By.id("mobileNumber")).sendKeys(string);
	}

	@When("user enters the DOB")
	public void user_enters_the_DOB() {
		driver.findElement(By.xpath("//img[@alt='Ch']")).click();

		WebElement month = driver.findElement(By.xpath("// select[@data-handler='selectMonth']"));

		Select actmonth= new Select(month);

		actmonth.selectByValue("10");

		WebElement year = driver.findElement(By.xpath("// select[@data-handler='selectYear']"));

		Select actyear = new Select(year);

		actyear.selectByValue("1997");

		WebElement cal =driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));

		cal.findElement(By.linkText("9")).click();
	   
	}
	

	@When("user enters the  address {string}")
	public void user_enters_the_address(String string) {
		driver.findElement(By.id("address")).sendKeys(string);
	}

	@When("user chooses the Security Question")
	public void user_chooses_the_Security_Question() {
		WebElement seques = driver.findElement(By.xpath("//select[@id='securityQuestion']"));

		Select seq= new Select(seques);

		seq.selectByVisibleText("What is your Nick Name?");
		
	}

	@When("user enters the Answer {string}")
	public void user_enters_the_Answer(String string) {
		driver.findElement(By.name("answer")).sendKeys(string);
	}

	@Then("user clicks the register button")
	public void user_clicks_the_register_button() {
		driver.findElement(By.name("Submit")).click();
	}


}
