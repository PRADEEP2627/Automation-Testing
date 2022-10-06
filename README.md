# Automation-Testing
Launch new Browser
Open DemoQA.com website
Click on Registration link using "driver.findElement(By.xpath(".//[@id='menu-item-374']/a")).click();"*
Come back to Home page (Use 'Back' command)
Again go back to Registration page (This time use 'Forward' command)
Again come back to Home page (This time use 'To' command)
Refresh the Browser (Use 'Refresh' command)
Close the Browser
public class MyClass {
    public static void main(String args[]) {
     systme.setproperty("webdriver.chrome.driver",chrome driver path url);
webdriver driver-new chromedriver();
driver.manage().windows().maximize();
string url = "https:www.google.com";
driver.get(url);
string title =driver.gettitle();
system.out.ptintln("this is title",+title);
webdriver registration = driver.findelement(by.xpath("/html/body/header/nav/div/div/div[4]/a/span[2]"));
driver.get(appUrl);
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		driver.navigate().back();
		driver.navigate().to(appUrl);
		driver.navigate().refresh();
		driver.close();

    }
}
