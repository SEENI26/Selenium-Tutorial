package seleniumtutorial;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertcommand2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		WebElement element1 = driver.findElement(By.xpath("(//a[normalize-space()='Alert with Textbox'])[1]"));
		element1.click();

		Thread.sleep(1000);

		WebElement element = driver.findElement(
				By.xpath("(//button[normalize-space()='click the button to demonstrate the prompt box'])[1]"));
		element.click();

		// prompt alert

		Alert a = driver.switchTo().alert();

		// Get Alert message text
		String text = a.getText();
		System.out.println(text);

		// send a text
		a.sendKeys("Seenivasan");
		a.accept();

		driver.close();
		driver.quit();
	}

}
