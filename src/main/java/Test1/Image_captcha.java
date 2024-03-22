package Test1;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Image_captcha {
	
	    public static void main(String[] args) {
	    

	        // Create a new WebDriver instance
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the website with the captcha
	        driver.get("https://example.com");

	        // Find the captcha element
	        WebElement captchaElement = driver.findElement(By.id("captcha"));

	        // Solve the captcha using an external service (e.g., 2captcha, Anti-Captcha)
	        String captchaSolution = solveCaptcha(captchaElement);

	        // Enter the captcha solution into the input field
	        driver.findElement(By.id("captcha-input")).sendKeys(captchaSolution);

	        // Submit the form
	        driver.findElement(By.id("submit-button")).click();

	        // Close the WebDriver instance
	        //driver.quit();
	    }

	    private static String solveCaptcha(WebElement captchaElement) {
	        // Take a screenshot of the captcha element
	        File screenshot = ((TakesScreenshot)captchaElement).getScreenshotAs(OutputType.FILE);

	        // Send the captcha screenshot to an external service for solving
	        String captchaSolution = sendCaptchaScreenshotToService(screenshot);

	        // Return the captcha solution
	        return captchaSolution;
	    }

	    private static String sendCaptchaScreenshotToService(File screenshot) {
	        // Replace this with the actual code to send the captcha screenshot to an external service
	        return "123456";
	    }
	}


