package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameclass
{
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		// Using Java Script Executor
		JavascriptExecutor jr = (JavascriptExecutor)driver;
		
		WebElement fra = driver.findElement(By.xpath("(//h3[contains(text(),'iFrame will not show if you have adBlock extension')])[1]"));
		jr.executeScript("arguments[0].scrollIntoView()", fra);
		
		//arguments[0].scrollIntoView(true)
		// To Switch into frame
		WebElement fra1 = driver.findElement(By.name("a077aa5e"));
		driver.switchTo().frame(fra1);
		
		Thread.sleep(1000);
		
		WebElement im = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		 im.click();
		 
		 Thread.sleep(2000);
		 driver.quit();
	}

}
