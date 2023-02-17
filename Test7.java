package Test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static WebDriver driver =null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\SeleniumTest11\\Resourse\\chromedriver.exe");
		driver = new ChromeDriver(); 	
		String baseUrl = "https://letcode.in/";
		driver.get(baseUrl);
		driver.manage().window().maximize();

		//open work space	
		driver.findElement(By.xpath("//*[@id=\"testing\"] ")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[3]/app-menu/div/footer/a")).click();

		//send value
		driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
		Set<String> windows =driver.getWindowHandles();
		List<String> windoeshandle = new ArrayList<String>(windows);
		driver.switchTo().window(windoeshandle.get(1));
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.switchTo().window(windoeshandle.get(0));
		String URL1 = driver.getCurrentUrl();
		System.out.println(URL1);
		//using TAB key
		driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
		String URL2 = driver.getCurrentUrl();
		System.out.println(URL2);
		driver.switchTo().window(windoeshandle.get(0));
		driver.findElement(By.xpath("///*[@id=\"multi\"]")).click();
		String URL3 = driver.getCurrentUrl();
		System.out.println(URL3);
		driver.switchTo().window(windoeshandle.get(1));
		String URL4 = driver.getCurrentUrl();
		System.out.println(URL4);

		
	}

}
