package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public static WebDriver driver =null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\SeleniumTest11\\Resourse\\chromedriver.exe");
		 driver = new ChromeDriver(); 	
      String baseUrl = "https://letcode.in/";
       driver.get(baseUrl);
        driver.manage().window().maximize();
      
	//open work space	
	driver.findElement(By.xpath("//*[@id=\"testing\"] ")).click();
	
	// open input method
	driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer/a")).click(); 
	
	//send value
	driver.findElement(By.xpath("//*[@id=\"fullName\"] ")).sendKeys("hello1");
	
	//using TAB key
	driver.findElement(By.xpath("//*[@id=\"join\"]")).sendKeys(" person", Keys.TAB );
	String attribute =  driver.findElement(By.xpath("//*[@id=\"join\"] ")).getAttribute("value");
	System.out.println("this is get text" + attribute);
	
	//get atribute
	String attribute1 =  driver.findElement(By.xpath("//*[@id=\"getMe\"] ")).getAttribute("value");
	System.out.println("this is get text" + attribute1);
	
	//clear text
	driver.findElement(By.xpath("//*[@id=\"clearMe\"] ")).clear();
	
	//is enabel 
		boolean enable =driver.findElement(By.xpath("//*[@id=\"noEdit\"] ")).isEnabled();
		System.out.println(enable);
		
		//is read only
	 String read =driver.findElement(By.xpath("//*[@id=\"dontwrite\"] ")).getCssValue("value");
	 System.out.println(" this is read only"+read);
        
     
    	
        driver.close();
      	}

}
