package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// Working With Buttons

public class Test2 {
	
	public static WebDriver driver =null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\SeleniumTest11\\Resourse\\chromedriver.exe");
		 driver = new ChromeDriver(); 	
      String baseUrl = "https://letcode.in/";
       driver.get(baseUrl);
        driver.manage().window().maximize();
		
		
	//open work space	
	driver.findElement(By.xpath("//*[@id=\"testing\"] ")).click();
	
	// open button method
	driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a")).click(); 
	
	//Goto Home and come back here using driver command
	 driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
	 String gettitle =driver.getTitle();
	System.out.println("this is title" + gettitle);
	driver.navigate().back();
	
	//Get the X & Y co-ordinates
	WebElement location =driver.findElement(By.xpath("//*[@id=\"position\"]"));
	location.getLocation();
	System.out.println("this is location" + location);
	
	//Find the color of the button
	WebElement color = driver.findElement(By.xpath("//*[@id=\"color\"]"));
	String color1 =color.getCssValue("class");
	System.out.println("this is color" + color1);
	
	//Find the height & width of the button
      org.openqa.selenium.Rectangle  rect = driver.findElement(By.xpath("//*[@id=\"property\"]")).getRect();
        org.openqa.selenium.Dimension  dom = rect.getDimension();
        System.out.println("this is height" + dom.getHeight());
        System.out.println("this is weigth" + dom.getWidth());
    	
	
	//Confirm button is disabled 
		boolean enable =driver.findElement(By.xpath("//*[@id=\"isDisabled\"]")).isEnabled();
		System.out.println(enable);
		
		//Click and Hold Button
	 String read =driver.findElement(By.xpath("//*[@id=\"isDisabled\"]/div/h2")).getCssValue("value");
	 System.out.println(" this is read only"+read);
        
     
    	
        driver.close();
      	}

}
