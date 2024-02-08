package Test1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login_testng {
	WebDriver driver=null;
	

		    @BeforeMethod
		    public void setUp() {
		      driver = new ChromeDriver();
		        driver.get("https://rvphp.djaxbidder.com/CompetitiveUI/agency/");
		    }

		    @Test
		    public void testLogin() {
		        WebElement usernameInput = driver.findElement(By.id("username"));
		        usernameInput.sendKeys("ruser");

		        WebElement passwordInput = driver.findElement(By.id("password"));
		        passwordInput.sendKeys("admin@123456");

		        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"formAuthentication\"]/div[3]/button"));
		        loginButton.click();

		        // Assert that the user is logged in by checking for the presence of a specific element on the dashboard page.
		        WebElement dashboardElement = driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li/a/div/img"));
		        Assert.assertTrue(dashboardElement.isDisplayed());
		    }

		    @AfterMethod
		    public void tearDown() {
		        driver.quit();
		    }
	
}

