package seleniumtutorial;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scriptautomation {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		// Create a object for Java Script executor

		JavascriptExecutor jr = (JavascriptExecutor) driver;

		// Step 1 for create Script for send Keys
		WebElement user = driver.findElement(By.id("email"));
		jr.executeScript("arguments[0].setAttribute('value','seeni@gmail.com')", user);

		// get User Name Attribute see in Console Window
		Object usertext = jr.executeScript("return arguments[0].getAttribute('value')", user);
		System.out.println("User Name is : " + usertext);

		Thread.sleep(1000);

		WebElement passwr = driver.findElement(By.id("pass"));
		jr.executeScript("arguments[0].setAttribute('value','ssrini')", passwr);

		// Get Password Attribute
		Object passtext = jr.executeScript("return arguments[0].getAttribute('value')", passwr);
		System.out.println("Password is :" + passtext);

		// Step 2 for Click button using script
		WebElement click = driver.findElement(By.name("login"));
		jr.executeScript("arguments[0].click()", click);

		Thread.sleep(1000);
		driver.quit();

	}

}
