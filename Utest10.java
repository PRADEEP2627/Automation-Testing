package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Utest10 {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/draggable");
		
		WebElement ele =driver.findElement(By.xpath("//*[@id=\"sample-box\"]"));
		driver.switchTo().frame(0);
		Actions drag = new Actions(driver);
		drag.dragAndDropBy(ele, 50, 50).build().perform();
		System.out.println("hi");
		
		

	}

}
