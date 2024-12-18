package seleniumtutorial;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotclass {
	public static void main(String[] args) throws AWTException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("seenivasan");
		// using action class
		Actions a = new Actions(driver);
		a.doubleClick(username).perform();
		a.contextClick(username).perform();

		// using robot class

		Robot r = new Robot();
		// using for-loop for scroll the copy section
		for (int i = 0; i < 3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

		// TO enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// For Password Section
		WebElement password = driver.findElement(By.name("pass"));
		a.contextClick(password).perform();

		// using for-loop for pasting password
		for (int j = 0; j < 4; j++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

		// TO Enter password
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
