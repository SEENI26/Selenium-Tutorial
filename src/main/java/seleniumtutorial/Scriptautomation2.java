package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scriptautomation2 
{
 public static void main(String[] args) 
 {
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/guru99home/");
	
	driver.manage().window().maximize();
	
	// Create Java Script Object
	JavascriptExecutor jr = (JavascriptExecutor)driver;
	
	WebElement page = driver.findElement(By.xpath("(//h3[contains(text(),'iFrame will not show if you have adBlock extension')])[1]"));
	
	// How to scroll down and Scroll Up In Webpage
	// Using this Script 
	// If is true show the Correct Page.
	// if is False Show the First Page.
	jr.executeScript("arguments[0].scrollIntoView(true)", page);
	
}
}
