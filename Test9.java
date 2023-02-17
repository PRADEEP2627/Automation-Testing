package Test1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("car",Keys.ENTER);
		List<WebElement> words =driver.findElements(By.xpath("//*[contains(text(),'car') or contains(text(),'Car')]"));
		System.out.println(words.size());
				for (WebElement print :words) {
		System.out.println(print.getText());
	}

}
}
