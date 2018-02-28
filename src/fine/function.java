package fine;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class function {

public static WebDriver driver;	
static String URL="https://www.flipkart.com/";

@Test (priority=1)
public void flipkart() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Varun\\Desktop\\drivers\\chromedriver.exe");
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--start-maximized");
	 driver = new ChromeDriver( options );
	 driver.get(URL);
}	
	
@Test (priority=2)
public void login() throws InterruptedException
{
//Enter the Email id	
driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("varunvishal28@gmail.com");
Thread.sleep(3000);

//Enter the password
driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Tour2810");
Thread.sleep(3000);

//click on login button
driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
Thread.sleep(3000);
}

@Test (priority=3)
public void Afterlogin() throws InterruptedException
{
//click on men
	driver.findElement(By.xpath(".//*[@id='container']/div/header/div[3]/div/ul/li[3]/a")).click();
	Thread.sleep(3000);
	
//click on Jacket button
	
	driver.findElement(By.xpath(".//*[@id='container']/div/header/div[3]/div/ul/li[3]/ul/li/ul/li[2]/ul/li[6]/a/span")).click();
	Thread.sleep(3000);
	
//click on jacket image
	driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div[1]/div/a[1]/div/div/div[1]/img")).click();
	Thread.sleep(3000);
}

@Test (priority=4)
public void switchwindow() throws InterruptedException
{
//switching window
	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    
//click on size button
    driver.findElement(By.xpath(".//*[@id='swatch-0-size']/a")).click();
   	Thread.sleep(3000);
    
    
//click on Buy now
    driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div/div/div[1]/div/div[1]/div[2]/ul/li/button")).click();
	Thread.sleep(3000);
	
	
	
	
	
	
	
	
}
}