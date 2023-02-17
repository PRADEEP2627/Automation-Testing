package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {
	
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
	driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[3]/app-menu/div/footer/a")).click(); 
	
	//Select the apple using visible text
	WebElement fruits =driver.findElement(By.xpath("//*[@id=\"fruits\"]"));
	 Select list =new Select(fruits);
	 list.selectByVisibleText("Apple");
	 WebElement selectf = list.getFirstSelectedOption();
	System.out.println(selectf.getText());
	
	//Select your super hero's
	WebElement superhero =driver.findElement(By.xpath("//*[@id=\"superheros\"]"));
	 Select superh =new Select(superhero);
	 superh.selectByValue("sm");
	 WebElement selecthero = superh.getFirstSelectedOption();
	System.out.println(selecthero.getText());
	
	//Select the last programming language and print all the options
	WebElement selectprogram =driver.findElement(By.xpath("//*[@id=\"lang\"]"));
	Select list1 =new Select(selectprogram);
	 list1.selectByValue("java");
	 WebElement selectp = list1.getFirstSelectedOption();
	System.out.println(selectp.getText());
	
	
	//Select India using value & print the selected value
	WebElement selectindia =driver.findElement(By.xpath("//*[@id=\"country\"]"));
	Select list2 =new Select(selectindia);
	 list2.selectByValue("India");
	 WebElement selecti = list2.getFirstSelectedOption();
	System.out.println(selecti.getText());
	
	

        
     
    	
       // driver.close();
      	}

}
