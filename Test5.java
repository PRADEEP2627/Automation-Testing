package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static WebDriver driver =null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\SeleniumTest11\\Resourse\\chromedriver.exe");
		driver = new ChromeDriver(); 	
		String baseUrl = "https://letcode.in/";
		driver.get(baseUrl);
		driver.manage().window().maximize();

		//open work space	
		driver.findElement(By.xpath("//*[@id=\"testing\"] ")).click();
		 driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[1]/app-menu/div/footer/a")).click();

		//send value
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[1]/div/input ")).sendKeys("Pradeep");

		//using TAB key
		driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[2]/div/input")).sendKeys(" Kumar");


		//switch to nested frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/app-root/app-innerframe/div/div/div/div/div/input")).sendKeys("pradeep@gmail.com");

		//back to parent frame 
		System.out.println("hi");
		driver.switchTo().parentFrame();
		System.out.println("hi");
		driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[2]/div/input")).sendKeys(" goodmornig");
driver.switchTo().defaultContent();

	}

}
