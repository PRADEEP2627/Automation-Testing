package Test1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
	
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
	driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[4]/app-menu/div/footer/a")).click(); 
	
	//Accept the Alert
	driver.findElement(By.xpath("//*[@id=\"accept\"]")).click();
      Alert alert  = driver.switchTo().alert();
      String gettext = alert.getText();
		System.out.println(gettext);
		alert.accept();
		
		driver.switchTo().window(null);
	
	//Dismiss the Alert & print the alert text
	driver.findElement(By.xpath("//*[@id=\"confirm\"]"));
	 Alert alert1  = driver.switchTo().alert();
     String gettext1 = alert.getText();
		System.out.println(gettext1);
		alert1.dismiss();
		
	//Type your name & accept
	 driver.findElement(By.xpath("//*[@id=\"prompt\"]"));
	 Alert alert2  = driver.switchTo().alert();
	 alert2.sendKeys("pradeep");
     String gettext2 = alert2.getText();
		System.out.println(gettext2);
		alert.accept();
	
	//Sweet alert
	driver.findElement(By.xpath("//*[@id=\"modern\"]"));
	 Alert alert3  = driver.switchTo().alert();
     String gettext3 = alert3.getText();
		System.out.println(gettext3);
		alert.accept();
	

        
     
    	
        driver.close();
      	}

}
