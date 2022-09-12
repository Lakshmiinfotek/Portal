package trainingportalsteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepsforhomepage {
	WebDriver driver;// the class using the driver instance

	@Given("I am on the home page of {string}")
	public void i_am_on_the_home_page_of(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		 driver = new ChromeDriver();// creating an object for the chrome driver
		driver.get(string);// invoke the web site
		driver.manage().window().maximize();//Maximizing window

	}

	@Then("I click on the {string} button")
	public void i_click_on_the_button(String string1) {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement string11 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"topnav\"]/a/span")));
		string11.click();

	}

	@Then("I type the Username = {string} and password=\"{int}")
	public void i_type_the_Username_and_password(String string, CharSequence[] int1) {
		driver.findElement(By.id("user_login")).sendKeys(string);
		driver.findElement(By.name("pwd")).sendKeys(int1);

	}
	
	@Then("I click on {string}")
	public void i_click_on(String string) {
		WebElement string1 = driver.findElement(By.name("wp-submit"));
		string1.click();



	}

	@Then("I am on the mainpage")
	public void i_am_on_the_mainpage() {
		System.out.println("i am on the homepage");

	}

	@Then("I will click on {string} button")
	public void i_will_click_on_button(String string) {
		WebElement string1 =driver.findElement((By.linkText("string")));
		string1.click();

	}

	@Then("i am on the database page")
	public void i_am_on_the_database_page() {
		System.out.println("i am on the database page");

	}



}
