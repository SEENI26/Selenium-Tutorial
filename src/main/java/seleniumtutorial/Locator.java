package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[] args) throws InterruptedException {
		// launch browser comment
		ChromeDriver driver = new ChromeDriver();

		// Pass Url comment
		driver.get("https://www.facebook.com/?_rdr");

		// maximize window comment
		driver.manage().window().maximize();

		// To find the text by Contain text Xpath using business logic
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
		String st = text.getText();
		System.out.println(st);

		// the Locator this is ID locator
		// sendkeys mean enter Value for the input
		driver.findElement(By.id("email")).sendKeys("seeni@gmail.com");

		// the Locator this is Name locator
		driver.findElement(By.name("pass")).sendKeys("see&85");

		// the Locator this is Xpath locator
		driver.findElement(By.xpath("//div[@class='_6ltg'][1]")).click();

		// the Locator this is Xpath text locator
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	}
}
