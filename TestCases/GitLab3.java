package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitLab3 {
	WebDriver driver;
	
	  @BeforeTest
	     public void LaunchUrl() throws InterruptedException{
	        	
	      WebDriverManager.chromedriver().setup();
	   	  driver =new ChromeDriver();
	   	  driver.get("https://gitlab.com/users/sign_in");
	   	  Thread.sleep(5000);

}
	  @Test
	  public void NewProjectPage(){
		  //user name
		  driver.findElement(By.id("user_login")).sendKeys("py12");
		  //password
		  driver.findElement(By.id("user_password")).sendKeys("$eed@1234");
		  //remember
		  driver.findElement(By.id("user_remember_me")).click();
		  //sign
		  driver.findElement(By.name("commit")).click();
		  //new project
		  driver.findElement(By.xpath("//*[@id='content-body']/div[3]/div/a")).click();
		  
	  }
	  
	  @AfterTest
	  public void CloseBrowser(){
		  
		  driver.close();
	  }
}
