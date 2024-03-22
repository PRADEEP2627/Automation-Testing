package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class democlass {

	public static void main(String[] args) throws InterruptedException {

				     		     
		        // Create a new ChromeDriver instance
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the login page of the application
		        driver.get("https://revphpe.djaxbidder.com/ConvrsusUI/agency/index.php");

		        // Find the username and password fields
		        WebElement usernameField = driver.findElement(By.id("username"));
		        WebElement passwordField = driver.findElement(By.id("password"));

		        // Enter the username and password
		        usernameField.sendKeys("testuser1");
		        passwordField.sendKeys("admin@123456");

		        // Click on the login button
		        driver.findElement(By.xpath("//*[@id=\"formAuthentication\"]/div[3]/button")).click();

		        // Check if the user is successfully logged in
		        if (driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li/a/div/img")).isDisplayed()) {
		            System.out.println("User is successfully logged in.");
		        } else {
		            System.out.println("User is not logged in.");
		        }

		        // Close the browser
		        driver.quit();
		    }
	}

	



