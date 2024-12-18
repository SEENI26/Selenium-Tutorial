package seleniumtutorial;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling 
// Window Handling
{
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver =new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("iphone 16");
	Thread.sleep(500);
	
	WebElement Cl = driver.findElement(By.xpath("//button[@class='_2iLD__']"));
	Cl.click();
	
	WebElement Ipcl = driver.findElement(By.xpath("(//img[@class='DByuf4'])[1]"));
	Ipcl.click();
	
	String ParentWindowId = driver.getWindowHandle();
	System.out.println("Parent ID : " + ParentWindowId);
	
	Set<String> allwindowId = driver.getWindowHandles();
	System.out.println("all Window Id :" + allwindowId);
	
	// Create enhanced for loop
	for (String windId :allwindowId) 
	{
		// using if condition
		if (windId != ParentWindowId) 
		{
		driver.switchTo().window(windId);	
		}
	}
}
}
