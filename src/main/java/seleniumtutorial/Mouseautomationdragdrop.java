package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseautomationdragdrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/drag_drop.html");

		driver.manage().window().maximize();
		// Step 1 drag and drop the BANK name on debit side
		WebElement drag1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement drop1 = driver.findElement(By.id("bank"));

		// step 2 drag and drop the amount number
		WebElement drag = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement drop = driver.findElement(By.id("amt7"));

		// Credit Side
		WebElement crdrag = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement crdrop = driver.findElement(By.id("loan"));

		WebElement crdrag1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement crdrop1 = driver.findElement(By.id("amt8"));

		// In drag and drop& drop using Action Class
		Actions a = new Actions(driver);
		
		// Debit Side 
		a.dragAndDrop(drag1, drop1).build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(drag, drop).build().perform();

		// credit Side
		Thread.sleep(1000);
		a.dragAndDrop(crdrag, crdrop).build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(crdrag1, crdrop1).build().perform();

	}

}