package click_and_view;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://revphpe.djaxbidder.com/adblock_551/demo/ay1.html");
		WebElement click = driver.findElement(By.xpath("//*[@id=\"revive-0-0\"]/a"));
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(allWindowHandles);

				for (int i = 1; i <= 100; i++) {
					click.click();
			System.out.println(i+"click");
		
		}
			driver.quit();
	}

}

