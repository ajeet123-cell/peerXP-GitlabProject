package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitLab2 {
	
	WebDriver driver;
	     @BeforeTest
	     public void LaunchUrl() throws InterruptedException{
	        	
	      WebDriverManager.chromedriver().setup();
	   	  driver =new ChromeDriver();
	   	  driver.get("https://gitlab.com/users/sign_in#register-pane");
	   	  Thread.sleep(5000);
	   	  
	     }
	     @Test
	     public void RegistrationPage() throws InterruptedException{
	    	 //First Name
	    	  driver.findElement(By.id("new_user_first_name")).sendKeys("Ajeet");
	    	 //Last Name 
	    	  driver.findElement(By.id("new_user_last_name")).sendKeys("Patel");
	    	  //User Name
	    	  driver.findElement(By.id("new_user_username")).sendKeys("Ajeet");
	    	  //Email
	    	  driver.findElement(By.id("new_user_email")).sendKeys("ajeetcool146@gmail.com");
	    	  //Password
	    	  driver.findElement(By.id("new_user_password")).sendKeys("Ajeet@123");
	    	 // CheckBox
	    	  driver.findElement(By.id("new_user_email_opted_in")).click();
	    	  
	    	  Thread.sleep(5000);
	    	  
	    	  driver.findElement(By.id("commit")).click();
	    	  
	    	  
	    	  
	     }

	        	
	 

}
