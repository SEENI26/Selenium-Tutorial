package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
        // Create a Action for Mouse hover
		Actions s = new Actions(driver);

		WebElement click = driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[5]"));
		// Click the Drop function hold
		s.moveToElement(click).clickAndHold().perform();
        // Add Few Timing
		Thread.sleep(500);

		// Click to next Element
		WebElement down = driver.findElement(By.xpath("(//a[normalize-space()='Cleaning & Bath'])[1]"));

		s.moveToElement(down).perform();
		Thread.sleep(500);
		// Click the Element Which I selected they Hold the Text and show in Output
		WebElement hold = driver.findElement(By.xpath("//a[text()='Cleaning Supplies']"));
		s.clickAndHold(hold).perform();
		System.out.println("The Hold text is :" + hold.getText());
		
		driver.quit();
	}

}
