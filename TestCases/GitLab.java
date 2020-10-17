package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitLab {
	WebDriver driver;
	
	@BeforeTest
	public void LaunchUrl() throws InterruptedException{

    	WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		driver.get("https://gitlab.com/users/sign_in");
		 Thread.sleep(5000);
		
	}
	@Test
	public void NegativeTestCase() {
		 //username
        driver.findElement(By.id("user_login")).sendKeys("testuser");
        //password
        driver.findElement(By.id("user_password")).sendKeys("testuserPassword");
        //remember me checkbox
        driver.findElement(By.id("user_remember_me")).click();
        //signin    
        driver.findElement(By.name("commit")).click();
	}
	@AfterTest
	public void close(){
		 driver.close();
		
	}

}
