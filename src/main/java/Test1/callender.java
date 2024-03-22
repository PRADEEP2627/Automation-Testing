package Test1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class callender {
	

	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

	        // Create a new WebDriver instance
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the webpage with the calendar
	        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

	        // Find the calendar element
	        WebElement calendar = driver.findElement(By.id("first_date_picker"));
	        
	        calendar.click();
	        // Create an Actions object
	        Actions actions = new Actions(driver);

	        // Move the mouse to the calendar element
	        actions.moveToElement(calendar).perform();

	        // Click on the desired date
	        WebElement date = driver.findElement(By.className("ui-state-default"));
	        date.click();
	        String date1 = calendar.getAttribute("");
	        System.out.println(date1);

	        // Close the WebDriver instance
	        //driver.quit();
	    }
	}


