package qatrainingpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class homepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","c:\\Program Files\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		driver.get("https://training.qaonlinetraining.com/");
		 driver.manage().window().maximize();
		 
		 
		// for login link used explicit wait 
		WebDriverWait wait = new WebDriverWait(driver, 20);
		 WebElement loginlink =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"topnav\"]/a/span")));
		loginlink.click();
		
		WebElement username = driver.findElement(By.id("user_login"));
		username.clear();
		username.sendKeys("Laksmi");
		WebElement password = driver.findElement(By.name("pwd"));
		password.clear();
	    password.sendKeys("7051234567");
	    WebElement loginbtn = driver.findElement(By.name("wp-submit"));
	    loginbtn.click();
	    Thread.sleep(1000);
	    
	    

	    
	    
	    
	    
	 // creating object instance for chromedriver
	    //invoke the browser
	    //maximizing the browser
	    //to locate login link using xpath and hold the element value used explicit wait
	    //enter username with id locaator
	    //clear the username
	    //send value to the username
	    //enter password with name locator
	    // clear the password
	    // send the  password
	    // locate login button and click
	    
	    
		
	}

}
