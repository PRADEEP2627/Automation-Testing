package click_and_view;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class view {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://revphpe.djaxbidder.com/mahmood_DSP_SSP/demo123.php");
		//WebElement click = driver.findElement(By.xpath("/html/body/a"));
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(allWindowHandles);

				for (int i = 1; i <= 30; i++) {
					driver.navigate().refresh();
			System.out.println(i+"Impression");
		
		}
			driver.quit();
	}

}


