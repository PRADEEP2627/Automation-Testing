package Test1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static WebDriver driver =null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\SeleniumTest11\\Resourse\\chromedriver.exe");
		driver = new ChromeDriver(); 	
		String baseUrl = "https://letcode.in/edit";
		driver.get(baseUrl);
		driver.manage().window().maximize();

		//open work space	
		//driver.findElement(By.xpath("//*[@id=\"testing\"] ")).click();
		//driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[3]/app-menu/div/footer/a")).click();

		//send value
		List<WebElement> lables =driver.findElements(By.tagName("label"));
		WebElement  label1 =lables.get(lables.size()-1);
		System.out.println(label1.getText());
		int size =lables.size();
		if (size==7) {
			System.out.println("test passed");
		}
		for (WebElement label:lables) {
			String lable2 =label.getText();
			System.out.println(lable2);
		}
		
		driver.close();
	
		

	
	}

}
