package Account_Creation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Account_Creation {
				
	String get = ("https://www.google.com");
	 String name = "q";

	    WebDriver driver;

	    @BeforeMethod
	    public void setup() {
	       
	        driver = new ChromeDriver();
	        driver.get(get);
	    }

	    @Test
	    public void testSearch() {
	        webelement searchBox = driver.findElement(By.name(name));
	        searchBox.sendKeys("Selenium");
	        searchBox.submit();
	        WebElement firstResult = driver.findElement(By.cssSelector("div.rc"));
	        firstResult.click();
	    }

	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
	}

