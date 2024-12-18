package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousedoubleclick
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		WebElement doubleClickOption = driver.findElement(By.id("email"));
		doubleClickOption.sendKeys("seenivasan");
		
        // Using action Class
        Actions a = new Actions(driver);
       
        // Double click method
        a.doubleClick(doubleClickOption).build().perform();
        a.contextClick(doubleClickOption).perform();
		
	}

}
