package Test1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static WebDriver driver =null;
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\SeleniumTest11\\Resourse\\chromedriver.exe");
		driver = new ChromeDriver(); 	
		String baseUrl = "https://letcode.in/";
		driver.get(baseUrl);
		driver.manage().window().maximize();

		//open work space	
		driver.findElement(By.xpath("//*[@id=\"testing\"] ")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[2]/app-menu/div/footer/a")).click();

		//Select any one
		WebElement select1= driver.findElement(By.xpath("//*[@id=\"yes\"]"));
		select1.click();
		boolean gettext1 =select1.isSelected(); 
		System.out.println("1"+gettext1);

		//Cofirm you can select only one radio button
		WebElement select2=driver.findElement(By.xpath("//*[@id=\"one\"]"));
		select2.click();
		boolean gettext2 =select2.isSelected(); 
		System.out.println("2"+gettext2);

		//Find the bug
		WebElement select3= driver.findElement(By.xpath("//*[@id=\"nobug\"]"));
		select3.click();
		boolean gettext3 =select3.isSelected(); 
		System.out.println("3"+gettext3);
		WebElement select31= driver.findElement(By.xpath("//*[@id=\"bug\"]"));
		select31.click();
		boolean gettext31 =select31.isSelected(); 
		System.out.println("3"+gettext31);

		//Find which one is selected 
		boolean select4 =driver.findElement(By.xpath("//*[@id=\"foo\"]")).isSelected();
	System.err.println("selected is 4 "+select4);
	
	boolean select41 =driver.findElement(By.xpath("//*[@id=\"notfoo\"]")).isSelected();
	System.err.println("selected is 4 "+select41);
	
		
		
		//Confirm last field is disabled
		boolean select5 =driver.findElement(By.xpath("//*[@id=\"maybe\"]")).isEnabled();
		System.out.println("is disabled 5"+ select5);

		//Find if the checkbooks is selected?
		WebElement  select6 =driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input"));
		select6.click();
		boolean select61 = select6.isSelected();
		System.out.println("is selected 6"+select61);
		
		

		//Accept the T&C
WebElement  select7 =driver.findElement(By.linkText("FAKE terms and conditions"));
	  select7.click();
	  boolean select71 = select7.isSelected();
	  System.out.println("is selected 7"+select71);
	}

}
